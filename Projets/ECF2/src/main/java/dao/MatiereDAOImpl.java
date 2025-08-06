package dao;

import model.Matiere;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class MatiereDAOImpl implements MatiereDAO {
    public void Create(Matiere matiere, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(matiere);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public Matiere ReadOne(int id, Transaction tx,
                           Session session, SessionFactory sessionFactory) {
        Matiere matiere = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            matiere = session.find(Matiere.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return matiere;
    }

    public List<Matiere> ReadAll(Transaction tx,
                                 Session session, SessionFactory sessionFactory) {
        List<Matiere> matiereList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Matiere";
            Query<Matiere> query = session.createQuery(ask, Matiere.class);
            matiereList = query.list();
            tx.commit();

            for (Matiere matiere : matiereList
            ) {
                System.out.println(matiere);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return matiereList;
    }

    public void Update(Matiere matiere, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(matiere);
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
        Matiere matiere = null;
        try {
            matiere = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.delete(matiere);
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

