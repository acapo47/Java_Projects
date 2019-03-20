/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
        File myFile = new File("e:\\m325f17","myFile");
        char[] out = new char[512];
        int x;
        
        System.out.println("Can read? " + myFile.canRead());
        System.out.println("Can write? " + myFile.canWrite());
        System.out.println("Is it a file? " + myFile.isFile());
        System.out.println("Is it a directory? " 
                + myFile.isDirectory());
        System.out.println("Exists? " + myFile.exists());
        try {
            myFile.createNewFile();
        } catch (IOException ex) {
            System.out.println("Ooops");
        }
        System.out.println("Exists? " + myFile.exists());
        System.out.println("Parent: " + myFile.getParent());
        try {
            FileReader fr = new FileReader("lab3.sql");
            int c = fr.read(out);
            System.out.println("C is " + c);
            System.out.println("out.length = " + out.length);
            for (x = 0; x < out.length; x++){
                System.out.print(out[x]);
            }//end for 
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find your file");
            System.exit(-5);
        } catch (IOException ex) {
            System.out.println("Something happened");
            System.exit(-22);
        }
//        int c = fr.read(out,512);
    }
    
}
