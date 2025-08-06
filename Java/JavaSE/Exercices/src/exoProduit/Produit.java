package exoProduit;

public class Produit {
    private String nom;
    private int quantité;
    private double prix;


    public Produit(String nom, int quantité, double prix) {
        this.nom = nom;
        this.quantité = quantité;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    @Override
    public String toString() {
        return "Produit : " +
                "nom= " + nom + ',' +
                " quantité='" + quantité + ',' +
                " prix=" + prix +
                '.';
    }
}
