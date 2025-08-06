package exoStream;

import java.time.LocalDate;

public class Film {

    private String titre;
    private LocalDate dateSortie;
    private String realisateur;
    private String genre;
    private int entreeNombre;

    public Film(String titre, LocalDate dateSortie, String realisateur, String genre, int entreeNombre) {
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.realisateur = realisateur;
        this.genre = genre;
        this.entreeNombre = entreeNombre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getEntreeNombre() {
        return entreeNombre;
    }

    public void setEntreeNombre(int entreeNombre) {
        this.entreeNombre = entreeNombre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Override
    public String toString() {
        return "Film :" +
                "titre = " + titre + ',' +
                " dateSortie = " + dateSortie +
                ", realisateur = " + realisateur + ',' +
                " genre = " + genre + ',' +
                " entreeNombre = " + entreeNombre +
                '.';
    }
}
