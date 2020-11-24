package ukrsib;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import test_task.ukrsib.Service;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

	@Spy
	private Service service;

	@Before
	public void setup() {
		Mockito.doNothing().when(service).saveTransactions();
		Mockito.doNothing().when(service).saveClient(Mockito.any());
	}
	
	@Test
	public void transactionLoadTest() throws XMLStreamException, JAXBException {
		service.loadTransactions("Java_test.xml");
		Assert.assertEquals(service.getTransactions().size(), 12);
	}
}