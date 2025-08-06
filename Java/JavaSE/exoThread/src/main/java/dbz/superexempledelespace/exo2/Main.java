package dbz.superexempledelespace.exo2;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MaRunnableTache(1));
        Thread thread2 = new Thread(new MaRunnableTache(2));
        Thread thread3 = new Thread(new MaRunnableTache(3));
        Thread thread4 = new Thread(new MaRunnableTache(4));
        Thread thread5 = new Thread(new MaRunnableTache(5));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
