package dao;

import model.Note;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class NoteDAOImpl implements NoteDAO {

    public void Create(Note note, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.save(note);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
    }

    public Note ReadOne(int id, Transaction tx,
                        Session session, SessionFactory sessionFactory) {
        Note note = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            note = session.find(Note.class, id);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return note;
    }

    public List<Note> ReadAll(Transaction tx,
                              Session session, SessionFactory sessionFactory) {
        List<Note> noteList = new ArrayList<>();
        try {
            tx = session.getTransaction();
            tx.begin();
            String ask = "FROM Note";
            Query<Note> query = session.createQuery(ask, Note.class);
            noteList = query.list();
            tx.commit();

            for (Note note : noteList
            ) {
                System.out.println(note);
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        }
        return noteList;
    }

    public void Update(Note note, Transaction tx,
                       Session session, SessionFactory sessionFactory) {
        try {
            tx = session.getTransaction();
            tx.begin();
            session.update(note);
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
        Note note = null;
        try {
            note = ReadOne(id, tx,
                    session, sessionFactory);
            tx = session.getTransaction();
            tx.begin();
            session.delete(note);
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

