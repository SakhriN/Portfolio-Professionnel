package dbz.superexempledelespace.exo2;

public class MaRunnableTache implements Runnable {
    private int nombre;
    public MaRunnableTache(int tagrandmere) {
        this.nombre = tagrandmere;

    }
    public void run() {
            int j = nombre*nombre;
            System.out.println("Le carré de "+ nombre +" : "+j);
    }
}
