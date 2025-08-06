package org.example.exo17;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("ProduitA", 50);
        map.put("ProduitB", 30);
        map.put("ProduitC", 20);

        runTest(map);

        System.out.println("Inventaire final : " + map);

    }


    private static void runTest(ConcurrentHashMap<String, Integer> map) {

        Runnable RAcheteur = () -> {
            for (int i = 0; i < 10; i++) {
                int random = (int) Math.round((Math.random() * 2));
                switch (random) {
                    case 0 -> {
//                        map.merge("ProduitA",-1, Integer::sum);
                        String key = "ProduitA";
                        map.computeIfPresent(key, (k, v) -> v - 1);
                        System.out.println(Thread.currentThread().getName() + " a acheté 1 unité de " + key);
                    }
                    case 1 -> {
                        String key = "ProduitB";
                        map.computeIfPresent(key, (k, v) -> v - 1);
                        System.out.println(Thread.currentThread().getName() + " a acheté 1 unité de " + key);
                    }
                    default -> {
                        String key = "ProduitC";
                        map.computeIfPresent(key, (k, v) -> v - 1);
                        System.out.println(Thread.currentThread().getName() + " a acheté 1 unité de " + key);
                    }
                }
            }
        };

        Runnable RReapprovisionneur = () -> {
            for (int i = 0; i < 5; i++) {
                int random = (int) Math.round((Math.random() * 2));
                switch (random) {
                    case 0 -> {
//                        map.merge("ProduitA",-1, Integer::sum);
                        String key = "ProduitA";
                        map.computeIfPresent("ProduitA", (k, v) -> v + 10);
                        System.out.println(Thread.currentThread().getName() + " a réapprovisionné 10 unités de " + key);
                    }
                    case 1 -> {
                        String key = "ProduitB";
                        map.computeIfPresent(key, (k, v) -> v + 10);
                        System.out.println(Thread.currentThread().getName() + " a réapprovisionné 10 unités de " + key);
                    }
                    default -> {
                        String key = "ProduitC";
                        map.computeIfPresent(key, (k, v) -> v + 10);
                        System.out.println(Thread.currentThread().getName() + " a réapprovisionné 10 unités de " + key);
                    }
                }
            }
        };

        Thread t1 = new Thread(RAcheteur);
        Thread t2 = new Thread(RAcheteur);
        Thread t3 = new Thread(RReapprovisionneur);

        try{
            t1.start();
            t2.start();
            t3.start();

            t3.join();
            t2.join();
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}