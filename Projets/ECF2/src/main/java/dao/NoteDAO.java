package dao;

import model.Note;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public interface NoteDAO {

public void Create(Note note, Transaction tx,
        Session session, SessionFactory sessionFactory);

public Note ReadOne(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

public List<Note> ReadAll(Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Update(Note note, Transaction tx,
        Session session, SessionFactory sessionFactory);

public void Delete(int id,Transaction tx,
        Session session, SessionFactory sessionFactory);

        }
