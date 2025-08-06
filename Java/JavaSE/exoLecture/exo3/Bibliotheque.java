package exo3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Book> bibliothequeDeLivre;

    public Bibliotheque() {
        bibliothequeDeLivre = new ArrayList<Book>();
    }

    public void add(Book book) {
        bibliothequeDeLivre.add(book);
        System.out.println("Livre ajouté a la bibliotheque : " + book.getTitle());
    }

    public void remove(String name) {
        for (Book book : bibliothequeDeLivre) {
            if (book.getTitle().equals(name)) {
                bibliothequeDeLivre.remove(book);
                System.out.println("Livre supprimé de la bibliotheque.");
            }else{
                System.out.println(name+" n'existe pas.");
            }
        }
    }

public List<Book> getLivres(){
        return bibliothequeDeLivre;
}
    @Override
    public String toString() {
        return "Bibliotheque : " +
                "bibliothequeDeLivre : \n" + bibliothequeDeLivre;
    }
}
