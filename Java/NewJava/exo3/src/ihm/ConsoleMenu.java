package ihm;

import animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private int choice=10;
    private List<Enclosure> enclosures;

    public void main(){

        Scanner scanner = new Scanner(System.in);
        ZooManager manager = new ZooManager();

        while(choice!=0){
            System.out.println("1. Créer un mammifère");
            System.out.println("2. Créer un oiseau");
            System.out.println("3. Créer un enclos");
            System.out.println("4. Voir les animaux d'un enclos");
            System.out.println("0. Fermer");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1 :
                    createBird(scanner, manager);
                    break;

                case 2:
                    createMammal(scanner, manager);
                    break;

                case 3:
                    createEnclosure(scanner, manager);
                    break;

                case 4:
                    SeeAnimalsFromEnclosure(scanner);
                    break;

                case 5:
                    SeeAnimalsFromEnclosure(scanner);
                    break;

                case 0:
                    System.out.println("Bonne journée.");
                    break;

                default:
                    System.out.println("Commande incorrecte.");
                    break;
            }
        }
    }

    private void createBird(Scanner scanner, ZooManager manager) {
        System.out.println("Choisissez le nom de votre mammifère.");
        String mname = scanner.nextLine();
        System.out.println("Choisissez l'espèce de votre mammifère.");
        String mspecies = scanner.nextLine();
        Mammal mammal = manager.CreateMammal(mname, mspecies);
        if(enclosures!=null){
            System.out.println("Choisissez l'enclos qui va permettre d'ajouter l'animal.");
            for (Enclosure e : enclosures) {
                System.out.println(e.getId()+". " + e.getName());
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            for (Enclosure e : enclosures) {
                if(e.getId() == choice) {
                    e.addAnimal(mammal);
                }
            }
        }else{
            System.out.println("Il n'ya pas d'enclos, massacre du mammifère.");
        }

    }

    private void createMammal(Scanner scanner, ZooManager manager){
        System.out.println("Choisissez le nom de votre mammifère.");
        String bname = scanner.nextLine();
        System.out.println("Choisissez l'espèce de votre mammifère.");
        String bspecies = scanner.nextLine();
        Bird bird = manager.CreateBird(bname, bspecies);
        if(enclosures!=null){
            System.out.println("Choisissez l'enclos qui va permettre d'ajouter l'animal.");
            for (Enclosure e : enclosures) {
                System.out.println(e.getId()+". " + e.getName());
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            for (Enclosure e : enclosures) {
                if(e.getId() == choice) {
                    e.addAnimal(bird);
                }
            }
        }else{
            System.out.println("Il n'ya pas d'enclos, massacre de l'oiseau.");
        }
    }

    private void createEnclosure(Scanner scanner, ZooManager manager){
        System.out.println("Choisissez le nom de votre enclos.");
        String ename = scanner.nextLine();
        Enclosure enclosure = manager.CreateEnclosure(ename);
        if(enclosures==null){
            enclosures = new ArrayList<>();
        }
        enclosures.add(enclosure);
    }

    private void SeeAnimalsFromEnclosure(Scanner scanner){

        if(enclosures!=null){
            System.out.println("De quel enclos vous voulez voir la liste des animaux ?");
            for (Enclosure e : enclosures) {
                System.out.println(e.getId()+". " + e.getName());
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            for (Enclosure e : enclosures) {
                if(e.getId() == choice) {
                    List<Animal> animals = e.getEnclosure();
                    for (Animal a : animals) {
                        System.out.println("Bonjour, je suis " + a.getName() + ", je suis un " + a.getSpecies() +".");
                    }
                }
            }

        }else {
            System.out.println("Veuillez créer un enclos avant de choisir ce menu !");
        }

    }



}
