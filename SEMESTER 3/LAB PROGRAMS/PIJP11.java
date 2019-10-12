package com.bca;

import java.sql.*;
public class PIJP11
{
    public static void main (String[] args)
    {
        System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
        Connection connect = null;
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
            String userName = "abhi";
            String password = "abhi123";
            String url = "jdbc:MySQL://localhost/trafficoffenders";
            connect = DriverManager.getConnection (url, userName, password);
            System.out.println ("\nDatabase Connection Established...");
        }
        catch (Exception ex)
        {
            System.err.println ("Cannot connect to database server");
            ex.printStackTrace();
        }

        finally
        {
            if (connect != null)
            {
                try
                {
                    System.out.println("\n***** Let terminate the Connection *****");
                    connect.close ();
                    System.out.println ("\nDatabase connection terminated...");
                }
                catch (Exception ex)
                {
                    System.out.println ("Error in connection termination!");
                }
            }
        }
    }
}