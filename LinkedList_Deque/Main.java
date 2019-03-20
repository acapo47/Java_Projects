/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171108;

import java.util.Deque;
import java.util.LinkedList;

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
//        Deque<String> myDeque = new Deque<>();
        Deque<String> myQ = new LinkedList<>();
        Deque<String> myStack = new LinkedList<>();
        String got;
        
        myQ.offer("A");
        myQ.offer("B");
        myQ.offer("C");
        
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        
        myQ.forEach(x -> System.out.println(x));
        System.out.println("Is it empty? " + myQ.isEmpty());
        while ((got = myQ.poll()) != null){
            System.out.println(got);
        }
        System.out.println("Is it empty? " + myQ.isEmpty());
        System.out.println("\n\n");
        final int i = 0;
        myStack.forEach(x ->  System.out.println(i +x));
        System.out.println("Is Stack Empty? " + myStack.isEmpty());
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
        System.out.println("Is Stack Empty? " + myStack.isEmpty());
        
        
    }
    
}
