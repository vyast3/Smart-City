/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.*;
import javax.servlet.http.*;

/**
 *
 * @author Admin
 */
public class SmartCityTourismlDB {

    public static void mappingTourismInfo(HttpServletRequest request, Tourism bean) {
        String parameter;
        parameter = request.getParameter("tourismId");
        if (parameter != null) {
            bean.setId(new Integer(parameter));
        }

        parameter = request.getParameter("type");
        if (parameter != null) {
            bean.setType(parameter);
        }

        parameter = request.getParameter("cityName");
        if(parameter != null){
            bean.setCity(parameter);
        }

        parameter = request.getParameter("placeName");
        if(parameter != null){
            bean.setPlaceName(parameter);
        }

        parameter = request.getParameter("description");
        if (parameter != null) {
            bean.setDescription(parameter);
        }

        
        parameter = request.getParameter("location");
        if (parameter != null) {
            bean.setLocation(parameter);
        }
        parameter = request.getParameter("attractive");
        if (parameter != null) {
            bean.setAttractious(parameter);
        }
        parameter = request.getParameter("waytoReach");
        if (parameter != null) {
            bean.setWaytoReach(parameter);
        }
        
        parameter = request.getParameter("helplineNo");
        if (parameter != null) {
            bean.setHelplineNo(parameter);
        }
         parameter = request.getParameter("tourOperator");
        if (parameter != null) {
            bean.setTourOperator(parameter);
        }

    }

    public static int insertTourismInfo(Tourism bean) {
        int row = -1;
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Insert into tourism (type, city, place_name, description, location, attractious, wayto_reach,helpline_no, tour_operator) Values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, bean.getType());
            ps.setString(2, bean.getCity());
            ps.setString(3, bean.getPlaceName());
            ps.setString(4, bean.getDescription());
            ps.setString(5, bean.getLocation());
            ps.setString(6, bean.getAttractious());
            ps.setString(7, bean.getWaytoReach());
            ps.setString(8, bean.getHelplineNo());
            ps.setString(9, bean.getTourOperator());
            row = ps.executeUpdate();
            System.out.println("inserted row" + row);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception" + row);
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
            }
            try {
                con.close();
            } catch (Exception e) {
            }
        }
        return row;
    }

    
}
