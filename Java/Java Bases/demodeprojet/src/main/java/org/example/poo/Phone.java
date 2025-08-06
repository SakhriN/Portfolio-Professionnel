package org.example.poo;

public class Phone extends Product {

    int prix;

    public Phone() {

    }

    public Phone(String name, int id, int prix) {
        super(name, id);
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
