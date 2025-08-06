package observer;

public class MonLutinObservateur implements LutinObservateur {
    private String name;

    public MonLutinObservateur(String name) {
        this.name = name;
    }

    public void inform(String message) {
        System.out.println(this.name + " a reçu le message suivant : " + message);
    }
}
