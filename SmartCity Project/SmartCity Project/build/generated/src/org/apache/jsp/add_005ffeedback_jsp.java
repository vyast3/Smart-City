package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005ffeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("﻿<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
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
      out.write("                    var name = document.getElementById(\"name1\").value;\n");
      out.write("                    var contact = document.getElementById(\"contact\").value;\n");
      out.write("                    var email = document.getElementById(\"email\").value;\n");
      out.write("                    var query = document.getElementById(\"query\").value;\n");
      out.write("                    var reg = /^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$/;\n");
      out.write("                       \n");
      out.write("                    if(name ==\"\" || contact == \"\" || email ==\"\" || query ==\"\" ){\n");
      out.write("                        alert(\"Field should not be empty\");\n");
      out.write("                    }else if(reg.test(email) == false) {\n");
      out.write("\n");
      out.write("                        alert('Invalid Email Address');\n");
      out.write("                         document.forms[0].action=\"/SmartCityNew/FeedbackServlet\";\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                            \n");
      out.write("                    }else if(isNaN(contact))\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter number\");\n");
      out.write("                         document.forms[0].action=\"/SmartCityNew/FeedbackServlet\";\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                                \n");
      out.write("                    }else if(contact.length != 10){\n");
      out.write("                        alert(\"Please enter 10 digit number\");\n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/FeedbackServlet\";\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        document.forms[0].action=\"/SmartCityNew/FeedbackAddServlet?name=\"+name\n");
      out.write("                            +\"&contact=\"+contact\n");
      out.write("                            +\"&email=\"+email\n");
      out.write("                            +\"&query=\"+query;\n");
      out.write("                        document.forms[0].submit();\n");
      out.write("                    }\n");
      out.write("                     \n");
      out.write("                }\n");
      out.write("                function login() {\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                    document.forms[0].action=\"/SmartCityNew/AdminLogin?name=\"+document.getElementById(\"name\").value\n");
      out.write("                        +\"&password=\"+document.getElementById(\"password\").value;\n");
      out.write("                    document.forms[0].submit();\n");
      out.write("\n");
      out.write("                }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"layout\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\"><a href=\"#\"><img src=\"images/logo_1.png\" alt=\"\" /></a></div>\n");
      out.write("                <div class=\"member_login\">\n");
      out.write("                    <div class=\"login_box\">\n");
      out.write("\n");
      out.write("                        <fieldset>\n");
      out.write("                            <div class=\"column_1\">\n");
      out.write("                                <label>username :</label>\n");
      out.write("                                <label>password :</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column_2\">\n");
      out.write("                                <input type=\"text\" name=\"name\" id=\"name\"/>\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column_3\">\n");
      out.write("                                <input type=\"image\" src=\"images/login_btn.gif\" class=\"login\" onclick=\"login()\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column_4\">\n");
      out.write("                                <label class=\"password\"><a href=\"#\">Forgot <br />\n");
      out.write("                                        password</a></label>\n");
      out.write("                            </div>\n");
      out.write("                        </fieldset>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"body_container\">\n");
      out.write("                <div id=\"body_container_inner\">\n");
      out.write("                    <div id=\"menu\">\n");
      out.write("                        <ul>\n");
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
      out.write("                    <br/><br/>\n");
      out.write("                    <center>\n");
      out.write("                        <h1>Feedback Form</h1>\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <form action=\"#\" method=\"post\" id=\"form1\">\n");
      out.write("                            <table border=\"0\" width=\"100%\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"40%\">\n");
      out.write("                                        Name:\n");
      out.write("                                    </td>\n");
      out.write("                                    <td width=\"60%\">\n");
      out.write("                                        <input type=\"text\" name=\"name1\" id=\"name1\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"40%\">\n");
      out.write("                                        Contact No.:\n");
      out.write("                                    </td>\n");
      out.write("                                    <td width=\"60%\">\n");
      out.write("                                        <input type=\"text\" name=\"contact\" id=\"contact\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"40%\">\n");
      out.write("                                        Email Id:\n");
      out.write("                                    </td>\n");
      out.write("                                    <td width=\"60%\">\n");
      out.write("                                        <input type=\"text\" name=\"email\" id=\"email\"/>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"40%\">\n");
      out.write("                                        Complain/Queries:\n");
      out.write("                                    </td>\n");
      out.write("                                    <td width=\"60%\">\n");
      out.write("                                        <textarea name=\"query\" cols=\"39\" rows=\"6\" id=\"query\"></textarea>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                            <input type=\"button\" value=\"Submit\" onclick=\"validateData()\"/>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </center>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /add_feedback.jsp(116,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Result == 'Success'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <h3>Feedback submitted successfully</h3>\n");
        out.write("                        ");
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
}
