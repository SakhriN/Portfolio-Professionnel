package org.example.exo23;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Article> panier;

public Panier() {
    panier = new ArrayList<Article>();
}


    public List<Article> getPanier() {
        return panier;
    }

    public void AjoutPanier(Article article) {
        panier.add(article);
    }

    public void SuppressionPanier(Article article) {
    panier.remove(article);
    }

}
