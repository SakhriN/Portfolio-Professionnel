package org.example.collections.papeterie;

public class ArticleUnitaire extends Article {


    String nom;
    float prix;

    public ArticleUnitaire() {
    }

    public ArticleUnitaire(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "ArticleUnitaire{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", id=" + id +
                '}';
    }
}
