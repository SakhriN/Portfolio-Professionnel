package dao;

import model.Departement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface DepartementDAO {

    public void Create(Departement departement, Transaction tx,
                       Session session, SessionFactory sessionFactory);

    public Departement ReadOne(int id, Transaction tx,
                               Session session, SessionFactory sessionFactory);

    public List<Departement> ReadAll(Transaction tx,
                                     Session session, SessionFactory sessionFactory);

    public void Update(Departement departement, Transaction tx,
                       Session session, SessionFactory sessionFactory);

    public void Delete(int id,Transaction tx,
                       Session session, SessionFactory sessionFactory);

}
