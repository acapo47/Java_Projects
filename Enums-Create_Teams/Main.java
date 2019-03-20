/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170925;

import my.enums.Days;
import my.teams.FootballTeam;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FootballTeam ravens, cowboys;

        ravens = new FootballTeam("Baltimore Ravens", "AFC",
                "North", true);
        System.out.println(ravens);
        System.out.println(FootballTeam.getNumberOfPlayers());
        FootballTeam.setNumberOfPlayers(48);
        cowboys = new FootballTeam("Dallas Cowboys", "NFC",
                "East", false);
        System.out.println(cowboys);
//        System.out.println(cowboys.getNumberOfPlayers());
        System.out.println(FootballTeam.getNumberOfPlayers());
        System.out.println(ravens.getNumberOfPlayers());
        for (Days x: Days.values()){
            System.out.println(x); 
        }//
    }

}
