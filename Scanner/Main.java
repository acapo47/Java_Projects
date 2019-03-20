/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170908;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int whileX;

        int numStudents = 30;

        for (int x = 0; x < numStudents; x++) {

        }// end for
//        System.out.println("X is " + x);
        int x;
        for (x = 0; x < numStudents; x++) {

        }// end for
//        System.out.println("X is " + x);
//        int loopCount = 0;
//        for (int j = 0; j < 5; j++){
//            System.out.println("Outer loop " + ++loopCount);
//            for (int i = 0; i < 4; i++){
//                System.out.println("Inner Loop J is " + j + 
//                        " Loop count is " + ++loopCount);
//            }//end inner loop
//        }//end outer loop
        String name;
        name = "Jim";
        System.out.println(name);
        name = "Joe";
        System.out.println(name);
        name = JOptionPane.showInputDialog("Enter your name");
        System.out.println(name);
        String input = JOptionPane.showInputDialog("Now for an integer");
        x = Integer.parseInt(input);
        System.out.println(x);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer => ");
        int w = sc.nextInt();
        System.out.print("Enter a Double => ");
        double l = sc.nextDouble();
    }//end method main

}//end class Main
