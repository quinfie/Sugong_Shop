/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm_Kho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BIN DAT
 */
public class DataHelper {

    public static Connection openConnection() throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Sugong_Coffee"
                    + ";encrypt=false;trustServerCertificate=true;loginTimeout=30;characterEncoding=UTF-8";
            String username = "sa";
            String password = "123";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException cnfe) {
            // Log or handle the ClassNotFoundException
            throw cnfe; // Re-throwing to let the caller handle it
        } catch (SQLException sqle) {
            // Log or handle the SQLException
            throw sqle; // Re-throwing to let the caller handle it
        }
        return con;
    }

}
