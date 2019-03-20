/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170911;

import my.classes.MyClass;

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
        int j = 123;
        double f = 3232.444;
        double result;
        int iResult;
        final double SALES_TAX = .075;
        double taxable;
        MyClass myClass = new MyClass();

        result = j * f;
//        iResult = j * f;
        iResult = j * (int) f;
        System.out.println("result is " + result + "\niResult is " + iResult);
        taxable = result * SALES_TAX;
        System.out.println("Tax is " + taxable);
        System.out.println("myClass is " + myClass);

    }

}
