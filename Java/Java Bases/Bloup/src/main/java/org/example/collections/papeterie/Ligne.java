package org.example.collections.papeterie;

public class Ligne {

    Article article;

    int quantite;

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public Ligne(){

    }
    public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "article=" + article +
                ", quantite=" + quantite +
                '}';
    }
}
