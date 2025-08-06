package org.example.poo.tpbooks;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorFirstName, String authorLastName) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getFirstname().equalsIgnoreCase(authorFirstName) &&
                        author.getLastname().equalsIgnoreCase(authorLastName)) {
                    filteredBooks.add(book);
                    break;
                }
            }
        }
        return filteredBooks;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisherName) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().getPublisherName().equalsIgnoreCase(publisherName)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public static List<Book> filterBooksAfterSpecifiedYear(List<Book> books, int year) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublishingAnnee() > year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
}
