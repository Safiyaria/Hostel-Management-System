/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author User
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection ("jdbc:sqlserver://localhost:1433;user=sn;password=872524;" + "databaseName=ProjectHostelManagementSystem;");
          return con;
        }
        catch(Exception e)
        {
            return null;
        }
        
    }
    
}
