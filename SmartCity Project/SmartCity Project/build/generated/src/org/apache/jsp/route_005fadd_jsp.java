package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class route_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
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
      out.write("                    var routeId = document.getElementById(\"routeId\").value;\n");
      out.write("                    var type;\n");
      out.write("                    if(document.getElementById('type1').checked) {\n");
      out.write("                        type  = document.getElementById(\"type1\").value;\n");
      out.write("                       \n");
      out.write("                    }else if(document.getElementById('type2').checked) {\n");
      out.write("                        type  = document.getElementById(\"type2\").value;\n");
      out.write("                       \n");
      out.write("                    }\n");
      out.write("                    var city = document.getElementById(\"city\").value;\n");
      out.write("                    var routeName = document.getElementById(\"routeName\").value;\n");
      out.write("                    var routeInfo = document.getElementById(\"routeInfo\").value;\n");
      out.write("                    var routeLocation = document.getElementById(\"routeLocation\").value;\n");
      out.write("\n");
      out.write("                    if(routeId ==\"\" || type == \"\" || city ==\"\" || routeName ==\"\" || routeInfo ==\"\" || routeLocation ==\"\"){\n");
      out.write("                        alert(\"Field should not be empty\");\n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/RouteIUrlServlet\";\n");
      out.write("                    document.forms[0].submit();\n");
      out.write("                    }else{\n");
      out.write("                        \n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/RouteEditServlet?routeId=\"+routeId\n");
      out.write("                            +\"&type=\"+type\n");
      out.write("                            +\"&city=\"+city\n");
      out.write("                            +\"&routeName=\"+routeName\n");
      out.write("                            +\"&routeInfo=\"+routeInfo\n");
      out.write("                            +\"&routeLocation=\"+routeLocation;\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                       \n");
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
    // /route_add.jsp(65,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
        out.write("                            <h1>Add/Edit Route</h1>\n");
        out.write("                            ");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <form action=\"#\" method=\"post\">\n");
        out.write("                                <table border=\"0\" width=\"100%\">\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Route Id:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Route.routeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("                                            <input type=\"hidden\" name=\"routeId\" id=\"routeId\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Route.routeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            City:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"city\" id=\"city\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Route.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Route Name:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <input type=\"text\" name=\"routeName\" id=\"routeName\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Route.routeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Route Information:\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <textarea name=\"routeInfo\" id=\"routeInfo\" cols=\"39\" rows=\"6\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Route.routeInformation}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\n");
        out.write("                                            ");
        out.write("\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td width=\"40%\">\n");
        out.write("                                            Route Path Location Name:<br/>\n");
        out.write("                                            (Please enter comma seprated value of path)\n");
        out.write("                                        </td>\n");
        out.write("                                        <td width=\"60%\">\n");
        out.write("                                            <textarea name=\"routeLocation\" id=\"routeLocation\" cols=\"39\" rows=\"6\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Route.routeLocation}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\n");
        out.write("\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("\n");
        out.write("                                </table>\n");
        out.write("                                <input type=\"submit\" value=\"Add Route\" onclick=\"validateData()\"/>\n");
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
    // /route_add.jsp(108,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /route_add.jsp(186,12) name = url type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
