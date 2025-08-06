import java.awt.*;
import java.util.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Observateur observateur1 = new MonObservateur("Nassim Sakhri");
        Observateur observateur2 = new MonObservateur("Clement Roelens");
        Observateur observateur3 = new MonObservateur("Remi Jospin");



        eventManager.addObservateur(observateur1);
        eventManager.addObservateur(observateur2);
        eventManager.addObservateur(observateur3);

        System.out.println("Nouvel événement : On va manger a 11h.");
        eventManager.notifyObservers("On va manger a 11h.");


    }
}