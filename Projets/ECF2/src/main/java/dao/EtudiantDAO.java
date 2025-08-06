package dao;

import model.Etudiant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface EtudiantDAO {

public void Create(Etudiant etudiant, Transaction tx,
        Session session, SessionFactory sessionFactory);

public Etudiant ReadOne(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

public List<Etudiant> ReadAll(Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Update(Etudiant etudiant, Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Delete(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

        }
