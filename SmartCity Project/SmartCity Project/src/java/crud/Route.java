/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

/**
 *
 * @author Admin
 */
public class Route implements java.io.Serializable{

    private Integer routeId;
    private String city;
    private String routeName;
    private String routeInformation;
    private String routeLocation;
    private String type;



    public Route(){
        routeId = new Integer(0);
        city = new String("");
        routeName = new String("");
        routeInformation = new String("");
        routeLocation = new String("");
   
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getRouteInformation() {
        return routeInformation;
    }

    public void setRouteInformation(String routeInformation) {
        this.routeInformation = routeInformation;
    }

    public String getRouteLocation() {
        return routeLocation;
    }

    public void setRouteLocation(String routeLocation) {
        this.routeLocation = routeLocation;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String toString(){
        return routeId + ": " + city + ", " + routeName + ", " + routeInformation+", "+routeLocation;
    }
}
