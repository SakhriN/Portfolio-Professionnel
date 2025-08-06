package org.example.poo;

public class Chaise {

    private int nbPied;
    private String typePied;

    private String colorPied;

    public Chaise(int nbPied, String colorPied, String typePied) {
        this.nbPied = nbPied;
        this.colorPied = colorPied;
        this.typePied = typePied;
    }

    @Override
    public String toString() {
        return "Je suis une Chaise, avec " + nbPied + " pieds en " + typePied + " et de couleur " + colorPied + " ." ;
    }
}
