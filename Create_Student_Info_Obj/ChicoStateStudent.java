/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.student;

import java.util.Date;

/**
 * This class describes a generic student object
 * 
 * @version 0.1
 * 
 */
public class ChicoStateStudent {
    /**
     * The student identifier
     */
    private long studentID;
    /**
     * Student's first name
     */
    private String firstName;
    /**
     * Student's last name
     */
    private String lastName;
    /**
     * Date student enrolled
     */
    private Date enrolled;
    /** 
     * Student's declared major
     */
    private String major;

    /**
     *  All argument constructor for a
     *      student object
     * 
     * @param ID
     * @param first First name for the student
     * @param lastName Student's last name
     * @param enrolled Date the student enrolled
     * @param major Major that the student has declared
     */
    public ChicoStateStudent(long ID, String first, 
            String lastName, Date enrolled, 
            String major) {
        this.studentID = ID;
        firstName = first;
        this.lastName = lastName;
        this.enrolled = enrolled;
        this.major = major;
    }

    /**
     *  Create an instance of the Student class
     * 
     * @param studentID Identifier for the student
     * @param firstName Student's first name
     */
    public ChicoStateStudent(long studentID, String firstName) {
        this.studentID = studentID;
        this.firstName = firstName;
    }
    
    /**
     *  Buck night behavior
     * 
     * @param brand Type of alcohol consumed
     * @return A drunken slob
     */
    // drinkuntilyourestupid
    public String drinkUntilYoureStupid(String brand){
        return "Stumble burp hurl";
    }

    /**
     *
     * @return a text description of a student
     */
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID 
                + ", firstName=" + firstName + 
                ", lastName=" + lastName + 
                ", \n\tenrolled=" + enrolled +
                ", major=" + major + '}';
    }
    
    

    /**
     * @return the studentID
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the enrolled
     */
    public Date getEnrolled() {
        return enrolled;
    }

    /**
     * @param enrolled the enrolled to set
     */
    public void setEnrolled(Date enrolled) {
        this.enrolled = enrolled;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
    
}
