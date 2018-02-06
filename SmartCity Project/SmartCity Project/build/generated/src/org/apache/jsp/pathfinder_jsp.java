package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pathfinder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("﻿<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_sql_005fquery_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\n");
      out.write("        <title>Smart City Transportation</title>\n");
      out.write("        <style type=\"text/css\" media=\"screen\">\n");
      out.write("            @import url(\"css/layout.css\");\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            html { height: 100% }\n");
      out.write("            body { height: 100%; margin: 0; padding: 0 }\n");
      out.write("            #map_canvas { height: 100% }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("                src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyCHLeDxIjgTe6hYIoWEzy2EURxWazuY3oQ&sensor=true&geodesic:true\">\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" >\n");
      out.write("            function initialize() {\n");
      out.write("                geocoder = new google.maps.Geocoder();\n");
      out.write("                var latlng = new google.maps.LatLng(21,77);\n");
      out.write("                var myOptions = {\n");
      out.write("                    zoom: 8,\n");
      out.write("                    center: latlng,\n");
      out.write("                    mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("                }\n");
      out.write("                map = new google.maps.Map(document.getElementById(\"map_canvas\"), myOptions);\n");
      out.write("            }\n");
      out.write("            function codeAddress(routePoint, city) {\n");
      out.write("            ");
      out.write("\n");
      out.write("                    var array = routePoint.split(',');\n");
      out.write("\n");
      out.write("                    for(i = 0 ; i < array.length-1; i++){\n");
      out.write("                        var address1 = array[i]+\", \"+city ;\n");
      out.write("                            \n");
      out.write("                        var address2 = array[i+1]+\", \"+city;\n");
      out.write("                        var p1,p2;\n");
      out.write("                        var mygc = new google.maps.Geocoder();\n");
      out.write("                        mygc.geocode({'address' : address1}, function(results, status){\n");
      out.write("                            <!--alert( \"lat long: \" + results[0].geometry.location.lat()+\", \"+ results[0].geometry.location.lng() );-->\n");
      out.write("                            map.setCenter(results[0].geometry.location);\n");
      out.write("                            p1=results[0].geometry.location.lat();\n");
      out.write("                            p2= results[0].geometry.location.lng();\n");
      out.write("                            var marker = new google.maps.Marker({\n");
      out.write("                                map: map,\n");
      out.write("                                position: results[0].geometry.location\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        var mygc = new google.maps.Geocoder();\n");
      out.write("                        mygc.geocode({'address' : address2}, function(results, status){\n");
      out.write("                            <!--alert( \"lat long: \" + results[0].geometry.location.lat()+\", \"+ results[0].geometry.location.lng() );-->\n");
      out.write("                            map.setCenter(results[0].geometry.location);\n");
      out.write("\n");
      out.write("                            var marker = new google.maps.Marker({\n");
      out.write("                                map: map,\n");
      out.write("                                position: results[0].geometry.location\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                            var flightPlanCoordinates = [\n");
      out.write("                                new google.maps.LatLng(p1, p2),\n");
      out.write("                                new google.maps.LatLng(results[0].geometry.location.lat(), results[0].geometry.location.lng()),\n");
      out.write("\n");
      out.write("                            ];\n");
      out.write("                            var flightPath = new google.maps.Polyline({\n");
      out.write("                                path: flightPlanCoordinates,\n");
      out.write("                                strokeColor: \"#FF0000\",\n");
      out.write("                                strokeOpacity: 1.0,\n");
      out.write("                                strokeWeight: 2\n");
      out.write("                            });\n");
      out.write("                            flightPath.setMap(map);\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                            var service = new google.maps.DistanceMatrixService();\n");
      out.write("                            service.getDistanceMatrix(\n");
      out.write("                            {\n");
      out.write("                                origins: [array[0]+\", \"+city],\n");
      out.write("                                destinations: [array[array.length-1]+\", \"+city],\n");
      out.write("                                travelMode: google.maps.TravelMode.DRIVING,\n");
      out.write("                                avoidHighways: false,\n");
      out.write("                                avoidTolls: false\n");
      out.write("                            }, callback);\n");
      out.write("\n");
      out.write("                            function callback(response, status) {\n");
      out.write("                                if (status == google.maps.DistanceMatrixStatus.OK) {\n");
      out.write("                                    var origins = response.originAddresses;\n");
      out.write("                                    var destinations = response.destinationAddresses;\n");
      out.write("\n");
      out.write("                                    for (var i = 0; i < origins.length; i++) {\n");
      out.write("                                        var results = response.rows[i].elements;\n");
      out.write("                                        for (var j = 0; j < results.length; j++) {\n");
      out.write("                                            var element = results[j];\n");
      out.write("                                            var distance = element.distance.text;\n");
      out.write("                                            var duration = element.duration.text;\n");
      out.write("                                            var from = origins[i];\n");
      out.write("                                            var to = destinations[j];\n");
      out.write("            ");
      out.write("\n");
      out.write("                                            document.getElementById(\"result\").innerHTML=distance;\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            ");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div id=\"layout\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\"><a href=\"#\"><img src=\"images/logo_1.png\" alt=\"\" /></a></div>\n");
      out.write("                <div class=\"member_login\">\n");
      out.write("                    <div class=\"login_box\">\n");
      out.write("                        <form action=\"AdminLogin\" method=\"get\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"column_1\">\n");
      out.write("                                    <label>username :</label>\n");
      out.write("                                    <label>password :</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"column_2\">\n");
      out.write("                                    <input type=\"text\" name=\"name\"/>\n");
      out.write("                                    <input type=\"password\" name=\"password\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"column_3\">\n");
      out.write("                                    <input type=\"image\" src=\"images/login_btn.gif\" class=\"login\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"column_4\">\n");
      out.write("                                    <label class=\"password\"><a href=\"#\">Forgot <br />\n");
      out.write("                                            password</a></label>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"body_container\">\n");
      out.write("                <div id=\"body_container_inner\">\n");
      out.write("                    <div id=\"menu\">\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                            <li><a href=\"PathFinderPage\">Path Finder</a></li>\n");
      out.write("                            <li><a href=\"search_businfo.jsp\">Bus Info</a></li>\n");
      out.write("                            <li><a href=\"search_route.jsp\">Route Info</a></li>\n");
      out.write("                            <li><a href=\"search_hospitalinfo.jsp\">Hospital Info</a></li>\n");
      out.write("                            <li><a href=\"search_tourisminfo.jsp\">Tourist Place Info</a></li>\n");
      out.write("                            <li><a href=\"FeedbackServlet\">Feedback</a></li>\n");
      out.write("                            <li><a href=\"about_us.jsp\">About us</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"banner\"><a href=\"#\"><img src=\"images/banner.png\" alt=\"\" /></a></div>\n");
      out.write("                    <div class=\"find_more\">\n");
      out.write("                        <p>Find New Partners, Experience Romance &amp; Find Love!<br />\n");
      out.write("                            <span><a href=\"#\">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container_row\">\n");
      out.write("                        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /pathfinder.jsp(268,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Operation == 'PathFindPage'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");

            System.out.println("psth find psgr opers");
                            
          out.write("\n");
          out.write("                            <script type=\"text/javascript\">\n");
          out.write("                                initialize();\n");
          out.write("\n");
          out.write("                            </script>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write("\n");
      out.write("                        <center>\n");
      out.write("\n");
      out.write("                            <form action=\"PathFinderServlet\" method=\"post\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"2\">\n");
      out.write("                                            <center>\n");
      out.write("                                                <h1>Path Finder Page</h1>\n");
      out.write("                                            </center>\n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <br/>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            Select any route\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"routePoint\" id=\"busRoute\" >\n");
      out.write("                                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"2\">\n");
      out.write("                                            <center>\n");
      out.write("                                                <input type=\"submit\" value=\"Draw path\" />\n");
      out.write("                                            </center>\n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                            <br/>\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <br/>\n");
      out.write("                        </center>\n");
      out.write("\n");
      out.write("                        <div id=\"map_canvas\" style=\"width:85%; height:60%; margin-left:60px; margin-right:10px\"></div>\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("                        <div class=\"footer_link\">\n");
      out.write("                            <ul style=\"color:#FFf;\">\n");
      out.write("                                Copyright (c) Smart City Transportation. All rights reserved.\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
    // /pathfinder.jsp(13,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setVar("dsn1");
    // /pathfinder.jsp(13,0) name = driver type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
    // /pathfinder.jsp(13,0) name = url type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost/smartcity");
    // /pathfinder.jsp(13,0) name = user type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
    // /pathfinder.jsp(13,0) name = password type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setPassword("chidya");
    int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
    if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_005fquery_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fquery_005f0.setParent(null);
    // /pathfinder.jsp(15,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f0.setVar("route");
    // /pathfinder.jsp(15,0) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dsn1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_sql_005fquery_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_005fquery_005f0 = _jspx_th_sql_005fquery_005f0.doStartTag();
      if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_005fquery_005f0[0]++;
          _jspx_th_sql_005fquery_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_005fquery_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    SELECT * FROM route;\n");
          out.write("\n");
          int evalDoAfterBody = _jspx_th_sql_005fquery_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_005fquery_005f0[0]--;
        }
      }
      if (_jspx_th_sql_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_005fquery_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_005fquery_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_005fquery_005f0.doFinally();
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pathfinder.jsp(296,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("row");
    // /pathfinder.jsp(296,48) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${route.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.route_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</option>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /pathfinder.jsp(298,84) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.route_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /pathfinder.jsp(333,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Operation == 'PathFind'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                Minimum distance between the station is <div id=\"result\"></div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /pathfinder.jsp(341,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Operation == 'PathFind'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_sql_005fquery_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_005fquery_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fquery_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /pathfinder.jsp(342,28) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f1.setVar("route1");
    // /pathfinder.jsp(342,28) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dsn1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_sql_005fquery_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_005fquery_005f1 = _jspx_th_sql_005fquery_005f1.doStartTag();
      if (_jspx_eval_sql_005fquery_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_005fquery_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_005fquery_005f1[0]++;
          _jspx_th_sql_005fquery_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_005fquery_005f1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                SELECT * FROM smartcity.route r where r.route_id like ? ;\n");
          out.write("                                ");
          if (_jspx_meth_sql_005fparam_005f0(_jspx_th_sql_005fquery_005f1, _jspx_page_context, _jspx_push_body_count_sql_005fquery_005f1))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_005fquery_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_005fquery_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_005fquery_005f1[0]--;
        }
      }
      if (_jspx_th_sql_005fquery_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_005fquery_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_005fquery_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_005fquery_005f1.doFinally();
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_005fquery_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_005fquery_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_005fquery_005f1);
    // /pathfinder.jsp(344,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fparam_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.routePoint}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_sql_005fparam_005f0 = _jspx_th_sql_005fparam_005f0.doStartTag();
    if (_jspx_th_sql_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /pathfinder.jsp(347,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setVar("row");
    // /pathfinder.jsp(347,28) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${route1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <script type=\"text/javascript\">\n");
          out.write("                                    initialize();\n");
          out.write("                                    codeAddress('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.route_location}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("' );\n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                </script>\n");
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_sql_005fquery_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\n");
          out.write("                                <br/>\n");
          out.write("                                <center>\n");
          out.write("                                    <h2>Bus information</h2>\n");
          out.write("                                </center>\n");
          out.write("                                <table border=\"1\" width=\"100%\">\n");
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <th>Bus Name</th>\n");
          out.write("                                        <th>Bus No.</th>\n");
          out.write("                                        <th>Timing</th>\n");
          out.write("                                        <th>Route</th>\n");
          out.write("                                        <th>Stopage</th>\n");
          out.write("                                        <th>Fair per K.M.</th>\n");
          out.write("                                        <th>Facilities</th>\n");
          out.write("                                        <th>Helpline No.</th>\n");
          out.write("                                        <th>Type</th>\n");
          out.write("                                        <th>City Name</th>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                </table>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_005fquery_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fquery_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /pathfinder.jsp(354,32) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f2.setVar("query1");
    // /pathfinder.jsp(354,32) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dsn1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_sql_005fquery_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_005fquery_005f2 = _jspx_th_sql_005fquery_005f2.doStartTag();
      if (_jspx_eval_sql_005fquery_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_005fquery_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_005fquery_005f2[0]++;
          _jspx_th_sql_005fquery_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_005fquery_005f2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                    SELECT * FROM smartcity.businfo b where b.bus_route like ? ;\n");
          out.write("                                    ");
          if (_jspx_meth_sql_005fparam_005f1(_jspx_th_sql_005fquery_005f2, _jspx_page_context, _jspx_push_body_count_sql_005fquery_005f2))
            return true;
          out.write("\n");
          out.write("                                    \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_sql_005fquery_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_005fquery_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_005fquery_005f2[0]--;
        }
      }
      if (_jspx_th_sql_005fquery_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_005fquery_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_005fquery_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_005fquery_005f2.doFinally();
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_005fquery_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_005fquery_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_005fparam_005f1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_005fquery_005f2);
    // /pathfinder.jsp(356,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fparam_005f1.setValue("%" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.route_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "%");
    int _jspx_eval_sql_005fparam_005f1 = _jspx_th_sql_005fparam_005f1.doStartTag();
    if (_jspx_th_sql_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /pathfinder.jsp(379,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f2.setVar("row");
    // /pathfinder.jsp(379,36) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.bus_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.bus_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.bus_timing}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.bus_route}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.stopage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.fair}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.facilities}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.helpline_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}
