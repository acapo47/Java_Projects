/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.teams;

/**
 *
 * @author Anthony
 */
public class FootballTeam {
    
    private static int numberOfPlayers = 45;
    private String name;
    private String league;
    private String division;
    private boolean sucks;
    
    public FootballTeam(String name, String league, 
            String division, boolean sucks) {
        this.name = name;
        this.league = league;
        this.division = division;
        this.sucks = sucks;
    }
    
    @Override
    public String toString() {
        return "FootballTeam{" + "name=" + getName() + ",\n league=" + 
                    getLeague() + ", division=" + getDivision() 
                + "\n, sucks=" + isSucks() + '}';
    }

    /**
     * @return the numberOfPlayers
     */
    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    /**
     * @param aNumberOfPlayers the numberOfPlayers to set
     */
    public static void setNumberOfPlayers(int aNumberOfPlayers) {
        numberOfPlayers = aNumberOfPlayers;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the league
     */
    public String getLeague() {
        return league;
    }

    /**
     * @param league the league to set
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * @return the sucks
     */
    public boolean isSucks() {
        return sucks;
    }

    /**
     * @param sucks the sucks to set
     */
    public void setSucks(boolean sucks) {
        this.sucks = sucks;
    }
}
