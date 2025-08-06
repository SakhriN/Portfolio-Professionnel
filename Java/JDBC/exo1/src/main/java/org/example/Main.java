package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // connection à ma bdd test mySQL
        String url = "jdbc:mysql://localhost:3306/test";

        try {
            Connection connection = DriverManager.getConnection(url,"root","test");
            if (connection != null){
                System.out.println("connexion ok");
            }else {
                System.out.println("connexion nok !!!");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        // Meilleur pratique mettre la connection dans une classe appart.

    }
}