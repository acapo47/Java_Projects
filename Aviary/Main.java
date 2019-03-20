/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11117;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import my.aviary.Birds;

/**
 *
 * @author GLNN104Lab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Birds> birdal = new ArrayList<>();
        LinkedList<Birds> birdll = new LinkedList<>();
        HashMap<Integer, Birds> birdhm = new HashMap<>();
        Birds tweety;
        tweety = new Birds(7, "Blue", "Hook", true, "Birdica", 7);
        //bird.add(new Birds(7, "Blue", "Hook", true, "Birdica", 7));
        birdal.add(tweety);
        birdll.add(tweety);
        birdhm.put(1, tweety); // put instead of add
        
        Iterator<Birds> it = birdal.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
        it = birdll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
        Collection<Birds> c = birdhm.values();
        
        for (Birds x: c){
            System.out.println(x);   
        }
    }
    
}
