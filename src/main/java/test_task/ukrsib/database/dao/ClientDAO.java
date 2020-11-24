package test_task.ukrsib.database.dao;

import org.hibernate.Session;

import test_task.ukrsib.database.HibernateSessionFactory;
import test_task.ukrsib.model.Client;

public class ClientDAO {

	private ClientDAO() {

	}

	public void save(Client client) {
		Session session = HibernateSessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(client);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	public static final ClientDAO getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static final class SingletonHolder {
		private static final ClientDAO INSTANCE = new ClientDAO();
	}
}