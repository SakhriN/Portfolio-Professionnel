package dbz.superexempledelespace.exo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {


        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int j = i;
            exec.execute(()-> System.out.println("Tâche "+ j + " exécutée par "+ Thread.currentThread().getName()));
        }
    }
}
