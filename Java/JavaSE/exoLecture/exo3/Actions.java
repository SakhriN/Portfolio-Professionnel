package exo3;

import java.io.*;
import java.util.Scanner;

public class Actions {

    public void Ajouter(Scanner scanner, Bibliotheque bibliotheque) {
        System.out.println("Veuillez donner un nom de livre : ");
        String nom = scanner.nextLine();
        System.out.println("Veuillez donner le nom de l'auteur : ");
        String auteur = scanner.nextLine();
        bibliotheque.add(new Book(nom, auteur));
    }

    public void Retirer(Scanner scanner, Bibliotheque bibliotheque) {
        System.out.println("Veuillez donner un nom de livre : ");
        String nom = scanner.nextLine();
                bibliotheque.remove(nom);
    }

    public void Demonstration(Bibliotheque bibliotheque) {
        for(Book book : bibliotheque.getLivres()){
            System.out.println(book);
        }
    }

    public void Serialization(Bibliotheque bibliotheque) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("biblio.ser"))){
            output.writeObject(bibliotheque);
            System.out.println("Bibliotheque sérialisée.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void DeSerialization(Bibliotheque bibliotheque) {
        try (ObjectInputStream outinput = new ObjectInputStream(new FileInputStream("biblio.ser"))){
            bibliotheque = (Bibliotheque) outinput.readObject();
            System.out.println("Bibliotheque désérialisée : " + bibliotheque);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
