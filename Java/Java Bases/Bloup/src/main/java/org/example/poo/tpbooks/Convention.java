package org.example.poo.tpbooks;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Convention {
    public static void main(String[] args) {
        Author test1 = new Author("Michel","Sardou");
        Author test2 = new Author("Daft","Punk");
        Author test3 = new Author("Daft2","Punk");

        Publisher tost1 = new Publisher(1,"LaBagarre");
        Publisher tost2 = new Publisher(2,"LaVRAIEBagarre");

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book( "Pourquoi je suis un mauvais chanteur", new Author[]{test1}, tost1, 2012, 69, 29.12F, Book.CoverType.PAPERBACK));
        bookList.add(new Book( "L'art de ne pas se dévoiler", new Author[]{test2, test3}, tost2, 2020, 690, 999.12F, Book.CoverType.HARDCOVER));

//        Book Nulachier = new Book(1,"Pourquoi je suis un mauvais chanteur",new Author[]{test1},tost1,2012,69,29.12F, Book.CoverType.PAPERBACK);
//        Book dinguerie = new Book(2,"L'art de ne pas se dévoiler",new Author[]{test2, test3},tost2,2020,690,999.12F, Book.CoverType.HARDCOVER);

        System.out.println(bookList);

        List<Book> filteredByAuthor = BookService.filterBooksByAuthor(bookList,"Daft","Punk");
        List<Book> filteredByPublisher = BookService.filterBooksByPublisher(bookList, "LaBagarre");
        List<Book> filteredByYear = BookService.filterBooksAfterSpecifiedYear(bookList, 2015);

        System.out.println(filteredByAuthor);
        System.out.println(filteredByPublisher);
        System.out.println(filteredByYear);
        
    }
}
