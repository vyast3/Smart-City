<%-- 
    Document   : search_businfo
    Created on : Mar 31, 2012, 1:13:49 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dsn1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/smartcity" user="root" password="chidya"/>

<sql:query var="query1" dataSource="${dsn1}">
    Select * from businfo
</sql:query>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Smart City Transportation</title>
        <style type="text/css" media="screen">
            @import url("css/layout.css");
        </style>
    </head>
    <body>
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
                    <br/>
                    <center>
                                                <h1>Route Inforamtion</h1>
                                            </center>
                    <center>
                        <form action="RouteRadioCalled" method="post">
                            <h3>
                                Select Type:
                                <input type="radio" name="type" value="City" onclick = "submit(this.form)">City</input>
                                <input type="radio" name="type" value="Urban" onclick = "submit(this.form)">Urban</input>
                            </h3>
                        </form>
                    </center>
                    <c:choose>
                        <c:when test="${requestScope.Operation == 'ShowCityName'}">
                            <sql:query var="cityquery" dataSource="${dsn1}">
                                SELECT distinct r.city FROM smartcity.route r where r.type = ?;
                                <sql:param value="${requestScope.type}" />
                            </sql:query>
                            <form action="RouteInfoSearch" method="post">
                                <center> <h4 style="font-size:larger; margin-top:30px">Select Place:
                                        <select name="cityName">
                                            <c:forEach var="row" items="${cityquery.rows}">
                                                <option value="${row.city}"><c:out value="${row.city}"/></option>
                                            </c:forEach>
                                        </select>
                                        <input type="submit" value="View Information"/>
                                    </h4>
                                </center>

                            </form>
                        </c:when>
                    </c:choose>
                    <%
            System.out.println("route name " + request.getAttribute("routeName"));
                    %>
                    <c:choose>

                        <c:when test="${requestScope.Operation == 'RouteInfoSearch'}">
                            <sql:query var="cityquery" dataSource="${dsn1}">
                                SELECT distinct r.city FROM smartcity.route r where r.type = ?;
                                <sql:param value="${requestScope.type}" />
                            </sql:query>
                            <form action="BusInfoSearch" method="post">
                                <center> <h4 style="font-size:larger; margin-top:30px">Select Place:
                                        <select name="cityName">
                                            <c:forEach var="row" items="${cityquery.rows}">
                                                <option value="${row.city}"><c:out value="${row.city}"/></option>
                                            </c:forEach>
                                        </select>
                                        <input type="submit" value="View Information"/>
                                    </h4>
                                </center>

                            </form>
                            <sql:query var="query2" dataSource="${dsn1}">
                                SELECT * FROM smartcity.route r where r.city like ?;
                                <sql:param value="${requestScope.cityName}" />
                            </sql:query>
                            <table border="1" width="100%">

                                <tr>
                                    <th>Route Name</th>
                                    <th>City</th>
                                    <th>Route Information</th>
                                    <th>Route Location</th>
                                    <th>Type</th>

                                </tr>
                                <c:forEach var="row" items="${query2.rows}">
                                    <tr>
                                        <td>${row.route_name}</td>
                                        <td>${row.city}</td>
                                        <td>${row.route_information}</td>
                                        <td>${row.route_location}</td>
                                        <td>${row.type}</td>
                                        
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
</html>