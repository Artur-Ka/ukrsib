package test_task.ukrsib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "client")
@XmlRootElement(name = "client")
public class Client {

	private Integer inn;
	private String firstName;
	private String lastName;
	private String middleName;

	@Id
	public Integer getInn() {
		return inn;
	}

	public void setInn(Integer inn) {
		this.inn = inn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String toString() {
		return new StringBuilder().append(firstName).append(" ").append(middleName).append(" ").append(lastName).append(" ").append(inn).toString();
	}
}