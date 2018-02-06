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
    Select * from tourism
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
                    <br/><center>
                        <h1>Tourism Information</h1>
                    </center>
                    <center>
                        <form action="TourismRadioCalled" method="post">
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
                                SELECT distinct t.city FROM smartcity.tourism t where t.type = ?;
                                <sql:param value="${requestScope.type}" />
                            </sql:query>
                            <form action="TourismInfoSearch" method="post">
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

                        <c:when test="${requestScope.Operation == 'TourismInfoSearch'}">
                            <sql:query var="cityquery" dataSource="${dsn1}">
                                SELECT distinct t.city FROM smartcity.tourism t where t.type = ?;
                                <sql:param value="${requestScope.type}" />
                            </sql:query>
                            <form action="TourismInfoSearch" method="post">
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
                                SELECT * FROM smartcity.tourism t where t.city like ?;
                                <sql:param value="${requestScope.cityName}" />
                            </sql:query>

                            <%--<table border="1" width="100%">

                                <tr>
                                    <th>Place Name</th>
                                    <th>Description</th>
                                    <th>Type</th>
                                    <th>City</th>
                                    <th>Location</th>
                                    <th>Attractive Place</th>
                                    <th>Way to reach</th>
                                    <th>Helpline No.</th>
                                    <th>Tour Operator</th>

                                </tr>--%>
                            <c:forEach var="row" items="${query2.rows}">

                                <div class="welcomezone">
                                    <div style="margin-bottom:20px; border-bottom:1px dotted #000; padding-bottom:10px;">
                                        <br />
                                        <%--<h3>Project One</h3>--%>
                                        <div> <img src="${row.image_file}" alt="Image not available" class="project-img" width="304" height="228"/>
                                            
                                            
                                            <table>
                                                <tr>
                                                    <td width="150px">
                                                     <b>Place name:</b>
                                                    </td>
                                                    <td>
                                                         ${row.place_name}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="150px">
                                                        <b>City:</b>
                                                    </td>
                                                    <td>
                                                         ${row.city}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="150px">
                                                        <b>Location:</b>
                                                    </td>
                                                    <td>
                                                         ${row.location}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="150px">
                                                        <b>Attractive Place: </b>
                                                    </td>
                                                    <td>
                                                         ${row.attractious}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="150px">
                                                        <b>Way to reach:</b>
                                                    </td>
                                                    <td>
                                                         ${row.wayto_reach}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="150px">
                                                        <b>Helpline No:</b>
                                                    </td>
                                                    <td>
                                                         ${row.helpline_no}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="150px">
                                                        <b>Tour Operator:</b>
                                                    </td>
                                                    <td >
                                                        ${row.tour_operator}
                                                    </td>
                                                </tr>
                                            </table>
                                        </div>
                                        <br />
                                        <div style="font-weight:bold;">
                                            <div class="clear"></div>
                                        </div>
                                    </div>


                                </div>
                                <%-- <tr>
                                     <td>${row.place_name}</td>
                                     <td>${row.description}</td>
                                     <td>${row.type}</td>
                                     <td>${row.city}</td>
                                     <td>${row.location}</td>
                                     <td>${row.attractious}</td>
                                     <td>${row.wayto_reach}</td>
                                     <td>${row.helpline_no}</td>
                                     <td>${row.tour_operator}</td>

                                    </tr>
                                    <br/>
                                    <img src="${row.image_file}" alt="Pulpit rock" width="304" height="228" />
                                --%>
                            </c:forEach>
                            <%--    </table>--%>
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
