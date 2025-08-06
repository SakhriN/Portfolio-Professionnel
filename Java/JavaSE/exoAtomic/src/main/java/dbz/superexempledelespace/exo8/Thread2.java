package dbz.superexempledelespace.exo8;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Thread2 implements Callable<AtomicInteger> {
    private AtomicInteger counter;
    private AtomicInteger compteur;


    public Thread2(AtomicInteger counter) {
        this.compteur = new AtomicInteger(0);
        this.counter = counter;
    }

    public AtomicInteger call() {

        counter.incrementAndGet();
        compteur.incrementAndGet();
        return counter;
    }

    public AtomicInteger getCompteur() {
        return compteur;
    }
}
