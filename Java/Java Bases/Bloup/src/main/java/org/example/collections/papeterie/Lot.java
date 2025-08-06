package org.example.collections.papeterie;

public class Lot {

    Article article;
int quantite;
float remiseTaux;

    public Lot(Article article, int quantite, float remiseTaux) {
        this.article = article;
        this.quantite = quantite;
        this.remiseTaux = remiseTaux;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getRemiseTaux() {
        return remiseTaux;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "article=" + article +
                ", quantite=" + quantite +
                ", remiseTaux=" + remiseTaux +
                '}';
    }
}
