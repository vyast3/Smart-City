/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.io.File;
import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Admin
 */
public class SmartCityTourismlDB {
    
     //Directory where file will be stored temporarily.
    private static final String TMP_DIR_PATH = "C:\\Users\\Pankaj Pandey\\Desktop\\SmartCity Project\\SmartCity Project\\SmartCityNew\\web\\data";
    private static File tmpDir = null;
    //Destination directory where file will be stored.
    private static final String DESTINATION_DIR_PATH = "C:\\Users\\Pankaj Pandey\\Desktop\\SmartCity Project\\SmartCity Project\\SmartCityNew\\web\\data";
    private static File destinationDir = null;

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

         parameter = request.getParameter("inputFile");
        if (parameter != null) {
            System.out.println("file name "+parameter);
            try {
                uploadFile(parameter, request);
            } catch (ServletException ex) {
                ex.printStackTrace();
                Logger.getLogger(SmartCityTourismlDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            bean.setImageFile("data/"+parameter);
        }

    }
    
    private static void uploadFile(String fileName,HttpServletRequest request) throws ServletException{
        //creates a new file instance with a given path.
        tmpDir = new File(TMP_DIR_PATH);
        if (!tmpDir.isDirectory()) {
            tmpDir.mkdirs();
            throw new ServletException(DESTINATION_DIR_PATH + " is not a directory");
        }

        destinationDir = new File(DESTINATION_DIR_PATH);
        if (!destinationDir.isDirectory()) {
            destinationDir.mkdirs();
            throw new ServletException(DESTINATION_DIR_PATH + " is not a directory");
        }
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();

        //Set the size threshold, above which content will be stored on disk.
        fileItemFactory.setSizeThreshold(1 * 1024 * 1024); //1 MB
        
        //Set the temporary directory to store the uploaded files of size above threshold.
        fileItemFactory.setRepository(tmpDir);

        final ServletFileUpload uploadHandler = new ServletFileUpload(fileItemFactory);
        try {
            /*
             * Parse the request
             */
            final List items = uploadHandler.parseRequest(request);
            final Iterator itr = items.iterator();
            while (itr.hasNext()) {
                FileItem item = (FileItem) itr.next();
                System.out.println("image file "+item.getName());
                /*
                 * Handle Form Fields.
                 */
                if (item.isFormField()) {
//                    out.println("To be uploaded File Name = " + item.getFieldName() + ", Value = " + item.getString());
                } else {
                    //Handle Uploaded files.
//                    out.println("File Name = " + item.getName()
//                            + "<br/> Content type = " + item.getContentType()
//                            + "<br/> File Size = " + item.getSize());
                    /*
                     * Write file to the ultimate location.
                     */
                    File file = new File(destinationDir, item.getName());
                    item.write(file);
                }
//                 out.println("</body>");
//                  out.println("</html>");
//                out.close();
            }
        } catch (final FileUploadException ex) {
//            log("Error encountered while parsing the request", ex);
        } catch (final Exception ex) {
//            log("Error encountered while uploading file", ex);
        }
    }

    public static int insertTourismInfo(Tourism bean) {
        int row = -1;
        Connection con = null;
        PreparedStatement ps = null;
        String query = "Insert into tourism (type, city, place_name, description, location, attractious, wayto_reach,helpline_no, tour_operator, image_file) Values(?, ?, ?, ?, ?, ?, ?, ?, ? ,?)";
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
            ps.setString(10, bean.getImageFile());
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
