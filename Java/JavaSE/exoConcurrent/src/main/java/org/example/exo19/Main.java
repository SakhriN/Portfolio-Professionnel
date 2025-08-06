package org.example.exo19;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();

        runTest(list);

        System.out.println("Liste finale des produits : " + list);
    }

    private static void runTest(ConcurrentLinkedQueue<String> map) {

        Runnable ajout = () -> {
            for (int i = 0; i < 10; i++) {
                map.add(Thread.currentThread().getName()+"-Element-"+i);
                System.out.println(Thread.currentThread().getName()+" a ajouté : " + Thread.currentThread().getName()+"-Element-"+i);
            }

        };

        Runnable retrait = () -> {
            for (int i = 0; i < 10; i++) {
                if (map.contains(Thread.currentThread().getName()+i)) {
                    map.remove(Thread.currentThread().getName()+i);
                    System.out.println(Thread.currentThread().getName()+" a retiré : " + Thread.currentThread().getName()+"-Element-"+i);
                }else{
                    System.out.println(Thread.currentThread().getName()+ " n'a trouvé aucun élément à retirer.");
                }
            }

        };

        Thread t1 = new Thread(ajout,"Producer");
        Thread t2 = new Thread(retrait,"Consumer");


        try{
            t2.start();
            t1.start();

            t2.join();
            t1.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}