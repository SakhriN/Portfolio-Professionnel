package dbz.superexempledelespace.exo16;

import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        AtomicInteger[] atomicIntegers = new AtomicInteger[]{
                new AtomicInteger(1),
                new AtomicInteger(2),
                new AtomicInteger(3),
                new AtomicInteger(4),
                new AtomicInteger(5),
                new AtomicInteger(6),
                new AtomicInteger(7),
                new AtomicInteger(8)
        };

        int sum = Arrays.stream(atomicIntegers).mapToInt(atomicInteger -> atomicInteger.intValue()).sum();


        CyclicBarrier barrier = new CyclicBarrier(4,()->{
            System.out.println("Somme totale : " + sum);
        });

        for (int i = 0; i < atomicIntegers.length; i=i+2) {
            int j=i;
            new Thread(() -> {
                try{
                    int somme = atomicIntegers[j].intValue()+atomicIntegers[j+1].intValue();
                    System.out.println(Thread.currentThread().getName() + " a calculé une somme partielle de (indice : " + j + " à indice : " + (j+1) +") : "+somme);
                    barrier.await();
                }catch(InterruptedException | BrokenBarrierException e){
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
