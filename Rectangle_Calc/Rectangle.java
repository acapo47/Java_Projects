/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;   //imports the scanner object utility
/**
 *
 * @author ac
 */
public class Rectangle {    //declares class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    //declare and begin class
        
        System.out.println("Welcome to the Area and Perimeter Calculator"); //welcome users to the program
        System.out.println();   //prints blank line
        String choice = "y";    //entry to continue using program
        
        
        while (choice.equalsIgnoreCase("y")){    //runs program again if user decides to continue
        
            //Ask user for length of rectangle    
            Scanner scnr = new Scanner(System.in); //creates a Scanner object named scnr for length
            System.out.print("Enter length: "); //user inputs length
            double length = scnr.nextDouble();  //scanner stores and looks for the next input

                //Ask user for width of rectangle    
                Scanner scnr1 = new Scanner(System.in); //creates a Scanner object named scnr1 for width
                System.out.print("Enter width: ");  //user inputs width
                double width = scnr1.nextDouble(); //scanner stores and looks for the next input
                    
                    double area = length * width; //Math for area of rectangle
                    System.out.println("Area: " + area); //Display output of area to user
                        
                        double perimeter = 2 * width + 2 * length; //Math for perimeter of rectangle
                        System.out.println("Perimeter: " + perimeter); //Display output of perimeter to user
                            
                            System.out.print("Continue? (Y/N): "); //Ask if the user would like to continue
                            choice = scnr.next();   //evaluates choice to end or continue program
                            System.out.println();   //prints blank line
        }
    
     
    
}
} //end class