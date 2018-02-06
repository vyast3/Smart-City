package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bus_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.release();
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sql_005fquery_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Smart City Transportation</title>\n");
      out.write("        <style type=\"text/css\" media=\"screen\">\n");
      out.write("            @import url(\"css/layout.css\");\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateData() {\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                    var busId = document.getElementById(\"busId\").value;\n");
      out.write("                    var type;\n");
      out.write("                    if(document.getElementById('type1').checked) {\n");
      out.write("                        type  = document.getElementById(\"type1\").value;\n");
      out.write("\n");
      out.write("                    }else if(document.getElementById('type2').checked) {\n");
      out.write("                        type  = document.getElementById(\"type2\").value;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                    var busName = document.getElementById(\"busName\").value;\n");
      out.write("                    var city = document.getElementById(\"city\").value;\n");
      out.write("                    var busNumber = document.getElementById(\"busNumber\").value;\n");
      out.write("                    var busRTONumber = document.getElementById(\"busRTONumber\").value;\n");
      out.write("                    var busTiming = document.getElementById(\"busTiming\").value;\n");
      out.write("                    var busRoute = document.getElementById(\"busRoute\").value;\n");
      out.write("                    var stopage = document.getElementById(\"stopage\").value;\n");
      out.write("                    var fair = document.getElementById(\"fair\").value;\n");
      out.write("                    var facilities = document.getElementById(\"facilities\").value;\n");
      out.write("                    var helplineNumber = document.getElementById(\"helplineNumber\").value;\n");
      out.write("                    var remarks = document.getElementById(\"remarks\").value;\n");
      out.write("                    if(busId ==\"\" || type == \"\" || city ==\"\" || busName ==\"\" || busNumber ==\"\" || busRTONumber ==\"\" || busRTONumber ==\"\"\n");
      out.write("                        || busTiming ==\"\" || busRoute ==\"\" || stopage ==\"\" || fair ==\"\" || facilities ==\"\" || helplineNumber ==\"\" || remarks ==\"\"){\n");
      out.write("                        alert(\"Field should not be empty\");\n");
      out.write("                        \n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/BusIUrlServlet\";\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                    }else if(isNaN(stopage) || isNaN(fair) || isNaN(helplineNumber))\n");
      out.write("                    {\n");
      out.write("                        alert(\"Stopage, fair and helpline number should be numeric\");\n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/BusIUrlServlet\";\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                    }\n");
      out.write("                    else if(helplineNumber.length != 10){\n");
      out.write("                        alert(\"Please enter 10 digit number\");\n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/BusIUrlServlet\";\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                       \n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/BusEditServlet?busId=\"+busId\n");
      out.write("                            +\"&type=\"+type\n");
      out.write("                            +\"&city=\"+city\n");
      out.write("                            +\"&busName=\"+busName\n");
      out.write("                            +\"&busNumber=\"+busNumber\n");
      out.write("                            +\"&busRTONumber=\"+busRTONumber\n");
      out.write("                            +\"&busTiming=\"+busTiming\n");
      out.write("                            +\"&busRoute=\"+busRoute\n");
      out.write("                            +\"&stopage=\"+stopage\n");
      out.write("                            +\"&fair=\"+fair\n");
      out.write("                            +\"&facilities=\"+facilities\n");
      out.write("                            +\"&helplineNumber=\"+helplineNumber\n");
      out.write("                            +\"&remarks=\"+remarks;\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                function logout() {\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                    document.forms[0].action=\"/SmartCityNew/LogoutAction\";\n");
      out.write("                    document.forms[0].submit();\n");
      out.write("\n");
      out.write("                }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
    // /bus_edit.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setVar("ds1");
    // /bus_edit.jsp(12,0) name = driver type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
    // /bus_edit.jsp(12,0) name = url type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost/smartcity");
    // /bus_edit.jsp(12,0) name = user type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
    // /bus_edit.jsp(12,0) name = password type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /bus_edit.jsp(13,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f0.setVar("route");
    // /bus_edit.jsp(13,0) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
          out.write("    Select route_name from route\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /bus_edit.jsp(95,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.Session == 'Admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div id=\"layout\">\n");
        out.write("                <div id=\"header\">\n");
        out.write("                    <div id=\"logo\"><a href=\"#\"><img src=\"images/logo_1.png\" alt=\"\" /></a></div>\n");
        out.write("                    <div class=\"member_login\">\n");
        out.write("                        <div class=\"login_box\">\n");
        out.write("\n");
        out.write("                            <fieldset>\n");
        out.write("                                <div class=\"column_1\">\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"column_2\">\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"column_3\">\n");
        out.write("                                    <input type=\"image\" src=\"images/logout.jpg\" class=\"login\" onclick=\"logout()\"/>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"column_4\">\n");
        out.write("                                </div>\n");
        out.write("                            </fieldset>\n");
        out.write("\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("                <div id=\"body_container\">\n");
        out.write("                    <div id=\"body_container_inner\">\n");
        out.write("                        <div id=\"menu\">\n");
        out.write("                            <ul>\n");
        out.write("                                <li><a href=\"RouteIUrlServlet\">Add Route</a></li>\n");
        out.write("                                <li><a href=\"BusIUrlServlet\">Add Bus</a></li>\n");
        out.write("                                <li><a href=\"HospitalIUrlServlet\">Add Hospital</a></li>\n");
        out.write("                                <li><a href=\"TourismAddServlet\">Add Tourism</a></li>\n");
        out.write("                                <li><a href=\"feedback_read.jsp\">Feedback</a></li>\n");
        out.write("                                <li><a href=\"route_read.jsp\">Read Route</a></li>\n");
        out.write("                                <li><a href=\"bus_read.jsp\">Read Bus</a></li>\n");
        out.write("                                <li><a href=\"hospital_read.jsp\">Read Hospital</a></li>\n");
        out.write("\n");
        out.write("                            </ul>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"banner\"><a href=\"#\"><img src=\"images/banner_1.png\" alt=\"\" /></a></div>\n");
        out.write("                        <div class=\"find_more\">\n");
        out.write("                            <p>Find New Partners, Experience Romance &amp; Find Love!<br />\n");
        out.write("                                <span><a href=\"#\">Register Now</a> and take a sneak peak at over 9 million Singles.</span></p>\n");
        out.write("                        </div>\n");
        out.write("                        <center>\n");
        out.write("                            <h1>Add/Edit Bus information</h1>\n");
        out.write("                            ");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <form action=\"#\" method=\"post\">\n");
        out.write("                                <table border=\"0\" width=\"100%\">\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus Id:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.busId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("                                            <input type=\"hidden\" name=\"busId\" id=\"busId\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.busId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus Name:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"busName\" id=\"busName\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.busName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Select Type\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"radio\" name=\"type\" id=\"type1\" value=\"City\" checked>City</input>\n");
        out.write("                                            <input type=\"radio\" name=\"type\" id=\"type2\" value=\"Urban\">Urban</input>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            City\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"city\" id=\"city\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus Number\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"busNumber\" id=\"busNumber\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.busNO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus RTO Number\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"busRTONumber\" id=\"busRTONumber\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.busRTONumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus Timing\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"busTiming\" id=\"busTiming\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.busTiming}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus Route:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <select name=\"busRoute\" multiple=\"multiple\" id=\"busRoute\" >\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            </select></td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Stopage:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"stopage\" id=\"stopage\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.stopage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Fair per KM:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"fair\" id=\"fair\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.fair}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Facilities:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\"  name=\"facilities\" id=\"facilities\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.facilities}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Helpline Number:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\"  name=\"helplineNumber\" id=\"helplineNumber\" value= '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.helplineNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Remarks:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\"  name=\"remarks\" id=\"remarks\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Bus.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                </table>\n");
        out.write("                                <input type=\"submit\" value=\"Add Bus Info\" onclick=\"validateData()\"/>\n");
        out.write("                            </form>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        </center>\n");
        out.write("                        <div id=\"footer\">\n");
        out.write("                            <div class=\"footer_link\">\n");
        out.write("                                <ul style=\"color:#FFf;\">\n");
        out.write("                                    Copyright (c) Smart City Transportation. All rights reserved.\n");
        out.write("                                </ul>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /bus_edit.jsp(139,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Result == 'Success'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <h4>Information Added Successfully</h4>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /bus_edit.jsp(214,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("row");
    // /bus_edit.jsp(214,48) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${route.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.route_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
    // /bus_edit.jsp(215,86) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.route_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fredirect_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fredirect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_005fredirect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fredirect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /bus_edit.jsp(284,12) name = url type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fredirect_005f0.setUrl("index.jsp");
    int _jspx_eval_c_005fredirect_005f0 = _jspx_th_c_005fredirect_005f0.doStartTag();
    if (_jspx_th_c_005fredirect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
    return false;
  }
}
