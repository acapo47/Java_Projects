//@author Anthony Capo

package coincalc;         //package declaration

import java.util.Scanner; //imports java scanner utility

public class ChangeCalc { //declare and begin class

    public static void main(String[] args) {
        System.out.println("Welcome to the Change Calculator");
        System.out.println();
        
        Scanner scnr = new Scanner(System.in); //new scanner object "scnr" created
        
        String choice = "y";
        
        int quarter = 25;   //declare set values for coins
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        
        do{ //do while loop repeats program until user chooses to quit
            System.out.print("Enter number of cents (0-99): ");
            int cents = scnr.nextInt();
            System.out.println();
            
            //Math that decides how many of each coins are needed
            int numQuarter = (cents / quarter); 
                cents %= quarter;
            int numDime = (cents / dime);
                cents %= dime;
            int numNickel = (cents / nickel);
                cents %= nickel;
            int numPenny = (cents / penny);
                cents %= penny;
            
            //prints out the number of each coins    
            System.out.println("Quarters: " + numQuarter);
            System.out.println("Dimes:    " + numDime);
            System.out.println("Nickels:  " + numNickel);
            System.out.println("Pennies:  " + numPenny);
            System.out.println();
            
            //asks user to continue or not
            System.out.print("Continue? (y/n): ");
            choice = scnr.next();
            System.out.println();
        }while (choice.equalsIgnoreCase("y"));
    }   
}//end of class
