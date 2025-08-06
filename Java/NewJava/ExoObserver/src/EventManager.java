import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class EventManager {

    private List<Observateur> observateurs = new ArrayList<Observateur>();

public void addObservateur(Observateur observateur) {
    observateurs.add(observateur);
}

public void removeObservateur(Observateur observateur) {
    observateurs.remove(observateur);
}

public void listObservateurs() {
    for (Observateur observateur : observateurs) {
        System.out.println(observateur);
    }
}

public void notifyObservers(String message) {
    for (Observateur observateur : observateurs) {
        observateur.react(message);
    }
}

}
