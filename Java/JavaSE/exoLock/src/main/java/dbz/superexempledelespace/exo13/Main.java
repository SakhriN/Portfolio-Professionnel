package dbz.superexempledelespace.exo13;

public class Main {
    public static void main(String[] args) {

        Imprimante imprimante = new Imprimante();

        Thread[] thread = new Thread[3];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(()-> {
               imprimante.utilisation();
            });
        }

        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }

    }
}
