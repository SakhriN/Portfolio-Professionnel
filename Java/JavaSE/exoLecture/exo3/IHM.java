package exo3;

import java.util.Scanner;

public class IHM {

    public void service(){
        Scanner sc = new Scanner(System.in);
        Bibliotheque bi = new Bibliotheque();
        Actions a = new Actions();
        System.out.println("Bonjour");
        int choix = 1;

        while(choix != 0){
            System.out.println("Merci de choisir l'action suivante : \n" +
                    "1. Ajouter un livre.\n" +
                    "2. Supprimer un livre.\n" +
                    "3. Voir les livres dans la bibliothèque.\n" +
                    "4. Sérialiser une bibliothèque.\n" +
                    "5. Désérialiser une bibliothèque.\n" +
                    "0. Quitter.");
            choix = sc.nextInt();
            sc.nextLine();

            switch(choix){
             case 0 ->{
                 System.out.println("Au revoir.");
                 sc.close();
             }
             case 1 ->{
                 a.Ajouter(sc,bi);
             }
                case 2 ->{a.Retirer(sc,bi);}
                case 3 ->{a.Demonstration(bi);}
                case 4 ->{a.Serialization(bi);}
                case 5 ->{a.DeSerialization(bi);}
                default ->{
                    System.out.println("Incorrect.");
                }
            }
        }
    }
}
