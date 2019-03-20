/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171115;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

        //        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer => ");
//        int i = sc.nextInt();
        Connection con = null;

        try {
            DriverManager.registerDriver(
                    new oracle.jdbc.OracleDriver());
        } catch (SQLException ex) {
            System.out.println("There's a driver problem");
            System.exit(-12);
        }// end register driver
       
        try {
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@horus.cob.csuchico.edu:"
                            + "1521:orcl", "M325", "MIN$"); 
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Wrong username/password"); 
            System.exit(-45);
        }//end get connection
        try {
            Statement stmt = con.createStatement();
            String query = "select first_name, last_name, "
                    + "department_name "
                    + "from employees "
                    + "join departments using (department_id) "
                    + "where department_id in (10,100)";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
