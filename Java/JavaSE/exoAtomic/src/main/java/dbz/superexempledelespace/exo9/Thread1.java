package dbz.superexempledelespace.exo9;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Runnable {
private AtomicInteger counter;
private AtomicInteger compteur;


    public Thread1(AtomicInteger counter) {
        this.compteur = new AtomicInteger(0);
        this.counter = counter;
    }

    public void run() {

        counter.incrementAndGet();
        compteur.incrementAndGet();
        System.out.println(Thread.currentThread().getName() + " a implémenté le compteur a " + counter.get());
    }
}
