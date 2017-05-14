package org.sofiane.org.sofiane.test.spring;

import org.sofiane.org.sofiane.test.spring.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	@Value("${version}")
	private static String version;
	
    public static void main( String[] args )
    {
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring-context.xml");
    	PersonServiceImpl personServiceImpl = (PersonServiceImpl) context.getBean("personServiceImpl");
    	
        System.out.println( "Hello " + personServiceImpl.getPerson("1").getFirstName());
        System.out.println( "Version " + version);
    }
}
