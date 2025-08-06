package dao;

import model.Enseignant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface EnseignantDAO {

public void Create(Enseignant enseignant, Transaction tx,
        Session session, SessionFactory sessionFactory);

public Enseignant ReadOne(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

public List<Enseignant> ReadAll(Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Update(Enseignant enseignant, Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Delete(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

        }
