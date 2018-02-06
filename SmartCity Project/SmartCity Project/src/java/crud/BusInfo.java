/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

/**
 *
 * @author Admin
 */
public class BusInfo  implements java.io.Serializable{
    private Integer busId;
    private String busName;
    private String busNO;
    private String busRTONumber;
    private String busTiming;
    private String busRoute;
    private String stopage;
    private String fair;
    private String facilities;
    private String helplineNumber;
    private String remarks;
    private String type;


    private String city;

     public BusInfo(){
        busId = new Integer(0);
        busName = new String("");
        busNO = new String("");
        busRTONumber = new String("");
        busTiming = new String("");
        busRoute = new String("");
        stopage = new String("");
        fair = new String("");
        facilities = new String("");
        helplineNumber = new String("");
        remarks = new String("");
        city = new String("");
    }

     public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getBusNO() {
        return busNO;
    }

    public void setBusNO(String busNO) {
        this.busNO = busNO;
    }

    public String getBusRTONumber() {
        return busRTONumber;
    }

    public void setBusRTONumber(String busRTONumber) {
        this.busRTONumber = busRTONumber;
    }

    public String getHelplineNumber() {
        return helplineNumber;
    }

    public void setHelplineNumber(String helplineNumber) {
        this.helplineNumber = helplineNumber;
    }


    

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

   public String getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }

    public String getBusTiming() {
        return busTiming;
    }

    public void setBusTiming(String busTiming) {
        this.busTiming = busTiming;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getFair() {
        return fair;
    }

    public void setFair(String fair) {
        this.fair = fair;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStopage() {
        return stopage;
    }

    public void setStopage(String stopage) {
        this.stopage = stopage;
    }

     public String toString(){
        return busId + ": " + busName + ", " + busNO + ", " + busRTONumber+", "+busRoute+", "+busTiming +", "+stopage+", "+fair+", "+facilities+", "+helplineNumber+", "+remarks;
    }
}
