<%-- 
    Document   : hospital
    Created on : Mar 31, 2012, 9:38:22 PM
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
        <script type="text/javascript">
            function validateData() {

            <%--location.href = "FeedbackAddServlet";--%>
                    var tourismId = document.getElementById("tourismId").value;
                    var type;
                    if(document.getElementById('type1').checked) {
                        type  = document.getElementById("type1").value;

                    }else if(document.getElementById('type2').checked) {
                        type  = document.getElementById("type2").value;

                    }
                    var cityName = document.getElementById("cityName").value;
                    var placeName = document.getElementById("placeName").value;
                    var tourOperator = document.getElementById("tourOperator").value;
                    var description = document.getElementById("description").value;
                    var location = document.getElementById("location").value;
                    var attractive = document.getElementById("attractive").value;
                    var waytoReach = document.getElementById("waytoReach").value;
                    var inputFile = document.getElementById("inputFile").value;
                    var helplineNo = document.getElementById("helplineNo").value;

                    if(tourismId =="" || type == "" || cityName =="" || placeName =="" || tourOperator =="" || description ==""
                        || location =="" || attractive =="" || waytoReach =="" || helplineNo =="" || inputFile ==""){
                        alert("Field should not be empty");
                        document.forms[0].action="/SmartCityNew/TourismAddServlet";
                        document.forms[0].submit();
                    }else if(isNaN(helplineNo))
                    {
                        alert("Helpline number should be number");
                        document.forms[0].action="/SmartCityNew/TourismAddServlet";
                        document.forms[0].submit();
                    }
                    else if(helplineNo.length != 10){
                        alert("Please enter 10 digit number");
                        document.forms[0].action="/SmartCityNew/TourismAddServlet";
                        document.forms[0].submit();
                    }
                    else{
                           
                        document.forms[0].action="/SmartCityNew/TourismEditServlet?tourismId="+tourismId
                            +"&type="+type
                            +"&cityName="+cityName
                            +"&placeName="+placeName
                            +"&tourOperator="+tourOperator
                            +"&description="+description
                            +"&location="+location
                            +"&attractive="+attractive
                            +"&waytoReach="+waytoReach
                            +"&helplineNo="+helplineNo
                            +"&inputFile="+inputFile
                        ;
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
                                <h1>Add/Edit Tourism information</h1>
                                <c:if test="${requestScope.Result == 'Success'}">
                                    <h4>Information Added Successfully</h4>
                                </c:if>
                                <form action="#" enctype="multipart/form-data" method="post">
                                    <table border="0" width="100%">
                                        <tr>
                                            <td width="40%">
                                                Tourism Id:
                                            </td>
                                            <td width="60%">
                                                ${requestScope.Tourism.id}
                                                <input type="hidden" name="tourismId" id="tourismId" value='${requestScope.Tourism.id}'/>
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
                                                <input type="text" name="cityName" id="cityName" value='${requestScope.Tourism.city}'/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Place Name:
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="placeName" id="placeName" value='${requestScope.Tourism.placeName}'/>

                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="40%">
                                                Helpline No:
                                            </td>
                                            <td width="60%">
                                                <input type="text"  name="helplineNo" id="helplineNo" value= '${requestScope.Tourism.helplineNo}'/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Tour Operator:
                                            </td>
                                            <td width="60%">
                                                <input type="text"  name="tourOperator" id="tourOperator" value='${requestScope.Tourism.tourOperator}'/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Attach image files:
                                            </td>
                                            <td width="60%">
                                                <input type="file" name="inputFile" id="inputFile" size="40"/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Description:
                                            </td>
                                            <td width="60%">
                                                <textarea name="description" id="description" cols="30" rows="5">${requestScope.Tourism.description}</textarea>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Location:
                                            </td>
                                            <td width="60%">
                                                <textarea name="location" id="location" cols="30" rows="5">${requestScope.Tourism.location}</textarea>
                                            </td>
                                        </tr>



                                        <tr>
                                            <td width="40%">
                                                Attractive Place:
                                            </td>
                                            <td width="60%">
                                                <textarea name="attractive" id="attractive" cols="30" rows="5">${requestScope.Tourism.attractious}</textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="40%">
                                                Way to Reach:
                                            </td>
                                            <td width="60%">
                                                <textarea name="waytoReach" id="waytoReach" cols="30" rows="5">${requestScope.Tourism.waytoReach}</textarea>

                                            </td>
                                        </tr>
                                    </table>
                                    <input type="submit" value="Add Tourism Info" onclick="validateData()"/>
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


