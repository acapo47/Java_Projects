/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170927;

import java.util.InputMismatchException;
import java.util.Scanner;
import my.enums.Days;

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
        Scanner sc = new Scanner(System.in);
        int uhOh;
        try{
        System.out.print("Enter an integer => ");
        uhOh = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("I SAID AN INTEGER!!!!");
            System.exit(0);
        }
        for (Days x : Days.values()){
            System.out.println(x + " is a weekend day? "
                + x.isWeekEnd());
        }//end for
    }
    
}
