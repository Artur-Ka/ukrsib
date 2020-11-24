package test_task.ukrsib;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import test_task.ukrsib.database.dao.ClientDAO;
import test_task.ukrsib.database.dao.TransactionDAO;
import test_task.ukrsib.model.Client;
import test_task.ukrsib.model.Transaction;

public class Service {

	private final List<Transaction> transactions = new ArrayList<>();

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void loadTransactions(String path) throws XMLStreamException, JAXBException {
		XMLInputFactory xif = XMLInputFactory.newInstance();
		XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource("Java_test.xml"));
		xsr.nextTag();
		while (!xsr.getLocalName().equals("transaction")) {
			xsr.nextTag();
		}

		JAXBContext jc = JAXBContext.newInstance(Transaction.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		while (xsr.hasNext()) {
			if (xsr.isEndElement()) {
				break;
			}

			if (xsr.isStartElement()) {
				Transaction transaction = (Transaction) unmarshaller.unmarshal(xsr);
				transactions.add(transaction);
				saveClient(transaction.getClient());
			}
			xsr.nextTag();
		}
		xsr.close();

		saveTransactions();
	}

	public void saveTransactions() {
		TransactionDAO.getInstance().save(transactions);
	}

	public void saveClient(Client client) {
		ClientDAO.getInstance().save(client);
	}
}