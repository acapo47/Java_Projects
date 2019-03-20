/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jim
 */
public class DBStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection con = null;
        //
        // Register Driver
        //
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        } catch (SQLException ex) {
            System.out.println("Problem with driver");
            System.exit(-9);
        }

        //
        // get connection (Use your own user)
        //
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:"
                    + "@horus.cob.csuchico.edu:1521:orcl", "M335", "MIN$");
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Login Problem");
            System.exit(-12);
        }
        // 
        // Your code will go in the following try/catch (before the close)
        //
        try {
            Statement stmt = con.createStatement();
            String sql = "select * from employees "
                    + "where department_id = 100";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int cols = rsmd.getColumnCount();
            for (int j = 1; j <= cols; j++){
                if (rsmd.getColumnType(j) == Types.VARCHAR){
                    System.out.print(rsmd.getColumnName(j) + "\t");
                }// end if
            }// end heading for
            System.out.println("");
            while (rs.next()) {
                for (int j =    1; j <= cols; j++){
                    if (rsmd.getColumnType(j) == Types.VARCHAR){
                        System.out.print(rs.getString(j) + "\t");
                    }//end if
                }//end column loop
                System.out.println("");
            }// end row loop
            
//            sql = "delete from temp_table where idx > 10";
//            int num = stmt.executeUpdate(sql);
//            if (num == 1){
//                con.commit();
//                System.out.println("Commit complete");
//            }else {
//                con.rollback();
//                System.out.println("Something went wrong ... "+
//                        num + " rows deleted");
//            }
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the student name => ");
            String name = sc.next();
            sql = "INSERT INTO NAME_TAB VALUES (?)";
            System.out.println(sql);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.executeUpdate();
            con.close();
            System.out.println(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBStart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
