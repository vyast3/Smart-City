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
public class TourismControllerServlet extends HttpServlet {
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
        String outcome = "/bus.jsp";
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        if (uri.endsWith("/TourismEditServlet")) {
            Tourism bean = new Tourism();
            SmartCityTourismlDB.mappingTourismInfo(request, bean);
            SmartCityTourismlDB.insertTourismInfo(bean);
            request.setAttribute("Result", "Success");
            Tourism beans = new Tourism();
            request.setAttribute("Tourism", beans);
            outcome = "/tourism_edit.jsp";
            
        }
        if (uri.endsWith("/TourismAddServlet")) {
            Tourism beans = new Tourism();
            request.setAttribute("Tourism", beans);
            outcome = "/tourism_edit.jsp";
        }

        if (uri.endsWith("/TourismInfoSearch")) {
            String cityName = request.getParameter("cityName");
            request.setAttribute("cityName", cityName);
            request.setAttribute("type", type);
            request.setAttribute("Operation", "TourismInfoSearch");
            outcome = "/search_tourisminfo.jsp";
        }

         if (uri.endsWith("/TourismRadioCalled")) {
            type = request.getParameter("type");

            request.setAttribute("type", type);
            request.setAttribute("Operation", "ShowCityName");
            outcome = "/search_tourisminfo.jsp";
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
