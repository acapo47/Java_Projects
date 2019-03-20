/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171117;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

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
            DriverManager.registerDriver(
                    new oracle.jdbc.OracleDriver());
        } catch (SQLException ex) {
            System.out.println("Driver problem");
            System.exit(-123);
        }
        
        try {
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:"
                            + "@horus.cob.csuchico.edu:1521:orcl"
                    , "M335","MIN$");
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Invalid username/password");   
            System.exit(-456);
        }
        
        try {
            Statement stmt = con.createStatement();
            String sql = "Select * from employees";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
        } catch (SQLException ex) {
            System.out.println("Something happened");            
            ex.printStackTrace();
            System.exit(-235);
        }
        
    }
    
}
