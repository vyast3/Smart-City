<%-- 
    Document   : hospital_read
    Created on : Apr 1, 2012, 10:59:25 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:setDataSource var="dsn1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/smartcity" user="root" password="chidya"/>

<sql:query var="query1" dataSource="${dsn1}">
    Select * from feedback
</sql:query>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Smart City Transportation</title>
        <style type="text/css" media="screen">
            @import url("css/layout.css");
        </style>
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope.Session == 'Admin'}">
                <div id="layout">
                    <div id="header">
                        <div id="logo"><a href="#"><img src="images/logo_1.png" alt="" /></a></div>
                        <div class="member_login">
                            <div class="login_box">
                                <form action="LogoutAction" method="get">
                                    <fieldset>
                                        <div class="column_1">
                                        </div>
                                        <div class="column_2">
                                        </div>
                                        <div class="column_3">
                                            <input type="image" src="images/logout.jpg" class="login"/>
                                        </div>
                                        <div class="column_4">
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

                                <h1>Feeback Details</h1>
                                <table border="1" width="100%">
                                    <tr>
                                        <th>Name</th>
                                        <th>Contact No.</th>
                                        <th>Email Id</th>
                                        <th>Query</th>

                                    </tr>
                                    <c:forEach var="row" items="${query1.rows}">
                                        <tr>
                                            <td>${row.name}</td>
                                            <td>${row.contact}</td>
                                            <td>${row.emailid}</td>
                                            <td>${row.query}</td>

                                        </tr>
                                    </c:forEach>
                                </table>

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


