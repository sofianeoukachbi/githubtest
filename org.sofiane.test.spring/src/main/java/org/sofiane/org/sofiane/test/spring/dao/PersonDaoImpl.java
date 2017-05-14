package org.sofiane.org.sofiane.test.spring.dao;

import org.sofiane.org.sofiane.test.spring.model.Person;
import org.sofiane.org.sofiane.test.spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonDaoImpl implements PersonDao {

	@Autowired
	private PersonRepository personRepository;

	public Person getPerson(String personId) {
		return personRepository.getPerson(personId);
	}

}
