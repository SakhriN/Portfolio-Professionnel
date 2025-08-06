package dbz.superexempledelespace.exo1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread monPremierThread = new Thread(new MonPremierThread());
        Thread monPremierThread2 = new Thread(new MonPremierThread());
        Thread monPremierThread3 = new Thread(new MonPremierThread());

        monPremierThread.start();
        monPremierThread2.start();
        monPremierThread3.start();

    }
}