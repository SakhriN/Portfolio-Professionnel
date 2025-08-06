package dbz.superexempledelespace.exo12;

public class Main {


    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread[] threads = new Thread[2];
        for (int i = 0; i < threads.length; i++) {
            int finalI = i;
            threads[i] = new Thread(()->{
                switch(finalI){
                    case 0->{
                        for (int j = 0; j < 5; j++) {
                            int finalJ = j;
                            sharedResource.remove(finalJ);
                        }
                    }
                    default -> {
                        for (int j = 0; j < 5; j++) {
                            int finalJ = j;
                            sharedResource.add(finalJ);
                        }
                    }
                }
            });
        }

        for (int i = 0; i < threads.length; i++) {
            try{
                threads[i].start();
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sharedResource.show();
    }
}
