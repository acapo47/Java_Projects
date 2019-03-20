/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170830;

/**
 *
 * @author Anthony
 */
public class Main {

    public static void main(String[] args) {
        int j = 40;
        int k = 35;
        System.out.print("Howdy Howdy Howdy");
        System.out.println("and here we are again");
        System.out.println(j+k);
        System.out.println(j % k);
        System.out.println(k % j);
        int x = j++;
        System.out.println("x is " + x +" and j is " + j);
        j = j * (k + 1);
//        j *= k + 1;
        System.out.println(j);
        
        
    }// end method main
}// end class Main
