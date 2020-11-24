package test_task.ukrsib;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();

		try {
			service.loadTransactions("Java_test.xml");
		} catch (XMLStreamException | JAXBException e) {
			e.printStackTrace();
		}
	}
}