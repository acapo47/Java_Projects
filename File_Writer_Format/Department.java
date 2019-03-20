/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.classes;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Department {
    private int deptID;
    private String deptName;
    private Date startDate;
    private String deptStreet;
    private int deptZip;
    private String deptCity;
    private String deptState;
    private String deptCountry;

    public Department(int deptID, String deptName, Date startDate, String deptStreet, 
			int deptZip, String deptCity, String deptState, String deptCountry) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.startDate = startDate;
        this.deptStreet = deptStreet;
        this.deptZip = deptZip;
        this.deptCity = deptCity;
        this.deptState = deptState;
        this.deptCountry = deptCountry;
    }//end constructor

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
        return "Department{" + "deptID=" + deptID + ", deptName=" + deptName 
                + ", startDate=" + sdf.format(startDate) + ", deptStreet=" + deptStreet 
                + ", deptZip=" + deptZip + ", deptCity=" + deptCity 
                + ", deptState=" + deptState 
                + ", deptCountry=" + deptCountry + '}';
    }
    

    /**
     * @return the deptID
     */
    public int getDeptID() {
        return deptID;
    }

    /**
     * @param deptID the deptID to set
     */
    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the deptStreet
     */
    public String getDeptStreet() {
        return deptStreet;
    }

    /**
     * @param deptStreet the deptStreet to set
     */
    public void setDeptStreet(String deptStreet) {
        this.deptStreet = deptStreet;
    }

    /**
     * @return the deptZip
     */
    public int getDeptZip() {
        return deptZip;
    }

    /**
     * @param deptZip the deptZip to set
     */
    public void setDeptZip(int deptZip) {
        this.deptZip = deptZip;
    }

    /**
     * @return the deptCity
     */
    public String getDeptCity() {
        return deptCity;
    }

    /**
     * @param deptCity the deptCity to set
     */
    public void setDeptCity(String deptCity) {
        this.deptCity = deptCity;
    }

    /**
     * @return the deptState
     */
    public String getDeptState() {
        return deptState;
    }

    /**
     * @param deptState the deptState to set
     */
    public void setDeptState(String deptState) {
        this.deptState = deptState;
    }

    /**
     * @return the deptCountry
     */
    public String getDeptCountry() {
        return deptCountry;
    }

    /**
     * @param deptCountry the deptCountry to set
     */
    public void setDeptCountry(String deptCountry) {
        this.deptCountry = deptCountry;
    }
    
}// end clss Department
