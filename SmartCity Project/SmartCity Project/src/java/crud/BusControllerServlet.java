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
public class BusControllerServlet extends HttpServlet {
   public static String type;
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
        if (uri.endsWith("/BusEditServlet")) {
            BusInfo busBean = new BusInfo();
            SmartCityBusDB.mappingBusInfo(request, busBean);

            String operation = (String) session.getAttribute("Operation");
            if (operation.equals("U")) {
                int row = SmartCityBusDB.updateBusInfo(busBean);
                System.out.println("row count "+row+", "+busBean.getBusId());
                outcome = "/bus_read.jsp";
            }
            if (operation.equals("I")) {
                SmartCityBusDB.insertBusInfo(busBean);
                outcome = "/BusIUrlServlet";
            }
            request.setAttribute("Result", "Success");

        }
        if (uri.endsWith("/BusUUrlServlet")) {
            String busId = request.getParameter("busId");
            BusInfo bean = SmartCityBusDB.getUpdateBusInfoBean(busId);
            request.setAttribute("Bus", bean);
            session.setAttribute("Operation", "U");
            outcome = "/bus_edit.jsp";
        }
          if (uri.endsWith("/BusIUrlServlet")) {
            BusInfo busInfoBean = new BusInfo();
            request.setAttribute("Bus", busInfoBean);
            session.setAttribute("Operation", "I");
            outcome = "/bus_edit.jsp";
        }

         if (uri.endsWith("/BusDServlet")) { 
            SmartCityBusDB.deleteBusInfo(request.getParameter("busId"));
            outcome = "/bus_read.jsp";
        }

//        if (uri.endsWith("/BusInfoSearch")) {
//            String busId = request.getParameter("busId");
//            BusInfo busInfoBean = SmartCityBusDB.getUpdateBusInfoBean(busId);
//            request.setAttribute("Bus", busInfoBean);
//            request.setAttribute("Operation", "BusInfoSearch");
//            outcome = "/search_businfo.jsp";
//        }

        if (uri.endsWith("/BusInfoSearch")) {
            String cityName = request.getParameter("cityName");
            request.setAttribute("cityName", cityName);
            request.setAttribute("type", type);
            request.setAttribute("Operation", "BusInfoSearch");
            outcome = "/search_businfo.jsp";
        }

         if (uri.endsWith("/BusRadioCalled")) {
            type = request.getParameter("type");

            request.setAttribute("type", type);
            request.setAttribute("Operation", "ShowCityName");
            outcome = "/search_businfo.jsp";
        }

        if (uri.endsWith("/FindBusInfo")) {

            request.setAttribute("Source", request.getParameter("source"));
            request.setAttribute("Destination", request.getParameter("destination"));
            request.setAttribute("Operation","FindBusInfo");
            outcome = "/demo.jsp";
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
