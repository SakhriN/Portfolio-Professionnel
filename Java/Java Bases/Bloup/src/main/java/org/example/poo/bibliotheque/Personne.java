package org.example.poo.bibliotheque;

import org.example.poo.Person;

public class Personne {

    String nom, prenom;


    public Personne(){
    }
public Personne(String nom, String prenom){
this.nom = nom;
this.prenom = prenom;
}
    @Override
    public String toString() {
        return "Personne : " +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
