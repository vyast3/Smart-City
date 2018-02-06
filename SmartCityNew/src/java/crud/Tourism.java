/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

/**
 *
 * @author Admin
 */
public class Tourism {

    private Integer id;
    private String type;
    private String city;
    private String placeName;
    private String description;
    private String location;
    private String attractious;
    private String waytoReach;
    private String helplineNo;
    private String tourOperator;

    public Tourism() {
        this.id = new Integer(0);
        this.type = new String("");
        this.city = new String("");
        this.placeName = new String("");
        this.description = new String("");
        this.location = new String("");
        this.attractious = new String("");
        this.waytoReach = new String("");
        this.helplineNo = new String("");
        this.tourOperator = new String("");
    }


    public String getAttractious() {
        return attractious;
    }

    public void setAttractious(String attractious) {
        this.attractious = attractious;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHelplineNo() {
        return helplineNo;
    }

    public void setHelplineNo(String helplineNo) {
        this.helplineNo = helplineNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getTourOperator() {
        return tourOperator;
    }

    public void setTourOperator(String tourOperator) {
        this.tourOperator = tourOperator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWaytoReach() {
        return waytoReach;
    }

    public void setWaytoReach(String waytoReach) {
        this.waytoReach = waytoReach;
    }


}
