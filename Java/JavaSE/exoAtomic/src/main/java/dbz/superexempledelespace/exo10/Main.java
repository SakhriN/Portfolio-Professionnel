package dbz.superexempledelespace.exo10;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        AtomicLong counter = new AtomicLong(1);
        for (int i=2;i<=6;i++){

            int finalJ = i;
            Thread thread = new Thread(()->{
                counter.updateAndGet(x->x* finalJ);
                System.out.println(" : " + counter.get());
            });
            thread.start();
        }



        System.out.println("Valeur finale du compteur : "+ counter);
    }
}

