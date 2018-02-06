<%-- 
    Document   : mapdemo1
    Created on : Apr 4, 2012, 8:41:34 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dsn1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/smartcity" user="root" password="chidya"/>
<sql:query var="query1" dataSource="${dsn1}">
    SELECT * FROM smartcity.businfo b where b.bus_route like ? AND b.bus_route like ?;
    <sql:param value="%${requestScope.source}%" />
    <sql:param value="%${requestScope.destination}%" />
</sql:query>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <style type="text/css">
            html { height: 100% }
            body { height: 100%; margin: 0; padding: 0 }
            #map_canvas { height: 100% }
        </style>
        <script type="text/javascript"
                src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCHLeDxIjgTe6hYIoWEzy2EURxWazuY3oQ&sensor=true&geodesic:true">
        </script>
        <script type="text/javascript" >
            function initialize() {
                geocoder = new google.maps.Geocoder();
                var latlng = new google.maps.LatLng(21,77);
                var myOptions = {
                    zoom: 8,
                    center: latlng,
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                }
                map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
            }
            function codeAddress(source,destination) {
            <%--alert("source "+source+" and des"+destination);--%>
                    var address1 = source;
                    var address2 = destination;
                    var p1,p2;
                    var mygc = new google.maps.Geocoder();
                    mygc.geocode({'address' : address1}, function(results, status){
                        <!--alert( "lat long: " + results[0].geometry.location.lat()+", "+ results[0].geometry.location.lng() );-->
                        map.setCenter(results[0].geometry.location);
                        p1=results[0].geometry.location.lat();
                        p2= results[0].geometry.location.lng();
                        var marker = new google.maps.Marker({
                            map: map,
                            position: results[0].geometry.location

                        });

                    });

                    var mygc = new google.maps.Geocoder();
                    mygc.geocode({'address' : address2}, function(results, status){
                        <!--alert( "lat long: " + results[0].geometry.location.lat()+", "+ results[0].geometry.location.lng() );-->
                        map.setCenter(results[0].geometry.location);

                        var marker = new google.maps.Marker({
                            map: map,
                            position: results[0].geometry.location

                        });

                        var flightPlanCoordinates = [
                            new google.maps.LatLng(p1, p2),
                            new google.maps.LatLng(results[0].geometry.location.lat(), results[0].geometry.location.lng()),

                        ];
                        var flightPath = new google.maps.Polyline({
                            path: flightPlanCoordinates,
                            strokeColor: "#FF0000",
                            strokeOpacity: 1.0,
                            strokeWeight: 2
                        });
                        flightPath.setMap(map);

                        var origin1 = new google.maps.LatLng(p1, p2);
                        var origin2 = address1;
                        var destinationA = address2;
                        var destinationB =new google.maps.LatLng(results[0].geometry.location.lat(), results[0].geometry.location.lng());

                        var service = new google.maps.DistanceMatrixService();
                        service.getDistanceMatrix(
                        {
                            origins: [origin1, origin2],
                            destinations: [destinationA, destinationB],
                            travelMode: google.maps.TravelMode.DRIVING,
                            avoidHighways: false,
                            avoidTolls: false
                        }, callback);

                        function callback(response, status) {
                            if (status == google.maps.DistanceMatrixStatus.OK) {
                                var origins = response.originAddresses;
                                var destinations = response.destinationAddresses;

                                for (var i = 0; i < origins.length; i++) {
                                    var results = response.rows[i].elements;
                                    for (var j = 0; j < results.length; j++) {
                                        var element = results[j];
                                        var distance = element.distance.text;
                                        var duration = element.duration.text;
                                        var from = origins[i];
                                        var to = destinations[j];
            <%--alert("duration "+distance);--%>
                                        document.getElementById("result").innerHTML=distance;
                                    }
                                }
                            }

                        }

                    });



                }
        </script>
    </head>
    <body >
    <c:if test="${requestScope.Operation == 'PathFindPage'}">
        <%
            System.out.println("psth find psgr opers");
        %>
        <script type="text/javascript">
            initialize();
           
        </script>
    </c:if>
    <center>
        <br/><br/>
        <form action="PathFinderServlet" method="post">
            <table>
                <tr>
                    <td>
                        Source Name:
                    </td>
                    <td>
                        <input name="source" type="text" value="${requestScope.source}"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Destination Name:
                    </td>
                    <td>
                        <input name="destination" type="text" value="${requestScope.destination}"/>

                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center>
                            <input type="submit" value="Draw path" />
                        </center>

                    </td>
                </tr>


            </table>
        </form>
        <br/>
        <c:if test="${requestScope.Operation == 'PathFind'}">
            Minimum distance between the station is <div id="result"></div>
        </c:if>
        <br/>
    </center>

    <div id="map_canvas" style="width:80%; height:80%; azimuth:center"></div>

    <c:if test="${requestScope.Operation == 'PathFind'}">

        <script type="text/javascript">
            initialize();
            codeAddress('${requestScope.source}','${requestScope.destination}');
        </script>
        <br/>
        <center>
            <h2>Bus information</h2>
        </center>
        <table border="1" width="100%">

            <tr>
                <th>Bus Name</th>
                <th>Bus No.</th>
                <th>Timing</th>
                <th>Route</th>
                <th>Stopage</th>
                <th>Fair per K.M.</th>
                <th>Facilities</th>
                <th>Helpline No.</th>
                <th>Type</th>
                <th>City Name</th>

            </tr>

            <c:forEach var="row" items="${query1.rows}">
                <tr>
                    <td>${row.bus_name}</td>
                    <td>${row.bus_no}</td>
                    <td>${row.bus_timing}</td>
                    <td>${row.bus_route}</td>
                    <td>${row.stopage}</td>
                    <td>${row.fair}</td>
                    <td>${row.facilities}</td>
                    <td>${row.helpline_no}</td>
                    <td>${row.type}</td>
                    <td>${row.city}</td>

                </tr>
            </c:forEach>

        </table>
    </c:if>
</body>
</html>