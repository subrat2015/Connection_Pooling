package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "test";
            String password = "test";
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw e;
        }
    }



}