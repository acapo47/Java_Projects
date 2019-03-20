/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcf17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

/**
 *
 * @author Fabian Rubio
 */
public class JDBCF17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        String uname, pw;
        Scanner sc = new Scanner(System.in);

        try {
            DriverManager.registerDriver(
                    new oracle.jdbc.OracleDriver());
        } catch (SQLException ex) {
            System.out.println("Problem registering driver");
            System.exit(-99);
        }

        System.out.print("Enter your username => ");
        uname = sc.next();
        System.out.print("Enter your password => ");
        pw = sc.next();
        try {
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:"
                    + "@horus.cob.csuchico.edu:1521:orcl",
                    uname, pw);
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Problem with login");
            System.exit(-12);
        }

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "Select * from employees");
            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            for (int j = 1; j <= cols; j++) {
                if (rsmd.getColumnType(j) == Types.VARCHAR) {
                    System.out.print(rsmd.getColumnName(j) + "\t");
                }
            }//end heading for
            System.out.println("");

            while (rs.next()) {
                for (int j = 1; j <= cols; j++) {
                    if (rsmd.getColumnType(j) == Types.VARCHAR) {
                        System.out.print(rs.getString(j) + "\t");
                    }//end row if
                }//end col
                System.out.println("");
            }//end rows
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(-73);
        }
    }

}
