package myProbleme;

import myJustice.Policier;

public class AbusDautorite {
    private String nom;
    private Policier policier;

    public AbusDautorite(String nom, Policier policier) {
        this.nom = nom;
        this.policier = policier;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Policier getPolicier() {
        return policier;
    }

    public void setPolicier(Policier policier) {
        this.policier = policier;
    }

    @Override
    public String toString() {
        return "AbusDautorite : " + nom +
                ", abus orchestré par le policier " + policier +
                '.';
    }
}
