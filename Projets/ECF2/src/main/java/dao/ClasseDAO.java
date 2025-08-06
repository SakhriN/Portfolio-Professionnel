package dao;

import model.Classe;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface ClasseDAO {

    public void Create(Classe classe, Transaction tx,
                       Session session, SessionFactory sessionFactory);

    public Classe ReadOne(int id, Transaction tx,
                               Session session, SessionFactory sessionFactory);

    public List<Classe> ReadAll(Transaction tx,
                                     Session session, SessionFactory sessionFactory);

    public void Update(Classe classe, Transaction tx,
                       Session session, SessionFactory sessionFactory);

    public void Delete(int id,Transaction tx,
                       Session session, SessionFactory sessionFactory);

}
