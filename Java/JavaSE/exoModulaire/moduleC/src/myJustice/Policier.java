package myJustice;

public class Policier {

    private String nom;
    private String prenom;
    private int numerodebadge;


    public Policier(String nom, String prenom, int numerodebadge) {
        this.nom = nom;
        this.prenom = prenom;
        this.numerodebadge = numerodebadge;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumerodebadge() {
        return numerodebadge;
    }

    public void setNumerodebadge(int numerodebadge) {
        this.numerodebadge = numerodebadge;
    }

    @Override
    public String toString() {
        return
                  nom +
                ' ' + prenom +
                ", numero de badge " + numerodebadge;
    }
}
