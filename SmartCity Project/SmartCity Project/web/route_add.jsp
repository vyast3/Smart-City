<%-- 
    Document   : route_add
    Created on : Mar 27, 2012, 9:05:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


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
                    var routeId = document.getElementById("routeId").value;
                    var type;
                    if(document.getElementById('type1').checked) {
                        type  = document.getElementById("type1").value;
                       
                    }else if(document.getElementById('type2').checked) {
                        type  = document.getElementById("type2").value;
                       
                    }
                    var city = document.getElementById("city").value;
                    var routeName = document.getElementById("routeName").value;
                    var routeInfo = document.getElementById("routeInfo").value;
                    var routeLocation = document.getElementById("routeLocation").value;

                    if(routeId =="" || type == "" || city =="" || routeName =="" || routeInfo =="" || routeLocation ==""){
                        alert("Field should not be empty");
                        document.forms[0].action="/SmartCityNew/RouteIUrlServlet";
                    document.forms[0].submit();
                    }else{
                        
                        document.forms[0].action="/SmartCityNew/RouteEditServlet?routeId="+routeId
                            +"&type="+type
                            +"&city="+city
                            +"&routeName="+routeName
                            +"&routeInfo="+routeInfo
                            +"&routeLocation="+routeLocation;
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
                            <h1>Add/Edit Route</h1>
                            <c:if test="${requestScope.Result == 'Success'}">
                                <h4>Information Added Successfully</h4>
                            </c:if>
                            <form action="#" method="post">
                                <table border="0" width="100%">
                                    <tr>
                                        <td width="40%">
                                            Route Id:
                                        </td>
                                        <td width="60%">
                                            ${requestScope.Route.routeId}
                                            <input type="hidden" name="routeId" id="routeId" value='${requestScope.Route.routeId}'/>
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
                                            City:
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="city" id="city" value='${requestScope.Route.city}'/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="40%">
                                            Route Name:
                                        </td>
                                        <td width="60%">
                                            <input type="text" name="routeName" id="routeName" value='${requestScope.Route.routeName}'/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="40%">
                                            Route Information:
                                        </td>
                                        <td width="60%">
                                            <textarea name="routeInfo" id="routeInfo" cols="39" rows="6">${requestScope.Route.routeInformation}</textarea>
                                            <%--<input type="text" name="routeInfo" value='${requestScope.Route.routeInformation}'/>--%>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td width="40%">
                                            Route Path Location Name:<br/>
                                            (Please enter comma seprated value of path)
                                        </td>
                                        <td width="60%">
                                            <textarea name="routeLocation" id="routeLocation" cols="39" rows="6">${requestScope.Route.routeLocation}</textarea>

                                        </td>
                                    </tr>

                                </table>
                                <input type="submit" value="Add Route" onclick="validateData()"/>
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


