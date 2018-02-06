
<%-- 
    Document   : pathfinder
    Created on : Apr 1, 2012, 11:18:09 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dsn1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/smartcity" user="root" password="chidya"/>

<sql:query var="route" dataSource="${dsn1}">
    SELECT * FROM route;

</sql:query>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <title>Smart City Transportation</title>
        <style type="text/css" media="screen">
            @import url("css/layout.css");
        </style>
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
            function codeAddress(routePoint, city) {
            <%--alert("source "+source+" and des"+destination);--%>
                    var array = routePoint.split(',');

                    for(i = 0 ; i < array.length-1; i++){
                        var address1 = array[i]+", "+city ;
                            
                        var address2 = array[i+1]+", "+city;
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

            <%--var origin1 = new google.maps.LatLng(p1, p2);
            var origin2 = address1;
            var destinationA = address2;
            var destinationB =new google.maps.LatLng(results[0].geometry.location.lat(), results[0].geometry.location.lng());
            --%>
                            var service = new google.maps.DistanceMatrixService();
                            service.getDistanceMatrix(
                            {
                                origins: [array[0]+", "+city],
                                destinations: [array[array.length-1]+", "+city],
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

                }
            <%--function codeAddress(source,destination) {
            alert("source "+source+" and des"+destination);
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
            alert("duration "+distance);
                                        document.getElementById("result").innerHTML=distance;
                                    }
                                }
                            }

                        }

                    });



                }--%>
        </script>
    </head>
    <body >
        <div id="layout">
            <div id="header">
                <div id="logo"><a href="#"><img src="images/logo_1.png" alt="" /></a></div>
                <div class="member_login">
                    <div class="login_box">
                        <form action="AdminLogin" method="get">
                            <fieldset>
                                <div class="column_1">
                                    <label>username :</label>
                                    <label>password :</label>
                                </div>
                                <div class="column_2">
                                    <input type="text" name="name"/>
                                    <input type="password" name="password"/>
                                </div>
                                <div class="column_3">
                                    <input type="image" src="images/login_btn.gif" class="login"/>
                                </div>
                                <div class="column_4">
                                    <label class="password"><a href="#">Forgot <br />
                                            password</a></label>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
            <div id="body_container">
                <div id="body_container_inner">
                    <div id="menu">
                        <ul>

                            <li><a href="PathFinderPage">Path Finder</a></li>
                            <li><a href="search_businfo.jsp">Bus Info</a></li>
                            <li><a href="search_route.jsp">Route Info</a></li>
                            <li><a href="search_hospitalinfo.jsp">Hospital Info</a></li>
                            <li><a href="search_tourisminfo.jsp">Tourist Place Info</a></li>
                            <li><a href="FeedbackServlet">Feedback</a></li>
                            <li><a href="about_us.jsp">About us</a></li>
                        </ul>
                    </div>
                    <div class="banner"><a href="#"><img src="images/banner.png" alt="" /></a></div>
                    <div class="find_more">
                        <p>Find New Partners, Experience Romance &amp; Find Love!<br />
                            <span><a href="#">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>
                    </div>
                    <div class="container_row">
                        <c:if test="${requestScope.Operation == 'PathFindPage'}">
                            <%
            System.out.println("psth find psgr opers");
                            %>
                            <script type="text/javascript">
                                initialize();

                            </script>
                        </c:if>
                        <center>

                            <form action="PathFinderServlet" method="post">
                                <table>
                                    <tr>
                                        <td colspan="2">
                                            <center>
                                                <h1>Path Finder Page</h1>
                                            </center>

                                        </td>
                                    </tr>
                                    <br/>
                                    <tr>
                                        <td>
                                            Select any route
                                        </td>
                                        <td>
                                            <select name="routePoint" id="busRoute" >
                                                <c:forEach var="row" items="${route.rows}">

                                                    <option value="${row.route_id}"><c:out value="${row.route_name}"/></option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <%--<tr>
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
                                    </tr>--%>
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

                        <div id="map_canvas" style="width:85%; height:60%; margin-left:60px; margin-right:10px"></div>

                        <c:if test="${requestScope.Operation == 'PathFind'}">
                            <sql:query var="route1" dataSource="${dsn1}">
                                SELECT * FROM smartcity.route r where r.route_id like ? ;
                                <sql:param value="${requestScope.routePoint}" />

                            </sql:query>
                            <c:forEach var="row" items="${route1.rows}">
                                <script type="text/javascript">
                                    initialize();
                                    codeAddress('${row.route_location}','${row.city}' );
                                    <%--codeAddress('${requestScope.source}','${requestScope.destination}');--%>
                                </script>

                                <sql:query var="query1" dataSource="${dsn1}">
                                    SELECT * FROM smartcity.businfo b where b.bus_route like ? ;
                                    <sql:param value="%${row.route_name}%" />
                                    
                                </sql:query>
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
                            </c:forEach>
                        </c:if>
                    </div>
                    <div id="footer">
                        <div class="footer_link">
                            <ul style="color:#FFf;">
                                Copyright (c) Smart City Transportation. All rights reserved.
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>



<%--                                    <%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dsn1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/smartcity" user="root" password="chidya"/>

<sql:query var="query1" dataSource="${dsn1}">
    Select * from route
