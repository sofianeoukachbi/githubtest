package org.sofiane.org.sofiane.test.spring.configuration;

import org.sofiane.org.sofiane.test.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppTechnicalConfigs {
	
	@Bean
	public Person personAlwayspresent(){
		return new Person(5,"Sonia","OUKACHBI");
	}
	
	
}
