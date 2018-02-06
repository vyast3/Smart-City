/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class SmartCityControllerServlet extends HttpServlet {
    public static String type="";
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String outcome = "/route.jsp";
        HttpSession session = request.getSession();

        String uri = request.getRequestURI();
        if (uri.endsWith("/RouteEditServlet")) {
            Route bean = new Route();
            SmartCityRouteDB.mappingRoute(request, bean);

            String operation = (String) session.getAttribute("Operation");
            if (operation.equals("U")) {
                int row = SmartCityRouteDB.updateRoute(bean);
                System.out.println("row count "+row+", "+bean.getRouteId());
                outcome = "/route_read.jsp";
            }
            if (operation.equals("I")) {
                SmartCityRouteDB.insertRoute(bean);
                outcome = "/RouteIUrlServlet";
            }
            request.setAttribute("Result", "Success");
        }
        if (uri.endsWith("/RouteUUrlServlet")) {
            String routeId = request.getParameter("routeId");
            Route bean = SmartCityRouteDB.getUpdateRouteBean(routeId);
            request.setAttribute("Route", bean);
            session.setAttribute("Operation", "U");
            outcome = "/route_add.jsp";
        }
          if (uri.endsWith("/RouteIUrlServlet")) {
            Route bean = new Route();
            request.setAttribute("Route", bean);
            session.setAttribute("Operation", "I");
            outcome = "/route_add.jsp";
        }

         if (uri.endsWith("/RouteDServlet")) {
            Route bean = new Route();
            SmartCityRouteDB.mappingRoute(request, bean);
            SmartCityRouteDB.deleteRoute(bean);
            outcome = "/route_read.jsp";
        }

         if (uri.endsWith("/AdminLogin")) {
            if(request.getParameter("name").equalsIgnoreCase("Admin") && request.getParameter("password").equalsIgnoreCase("Password")){
                    request.setAttribute("Result", "success");
                    session.setAttribute("Session", "Admin");
               outcome = "/admin.jsp";
            }
            else{
                request.setAttribute("Result", "error");
               outcome = "/index.jsp";
            }
        }

        if (uri.endsWith("/RouteInfoSearch")) {
            String cityName = request.getParameter("cityName");
            request.setAttribute("cityName", cityName);
            request.setAttribute("type", type);
            request.setAttribute("Operation", "RouteInfoSearch");
            outcome = "/search_route.jsp";
        }

         if (uri.endsWith("/RouteRadioCalled")) {
            type = request.getParameter("type");

            request.setAttribute("type", type);
            request.setAttribute("Operation", "ShowCityName");
            outcome = "/search_route.jsp";
        }

        if (uri.endsWith("/FeedbackAddServlet")) {
            SmartCityRouteDB.insertFeedback(request);
            request.setAttribute("Result", "Success");
            outcome = "/add_feedback.jsp";
        }

        if (uri.endsWith("/FeedbackServlet")) {
            
            outcome = "/add_feedback.jsp";
        }

        if (uri.endsWith("/PathFinderServlet")) {
            request.setAttribute("Operation", "PathFind");
//            request.setAttribute("source", request.getParameter("source"));
//            request.setAttribute("destination", request.getParameter("destination"));
            request.setAttribute("routePoint", request.getParameter("routePoint"));
            outcome = "/pathfinder.jsp";
        }
        if (uri.endsWith("/PathFinderPage")) {
            request.setAttribute("Operation", "PathFindPage");
            outcome = "/pathfinder.jsp";
        }
        if (uri.endsWith("/LogoutAction")) {
            request.setAttribute("Operation", "PathFindPage");
            session.setAttribute("Session", "Logout");
            session.invalidate();
            outcome = "/index.jsp";
        }
       getServletContext().getRequestDispatcher(outcome).forward(request, response);
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
