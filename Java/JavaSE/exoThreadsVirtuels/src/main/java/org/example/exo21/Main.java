package org.example.exo21;

import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()){
            for (int i = 0; i < 1000; i++) {
                int numero = i;
            executor.execute(() -> {
                try {
                    System.out.println("Tentative de connexion du thread virtuel numéro "+(numero+1));
                    Thread.sleep(2000);// simule une tache
                    System.out.println("Le thread virtuel numéro "+(numero+1)+" s'est connecté.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            }
        }
    }
}