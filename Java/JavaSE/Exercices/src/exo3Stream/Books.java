package exo3Stream;

import java.time.LocalDate;

public class Books {

    private String titre;
    private String auteur;
    private String genre;
    private LocalDate dateDePublication;
    private int nombreDePages;
    private boolean disponible;
    private double prix;


    public Books(String titre, String auteur, String genre, LocalDate dateDePublication, int nombreDePages, boolean disponible, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.dateDePublication = dateDePublication;
        this.nombreDePages = nombreDePages;
        this.disponible = disponible;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public LocalDate getDateDePublication() {
        return dateDePublication;
    }

    public void setDateDePublication(LocalDate dateDePublication) {
        this.dateDePublication = dateDePublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }


    @Override
    public String toString() {
        return "Books{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", genre='" + genre + '\'' +
                ", dateDePublication=" + dateDePublication +
                ", nombreDePages=" + nombreDePages +
                ", disponible=" + disponible +
                ", prix=" + prix +
                '}';
    }
}
