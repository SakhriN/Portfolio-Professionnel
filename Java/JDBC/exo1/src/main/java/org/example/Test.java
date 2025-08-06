package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.sql.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            Integer cnchoice = 1;
            Integer dlchoice = 1;
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("connexion ok");

            System.out.println("Merci de saisir le prénom : ");
            String fn = scanner.nextLine();
            System.out.println("Merci de saisir le nom : ");
            String ln = scanner.nextLine();
            System.out.println("Merci de saisir le numéro de classe : ");
            Integer cn = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Merci de saisir la date de diplome : ");
            String ddstring = scanner.nextLine();
            String request1 = "INSERT INTO etudiant (firstName,lastName, class_number, diplome_date) VALUES ( ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request1);
            preparedStatement.setString(1, fn);
            preparedStatement.setString(2, ln);
            preparedStatement.setInt(3, cn);
            preparedStatement.setDate(4, Date.valueOf(ddstring));
            int nbRows = preparedStatement.executeUpdate();
            System.out.println(nbRows);

            String request2 = "SELECT * FROM etudiant";
            Statement statement1 = connection.createStatement();
            ResultSet resultSet = statement1.executeQuery(request2);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("firstName") + " " + resultSet.getString("lastName") + " " + resultSet.getInt("class_number") + " " + resultSet.getDate("diplome_date"));
            }
            statement1.close();

            System.out.println("Choisissez le numéro de classe :");
            cnchoice = scanner.nextInt();
            String request3 = "SELECT * FROM etudiant WHERE class_number = " + cnchoice;
            Statement statement2 = connection.createStatement();
            ResultSet resultSet1 = statement2.executeQuery(request3);
            while (resultSet1.next()) {
                System.out.println(resultSet1.getInt("id") + ") " + resultSet1.getString("firstName") + " " + resultSet1.getString("lastName") + " " + resultSet1.getInt("class_number") + " " + resultSet1.getDate("diplome_date"));
            }
            statement2.close();

            System.out.println("Choisissez quelle valeur supprimer :");
            dlchoice = scanner.nextInt();
            String request4 = "DELETE FROM etudiant WHERE id = " + dlchoice;
            Statement statement3 = connection.createStatement();
            int destruction = statement3.executeUpdate(request4);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void menu(){
        System.out.println("Choisissez l'action a suivre :");
        System.out.println("1 - Montrer tous les étudiants de la classe");
        System.out.println("2 - Ajouter un étudiant");
        System.out.println("3 - Montrer tous les étudiants selon un numéro de classe");
        System.out.println("4 - Supprimer un étudiant.");
        System.out.println("0 - Quitter ce programme de merde");
    }
}
