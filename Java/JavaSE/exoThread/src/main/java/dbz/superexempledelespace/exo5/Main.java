package dbz.superexempledelespace.exo5;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ExecutorService exec = Executors.newSingleThreadExecutor();
        Callable<String> integerCallable = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Résultat de la tâche " + i + " : " + (int)Math.pow(i, 2));
                Thread.sleep(2000);
            }
            return "fin";
        };
        try {
        Future<String> future = exec.submit(integerCallable);
        System.out.println(future.get());
        exec.shutdown();
    }catch(ExecutionException| InterruptedException e){
            e.printStackTrace();
        }
    }
}
