package observer;

import java.util.ArrayList;
import java.util.List;

public class SantaCity {
    private List<LutinObservateur> lutinsObservateurs = new ArrayList<>();

    public void addLutin(LutinObservateur lutinObservateur) {
        lutinsObservateurs.add(lutinObservateur);
    }

    public void removeLutin(LutinObservateur lutinObservateur) {
        lutinsObservateurs.remove(lutinObservateur);
    }

    public void notifyLutin(String message) {
        for (LutinObservateur lo: lutinsObservateurs) {
            lo.inform(message);
        }
    }
}
