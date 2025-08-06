package dao;

import model.EDT;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EDTDAOImpl implements EDTDAO {
    public void Create(EDT edt, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(edt);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public EDT ReadOne(int id, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        EDT edt = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            edt = session.find(EDT.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return edt;
    }

    public List<EDT> ReadAll(Transaction tx,
                             Session session, SessionFactory sessionFactory) {
        List<EDT> edtList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM emploi_du_temps";
            Query<EDT> query = session.createQuery(ask, EDT.class);
            edtList = query.list();
            tx.commit();

            for (EDT edt : edtList
            ) {
                System.out.println(edt);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return edtList;
    }

    public void Update(EDT edt, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(edt);
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
        EDT edt = null;
        try {
            edt = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.delete(edt);
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

