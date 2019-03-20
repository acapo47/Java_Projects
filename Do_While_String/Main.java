/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170906;

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
        int a = 12, b = 20;
        int c = 31;
        int max;
        int numCats;

        max = a + b > c ? a + b : c;
        System.out.println("Max is " + max);
        numCats = 0;

//        System.out.println("There " + (numCats > 1 ? "are ":"is ")
//                + numCats + " cat" + (numCats == 1 ? " " : "s ") + "here.");
        System.out.println("There " + (numCats != 1 ? "are " : "is ")
                + numCats + " cat" + (numCats == 1 ? " " : "s ") + "here.");
        
        a = -5;
        while (a > 0) {
            System.out.println("In the while loop: Howdy");
            a--;
        }// end while 
        System.out.println("a is " + a);
        do {
            System.out.println("In the do loop: Howdy");
            a--;
        } while (a > 0); // end do loop
        System.out.println("a is " + a);
        
        for (int i = 0; i < 10; i++){
            System.out.println("i is now " + i);
        }//end for
        
//        System.out.println("i is now " + i);
    }
}

