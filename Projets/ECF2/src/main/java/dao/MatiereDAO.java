package dao;

import model.Matiere;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface MatiereDAO {

public void Create(Matiere matiere, Transaction tx,
        Session session, SessionFactory sessionFactory);

public Matiere ReadOne(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

public List<Matiere> ReadAll(Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Update(Matiere matiere, Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Delete(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

        }
