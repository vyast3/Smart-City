<%-- 
    Document   : hospital
    Created on : Mar 31, 2012, 9:38:22 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div id="layout">
            <div id="header">
                <div id="logo"><a href="#"><img src="images/logo_1.png" alt="" /></a></div>
                <a href="index.jsp" style="align:right">Logout</a>
            </div>
            <div id="body_container">
                <div id="body_container_inner">
                    <div id="menu">
                        <ul>
                            <li class="first"><a href="index.html">home</a></li>
                            <li><a href="route.jsp">Add route</a></li>
                            <li><a href="bus.jsp">Add Bus info</a></li>
                            <li><a href="hospital.jsp">Add Hospital Info</a></li>

                        </ul>
                    </div>
                    <div class="banner"><a href="#"><img src="images/banner_1.png" alt="" /></a></div>
                    <div class="find_more">
                        <p>Find New Partners, Experience Romance &amp; Find Love!<br />
                            <span><a href="#">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>
                    </div>
                    <a href="HospitalIUrlServlet">Add/Create</a><br/>
                    <a href="hospital_read.jsp">Read</a><br/>
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


