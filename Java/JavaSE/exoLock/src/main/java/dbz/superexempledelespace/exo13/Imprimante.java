package dbz.superexempledelespace.exo13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Imprimante {

    Lock lock = new ReentrantLock();


    public void imprimante() {
    }

    public void utilisation(){
        try{
            System.out.println(Thread.currentThread().getName() + " tente d'utiliser l'imprimante.");
            int random = (int) (Math.random() * 1000);
            boolean bool = lock.tryLock(random, TimeUnit.MILLISECONDS);
            if(bool){
                System.out.println(Thread.currentThread().getName() + " a acquis le verrou et utilise l'imprimante.");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + "  a terminé d'utiliser l'imprimante et libère le verrou.");
                lock.unlock();
            }else{
                System.out.println(Thread.currentThread().getName() + " n'a pas pu accéder a l'imprimante (temps d'attente dépassé).");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }



    }

}
