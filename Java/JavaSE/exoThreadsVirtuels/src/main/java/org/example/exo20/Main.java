package org.example.exo20;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = ()->{
                Long debut = System.currentTimeMillis();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Long fin = System.currentTimeMillis();
            System.out.println("Thread physique : " + (fin-debut) + " ms");
        };


        Thread thread = new Thread(runnable);

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()){
                executor.execute(() -> {
                        long debut = System.currentTimeMillis();
                    try {
                        Thread.sleep(1000);// simule une tache
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                        long fin = System.currentTimeMillis();
                        System.out.println("Thread virtuel : " + (fin-debut) + " ms");
                });
        } //

        thread.start();

    }
}