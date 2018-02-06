package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mapdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n");
      out.write("    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            html { height: 100% }\n");
      out.write("            body { height: 100%; margin: 0; padding: 0 }\n");
      out.write("            #map_canvas { height: 80% }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("                src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyCHLeDxIjgTe6hYIoWEzy2EURxWazuY3oQ&libraries=geometry&sensor=false\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var geocoder;\n");
      out.write("            var map;\n");
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
      out.write("\n");
      out.write("            function codeAddress() {\n");
      out.write("                \n");
      out.write("                var address1 = document.getElementById(\"address1\").value;\n");
      out.write("                var address2 = document.getElementById(\"address2\").value;\n");
      out.write("                var marker1,marker2;\n");
      out.write("                var distance;\n");
      out.write("                geocoder.geocode( { 'address': address1}, function(results, status) {\n");
      out.write("                    if (status == google.maps.GeocoderStatus.OK) {\n");
      out.write("                        map.setCenter(results[0].geometry.location);\n");
      out.write("                        marker1 = new google.maps.Marker({\n");
      out.write("                            map: map,\n");
      out.write("                            position: results[0].geometry.location,\n");
      out.write("                            draggable: true\n");
      out.write("                        });\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                    } else {\n");
      out.write("                        alert(\"Geocode was not successful for the following reason: \" + status);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                geocoder.geocode( { 'address': address2}, function(results, status) {\n");
      out.write("                    if (status == google.maps.GeocoderStatus.OK) {\n");
      out.write("                        //        map.setCenter(results[0].geometry.location);\n");
      out.write("                        marker2 = new google.maps.Marker({\n");
      out.write("                            map: map,\n");
      out.write("                            position: results[0].geometry.location\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("                        distance = marker1.getPoint().distanceFrom(marker2.getPoint());\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    } else {\n");
      out.write("                        \n");
      out.write("                        alert(\"Geocode was not successful for the following reason: \" + status);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                  google.maps.event.addListener(marker.map, 'click', function(event) {\n");
      out.write("                            document.getElementById(\"lblCheck\").innerHTML = event;\n");
      out.write("                            alert(event.latLng);\n");
      out.write("                        });\n");
      out.write("                }\n");
      out.write("                function changeText() {\n");
      out.write("                    document.getElementById(\"lblCheck\").innerHTML = 'server';\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"initialize()\">\n");
      out.write("        <div id=\"map_canvas\" style=\"width: 320px; height: 480px;\"></div>\n");
      out.write("        <div>\n");
      out.write("            <input id=\"address1\" type=\"textbox\" value=\"palasia, indore\"/>\n");
      out.write("            <input id=\"address2\" type=\"textbox\" value=\"vijaynagar, indore\"/>\n");
      out.write("            <label id=\"lblCheck\"> asfasf</label>\n");
      out.write("            <form action=\"#\">\n");
      out.write("\n");
      out.write("                <input type=\"button\" value=\"Encode\" onclick=\"codeAddress()\"/>\n");
      out.write("                <input id=\"result\" name=\"result\" type=\"textbox\" value=\"0\"/>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <input type='button' onclick='changeText()' value='Change Text' />\n");
      out.write("            <p id=\"p1\">sas</p>\n");
      out.write("        </div>\n");
      out.write("        <p id=\"demo\"></p>\n");
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
