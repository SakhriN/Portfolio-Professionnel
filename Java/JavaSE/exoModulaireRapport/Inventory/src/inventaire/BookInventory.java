package inventaire;

import maBibliotheque.Book;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {

    private List<Book> books;

    public BookInventory() {
        books = new ArrayList<Book>();
    }



    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        return "Livres disponibles : " +
                books;
    }

}
