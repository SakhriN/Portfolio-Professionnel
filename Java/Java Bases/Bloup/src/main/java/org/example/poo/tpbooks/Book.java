package org.example.poo.tpbooks;

import java.util.Arrays;

public class Book {
    int idBook;
    static  int counter;

    String name;

    Author[] authors;

    Publisher publisher;

    int publishingAnnee;

    int amountOfPages;

    float BigDecimal;

    public static enum CoverType {

        PAPERBACK,

        HARDCOVER,

        NOTHING,

    }

public CoverType coverType;
    public CoverType getCoverType() {
        return coverType;
    }
    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingAnnee() {
        return publishingAnnee;
    }


    public Author[] getAuthors() {
        return authors;
    }

    public Book() {

    }

    {
        counter++;
    }


    public Book(String name, Author[] authors, Publisher publisher, int publishingAnnee, int amountOfPages, float bigDecimal, CoverType coverType) {
        this.idBook = counter;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingAnnee = publishingAnnee;
        this.amountOfPages = amountOfPages;
        this.BigDecimal = bigDecimal;
        this.coverType = coverType;

    }

    @Override
    public String toString() {
        return "Book number " +
                "idBook=" + idBook +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishingAnnee=" + publishingAnnee +
                ", amountOfPages=" + amountOfPages +
                ", BigDecimal=" + BigDecimal +
                ", coverType=" + coverType +
                "   \n";
    }
}
