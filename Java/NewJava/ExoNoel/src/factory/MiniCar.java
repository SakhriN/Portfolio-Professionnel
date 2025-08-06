package factory;

public class MiniCar implements Toy{

    @Override
    public void plays() {
        System.out.println("En train de jouer avec la petite voiture.");
    }

    public String getDescription() {
        return "Une petite voiture en bon état.";
    }
}
