/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170901;

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
        int a = 9;
        int b = 6;
        String level;

        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println(b + " is bigger than " + a);
        }// end if
        System.out.println("We're out of the if");
        System.out.println("\n\n");
        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else if (b > a) {
            System.out.println(b + " is bigger than " + a);
        } else {
            System.out.println("They must be equal");
        }//end if
        System.out.println("We're out of the if");
        level = "Gold";
        switch(level){
            case "Platinum":
                System.out.println("Free Admission");
            case "Gold":
                System.out.println("Subscription to mag");
            case "Silver":
                System.out.println("Baseball Cap");
                // no break
                break;
            case "Lead":
                System.out.println("a Banana");
        }// end case
        
        
    }// end method
}
  

