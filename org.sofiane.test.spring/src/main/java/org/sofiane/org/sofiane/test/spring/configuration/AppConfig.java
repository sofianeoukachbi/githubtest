package org.sofiane.org.sofiane.test.spring.configuration;

import org.sofiane.org.sofiane.test.spring.dao.PersonDao;
import org.sofiane.org.sofiane.test.spring.dao.PersonDaoImpl;
import org.sofiane.org.sofiane.test.spring.repository.PersonRepository;
import org.sofiane.org.sofiane.test.spring.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppTechnicalConfigs.class)
public class AppConfig {

	@Bean
	public PersonRepository personRepository() {
		PersonRepository personRepository = new PersonRepository();
		personRepository.initData();
		return personRepository;
	}

	@Bean
	public PersonServiceImpl personServiceImpl() {
		return new PersonServiceImpl(personDaoImpl());
	}

	@Bean
	public PersonDao personDaoImpl() {
		return new PersonDaoImpl();
	}

}
