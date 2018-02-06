<%-- 
    Document   : index
    Created on : Mar 27, 2012, 9:02:26 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                            <div class="container_row">
                                <center>
                                    <h1>Welcome to Admin page</h1>
                                </center>
                                <h3 style="margin-left:50px">
                                    Admin have following facilities:
                                    <br/><br/>
                                    1)Add Bus Information
                                    <br/><br/>
                                    2)Add Route Information:
                                    <br/><br/>
                                    3)Add Tourism Information:
                                    <br/><br/>
                                    4)Add Hospital Information:
                                    <br/><br/>
                                    5)Update/Delete Bus Information:
                                    <br/><br/>
                                    6)Update/Delete Route Information:
                                    <br/><br/>
                                    7)Update/Delete Hospital Information:
                                    <br/><br/>
                                    8)Read Feedback:
                                    <br/><br/>
                                    9)Read Bus Information:
                                    <br/><br/>
                                    10)Read Hospital Information:
                                    <br/><br/>
                                    11)Read Route Information:
                                </h3>
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


            </c:when>
            <c:otherwise>
                <c:redirect url="index.jsp"/>
            </c:otherwise>

        </c:choose>
    </body>
</html>


