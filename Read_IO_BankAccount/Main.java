/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170913;

import java.util.Locale;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        String b;
        
        a = "I saw the best minds of my generation";
        b = "Destroyed by madness";
        System.out.println(a + b);
        System.out.println(a + " " + b);
        System.out.println(a + " " + b + " " + 10);
        
        String x = "This is a \"long\" string that \n\t"
                + "needs to be on two lines";
        System.out.println(x);
        String fileName = "c:\\bankaccount";
        System.out.println(fileName);
        System.out.println(Locale.US);
    }
    
}
