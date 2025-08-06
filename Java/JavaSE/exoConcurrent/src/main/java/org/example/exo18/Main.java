package org.example.exo18;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();

        runTest(copyOnWriteList);

        System.out.println("Liste finale des produits : " + copyOnWriteList);
    }

    private static void runTest(List<String> map) {

        Runnable runname = () -> {
            for (int i = 0; i < 10; i++) {
                        map.add(Thread.currentThread().getName()+"-Produit-"+i);
                }

        };

        Thread t1 = new Thread(runname,"Thread-1");
        Thread t2 = new Thread(runname,"Thread-2");


        try{
            t1.start();
            t2.start();

            t2.join();
            t1.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}