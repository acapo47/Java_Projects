
import java.util.Scanner;
import my.change.Change;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
public class makechange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int val, coins;
        String cont;
        
        sc = new Scanner(System.in);
        
        do {
            System.out.print("\nEnter a number between " + "0 and 99 => ");
            val = sc.nextInt();
            System.out.println("");
            
            for(Change c: Change.values()){
                coins = val / c.getCoinValue();
                val = val % c.getCoinValue();
                
                System.out.print("There " + (coins == 1 ? "is ":"are ") + coins + " " + c);
                
                if (coins != 1){
                    switch (c) {
                        case QUARTER:
                        case DIME:
                        case NICKEL:
                                System.out.println("s");
                                break;
                        case PENNY: 
                            System.out.println("\bies");
                    }//end switch
                    
                } else {
                    System.out.println("");
                }
            }
            System.out.print("Wanna go again (y/n)? ");
            cont = sc.next();
        }while (cont.substring(0,1).equalsIgnoreCase("y"));
    }
    
}
