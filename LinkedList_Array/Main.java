/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171030;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.simpsons.Folks;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        HashMap hMap = new HashMap();
        Set ks;
        
        Scanner sc;
        String input;
        BufferedReader bfr;
        Folks flks = null;
        int key = 0;
        
        String name;
        int iq, age;
        double pay;
        
        try {
            bfr = new BufferedReader(
                    new FileReader("Folks.csv"));
            while ((input = bfr.readLine()) != null) {
                sc = new Scanner(input);
                sc.useDelimiter("\\s*,\\s*");
                key++;
                
                name = sc.next();
                age = sc.nextInt();
                pay = sc.nextDouble();
                iq = sc.nextInt();
                
                flks = new Folks(name, age, pay, iq);
                ll.add(flks);
                al.add(flks);
                hMap.put(key, flks);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(flks);
        flks.name = "Harvey";
        
        Iterator it = ll.iterator();
        System.out.println("The linked list\n");
        while (it.hasNext()){
            System.out.println("\t" + it.next());
        }
        it = al.iterator();
        System.out.println("\nThe array list\n");
        while (it.hasNext()){
            System.out.println("\t" + it.next());
        }//end 2nd iterator 
        System.out.println("\n\nHashMap\n");
        ks = hMap.keySet();
        it = ks.iterator();
        while (it.hasNext()){
            key = (int) it.next();
            System.out.println("\tKey: " + key + 
                    " Value: " + hMap.get(key));
            
        }
   }
    
}
