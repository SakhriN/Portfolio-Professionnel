package org.example;

import org.example.models.Client;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nom client");
        String nom = scan.nextLine();
        System.out.println("Prenom client");
        String prenom = scan.nextLine();
        System.out.println("identifiant client");
        Integer identifiant = scan.nextInt();
        System.out.println("telephone client");
        Integer telephone = scan.nextInt();

        Client test = new Client(nom, prenom, identifiant, telephone);

        String request1 = "SELECT * FROM client";
        System.out.println(test);
    }
}
