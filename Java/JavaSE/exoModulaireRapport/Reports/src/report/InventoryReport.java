package report;

import maBibliotheque.Book;
import inventaire.BookInventory;

public class InventoryReport {

    public void makeReport(BookInventory bi) {
        System.out.println("Voici la liste des livres dans l'inventaire : \n");
        for (Book b : bi.getBooks()) {
            System.out.println(b.toString());
        }
    }

}
