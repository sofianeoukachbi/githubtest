package org.sofiane.org.sofiane.test.spring.repository;

import java.util.HashMap;
import java.util.Map;

import org.sofiane.org.sofiane.test.spring.model.Person;

public class PersonRepository {

	private Map<String, Person> personMap = new HashMap<>();
	
	public void initData(){
		
		personMap.put("2", new Person(2, "toto", "titi"));
		personMap.put("3", new Person(3, "toto1", "titi"));
		personMap.put("4", new Person(4, "toto2", "titi"));
	}
	
	public Person getPerson(String personId){
		return personMap.get(personId);
	}
	
}
