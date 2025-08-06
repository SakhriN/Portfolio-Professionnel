package dbz.superexempledelespace.exo10;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Thread1 implements Runnable {
private AtomicLong counter;
private AtomicInteger multiplicateur;


    public Thread1(AtomicLong counter, AtomicInteger multiplicateur) {
        this.multiplicateur = new AtomicInteger(0);
        this.counter = counter;
    }

    public void run() {

        counter.incrementAndGet();

        System.out.println(Thread.currentThread().getName() + " a implémenté le compteur a " + counter.get());
    }
}
