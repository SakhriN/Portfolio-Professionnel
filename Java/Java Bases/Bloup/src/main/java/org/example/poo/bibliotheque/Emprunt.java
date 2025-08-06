package org.example.poo.bibliotheque;

import org.example.poo.Person;

import java.time.LocalDate;
import java.util.Date;

public class Emprunt {

    Personne personne;
    Livre livre;
    LocalDate dateDebut, dateFin;

public Emprunt(){
}

public Emprunt(Personne personne, Livre livre){
    this.personne = personne;
    this.livre = livre;
    LocalDate date1 = LocalDate.now();
    this.dateDebut = date1;
    this.dateFin = date1.plusYears(3);
}
    @Override
    public String toString() {
        return "Emprunt{" +
                "personne=" + personne +
                ", livre=" + livre +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}
