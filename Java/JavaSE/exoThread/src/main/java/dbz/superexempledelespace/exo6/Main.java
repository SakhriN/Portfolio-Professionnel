package dbz.superexempledelespace.exo6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        try{
            scheduler.schedule(() -> System.out.println("Task executee après 1 seconde"),1,TimeUnit.SECONDS);
            scheduler.schedule(() -> System.out.println("Task executee après 2 secondes"),2, TimeUnit.SECONDS);
            scheduler.scheduleAtFixedRate(() -> System.out.println("Task executee après 3 secondes"),3,2,TimeUnit.SECONDS);
            Thread.sleep(3001);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        scheduler.shutdown();
    }
}
