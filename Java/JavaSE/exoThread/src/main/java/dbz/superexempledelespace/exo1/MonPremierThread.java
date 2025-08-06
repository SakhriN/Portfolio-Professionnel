package dbz.superexempledelespace.exo1;

public class MonPremierThread implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try{
            System.out.println(Thread.currentThread().getName() + " Compteur  : " + i);
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
