package dao;

import model.Enseignant;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EnseignantDAOImpl implements EnseignantDAO {
    public void Create(Enseignant enseignant, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(enseignant);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public Enseignant ReadOne(int id, Transaction tx,
                              Session session, SessionFactory sessionFactory) {
        Enseignant enseignant = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            enseignant = session.find(Enseignant.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return enseignant;
    }

    public List<Enseignant> ReadAll(Transaction tx,
                                    Session session, SessionFactory sessionFactory) {
        List<Enseignant> enseignantList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Enseignant";
            Query<Enseignant> query = session.createQuery(ask, Enseignant.class);
            enseignantList = query.list();
            tx.commit();

            for (Enseignant enseignant : enseignantList
            ) {
                System.out.println(enseignant);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return enseignantList;
    }

    public void Update(Enseignant enseignant, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(enseignant);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public void Delete(int id, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        session=sessionFactory.openSession();
        Enseignant enseignant = null;
        try {
            enseignant = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.delete(enseignant);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        session.close();
    }
}

