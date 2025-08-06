package dbz.superexempledelespace.exo14;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        CyclicBarrier barre = new CyclicBarrier(3, ()->{
            System.out.println("Fusion des données terminée. Tous les threads peuvent continuer.");
        });


for (int i = 0; i < 3; i++) {
    int j = i;
    new Thread(()->{
        try{
            System.out.println(Thread.currentThread().getName()+" a commencé à charger les données.");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" a terminé le chargement des données.");
            barre.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }, "Thread-"+i).start();
}





    }
}
