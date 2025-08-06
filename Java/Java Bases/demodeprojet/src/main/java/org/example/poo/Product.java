package org.example.poo;

public class Product {

    protected String name;

    protected int id;

    public int getId() {
        return id;
    }

    public Product(){
    }

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void getBonjour() {
        System.out.println("Bonjour");
    }

    public void quiSuisJe() {
        System.out.println("Je suis un produit");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

