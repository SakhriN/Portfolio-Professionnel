package exo4;

public class Personnage {
    private String nom;
    private int PV;
    private int ATQ;

    public Personnage(String nom, int PV, int ATQ) {
        this.nom = nom;
        this.PV = PV;
        this.ATQ = ATQ;
    }

    public String getNom() {
        return nom;
    }

    public int getPV() {
        return PV;
    }

    public int getATQ() {
        return ATQ;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public void setATQ(int ATQ) {
        this.ATQ = ATQ;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void gagnePV(int montant) {
        PV = PV + montant;
    }

    public void perdPV(int montant) {
        PV = PV - montant;
    }

    public void gagneATQ(int montant) {
        ATQ = ATQ + montant;
    }

    public void perdATQ(int montant) {
        ATQ = ATQ - montant;
    }


    public String toString() {
        return nom + "," + PV + "," + ATQ;
    }
}
