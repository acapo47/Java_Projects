/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170918;

import java.util.Date;
import java.util.Scanner;

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
        String choice;
        Scanner sc = new Scanner(System.in);
        
//        do {
////           Processing
//            System.out.println("I'm in the loop");
//            System.out.print("Do you want to continue <Y/N> => ");
//            choice = sc.nextLine();
//        } while (choice.substring(0,1).equalsIgnoreCase("Y"));
//        int x = JOptionPane.showConfirmDialog(null,"Wanna go again?",
//                "Do it some more?",JOptionPane.YES_NO_OPTION);
//        if (x == JOptionPane.YES_OPTION){
//            System.out.println("x is " + x);
//        }
        System.out.printf("This is my String: %20s\n", "Jim");
        System.out.printf("This is my String: %20s\n",
                "Juan Gonzalez Diaz");
        int num = 1_234_567;
        System.out.printf("\t%,15d\n", num);
        System.out.printf("\tHere's my number %,15d\n", 23);
        
        System.out.printf("%12s %,12d      %,12d\n", 
                  "Cash",0, 325);
        String fmt = "%12s %,12d      %,12d\n";
        System.out.printf(fmt, "Beer",325, 0);
        
        System.out.printf("%,12.2f\n", 12345.6789);
        System.out.printf("%,12.2f\n", 12345.6);
        
        System.out.printf("%TD\n", new Date());
        System.out.printf("%Tb\n", new Date());
    }
    
}
