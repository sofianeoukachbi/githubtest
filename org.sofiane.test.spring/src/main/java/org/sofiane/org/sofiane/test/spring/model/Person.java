package org.sofiane.org.sofiane.test.spring.model;

public class Person {

	private Integer personId;
	private String firstName;
	private String lastName;

	public Person() {
	}
	
	public Person(Integer personId, String firstName, String lastName) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
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

}
