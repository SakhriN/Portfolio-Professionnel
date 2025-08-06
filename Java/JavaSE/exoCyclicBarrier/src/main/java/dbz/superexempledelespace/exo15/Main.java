package dbz.superexempledelespace.exo15;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        for (int i = 1; i < 4; i++) {
            int j = i;
            new Thread(()->{
                try{
                    System.out.println(Thread.currentThread().getName()+" a atteint l'étape 1");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+" a atteint l'étape 2");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+" a atteint l'étape 3");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, "Thread-"+i).start();
        }
    }
}
