package dao;

import model.EDT;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface EDTDAO {

    public void Create(EDT edt, Transaction tx,
                       Session session, SessionFactory sessionFactory);

    public EDT ReadOne(int id,Transaction tx,
                          Session session, SessionFactory sessionFactory);

    public List<EDT> ReadAll(Transaction tx,
                                Session session, SessionFactory sessionFactory);

    public void Update(EDT edt, Transaction tx,
                       Session session, SessionFactory sessionFactory);

    public void Delete(int id,Transaction tx,
                       Session session, SessionFactory sessionFactory);

}
