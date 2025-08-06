package dbz.superexempledelespace.exo13;

public class Nugget {

    String typeviande;
    int goutSur10;
    int quantite = 100;


    public Nugget() {
        this.typeviande  = "poulet";
        this.goutSur10 = 10;
        this.quantite = 100;
    }

    public String getTypeviande() {
        return typeviande;
    }

    public void setTypeviande(String typeviande) {
        this.typeviande = typeviande;
    }

    public int getGoutSur10() {
        return goutSur10;
    }

    public void setGoutSur10(int goutSur10) {
        this.goutSur10 = goutSur10;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void eat(){
        System.out.println("Vous vous delectez des 100 nuggets avec amour et tendresse, c'est le meilleur jour de votre vie.");
    }

    public void servir(){
        System.out.println("Le nugget est sur la table.");
    }




    @Override
    public String toString() {
        return "Nugget{" +
                "typeviande='" + typeviande + '\'' +
                ", goutSur10=" + goutSur10 +
                ", quantite=" + quantite +
                '}';
    }
}
