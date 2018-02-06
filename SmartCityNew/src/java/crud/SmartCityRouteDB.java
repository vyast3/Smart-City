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
public class SmartCityRouteDB {

    public static void mappingRoute(HttpServletRequest request, Route bean){
        String parameter;
        parameter = request.getParameter("routeId");
        if(parameter != null){
            bean.setRouteId(new Integer(parameter));
        }

        parameter = request.getParameter("city");
        if(parameter != null){
            bean.setCity(parameter);
        }

        parameter = request.getParameter("type");
        if(parameter != null){
            bean.setType(parameter);
        }

        parameter = request.getParameter("routeName");
        if(parameter != null){
            bean.setRouteName(parameter);
        }

        parameter = request.getParameter("routeInfo");
        if(parameter != null){
            bean.setRouteInformation(parameter);
        }

         parameter = request.getParameter("routeLocation");
        if(parameter != null){
            bean.setRouteLocation(parameter);
        }
    }

    public static int insertRoute(Route bean) {
        int row = -1;
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Insert into route (city, route_name, route_information,route_location,type) Values(?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, bean.getCity());
            ps.setString(2, bean.getRouteName());
            ps.setString(3, bean.getRouteInformation());
            ps.setString(4, bean.getRouteLocation());
             ps.setString(5, bean.getType());
            row = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
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

    public static int updateRoute(Route bean) {
        int row = -1;       //return no of row affected
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Update route set city= ?, route_name=?, route_information=?, route_location=? where route_id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, bean.getCity());
            ps.setString(2, bean.getRouteName());
            ps.setString(3, bean.getRouteInformation());
            ps.setString(4, bean.getRouteLocation());
            ps.setInt(5, bean.getRouteId().intValue());
            row = ps.executeUpdate();
        } catch (Exception e) {
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

    public static int deleteRoute(Route bean) {
        int row = -1;       //return no of row affected
        Connection con = null;
        PreparedStatement ps = null;
        String query = "delete from route where route_id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setInt(1, bean.getRouteId().intValue());
            row = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
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

    public static Route getUpdateRouteBean(String routeId) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Route bean = new Route();
        String query = "Select * from route Where route_id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, routeId);
            rs = ps.executeQuery();
            while(rs.next()){
                bean.setRouteId(new Integer(rs.getInt(1)));
                bean.setCity(rs.getString(2));
                bean.setRouteName(rs.getString(3));
                bean.setRouteInformation(rs.getString(4));
                bean.setRouteLocation(rs.getString(5));
            }
        } catch (Exception e) {
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                ps.close();
            } catch (Exception e) {
            }
            try {
                con.close();
            } catch (Exception e) {
            }
        }
        return bean;
    }

    static void insertFeedback(HttpServletRequest request) {

        Connection con = null;
        PreparedStatement ps = null;
        String query = "Insert into feedback (name, contact,emailid,query) Values(?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, request.getParameter("name"));
            ps.setString(2, request.getParameter("contact"));
            ps.setString(3, request.getParameter("email"));
            ps.setString(4, request.getParameter("query"));

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
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
    }


}
