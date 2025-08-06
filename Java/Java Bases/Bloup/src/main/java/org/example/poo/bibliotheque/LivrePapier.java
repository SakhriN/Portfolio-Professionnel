package org.example.poo.bibliotheque;

public class LivrePapier extends Livre {
    int nbPages;
    String editMaison;

    public  LivrePapier(){
    }

    public LivrePapier(String title, String author, int nbPages, String editMaison) {
        super(title, author);
        this.nbPages = nbPages;
        this.editMaison = editMaison;
    }

    @Override
    public String toString() {
        return "LivrePapier{" +
                "nbPages=" + nbPages +
                ", editMaison='" + editMaison + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
