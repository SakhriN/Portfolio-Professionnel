package org.example.exo23;

import java.util.List;

public class Commande {
    private int id;
    private List<Article> articles;
    private Status status;

    public Commande(int id, List<Article> articles, Status status) {
        this.id = id;
        this.articles = articles;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