</sql:query>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <title>Smart City Transportation</title>
        <style type="text/css" media="screen">
            @import url("css/layout.css");
            html { height: 100% }
            body { height: 100%; margin: 0; padding: 0 }
            #map_canvas { height: 80% }
        </style>

        <script type="text/javascript"
                src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCHLeDxIjgTe6hYIoWEzy2EURxWazuY3oQ&sensor=true">
        </script>
        <script type="text/javascript">
            var geocoder;
            var map;
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

            function codeAddress() {
                var address1 = document.getElementById("address1").value;
                var address2 = document.getElementById("address2").value;
                var marker1,marker2;
                geocoder.geocode( { 'address': address1}, function(results, status) {
                    if (status == google.maps.GeocoderStatus.OK) {
                        map.setCenter(results[0].geometry.location);
                        marker1 = new google.maps.Marker({
                            map: map,
                            position: results[0].geometry.location
                        });
                    } else {
                        alert("Geocode was not successful for the following reason: " + status);
                    }
                });

                geocoder.geocode( { 'address': address2}, function(results, status) {
                    if (status == google.maps.GeocoderStatus.OK) {
                        //        map.setCenter(results[0].geometry.location);
                        marker2 = new google.maps.Marker({
                            map: map,
                            position: results[0].geometry.location

                        });
                        var distance = marker1.getPoint().distanceFrom(marker2.getPoint());
                        parent.document.getElementById('result').innerHTML = distance;
                        document.getElementById("result").value = distance;
                        confirm("distance: " + distance);
                        document.write("<p>" + distance + "</p>");
                        document.getElementById("demo").innerHTML=dssds;
                    } else {
                        document.getElementById("demo").innerHTML=ewr;
                        alert("Geocode was not successful for the following reason: " + status);
                    }
                });
            }
            document.getElementById("demo").innerHTML=ewr;
        </script>
    </head>
    <body onload="initialize()">
        <div id="layout">
            <div id="header">
                <div id="logo"><a href="#"><img src="images/logo_1.png" alt="" /></a></div>
                <div class="member_login">
                    <div class="login_box">
                        <form action="AdminLogin" method="get">
                            <fieldset>
                                <div class="column_1">
                                    <label>username :</label>
                                    <label>password :</label>
                                </div>
                                <div class="column_2">
                                    <input type="text" name="name"/>
                                    <input type="password" name="password"/>
                                </div>
                                <div class="column_3">
                                    <input type="image" src="images/login_btn.gif" class="login"/>
                                </div>
                                <div class="column_4">
                                    <label class="password"><a href="#">Forgot <br />
                                            password</a></label>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
            <div id="body_container">
                <div id="body_container_inner">
                    <div id="menu">
                        <ul>

                            <li><a href="pathfinder.jsp">Path Finder</a></li>
                            <li><a href="search_businfo.jsp">Bus Info</a></li>
                            <li><a href="search_route.jsp">Route Info</a></li>
                            <li><a href="search_hospitalinfo.jsp">Hospital Info</a></li>
                            <li><a href="search_tourisminfo.jsp">Tourist Place Info</a></li>
                            <li><a href="add_feedback.jsp">Feedback</a></li>
                            <li><a href="about_us.jsp">About us</a></li>
                        </ul>
                    </div>
                    <div class="banner"><a href="#"><img src="images/banner.png" alt="" /></a></div>
                    <div class="find_more">
                        <p>Find New Partners, Experience Romance &amp; Find Love!<br />
                            <span><a href="#">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>
                    </div>

                    <div id="map_canvas" style="width: 320px; height: 480px;"></div>
                    <div>
                        <input id="address1" type="textbox" value="ujjain"/>
                        <input id="address2" type="textbox" value="indore"/>
                        <input type="button" value="Encode" onclick="codeAddress()"/>
                        <input id="result" type="textbox" value="0"/>
                    </div>
                    <p id="demo"></p>
                    <form action="RouteInfoSearch" method="post">

                        <center> <h4 style="font-size:larger; margin-top:30px">Select any Route:

                                <select name="routeName">
                                    <c:forEach var="row" items="${query1.rows}">
                                        <option value="${row.route_name}"><c:out value="${row.route_name}"/></option>
                                    </c:forEach>
                                </select>
                                <input type="submit" value="View Information"/>
                            </h4>
                        </center>

                    </form>
                    <%
            System.out.println("route name " + request.getAttribute("routeName"));
                    %>
                    <c:choose>

                        <c:when test="${requestScope.Operation == 'RouteInfoSearch'}">

                            <sql:query var="query2" dataSource="${dsn1}">
                                SELECT * FROM smartcity.businfo b where b.bus_route like ?;
                                <sql:param value="%${requestScope.routeName}%" />
                            </sql:query>
                            <table border="1" width="100%">

                                <tr>
                                    <th>Bus name</th>
                                    <th>Bus Number</th>
                                    <th>Bus RTO Number</th>
                                    <th>Bus Timing</th>
                                    <th>Bus Route</th>
                                    <th>Stopage</th>
                                    <th>Fair</th>
                                    <th>Facilities</th>
                                    <th>HelpLine Number</th>
                                    <th>Remarks</th>
                                </tr>
                                <c:forEach var="row" items="${query2.rows}">


                                    <tr>
                                        <td>${row.bus_name}</td>
                                        <td>${row.bus_no}</td>
                                        <td>${row.nus_rto_no}</td>
                                        <td>${row.bus_timing}</td>
                                        <td>${row.bus_route}</td>
                                        <td>${row.stopage}</td>
                                        <td>${row.fair}</td>
                                        <td>${row.facilities}</td>
                                        <td>${row.helpline_no}</td>
                                        <td>${row.remarks}</td>
                                    </tr>

                                </c:forEach>
                            </table>
                        </c:when>

                    </c:choose>
                    <div id="footer">
                        <div class="footer_link">
                            <ul style="color:#FFf;">
                                Copyright (c) Smart City Transportation. All rights reserved.
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>--%>

