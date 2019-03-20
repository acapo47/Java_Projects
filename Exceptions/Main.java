/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170929;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.exceptions.BadDoggieException;
import my.kennel.Doggy;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        Doggy fido = new Doggy("Large", "Korgi",
                "Fido",true);
        Doggy rover = new Doggy("MidSize","Shepard",
                "Rover", false);
                

        try {
            System.out.print("Enter an Integer => ");
            j = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("I needed an integer");
            System.exit(-12);
        }
        System.out.println("Thanx for the integer");
        System.out.println(rover);
        System.out.println(rover.bark(4));
        
        try {
            System.out.println(rover.pet());
        } catch (BadDoggieException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("\n" + fido);
        System.out.println(fido.bark(3));
        try {
            System.out.println(fido.pet());
        } catch (BadDoggieException ex) {
            System.out.println(ex.getMessage());
        }
//        System.out.println(fido.pet());
    }

}
