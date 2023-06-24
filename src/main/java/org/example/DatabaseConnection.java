package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
    static String url = "jdbc:mysql://127.0.0.1:3306/class";
    static  String username = "root";
    static String password = "naseebdangi";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }
}