package exo4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Demon> demons = new ArrayList<>();
        List<Evenement> bonevent = new ArrayList<>();
        List<Evenement> mauvaisevent = new ArrayList<>();
        List<Personnage> personnages = new ArrayList<>();
        LectureEcriture lectureEcriture = new LectureEcriture();
        Randomizer randomizer = new Randomizer();
        Personnage personnagechoisi = null;
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        boolean reussite = false;

        lectureEcriture.LireBestiaire(demons);
        lectureEcriture.LireBonEvent(bonevent);
        lectureEcriture.LireMauvaisEvent(mauvaisevent);
        lectureEcriture.LirePersonnage(personnages);

        System.out.println("Voulez vous créer un personnage, ou en choisir un existant ?\n" +
                "1. Créer un personnage.\n" +
                "2. Choisir un personnage existant.\n");
        choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1 -> {
                System.out.println("Merci de choisir le nom du personnage");
                String nom = scanner.nextLine();

                System.out.println("Voulez vous choisir les stats du personnage.\n" +
                        "1. Oui.\n" +
                        "2. Non.\n");
                choix = scanner.nextInt();
                scanner.nextLine();
                switch (choix) {
                    case 1 -> {
                        System.out.println("Choisissez les PV du personnage. (1-100)");
                        int pv = scanner.nextInt();
                        scanner.nextLine();
                        pv = lectureEcriture.verification(scanner, pv);
                        System.out.println("Choisissez l'ATQ du personnage. (1-100)");
                        int atq = scanner.nextInt();
                        scanner.nextLine();
                        atq = lectureEcriture.verification(scanner, atq);
                        personnagechoisi = new Personnage(nom, pv, atq);
                        personnages.add(personnagechoisi);
                    }
                    case 2 -> {
                        int random1 = (int) Math.round(Math.random() * 100);
                        System.out.println("PV du personnage : " + random1);
                        int random2 = (int) Math.round(Math.random() * 100);
                        System.out.println("ATQ du personnage : " + random2);
                        personnagechoisi = new Personnage(nom, random1, random2);
                        personnages.add(personnagechoisi);
                    }
                    default -> {
                        System.out.println("Invalide.");
                    }
                }
                System.out.println(personnagechoisi);
                lectureEcriture.EcrirePersonnage(personnagechoisi);
            }
            case 2 -> {
                if (!personnages.isEmpty()) {
                    System.out.println("Merci de choisir le personnage parmi la liste :");
                    int i = 1;
                    for (Personnage personnage : personnages) {
                        System.out.println(i + ". " + personnage);
                        i++;
                    }
                    choix = scanner.nextInt();
                    scanner.nextLine();
                    while (choix - 1 >= personnages.size() || choix < 0) {
                        System.out.println("Merci de choisir un numéro valide parmi la liste.");
                        for (Personnage personnage : personnages) {
                            System.out.println(i + ". " + personnage);
                            i++;
                        }
                        choix = scanner.nextInt();
                        scanner.nextLine();
                    }
                    personnagechoisi = personnages.get(choix - 1);
                } else {
                    System.out.println("Vous ne pouvez pas choisir, il n'y a aucun personnage existant.");
                }
            }
            default -> {
                System.out.println("Choix invalide.");
            }
        }
        System.out.println("Personnage choisi : ");
        System.out.println(personnagechoisi.toString());

        System.out.println("Merci de choisir la difficulté de l'aventure :\n" +
                "1. Aventure facile (5 événements aléatoires.\n" +
                "2. Aventure moyenne (10 événements aléatoires.\n" +
                "3. Aventure difficile (15 événements aléatoires.\n" +
                "4. Aventure sans fin (jusqu'a votre mort).");
        choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1 -> {int max =5; randomizer.Ramdomize(personnagechoisi,bonevent,mauvaisevent,demons,max);}
            case 2 -> {int max =10; randomizer.Ramdomize(personnagechoisi,bonevent,mauvaisevent,demons,max);}
            case 3 -> {int max =15; randomizer.Ramdomize(personnagechoisi,bonevent,mauvaisevent,demons,max);}
            case 4 -> {int max =999999; randomizer.Ramdomize(personnagechoisi,bonevent,mauvaisevent,demons,max);}
            default -> {
                System.out.println("VOUS ETES MORT !!!!");
            }
        }
    }
}
