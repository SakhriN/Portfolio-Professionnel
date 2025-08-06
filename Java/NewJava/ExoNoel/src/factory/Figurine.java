package factory;

public class Figurine implements Toy{

    @Override
    public void plays() {
        System.out.println("En train de jouer avec la figurine.");
    }


    public String getDescription() {
        return "Une figurine en bon état.";
    }

}
