package Service;

import dao.*;
import model.*;
import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

import java.util.ArrayList;
import java.util.List;

public class Service {

//        List<Etudiant> etudiantList = ReadEtudiantByIdClasse(etudiantDAO, 5, tx, session, sessionFactory);
//        for (Etudiant etudiant : etudiantList) {
//            System.out.println(etudiant.getPrenom_et() + " " +
//                    etudiant.getNom_et() + "\n");
//        }
//
//        etudiantDAO.Delete(5, tx, session, sessionFactory);
//
//        classeDAO.Delete(4, tx, session, sessionFactory);
//
//        departementDAO.Delete(1,tx,session,sessionFactory);



    // CRD Departement :
    public static void CreateDepartement(DepartementDAOImpl departementDAO, Departement departement,
                                         Transaction tx,
                                         Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        departementDAO.Create(departement, tx, session, sessionFactory);
        session.close();
    }

    public static Departement ReadOneDepartement(DepartementDAOImpl departementDAO, int id,
                                                 Transaction tx,
                                                 Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Departement departement = departementDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(departement);
        session.close();
        return departement;
    }

    public static void ReadAllDepartement(DepartementDAOImpl departementDAO,
                                          Transaction tx,
                                          Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        departementDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static void DeleteDepartement(DepartementDAOImpl departementDAO, int id,
                                         Transaction tx,
                                         Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        departementDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }

    // CRD Classe :

    public static void CreateClasse(ClasseDAOImpl classeDAO, Classe classe,
                                    Transaction tx,
                                    Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        classeDAO.Create(classe, tx, session, sessionFactory);
        session.close();
    }

    public static Classe ReadOneClasse(ClasseDAOImpl classeDAO, int id,
                                       Transaction tx,
                                       Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Classe classe = classeDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(classe);
        session.close();
        return classe;
    }

    public static void ReadAllClasse(ClasseDAOImpl classeDAO,
                                     Transaction tx,
                                     Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        classeDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static void DeleteClasse(ClasseDAOImpl classeDAO, int id,
                                    Transaction tx,
                                    Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        classeDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }

    // CRD Enseignant :

    public static void CreateEnseignant(EnseignantDAOImpl EnseignantDAO, Enseignant Enseignant,
                                        Transaction tx,
                                        Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        EnseignantDAO.Create(Enseignant, tx, session, sessionFactory);
        session.close();
    }

    public static Enseignant ReadOneEnseignant(EnseignantDAOImpl EnseignantDAO, int id,
                                               Transaction tx,
                                               Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Enseignant Enseignant = EnseignantDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(Enseignant);
        session.close();
        return Enseignant;
    }

    public static void ReadAllEnseignant(EnseignantDAOImpl EnseignantDAO,
                                         Transaction tx,
                                         Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        EnseignantDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static void DeleteEnseignant(EnseignantDAOImpl EnseignantDAO, int id,
                                        Transaction tx,
                                        Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        EnseignantDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }

    // CRD EDT :

    public static void CreateEDT(EDTDAOImpl edtDAO, EDT edt,
                                 Transaction tx,
                                 Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        edtDAO.Create(edt, tx, session, sessionFactory);
        session.close();
    }

    public static EDT ReadOneEDT(EDTDAOImpl edtDAO, int id,
                                 Transaction tx,
                                 Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        EDT edt = edtDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(edt);
        session.close();
        return edt;
    }

    public static void ReadAllEDT(EDTDAOImpl edtDAO,
                                  Transaction tx,
                                  Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        edtDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static void DeleteEDT(EDTDAOImpl edtDAO, int id,
                                 Transaction tx,
                                 Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        edtDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }

    // CRD Etudiant :
    public static void CreateEtudiant(EtudiantDAOImpl etudiantDAO, Etudiant etudiant,
                                      Transaction tx,
                                      Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        etudiantDAO.Create(etudiant, tx, session, sessionFactory);
        session.close();
    }

    public static Etudiant ReadOneEtudiant(EtudiantDAOImpl etudiantDAO, int id,
                                           Transaction tx,
                                           Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Etudiant etudiant = etudiantDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(etudiant);
        session.close();
        return etudiant;
    }

    public static void ReadAllEtudiant(EtudiantDAOImpl etudiantDAO,
                                       Transaction tx,
                                       Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        etudiantDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static List<Etudiant> ReadEtudiantByIdClasse(EtudiantDAOImpl etudiantDAO, int id,
                                                        Transaction tx,
                                                        Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        List<Etudiant> etudiantList = new ArrayList<>();
        etudiantList = etudiantDAO.ReadAllById(2, tx, session, sessionFactory);
        session.close();
        return etudiantList;
    }

    public static void DeleteEtudiant(EtudiantDAOImpl etudiantDAO, int id,
                                      Transaction tx,
                                      Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        etudiantDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }

    // CRD Matiere :


    public static void CreateMatiere(MatiereDAOImpl matiereDAO, Matiere matiere,
                                     Transaction tx,
                                     Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        matiereDAO.Create(matiere, tx, session, sessionFactory);
        session.close();
    }

    public static Matiere ReadOneMatiere(MatiereDAOImpl matiereDAO, int id,
                                         Transaction tx,
                                         Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Matiere matiere = matiereDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(matiere);
        session.close();
        return matiere;
    }

    public static void ReadAllMatiere(MatiereDAOImpl matiereDAO,
                                      Transaction tx,
                                      Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        matiereDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static void DeleteMatiere(MatiereDAOImpl matiereDAO, int id,
                                     Transaction tx,
                                     Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        matiereDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }

// CRD Note :

    public static void CreateNote(NoteDAOImpl noteDAO, Note note,
                                  Transaction tx,
                                  Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        noteDAO.Create(note, tx, session, sessionFactory);
        session.close();
    }

    public static Note ReadOneNote(NoteDAOImpl noteDAO, int id,
                                   Transaction tx,
                                   Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Note note = noteDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(note);
        session.close();
        return note;
    }

    public static void ReadAllNote(NoteDAOImpl noteDAO,
                                   Transaction tx,
                                   Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        noteDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

    public static void DeleteNote(NoteDAOImpl noteDAO, int id,
                                  Transaction tx,
                                  Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        noteDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }
}
