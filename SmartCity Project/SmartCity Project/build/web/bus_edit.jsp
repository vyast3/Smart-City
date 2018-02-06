<%-- 
    Document   : bus_edit
    Created on : Mar 29, 2012, 7:42:42 PM
    Author     : Admin
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="ds1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/smartcity" user="root" password="chidya"/>
<sql:query var="route" dataSource="${ds1}">
    Select route_name from route
</sql:query>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Smart City Transportation</title>
        <style type="text/css" media="screen">
            @import url("css/layout.css");
        </style>
        <script type="text/javascript">
            function validateData() {

            <%--location.href = "FeedbackAddServlet";--%>
                    var busId = document.getElementById("busId").value;
                    var type;
                    if(document.getElementById('type1').checked) {
                        type  = document.getElementById("type1").value;

                    }else if(document.getElementById('type2').checked) {
                        type  = document.getElementById("type2").value;

                    }
                    var busName = document.getElementById("busName").value;
                    var city = document.getElementById("city").value;
                    var busNumber = document.getElementById("busNumber").value;
                    var busRTONumber = document.getElementById("busRTONumber").value;
                    var busTiming = document.getElementById("busTiming").value;
                    var busRoute = document.getElementById("busRoute").value;
                    var stopage = document.getElementById("stopage").value;
                    var fair = document.getElementById("fair").value;
                    var facilities = document.getElementById("facilities").value;
                    var helplineNumber = document.getElementById("helplineNumber").value;
                    var remarks = document.getElementById("remarks").value;
                    if(busId =="" || type == "" || city =="" || busName =="" || busNumber =="" || busRTONumber =="" || busRTONumber ==""
                        || busTiming =="" || busRoute =="" || stopage =="" || fair =="" || facilities =="" || helplineNumber =="" || remarks ==""){
                        alert("Field should not be empty");
                        
                        document.forms[0].action="/SmartCityNew/BusIUrlServlet";
                        document.forms[0].submit();
                    }else if(isNaN(stopage) || isNaN(fair) || isNaN(helplineNumber))
                    {
                        alert("Stopage, fair and helpline number should be numeric");
                        document.forms[0].action="/SmartCityNew/BusIUrlServlet";
                        document.forms[0].submit();
                    }
                    else if(helplineNumber.length != 10){
                        alert("Please enter 10 digit number");
                        document.forms[0].action="/SmartCityNew/BusIUrlServlet";
                        document.forms[0].submit();
                    }
                    else{
                       
                        document.forms[0].action="/SmartCityNew/BusEditServlet?busId="+busId
                            +"&type="+type
                            +"&city="+city
                            +"&busName="+busName
                            +"&busNumber="+busNumber
                            +"&busRTONumber="+busRTONumber
                            +"&busTiming="+busTiming
                            +"&busRoute="+busRoute
                            +"&stopage="+stopage
                            +"&fair="+fair
                            +"&facilities="+facilities
                            +"&helplineNumber="+helplineNumber
                            +"&remarks="+remarks;
                        document.forms[0].submit();
                    }
                    
                }
                function logout() {

            <%--location.href = "FeedbackAddServlet";--%>
                    document.forms[0].action="/SmartCityNew/LogoutAction";
                    document.forms[0].submit();

                }
        </script>
    </head>
    <body>
    <c:choose>
        <c:when test="${sessionScope.Session == 'Admin'}">
            <div id="layout">
                <div id="header">
                    <div id="logo"><a href="#"><img src="images/logo_1.png" alt="" /></a></div>
                    <div class="member_login">
                        <div class="login_box">

                            <fieldset>
                                <div class="column_1">
                                </div>
                                <div class="column_2">
                                </div>
                                <div class="column_3">
                                    <input type="image" src="images/logout.jpg" class="login" onclick="logout()"/>
                                </div>
                                <div class="column_4">
                                </div>
                            </fieldset>

                        </div>
                    </div>
                </div>
                <div id="body_container">
                    <div id="body_container_inner">
                        <div id="menu">
                            <ul>
                                <li><a href="RouteIUrlServlet">Add Route</a></li>
                                <li><a href="BusIUrlServlet">Add Bus</a></li>
                                <li><a href="HospitalIUrlServlet">Add Hospital</a></li>
                                <li><a href="TourismAddServlet">Add Tourism</a></li>
                                <li><a href="feedback_read.jsp">Feedback</a></li>
                                <li><a href="route_read.jsp">Read Route</a></li>
                                <li><a href="bus_read.jsp">Read Bus</a></li>
                                <li><a href="hospital_read.jsp">Read Hospital</a></li>

                            </ul>
                        </div>
                        <div class="banner"><a href="#"><img src="images/banner_1.png" alt="" /></a></div>
                        <div class="find_more">
                            <p>Find New Partners, Experience Romance &amp; Find Love!<br />
                                <span><a href="#">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>
                        </div>
                        <center>
                            <h1>Add/Edit Bus information</h1>
                            <c:if test="${requestScope.Result == 'Success'}">
                                <h4>Information Added Successfully</h4>
                            </c:if>
                            <form action="#" method="post">
                                <table border="0" width="100%">
                                    <tr>
                                        <td width="40%">
                                            Bus Id:
                                        </td>
                                        <td width="60%">
                                            ${requestScope.Bus.busId}
                                            <input type="hidden" name="busId" id="busId" value='${requestScope.Bus.busId}'/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Bus Name:
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="busName" id="busName" value='${requestScope.Bus.busName}'/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="40%">
                                            Select Type
                                        </td>
                                        <td width="60%">
                                            <input type="radio" name="type" id="type1" value="City" checked>City</input>
                                            <input type="radio" name="type" id="type2" value="Urban">Urban</input>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            City
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="city" id="city" value='${requestScope.Bus.city}'/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="40%">
                                            Bus Number
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="busNumber" id="busNumber" value='${requestScope.Bus.busNO}'/>

                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Bus RTO Number
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="busRTONumber" id="busRTONumber" value='${requestScope.Bus.busRTONumber}'/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Bus Timing
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="busTiming" id="busTiming" value='${requestScope.Bus.busTiming}'/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Bus Route:
                                        </td>
                                        <td width="60%">
                                            <select name="busRoute" multiple="multiple" id="busRoute" >
                                                <c:forEach var="row" items="${route.rows}">
                                                    <option value="${row.route_name}"><c:out value="${row.route_name}"/></option>
                                                </c:forEach>
                                            </select></td>
                                    </tr>
                                    <tr>
                                        <td width="40%">
                                            Stopage:
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="stopage" id="stopage" value='${requestScope.Bus.stopage}'/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="40%">
                                            Fair per KM:
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="fair" id="fair" value='${requestScope.Bus.fair}'/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Facilities:
                                        </td>
                                        <td width="60%">
                                            <input type="text"  name="facilities" id="facilities" value='${requestScope.Bus.facilities}'/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Helpline Number:
                                        </td>
                                        <td width="60%">
                                            <input type="text"  name="helplineNumber" id="helplineNumber" value= '${requestScope.Bus.helplineNumber}'/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Remarks:
                                        </td>
                                        <td width="60%">
                                            <input type="text"  name="remarks" id="remarks" value='${requestScope.Bus.remarks}'/>
                                        </td>
                                    </tr>

                                </table>
                                <input type="submit" value="Add Bus Info" onclick="validateData()"/>
                            </form>


                        </center>
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
        </c:when>
        <c:otherwise>
            <c:redirect url="index.jsp"/>
        </c:otherwise>

    </c:choose>
</body>
</html>


