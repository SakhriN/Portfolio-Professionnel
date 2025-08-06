package org.example.exo22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrivez une valeur");
        String mot = scanner.nextLine();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            CompletableFuture<Void> step1 = CompletableFuture.runAsync(() -> {
                System.out.println("Etape 1 : Lecture des données.");
                System.out.println(liste);
            }, executor);
            CompletableFuture<Void> step2 = step1.thenRunAsync(() -> {
                System.out.println("Etape 2 : Traitement des données.");
                System.out.println("Mot ecrit : "+ mot);
            }, executor);
            CompletableFuture<Void> step3 = step2.thenRunAsync(() -> {
                System.out.println("Etape 3 : Stockage des données.");
                liste.add(mot);
                System.out.println(liste);
            }, executor);
            step3.join();
        }

    }
}