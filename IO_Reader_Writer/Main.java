/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] c = new char[512];
        try (FileReader fr = new FileReader("PLSQL2.sql");
                FileWriter fw = new FileWriter("Test.out")) {
            int count;
            while ((count = fr.read(c)) != -1) {
                fw.write(c, 0, count);

            }//end while
        } catch (FileNotFoundException ex) {
            System.out.println("Your file's not there");
            System.exit(-22);
        } catch (IOException ex) {
            System.out.println("Something happened");
            System.exit(-40);
        }// end try with resources
        try {
            BufferedReader bfr
                    = new BufferedReader(new FileReader("PLSQL2.sql"));
            BufferedWriter bfw
                    = new BufferedWriter(new FileWriter("Buff.out"));
            String x;
            while ((x = bfr.readLine()) != null){
                bfw.write(x);
                bfw.newLine();
            }// end buffer file
            bfw.close();
            bfr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
