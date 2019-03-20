/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.profs;

/**
 *
 * @author Anthony
 */
public class Professors {
    private String lastName;
    private String firstName;
    private String degree;
    private String grantingInstitution;
    private boolean tenure;
    private String rank;
    private String age;

    public String lecture(){
        return "BLAH BLAH BLAH";
    }// end lecture
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
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return the grantingInstitution
     */
    public String getGrantingInstitution() {
        return grantingInstitution;
    }

    /**
     * @param grantingInstitution the grantingInstitution to set
     */
    public void setGrantingInstitution(String grantingInstitution) {
        this.grantingInstitution = grantingInstitution;
    }

    /**
     * @return the tenure
     */
    public boolean isTenure() {
        return tenure;
    }

    /**
     * @param tenure the tenure to set
     */
    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }
            
}
