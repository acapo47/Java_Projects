/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11617;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.interfaces.DoStuff;

/**
 *
 * @author GLNN104Lab
 */
public class Main implements DoStuff{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,String> hMap = new HashMap<>();
        LinkedList <String> ll = new LinkedList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
        String today = "23/12/17";
        try {
            Date myDate = sdf.parse(today);
            System.out.println(sdf.format(myDate));
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i <= 12; i++){
            ll.add("String " + i);
            hMap.put(i, "String " + i);
        }
        
        Iterator<String> it = ll.iterator();
        System.out.println("Iterator");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\nObject For");
        for (String z : ll){
            System.out.println(z);
        }
        System.out.println("Lambda");
        ll.forEach(x -> System.out.println(x));
        System.out.println("\nLambda of hMap");
        hMap.forEach((k,v) -> System.out.println("Key " + k + "\tVal: " + v));
    }

    @Override
    public String sayHowdy() {
        return "Howdy";
    }

    @Override
    public String sayHowdyLots(int x) {
        String s = null;
        for (int i = 0; i < x; i++) {
        s += "Howdy ";
    }
        return s;
    }

    @Override
    public int getANumber(int x) {
        return x * 128989;
    }
    
}
