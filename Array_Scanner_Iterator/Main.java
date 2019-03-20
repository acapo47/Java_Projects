/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171027;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import my.folks.Folks;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String simpson;
        int age, iq;
        double salary;

        BufferedReader bfr;
        Scanner sc;
        String input;
        Folks folk;
        ArrayList al = new ArrayList();

        try {
            bfr = new BufferedReader(
                    new FileReader("Folks.csv"));
            while ((input = bfr.readLine()) != null) {
                sc = new Scanner(input.trim());
//                sc.useDelimiter(",");
                sc.useDelimiter("\\s*,\\s*");
                simpson = sc.next();
                age = sc.nextInt();
                salary = sc.nextDouble();
                iq = sc.nextInt();
                folk = new Folks(simpson, age, salary, iq);
                al.add(folk);

            }// end while
        } catch (FileNotFoundException ex) {
            System.out.println("File's not there");
            System.exit(-43);
        } catch (IOException ex) {
            System.out.println("Something Happened");
            System.exit(-64);
        }// end read/ create loop
        
        Iterator it = al.iterator();
        while (it.hasNext()){
            folk = (Folks) it.next();
            System.out.println(folk);
        }//end iterator loop
    }// end method main

}
