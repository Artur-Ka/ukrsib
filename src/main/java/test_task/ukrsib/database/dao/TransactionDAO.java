package test_task.ukrsib.database.dao;

import java.util.Collection;

import org.hibernate.Session;

import test_task.ukrsib.database.HibernateSessionFactory;
import test_task.ukrsib.model.Transaction;

public class TransactionDAO {

	private TransactionDAO() {

	}

	public void save(Collection<Transaction> transactions) {
		Session session = HibernateSessionFactory.openSession();
		session.beginTransaction();
		for (Transaction t : transactions) {
			session.persist(t);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	public static final TransactionDAO getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static final class SingletonHolder {
		private static final TransactionDAO INSTANCE = new TransactionDAO();
	}
}