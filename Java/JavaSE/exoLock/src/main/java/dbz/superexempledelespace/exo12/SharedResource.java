package dbz.superexempledelespace.exo12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    Lock lock = new ReentrantLock();
    List<Integer> list;

    public SharedResource() {
        list = new ArrayList<Integer>();
    }

    public void add(Integer value)  {
        try{
            boolean bool = lock.tryLock(4, TimeUnit.SECONDS);
            if (bool) {
                list.add(value);
                System.out.println(Thread.currentThread().getName() + " a ajouté " + value);
                lock.unlock();

            }else{
                System.out.println("Raté");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public void remove(Integer value) {
        try{
            boolean bool = lock.tryLock(4,TimeUnit.SECONDS);
            if (bool) {
                if(list.contains(value)){
                    list.remove(value);
                    System.out.println(Thread.currentThread().getName() + " a supprimé " + value);
                }else{
                    System.out.println(Thread.currentThread().getName() + " n'a rien à supprimer.");
                }
                lock.unlock();
            }else{
                System.out.println("Raté");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void show(){
        System.out.println("Etat final de la liste : " + list);
    }

}
