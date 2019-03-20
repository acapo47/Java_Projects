/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171025;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.classes.Person;

/**
 *
 * @author GLNN104Lab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first, last;
        int age;
        String major;

        BufferedReader bfr;
        Person person;
        String inp;
        Scanner sc;
        ArrayList al = new ArrayList();

        try {
            bfr = new BufferedReader(new FileReader("TestIO.csv"));
            while ((inp = bfr.readLine()) != null) {
                sc = new Scanner(inp);
                sc.useDelimiter("\\s*, \\s*");
                first = sc.next();
                last = sc.next();
                age = sc.nextInt();
                major = sc.next();
                person = new Person(first, last, age, major);
                System.out.println(person);
                al.add(person);
                //how is the order and type determined? They are given to you
            }//end while
        } catch (FileNotFoundException ex) {
            System.out.println("Where's the file?");
            System.exit(-5);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n Now with the Iterator");
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
