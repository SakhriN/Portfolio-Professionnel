package dbz.superexempledelespace.demo.entity;

import java.time.LocalDate;

public class Book {

    private String titre;
    private LocalDate datePublication;
    private String auteur;
    private String categorie;
    private double prix;
    private boolean prixNobel;

    public Book(String titre, LocalDate datePublication, String auteur, String categorie, double prix, boolean prixNobel) {
        this.titre = titre;
        this.datePublication = datePublication;
        this.auteur = auteur;
        this.categorie = categorie;
        this.prix = prix;
        this.prixNobel = prixNobel;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean estPrixNobel() {
        return prixNobel;
    }

    public void setPrixNobel(boolean prixNobel) {
        this.prixNobel = prixNobel;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }


    @Override
    public String toString() {
        return "Book : " +
                "titre='" + titre + '\'' +
                ", datePublication=" + datePublication +
                ", auteur='" + auteur + '\'' +
                ", categorie='" + categorie + '\'' +
                ", prix=" + prix +
                ", prixNobel=" + prixNobel +
                '}';
    }
}
