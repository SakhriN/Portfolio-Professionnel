package dao;

import model.Classe;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ClasseDAOImpl implements ClasseDAO {
    public void Create(Classe classe, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(classe);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public Classe ReadOne(int id, Transaction tx,
                               Session session, SessionFactory sessionFactory) {
        Classe classe = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            classe = session.find(Classe.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return classe;
    }

    public List<Classe> ReadAll(Transaction tx,
                                     Session session, SessionFactory sessionFactory) {
        List<Classe> classeList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Classe";
            Query<Classe> query = session.createQuery(ask, Classe.class);
        classeList = query.list();
            tx.commit();

            for (Classe classe : classeList
            ) {
                System.out.println(classe);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return classeList;
    }

    public void Update(Classe classe, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(classe);
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
        Classe classe = null;
        try {
        classe = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.remove(classe);
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

