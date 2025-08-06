package exo3;

import java.io.*;

public class Exo3 {


    public static void main(String[] args) {
//Book book = new Book("le poker pour les nuls", "Nassim Sakhri");
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.ser"))){
//            oos.writeObject(book);
//            System.out.println("Bouquin sérialisé.");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"))){
//            Book student = (Book) ois.readObject();
//            System.out.println("Bouquin désérialisé : " + book);
//        }catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//
//        Bibliotheque bibliotheque = new Bibliotheque();
//        bibliotheque.add(new Book("Les 3 petits canard","Bruce Banner"));
//        bibliotheque.add(new Book("Les 3 petits batard","Bruce Wayne"));
//        bibliotheque.add(new Book("Les 3 petits nanard","Bruce Willis"));
//
//
//        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("biblio.ser"))){
//            output.writeObject(bibliotheque);
//            System.out.println("Bibliotheque sérialisée.");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try (ObjectInputStream outinput = new ObjectInputStream(new FileInputStream("biblio.ser"))){
//            Bibliotheque bibliotheque1 = (Bibliotheque) outinput.readObject();
//            System.out.println("Bibliotheque désérialisée : " + bibliotheque1);
//        }catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//        }

        IHM im = new IHM();
        im.service();



    }
}
