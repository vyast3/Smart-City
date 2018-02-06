/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

/**
 *
 * @author Admin
 */
public class Hospital implements  java.io.Serializable{

    private Integer id;
    private String name;
    private String address;
    private String type;
private String city;
    private String contact;
     private String emailId;
   private String website;
    private String facilities;
    private String timing;
    private String drNames;
    public Hospital(){
        id = new Integer(0);
        name = new String("");
        address = new String("");
        type = new String("");
        city = new String("");
        contact = new String("");
        emailId = new String("");
        website = new String("");
        facilities = new String("");
        timing = new String("");
        drNames = new String("");
        name = new String("");
        name = new String("");
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDrNames() {
        return drNames;
    }

    public void setDrNames(String drNames) {
        this.drNames = drNames;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


   
}
