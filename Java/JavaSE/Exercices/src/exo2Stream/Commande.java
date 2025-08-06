package exo2Stream;

import java.util.List;

public class Commande {
    private int id;
    private String client;
    private List<String> articles;
    private double montantTotal;
    private boolean estLivree;
private static int count = 1;

    public Commande(String client, List<String> articles, double montantTotal, boolean estLivree) {
        this.id = count++;
        this.client = client;
        this.articles = articles;
        this.montantTotal = montantTotal;
        this.estLivree = estLivree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstLivree() {
        return estLivree;
    }

    public void setEstLivree(boolean estLivree) {
        this.estLivree = estLivree;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", articles=" + articles +
                ", montantTotal=" + montantTotal +
                ", estLivree=" + estLivree +
                '}';
    }
}
