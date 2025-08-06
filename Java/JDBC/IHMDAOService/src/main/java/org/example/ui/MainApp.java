package org.example.ui;

import org.example.models.Person;
import org.example.service.PersonService;
import org.example.utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Connection connection = ConnectionUtils.getMySQLConnection();
            System.out.println("Connexion à la base de données réussie.");

            PersonService personneService = new PersonService(connection);

            int choice;
            do {
                displayMenu();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> showAllPersonnes(personneService);
                    // Ajouter d'autres cas pour les fonctionnalités supplémentaires
                    case 0 -> System.out.println("Merci d'avoir utilisé l'application. Au revoir !");
                    default -> System.out.println("Choix invalide.");
                }

            } while (choice != 0);

            connection.close();
        } catch (SQLException e) {
            System.err.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Choisissez une option :");
        System.out.println("1 - Afficher toutes les personnes");
        // Ajouter d'autres options au besoin
        System.out.println("0 - Quitter");
    }

    private static void showAllPersonnes(PersonService personneService) {
        List<Person> personnes = personneService.getAllPersonnes();
        System.out.println("Liste des personnes :");
        for (Person personne : personnes) {
            System.out.println(personne.getId() + ") " + personne.getFirstName() + " " + personne.getLastName());
        }
    }
}
