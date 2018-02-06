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
public class SmartCityBusDB {

    public static void mappingBusInfo(HttpServletRequest request, BusInfo bean) {
        String parameter;
        parameter = request.getParameter("busId");
        if (parameter != null) {
            bean.setBusId(new Integer(parameter));
        }

        parameter = request.getParameter("type");
        if (parameter != null) {
            bean.setType(parameter);
        }
        parameter = request.getParameter("city");
        if (parameter != null) {
            bean.setCity(parameter);
        }
        parameter = request.getParameter("busName");
        if (parameter != null) {
            bean.setBusName(parameter);
        }

        parameter = request.getParameter("busNumber");
        if(parameter != null){
            bean.setBusNO(parameter);
        }

        parameter = request.getParameter("busRTONumber");
        if(parameter != null){
            bean.setBusRTONumber(parameter);
        }

        parameter = request.getParameter("busTiming");
        if (parameter != null) {
            bean.setBusTiming(parameter);
        }

        String[] para = request.getParameterValues("busRoute");
       
        if (para != null) {
            String route ="";
            for(int i= 0;i<para.length;i++){
                if(i ==0){
                   route = route +para[i];
                }
                else{
                    route = route +", " +para[i];
                }
            }
            bean.setBusRoute(route);
        }
        parameter = request.getParameter("stopage");
        if (parameter != null) {
            bean.setStopage(parameter);
        }
        parameter = request.getParameter("fair");
        if (parameter != null) {
            bean.setFair(parameter);
        }
        parameter = request.getParameter("facilities");
        if (parameter != null) {
            bean.setFacilities(parameter);
        }
        parameter = request.getParameter("helplineNumber");
        if(parameter != null){
            bean.setHelplineNumber(parameter);
        }

        parameter = request.getParameter("remarks");
        if (parameter != null) {
            bean.setRemarks(parameter);
        }



    }

    public static int insertBusInfo(BusInfo bean) {
        int row = -1;
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Insert into businfo (bus_name, bus_no, bus_rto_no, bus_timing, bus_route, stopage, fair,facilities, helpline_no,remarks,type,city) Values(? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            System.out.println("name " + bean.getBusName());
            ps.setString(1, bean.getBusName());
            ps.setString(2, bean.getBusNO());
            ps.setString(3, bean.getBusRTONumber());
            ps.setString(4, bean.getBusTiming());
            ps.setString(5, bean.getBusRoute());
            ps.setString(6, bean.getStopage());
            ps.setString(7, bean.getFair());
            ps.setString(8, bean.getFacilities());
            ps.setString(9, bean.getHelplineNumber());
            ps.setString(10, bean.getRemarks());
            ps.setString(11, bean.getType());
            ps.setString(12, bean.getCity());
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

    public static int updateBusInfo(BusInfo bean) {
        int row = -1;       //return no of row affected
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Update businfo set bus_name =?, bus_no =?, bus_rto_no =?, bus_timing =?, bus_route =?, stopage =?, fair =?,facilities =?, helpline_no =?,remarks =? where bus_id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, bean.getBusName());
            ps.setString(2, bean.getBusNO());
            ps.setString(3, bean.getBusRTONumber());
            ps.setString(4, bean.getBusTiming());
            ps.setString(5, bean.getBusRoute());
            ps.setString(6, bean.getStopage());
            ps.setString(7, bean.getFair());
            ps.setString(8, bean.getFacilities());
            ps.setString(9, bean.getHelplineNumber());
            ps.setString(10, bean.getRemarks());

            ps.setInt(11, bean.getBusId().intValue());
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

    public static int deleteBusInfo(String id) {
        int row = -1;       //return no of row affected
        Connection con = null;
        PreparedStatement ps = null;
        String query = "delete from businfo where bus_id=?";
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

    public static BusInfo getUpdateBusInfoBean(String busId) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BusInfo bean = new BusInfo();
        String query = "Select * from businfo Where bus_id=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "chidya");
            ps = con.prepareStatement(query);
            ps.setString(1, busId);
            rs = ps.executeQuery();
            while (rs.next()) {
                bean.setBusId(new Integer(rs.getInt(1)));
                bean.setBusName(rs.getString(2));
                bean.setBusNO(rs.getString(3));
                bean.setBusRTONumber(rs.getString(4));
                bean.setBusTiming(rs.getString(5));
                bean.setBusRoute(rs.getString(6));
                bean.setStopage(rs.getString(7));
                bean.setFair(rs.getString(8));
                bean.setFacilities(rs.getString(9));
                bean.setHelplineNumber(rs.getString(10));
                bean.setRemarks(rs.getString(11));
                
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
