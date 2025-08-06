package dbz.superexempledelespace.exo9;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);

        for (int i=0;i<10;i++){
            Thread thread = new Thread(new Thread1(counter));
            thread.start();
        }



        System.out.println("Valeur finale du compteur : "+ counter);
    }
}

