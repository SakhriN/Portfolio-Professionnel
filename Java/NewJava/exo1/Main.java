import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {
    int choix = 10;
        Scanner code = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();
    Annuary annuary = new Annuary();
int points = 100;
int reussite = 0;


    System.out.println("Bonjour dans ce merveilleux programme,");
while(choix!=0){
    Intro();
    choix = code.nextInt();
    code.nextLine();

    switch (choix){
        case 1:
            System.out.println("Choisissez le nom du nouveau contact :");
            String nom = code.nextLine();
            System.out.println("Merci de nous donner le numéro de téléphone.");
            String phone = code.nextLine();
            Person person = new Person(nom, phone);
            if(annuary.getPersons()==null){
                persons.add(person);
                annuary.setPersons(persons);
            }else{
                annuary.getPersons().add(person);
            }
            reussite = reussite + 1;
            int ajoutpoints = reussite * 12; 
            System.out.println("Ajout terminé. \n Ajouts réussis d'affilées : " + reussite + "\n Ajout de " + ajoutpoints + " points a Griffondor.");
            points = points + ajoutpoints;
            break;


            case 2:
                if(annuary.getPersons()!=null){
                    for (Person p : annuary.getPersons()) {
                        System.out.println("\n Nom du contact : "+ p.getName() +" et numéro de téléphone : "+p.getPhoneNumber() + " .");
                    }
                }else{
                    System.out.println("Il n'y a pas de contacts.");
                }
                break;


                case 0:
                    System.out.println("Bonne soirée." +
                            "\n Nombre de points de Gryffondor : " + points);
                    break;


                    default:
                        System.out.println("-5 points pour Gryffondor.");
                        points = points - 5;
                        reussite = 0;
                        break;

    }
}
};
    private static void Intro()
    {

        System.out.println("\n Merci de sélectionner l'action nécessaire :" +
                "\n 1. Ajouter un contact." +
                "\n 2. Voir l'annuaire." +
                "\n 0. Quitter");
    }
}