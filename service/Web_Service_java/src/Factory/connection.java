package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class connection
{


    public Connection getConnection()
    {

        Connection con = null;

        System.out.println("--- MySQL JDBC Connection Test ---");

        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL JDBC Driver succes !!");

        }
        catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
        }

        try {
            con =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gestionemprunts","root","");

            System.out.println("\n connection Registered!");
        }
        catch(Exception e)
        {
            System.out.println(" MySQL DataBase Uknown?");
        }
        return con;


    }
}
