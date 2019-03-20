/*
--
-- Anthony Capo
--
 */
package lab6f17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.classes.Department;

/**
 *
 * @author Anthony
 */
public class Lab6F17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int dID;
        String dName;
        Date dStart;
        String dStreet;
        int dZip;
        String dCity, dState, dCountry;
        SimpleDateFormat sdf = new SimpleDateFormat(
        "M/d/y"
        );
        
        Scanner sc;
        String input;
        Department dept;
        HashMap<Integer,Department> dMap = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(
        new FileReader("DeptData.txt"));
                BufferedWriter bw = new BufferedWriter(
                new FileWriter("BadRecs.txt"))){
            while ((input = br.readLine()) != null){
                sc = new Scanner(input.trim());
//                sc.useDelimiter(",");
                  sc.useDelimiter("\\s*,\\s*");
                try {
                    dID = sc.nextInt();
                    dName = sc.next();
                    dStart = sdf.parse(sc.next());
                    dStreet = sc.next();
                    dZip = sc.nextInt();
                    dCity = sc.next();
                    dState = sc.next();
                    dCountry = sc.next();
                    
                    dept = new Department(dID, dName, dStart, dStreet, dZip, dCity, dState, dCountry);
                    
                    dMap.put(dID, dept);
                    
                } catch (Exception ex){
                    StackTraceElement[]st = ex.getStackTrace();
                    System.out.println(input + "\t" +
                            st[st.length - 1]);
                    bw.write(input);
                    bw.newLine();
                }//end parse try catch
            }
                    
        } catch (IOException ex) {
            Logger.getLogger(Lab6F17.class.getName()).log(Level.SEVERE, null, ex);
        }//end read and parse
        
        
        Collection<Department> val = dMap.values();
        
        for (Department x : val){
            System.out.println(x);
        }
    
    }
    
}

