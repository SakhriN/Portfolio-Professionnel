package prets;

import maBibliotheque.Book;

import java.util.ArrayList;
import java.util.List;

public class CheckoutSystem {
    private List<Book> books;


    public CheckoutSystem() {
        books = new ArrayList<>();
    }

public void addBook(Book book) {
        books.add(book);
}

public void removeBook(Book book) {
        books.remove(book);
}


    @Override
    public String toString() {
        return "Livres empruntés : " +
                books;
    }
}
