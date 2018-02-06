package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bus_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sql_query_0(_jspx_page_context))
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
      out.write("                    }else{\n");
      out.write("                        if(isNaN(stopage) || isNaN(fair) || isNaN(helplineNumber))\n");
      out.write("                        {\n");
      out.write("                            alert(\"Stopage, fair and helpline number should be numeric\");\n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("                        else{\n");
      out.write("                            document.forms[0].action=\"/SmartCityNew/BusEditServlet?busId=\"+busId\n");
      out.write("                                +\"&type=\"+type\n");
      out.write("                                +\"&city=\"+city\n");
      out.write("                                +\"&busName=\"+busName\n");
      out.write("                                +\"&busNumber=\"+busNumber\n");
      out.write("                                +\"&busRTONumber=\"+busRTONumber\n");
      out.write("                                +\"&busTiming=\"+busTiming\n");
      out.write("                                +\"&busRoute=\"+busRoute\n");
      out.write("                                +\"&stopage=\"+stopage\n");
      out.write("                                +\"&fair=\"+fair\n");
      out.write("                                +\"&facilities=\"+facilities\n");
      out.write("                                +\"&helplineNumber=\"+helplineNumber\n");
      out.write("                                +\"&remarks=\"+remarks;\n");
      out.write("                            document.forms[0].submit();\n");
      out.write("                        }\n");
      out.write("                    }\n");
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
      if (_jspx_meth_c_choose_0(_jspx_page_context))
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
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("ds1");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost/smartcity");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("chidya");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("route");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ds1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    Select route_name from route\n");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Session == 'Admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.busId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                            <input type=\"hidden\" name=\"busId\" id=\"busId\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.busId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.busName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Bus Number\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"busNumber\" id=\"busNumber\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.busNO}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.busRTONumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.busTiming}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.stopage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Fair per KM:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"fair\" id=\"fair\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.fair}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.facilities}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.helplineNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Bus.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Result == 'Success'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <h4>Information Added Successfully</h4>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${route.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.route_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.route_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_redirect_0.setUrl("index.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
