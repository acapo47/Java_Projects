/*
--- Anthony Capo - Assignment 3 Interest Calculator
 */
package intcalc;

import java.math.*; //multiply function used for the interest
import java.text.NumberFormat;
import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {
        System.out.println("Welcome to the Interest Calculator");
        System.out.println();
        String choice = "y";
        Scanner scnr = new Scanner(System.in);

        do { //User inputs
            System.out.print("Enter loan amount:     ");
            double loanAmt = scnr.nextDouble();

            System.out.print("Enter interest rate:   ");
            double intRate = scnr.nextDouble();
            System.out.println();

            //formats the numbers to match currency values
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3); //sets percentage values to 'X.XX%'

            //Math to calculate the total interest. HALF_UP rounds fractions up to match currency values
            BigDecimal decimalLoanAmt = new BigDecimal(Double.toString(loanAmt));
            decimalLoanAmt = decimalLoanAmt.setScale(2, RoundingMode.HALF_UP); 
            BigDecimal decimalIntRate = new BigDecimal(Double.toString(intRate));
            BigDecimal decimalInterest = decimalLoanAmt.multiply(decimalIntRate);
            decimalInterest = decimalInterest.setScale(2, RoundingMode.HALF_UP);

            //Gets results and displays them to the user
            System.out.println("Loan amount:           " + currency.format(loanAmt));
            System.out.println("Interest rate:         " + percent.format(intRate));
            System.out.println("Interest:              " + currency.format(decimalInterest));
            System.out.println();

            //User choice to continue
            System.out.print("Continue? (y/n): ");
            choice = scnr.next();
            System.out.println();

        } while (choice.equalsIgnoreCase("y")); //do while loop executes the program as long as the user chooses to continue

    }

}
//end of program
