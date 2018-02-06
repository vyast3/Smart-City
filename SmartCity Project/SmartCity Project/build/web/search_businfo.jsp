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
                    <br/><br/>
                    <center>
                                                <h1>Bus Information</h1>
                                            </center>
                    <center>
                        <form action="BusRadioCalled" method="post">
                            <h3>
                                Select Type:
                                <input type="radio" id="name" name="type" value="City" onclick = "submit(this.form)">City</input>
                                <input type="radio" name="type" value="Urban" onclick = "submit(this.form)">Urban</input>
                            </h3>
                        </form>
                    </center>
                    <c:choose>
                        <c:when test="${requestScope.Operation == 'ShowCityName'}">
                       
                            <sql:query var="cityquery" dataSource="${dsn1}">
                                SELECT distinct b.city FROM smartcity.businfo b where b.type = ?;
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
                        </c:when>
                    </c:choose>
                    <%
            System.out.println("route name " + request.getAttribute("routeName"));
                    %>
                    <c:choose>

                        <c:when test="${requestScope.Operation == 'BusInfoSearch'}">
                             <sql:query var="cityquery" dataSource="${dsn1}">
                                SELECT distinct b.city FROM smartcity.businfo b where b.type = ?;
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
                                SELECT * FROM smartcity.businfo b where b.city like ?;
                                <sql:param value="${requestScope.cityName}" />
                            </sql:query>
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
                                <c:forEach var="row" items="${query2.rows}">


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
                        </c:when>

                    </c:choose>
                                        <div style="float:right;"><input type="button" value="Print Result" onclick="window.print()"/></div>
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


<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                           <li class="first"><a class="current">home</a></li>
                            <li><a href="about_us.html">Path Finder</a></li>
                            <li><a href="about_us.html">about us</a></li>
                            <li><a href="search_businfo.jsp">Bus Info</a></li>
                            <li><a href="search_route.jsp">Route Info</a></li>
                            <li><a href="services.html">Hospital Info</a></li>
                            <li><a href="support.html">Tourist Place Info</a></li>
                            <li><a href="contact_us.html">contact Us</a></li>
                        </ul>
                    </div>
                    <div class="banner"><a href="#"><img src="images/banner.png" alt="" /></a></div>
                    <div class="find_more">
                        <p>Find New Partners, Experience Romance &amp; Find Love!<br />
                            <span><a href="#">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>
                    </div>

                    <form action="BusInfoSearch" method="post">

                        <center> <h4 style="font-size:larger; margin-top:30px">Select any Bus:

                                <select name="busId">
                                    <c:forEach var="row" items="${query1.rows}">
                                        <option value="${row.bus_id}"><c:out value="${row.bus_name}"/></option>
                                    </c:forEach>
                                </select>
                                <input type="submit" value="View Information"/>
                            </h4>
                        </center>

                    </form>

                    <c:choose>
                        <c:when test="${requestScope.Operation == 'BusInfoSearch'}">
                            <table border="1" width="100%">


                                <tr>
                                    <td width="40%">
                                        Bus Name:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.busName}
                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Bus Number
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.busNO}


                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Bus RTO Number
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.busRTONumber}
                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Bus Timing
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.busTiming}

                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Bus Route:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.busRoute}
                                    </td>
                                </tr>



                                <tr>
                                    <td width="40%">
                                        Stopage:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.stopage}
                                    </td>
                                </tr>
                                <tr>
                                    <td width="40%">
                                        Fair per KM:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.fair}

                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Facilities:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.facilities}

                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Helpline Number:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.helplineNumber}

                                    </td>
                                </tr>

                                <tr>
                                    <td width="40%">
                                        Remarks:
                                    </td>
                                    <td width="60%">
                                        ${requestScope.Bus.remarks}

                                    </td>
                                </tr>

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
--%>