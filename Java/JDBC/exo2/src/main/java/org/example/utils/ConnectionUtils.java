package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getMySQLConnection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/bddexo2";
        String username = "root";
        String password = "test";

        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}