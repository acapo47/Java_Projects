/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
        int count;
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader bfr = null;
        char[] out = new char[512];
        
        try {
            fr = new FileReader("PLSQL2.sql");
            fw = new FileWriter("Test.out");
            //text version
            count = fr.read(out);
            
            while (count != -1) {
                System.out.println("Count is " + count);
                fw.write(out,0, count);
                count = fr.read(out);
            }//end read while
            fr.close();
            fw.close();
            
            fr = new FileReader("PLSQL2.sql");
            fw = new FileWriter("Test.out", true);
            //
            //  More common way of reading
            //
            while ((count = fr.read(out)) != -1){
                System.out.println("COunt is " + count);
                fw.write(out,0,count);
            }//end while
            fw.close();
            fr.close();
            
            bfr = new BufferedReader(new FileReader("PLSQL2.sql"));
            
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find your file");            
            System.exit(-7);
        } catch (IOException ex) {
            System.out.println("Something happened");            
            System.exit(-12);
        }
    }

}
