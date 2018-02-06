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
public class SmartCityHospitalDB {

    public static void mappingHospitalInfo(HttpServletRequest request, Hospital bean) {
        String parameter;
        parameter = request.getParameter("hospitalId");
        if (parameter != null) {
            bean.setId(new Integer(parameter));
        }

        parameter = request.getParameter("hospitalName");
        if (parameter != null) {
            bean.setName(parameter);
        }

        parameter = request.getParameter("hospitalAddress");
        if(parameter != null){
            bean.setAddress(parameter);
        }

        parameter = request.getParameter("type");
        if(parameter != null){
            bean.setType(parameter);
        }

        parameter = request.getParameter("hospitalCity");
        if (parameter != null) {
            bean.setCity(parameter);
        }

        
        parameter = request.getParameter("hospitalContact");
        if (parameter != null) {
            bean.setContact(parameter);
        }
        parameter = request.getParameter("hospitalEmail");
        if (parameter != null) {
            bean.setEmailId(parameter);
        }
        parameter = request.getParameter("hospitalWebsite");
        if (parameter != null) {
            bean.setWebsite(parameter);
        }
        parameter = request.getParameter("hospitalFacilities");
        if(parameter != null){
            bean.setFacilities(parameter);
        }

        parameter = request.getParameter("hospitalTiming");
        if (parameter != null) {
            bean.setTiming(parameter);
        }
         parameter = request.getParameter("doctorsName");
        if (parameter != null) {
            bean.setDrNames(parameter);
        }

    }

    public static int insertHospitalInfo(Hospital bean) {
        int row = -1;
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Insert into hospital (name, address, type, city, contact_no, email_id, website,facilities, timing,dr_names) Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            System.out.println("name " + bean.getName());
             ps.setString(1, bean.getName());
            ps.setString(2, bean.getAddress());
            ps.setString(3, bean.getType());
            ps.setString(4, bean.getCity());
            ps.setString(5, bean.getContact());
            ps.setString(6, bean.getEmailId());
            ps.setString(7, bean.getWebsite());
            ps.setString(8, bean.getFacilities());
            ps.setString(9, bean.getTiming());
            ps.setString(10, bean.getDrNames());
           

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

    public static int updateHospitalInfo(Hospital bean) {
        int row = -1;       //return no of row affected
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Update hospital set name = ?, address = ?, type = ?, city = ?, contact_no = ?, email_id = ?, website = ?,facilities = ?, timing = ?,dr_names = ? where id =?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, bean.getName());
            ps.setString(2, bean.getAddress());
            ps.setString(3, bean.getType());
            ps.setString(4, bean.getCity());
            ps.setString(5, bean.getContact());
            ps.setString(6, bean.getEmailId());
            ps.setString(7, bean.getWebsite());
            ps.setString(8, bean.getFacilities());
            ps.setString(9, bean.getTiming());
            ps.setString(10, bean.getDrNames());

            ps.setInt(11, bean.getId().intValue());
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

    public static int deleteHospitalInfo(String id) {
        int row = -1;       //return no of row affected
        Connection con = null;
        PreparedStatement ps = null;
        String query = "delete from hospital where id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(id));
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

    public static Hospital getUpdateHospitalInfo(String id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Hospital bean = new Hospital();
        String query = "Select * from hospital Where id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                bean.setId(new Integer(rs.getInt(1)));
                bean.setName(rs.getString(2));
                bean.setAddress(rs.getString(3));
                bean.setType(rs.getString(4));
                bean.setCity(rs.getString(5));
                bean.setContact(rs.getString(6));
                bean.setEmailId(rs.getString(7));
                bean.setWebsite(rs.getString(8));
                bean.setFacilities(rs.getString(9));
                bean.setTiming(rs.getString(10));
                bean.setDrNames(rs.getString(11));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
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
}
