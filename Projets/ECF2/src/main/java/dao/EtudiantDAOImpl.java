package dao;

import model.Etudiant;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAOImpl implements EtudiantDAO {
    public void Create(Etudiant etudiant, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(etudiant);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public Etudiant ReadOne(int id, Transaction tx,
                            Session session, SessionFactory sessionFactory) {
        Etudiant etudiant = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            etudiant = session.find(Etudiant.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return etudiant;
    }

    public List<Etudiant> ReadAll(Transaction tx,
                                  Session session, SessionFactory sessionFactory) {
        List<Etudiant> etudiantList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Etudiant";
            Query<Etudiant> query = session.createQuery(ask, Etudiant.class);
            etudiantList = query.list();
            tx.commit();

            for (Etudiant etudiant : etudiantList
            ) {
                System.out.println(etudiant);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return etudiantList;
    }

    public void Update(Etudiant etudiant, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(etudiant);
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
        Etudiant etudiant = null;
        try {
            etudiant = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.remove(etudiant);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        session.close();
    }

    public List<Etudiant> ReadAllById(int id,Transaction tx,
                                  Session session, SessionFactory sessionFactory) {
        List<Etudiant> etudiantList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Etudiant etudiant WHERE etudiant.classe.id_cl = :idClasse";
            Query<Etudiant> query = session.createQuery(ask, Etudiant.class);
            query.setParameter("idClasse",id);
            etudiantList = query.list();
            tx.commit();

            for (Etudiant etudiant : etudiantList
            ) {
                System.out.println(etudiant);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return etudiantList;
    }

}

