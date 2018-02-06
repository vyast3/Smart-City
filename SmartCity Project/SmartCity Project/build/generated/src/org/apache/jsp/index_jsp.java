package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("﻿<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Smart City Transportation</title>\n");
      out.write("        <style type=\"text/css\" media=\"screen\">\n");
      out.write("            @import url(\"css/layout.css\");\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                                    <label class=\"password\">\n");
      out.write("                                    </label>\n");
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
      out.write("                            <li><a href=\"add_feedback.jsp\">Feedback</a></li>\n");
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
      // /index.jsp(68,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.Result == 'error'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");

                            System.out.println("psth find psgr opers");
                            
          out.write("\n");
          out.write("                            <script type=\"text/javascript\">\n");
          out.write("                                alert(\"Password or Username may be wrong! Please enter valid information\");\n");
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
      out.write("                            <h1>Welcome to Smart City Website</h1>\n");
      out.write("                        </center>\n");
      out.write("                        <h3>\n");
      out.write("                            The project Smart-City-Transportation serves the basic need of managing information management in the field of transportation. It is a common experience of every individual that in big cities of India, commutation within and outside the city can be very chaotic if the information such as distance, average time etc. about a forthcoming journey is unknown. This results in loss of valuable resources like time, money etc., And if there is any source of information then the expected problem can be prepared for in advance.\n");
      out.write("                            <br/><br/>\n");
      out.write("                            The primary object of devising this system is to provide real time information to an individual about the transporting facilities available inside and outside the city. This project manages the information available completely and effectively so that the user needs minimum time to reach and extract the required information. Also this project aims to be user friendly, that is to say, it does not require any great expertise to operate this system. The project aims to capture the information available or that can be made available at a single point, this in itself is a great help to those seeking such information especially to those who are new into the city. Also this system can implemented, with little change in databases, so that it can work for any city across the country. When people move from one city to another city it is often noticed that they do not have any adequate knowledge of even the most prominent sites of the city, let alone the ‘not-so-known’ sites of the city.\n");
      out.write("                            One of the main objectives of this system is to divide the information of the transportation into small and manageable modules so that the user can reach the required information within small time and utilize it.\n");
      out.write("\n");
      out.write("                        </h3>\n");
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
}
