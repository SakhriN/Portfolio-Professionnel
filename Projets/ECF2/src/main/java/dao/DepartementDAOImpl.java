package dao;

import model.Departement;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class DepartementDAOImpl implements DepartementDAO {
    public void Create(Departement departement, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(departement);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public Departement ReadOne(int id, Transaction tx,
                               Session session, SessionFactory sessionFactory) {
        Departement departement = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            departement = session.find(Departement.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return departement;
    }

    public List<Departement> ReadAll(Transaction tx,
                                     Session session, SessionFactory sessionFactory) {
        List<Departement> departementList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Departement";
            Query<Departement> query = session.createQuery(ask, Departement.class);
            departementList = query.list();
            tx.commit();

            for (Departement departement : departementList
            ) {
                System.out.println(departement);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return departementList;
    }

    public void Update(Departement departement, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(departement);
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
        Departement departement = null;
        try {
            departement = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.delete(departement);
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
