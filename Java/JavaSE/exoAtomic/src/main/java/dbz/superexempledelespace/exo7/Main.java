package dbz.superexempledelespace.exo7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AtomicInteger atomique = new AtomicInteger(0);


        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        try{

        exec.scheduleAtFixedRate(()-> {
            System.out.println("Message périodique " + atomique.incrementAndGet());
        },1,2, TimeUnit.SECONDS);

            Thread.sleep(10000);
            exec.shutdown();

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("Programme terminé.");
        }

        }
    }
