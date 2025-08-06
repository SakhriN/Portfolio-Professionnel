package app;

import eNotification.EmailNotification;
import inventaire.BookInventory;
import prets.CheckoutSystem;
import report.InventoryReport;

import maBibliotheque.Book;

public class LibraryApp {
    public static void main(String[] args) {

        CheckoutSystem checkoutSystem = new CheckoutSystem();
        EmailNotification emailNotification = new EmailNotification();
        BookInventory bookInventory = new BookInventory();
        InventoryReport inventoryReport = new InventoryReport();

        Book book1 = new Book("Titre 1","Nassim Sakhri", 123.12);
        Book book2 = new Book("Titre 2","Clement Roelens", 123.12);
        Book book3 = new Book("Titre 3","Remi Jospin", 123.12);

        bookInventory.addBook(book1);
        bookInventory.addBook(book2);
        bookInventory.addBook(book3);

        inventoryReport.makeReport(bookInventory);

        bookInventory.removeBook(book1);
        checkoutSystem.addBook(book1);
        System.out.println(emailNotification.sendNotification("Quelqu'un a emprunté le livre : " + book1));
        bookInventory.removeBook(book2);
        checkoutSystem.addBook(book2);
        System.out.println(emailNotification.sendNotification("Quelqu'un a emprunté le livre : " + book2));

        inventoryReport.makeReport(bookInventory);

        bookInventory.addBook(book2);
        checkoutSystem.removeBook(book2);
        System.out.println(emailNotification.sendNotification("Quelqu'un a rendu le livre : " + book2));

        inventoryReport.makeReport(bookInventory);

    }
}
