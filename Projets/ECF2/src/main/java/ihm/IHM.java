package ihm;

import Service.Service;
import dao.*;
import model.Etudiant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IHM {
    EtudiantDAOImpl etudiantDAO = new EtudiantDAOImpl();
    DepartementDAOImpl departementDAO = new DepartementDAOImpl();
    ClasseDAOImpl classeDAO = new ClasseDAOImpl();
    EDTDAOImpl edtDAO = new EDTDAOImpl();
    EnseignantDAOImpl enseignantDAO = new EnseignantDAOImpl();
    MatiereDAOImpl matiereDAO = new MatiereDAOImpl();
    NoteDAOImpl noteDAO = new NoteDAOImpl();

    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    Session session = null;
    Transaction tx = null;

    public void menu() {
        Scanner scan = new Scanner(System.in);
        int choix;
        do {
            System.out.println("#############Bienvenue dans le menu principal!#############\n" +
                    "###########################################################\n" +
                    "###########################################################\n" +
                    "Que voulez-vous faire :\n" +
                    "1 - Créer un département\n" +
                    "2 - Créer un enseignant\n" +
                    "3 - Créer une classe\n" +
                    "4 - Créer un etudiant\n" +
                    "5 - Créer un emploi du temps\n" +
                    "6 - Créer une matière\n" +
                    "7 - Créer une note\n" +
                    "8 - Voir toutes les classes\n" +
                    "9 - Voir le nombre de matières differentes d'un élève\n" +
                    "10 - Voir les matières et les notes d'un élève\n" +
                    "11 - Voir la moyenne des notes d'un élève\n" +
                    "12 - Voir le nombre d'élèves dans un département choisi\n" +
                    "13 - Voir les élèves d'une classe\n" +
                    "14 - Supprimer un étudiant choisi\n" +
                    "15 - Supprimer une classe choisie\n" +
                    "16 - Supprimer un département choisi\n" +
                    "0 - Fermer l'application \n");
            choix = scan.nextInt();
            scan.nextLine();

            switch (choix) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {Service.ReadAllClasse(classeDAO,tx,session,sessionFactory);
                }
                case 9 -> {
                }
                case 10 -> {
                }
                case 11 -> {
                }
                case 12 -> {
                }
                case 13 -> {
                    ReadEtudiantByClassId(scan);
                }
                case 14 -> {
                    DeleteEtudiant(scan);
                }
                case 15 -> {
                    DeleteClasse(scan);
                }
                case 16 -> {
                    DeleteDepartement(scan);
                }
                case 0 ->{
                    System.out.println("Bye");
                    sessionFactory.close();
                    registry.close();
                }
                default -> {
                    System.out.println("Incorrect, reessaye");
                }
            }
        } while (choix != 0);
    }

    public void ReadEtudiantByClassId(Scanner scanner){
        System.out.println("Choisissez l'id de la classe :");
        int choix = scanner.nextInt();
        scanner.nextLine();
        session=sessionFactory.openSession();
        etudiantDAO.ReadAllById(choix,tx,session,sessionFactory);
        session.close();
    }
    public void DeleteEtudiant(Scanner scanner) {
        System.out.println("Veuillez choisir quel étudiant supprimer : ");
        session=sessionFactory.openSession();
        etudiantDAO.ReadAll(tx, session, sessionFactory);
        session.close();
        int choix = scanner.nextInt();
        scanner.nextLine();
        try {
            Service.DeleteEtudiant(etudiantDAO,choix,tx,session,sessionFactory);
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
            System.out.println("tu te fous de ma gueule. Nique ta soeur");
        }
    }

    public void DeleteClasse(Scanner scanner) {
        System.out.println("Veuillez choisir quelle classe supprimer : ");
        session=sessionFactory.openSession();
        classeDAO.ReadAll(tx, session, sessionFactory);
        session.close();
        int choix = scanner.nextInt();
        scanner.nextLine();
        try {
            Service.DeleteClasse(classeDAO,choix,tx,session,sessionFactory);
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
            System.out.println("tu te fous de ma gueule. Nique ta soeur");
        }
    }

    public void DeleteDepartement(Scanner scanner) {
        System.out.println("Veuillez choisir quel departement supprimer : ");
        session=sessionFactory.openSession();
        departementDAO.ReadAll(tx, session, sessionFactory);
        session.close();
        int choix = scanner.nextInt();
        scanner.nextLine();
        try {
            Service.DeleteDepartement(departementDAO,choix,tx,session,sessionFactory);
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
            System.out.println("tu te fous de ma gueule. Nique ta soeur");
        }
    }
}
