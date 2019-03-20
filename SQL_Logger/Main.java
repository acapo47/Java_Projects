/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        Connection con = null;
        
        try {
            DriverManager.registerDriver
                    (new oracle.jdbc.OracleDriver());
            // TODO code application logic here
        } catch (SQLException ex) {
            System.out.println("Connection Problem");
            System.exit(-3);
        }
        
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:"
                    + "@horus.cob.csuchico.edu:1521:orcl",
                    "M325","MIN$");
        } catch (SQLException ex) {
            System.out.println("Bad username/password");
            System.exit(-43);
        }
    }
    
}
