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
                    var hospitalId = document.getElementById("hospitalId").value;
                    var type;
                    if(document.getElementById('type1').checked) {
                        type  = document.getElementById("type1").value;

                    }else if(document.getElementById('type2').checked) {
                        type  = document.getElementById("type2").value;

                    }
                    var hospitalName = document.getElementById("hospitalName").value;
                    var hospitalCity = document.getElementById("hospitalCity").value;
                    var hospitalAddress = document.getElementById("hospitalAddress").value;
                    var hospitalEmail = document.getElementById("hospitalEmail").value;
                    var hospitalWebsite = document.getElementById("hospitalWebsite").value;
                    var hospitalTiming = document.getElementById("hospitalTiming").value;
                    var hospitalFacilities = document.getElementById("hospitalFacilities").value;
                    var doctorsName = document.getElementById("doctorsName").value;
                 
                    var hospitalContact = document.getElementById("hospitalContact").value;
                  
                    if(hospitalId =="" || type == "" || hospitalCity =="" || hospitalName =="" || hospitalAddress =="" || hospitalEmail ==""
                        || hospitalWebsite =="" || hospitalTiming =="" || hospitalFacilities =="" || doctorsName =="" || hospitalContact ==""){
                        alert("Field should not be empty");
                    }else{
                        if(isNaN(hospitalContact))
                        {
                            alert("HospitalContact number should be number");
                           
                        }
                        else{
                            var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
                            if(reg.test(hospitalEmail) == false) {

                                alert('Invalid hospital Email Address');

                            }
                            else{
                                document.forms[0].action="/SmartCityNew/HospitalEditServlet?hospitalId="+hospitalId
                                    +"&type="+type
                                    +"&hospitalCity="+hospitalCity
                                    +"&hospitalName="+hospitalName
                                    +"&hospitalAddress="+hospitalAddress
                                    +"&hospitalEmail="+hospitalEmail
                                    +"&hospitalWebsite="+hospitalWebsite
                                    +"&hospitalTiming="+hospitalTiming
                                    +"&hospitalFacilities="+hospitalFacilities
                                    +"&doctorsName="+doctorsName
                                    +"&hospitalContact="+hospitalContact
                                ;
                                document.forms[0].submit();
                            }
                            
                        }
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
                                <h1>Add/Edit Hospital information</h1>
                                <%--<c:if test="${requestScope.Result == 'Success'}">
                                    <h4>Information Added Successfully</h4>
                                </c:if>--%>
                                <form action="#" method="post">
                                    <table border="0" width="100%">
                                        <tr>
                                            <td width="40%">
                                                Hospital Id:
                                            </td>
                                            <td width="60%">
                                                ${requestScope.Hospital.id}
                                                <input type="hidden" name="hospitalId" id="hospitalId" value='${requestScope.Hospital.id}'/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Hospital Name:
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="hospitalName" id="hospitalName" value='${requestScope.Hospital.name}'/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Hospital Address
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="hospitalAddress" id="hospitalAddress" value='${requestScope.Hospital.address}'/>

                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Select Type
                                            </td>
                                            <td width="60%">
                                                <input type="radio" name="type" id="type1" value="City" checked>City</input>
                                                <input type="radio" name="type" id="type2" value="Urban">Urban</input>
                                                <%--<input type="radio" name="type"  value="{'City','Urban'}" />--%>

                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                City
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="hospitalCity" id="hospitalCity" value='${requestScope.Hospital.city}'/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td width="40%">
                                                Hospital Contact
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="hospitalContact" id="hospitalContact" value='${requestScope.Hospital.contact}'/>
                                            </td>
                                        </tr>



                                        <tr>
                                            <td width="40%">
                                                Email Id
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="hospitalEmail" id="hospitalEmail" value='${requestScope.Hospital.emailId}'/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="40%">
                                                Website Name:
                                            </td>
                                            <td width="60%">
                                                <input type="text" name="hospitalWebsite" id="hospitalWebsite" value='${requestScope.Hospital.website}'/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="40%">
                                                Timing:
                                            </td>
                                            <td width="60%">
                                                <input type="text"  name="hospitalTiming" id="hospitalTiming" value= '${requestScope.Hospital.timing}'/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="40%">
                                                Facilities:
                                            </td>
                                            <td width="60%">
                                                <textarea name="hospitalFacilities" id="hospitalFacilities" cols="30" rows="5">${requestScope.Hospital.facilities}</textarea>

                                                <%-- <input type="text"  name="hospitalFacilities" value='${requestScope.Hospital.facilities}'/>--%>
                                            </td>
                                        </tr>



                                        <tr>
                                            <td width="40%">
                                                Doctors Name:
                                            </td>
                                            <td width="60%">
                                                <textarea name="doctorsName" cols="30" id="doctorsName" rows="5">${requestScope.Hospital.drNames}</textarea>

                                            </td>
                                        </tr>

                                    </table>
                                    <input type="submit" value="Add Hospital Info" onclick="validateData()"/>
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


