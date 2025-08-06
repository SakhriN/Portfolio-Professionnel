package dbz.superexempledelespace.exo8;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(0);
        Thread1 thread1 = new Thread1(counter);
        Thread2 thread2 = new Thread2(counter);
        Thread3 thread3 = new Thread3(counter);
        
        for (int i = 0; i < 10000; i++) {
            int random = (int) Math.round(Math.random()*2+1);
            switch (random) {

                case 1-> {
                    thread1.call();
                }
                case 2-> {
                    thread2.call();
                }
                default -> {
                    thread3.call();
                }
            }
            if(i==9999){
                System.out.println("Nombres de fois ou le thread 1 est lancé : " + thread1.getCompteur());
                System.out.println("Nombres de fois ou le thread 2 est lancé : " + thread2.getCompteur());
                System.out.println("Nombres de fois ou le thread 3 est lancé : " + thread3.getCompteur());
            }
        }


        System.out.println("Valeur finale du compteur : "+ counter);
    }
}

