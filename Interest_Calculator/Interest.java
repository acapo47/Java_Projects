/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intcalc;

import java.math.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Interest {

    
    public static void main(String[] args) {
        System.out.println("Welcome to the Interest Calculator"); 
        System.out.println();
        String choice = "y"; 
        Scanner scnr = new Scanner(System.in);
        
        do{
            System.out.print("Enter loan amount:      ");
            double loanAmt = scnr.nextDouble();
            
            System.out.print("Enter interest rate:    ");
            double intRate = scnr.nextDouble();
            System.out.println();
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3);
            
            BigDecimal decimalLoanAmt = new BigDecimal(Double.toString(loanAmt));
            decimalLoanAmt = decimalLoanAmt.setScale(2, RoundingMode.HALF_UP);
            BigDecimal decimalIntRate = new BigDecimal(Double.toString(intRate));
            BigDecimal decimalInterest = decimalLoanAmt.multiply(decimalIntRate);
            decimalInterest = decimalInterest.setScale(2, RoundingMode.HALF_UP);
            
            System.out.println("Loan amount:       " + currency.format(loanAmt));
            System.out.println("Interest rate:     " + percent.format(intRate));
            System.out.println("Interest:          " + currency.format(decimalInterest));
            System.out.println();
            
            System.out.print("Continue? (y/n): ");
            choice = scnr.next();
            System.out.println();
 
        }while (choice.equalsIgnoreCase("y"));
       
    }
    
}
