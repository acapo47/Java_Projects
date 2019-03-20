/*
-- Anthony Capo 
*/

package temps;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Temperature {

    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();
        String choice = "y";
        Scanner scnr = new Scanner(System.in); //creates new instance of a scanner object

        do { //User input
            System.out.print("Enter degrees in Fahrenheit: ");

            double f = scnr.nextDouble();
            double c = ((f - 32) * 5 / 9); //math to convert fahrenheit to celsius 
            
            //sets decimals values to 'X.XX' and displays the result
            DecimalFormat df = new DecimalFormat("#.##"); 
            System.out.println("Degrees in Celsius: " + df.format(c));
            System.out.println();
            
            //User choice to continue
            System.out.print("Continue? (y/n): ");
            choice = scnr.next();
            System.out.println();

        } while (choice.equalsIgnoreCase("y")); //do while loop executes the program as long as the user chooses to continue
    }

}
//end of program