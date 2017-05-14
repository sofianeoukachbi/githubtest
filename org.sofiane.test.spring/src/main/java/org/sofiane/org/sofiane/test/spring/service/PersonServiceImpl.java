package org.sofiane.org.sofiane.test.spring.service;

import org.sofiane.org.sofiane.test.spring.dao.PersonDao;
import org.sofiane.org.sofiane.test.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonDao personDao;

	public PersonServiceImpl() {
	}
	
	public PersonServiceImpl(PersonDao personDao) {
		this.personDao = personDao;
	}

	public Person getPerson(String personId) {
		return personDao.getPerson(personId);
	}
	
	
	
}
