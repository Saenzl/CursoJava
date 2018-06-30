package com.orlando.login.daoimpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

import com.orlando.login.dao.PersonDAO;
import com.orlando.login.model.Person;

public class PersonDAOImplTest {

	//@Test
	public void inserTest(){
		PersonDAO personDao = new PersonDAOImpl();
		Person person = new Person();

		person.setName("Mario");
		person.setLastName("Perez");
		person.setEmail("mario2@gmail.com");
		person.setAge(24);
		person.setAddress("Monterrey");
		person.setPassword("password");

		personDao.insert(person);
	}
	
	
	public void getAllPersonTest(){
		PersonDAO personDao = new PersonDAOImpl();

		List<Person> persons = personDao.getAllPersons();

		for (Person person : persons) {
			System.out.println(person);
		}
	}
	
	@Test
	public void getByEmailTest(){
		String email = "mario2@gmail.com";
		PersonDAO personDao = new PersonDAOImpl();
		Person person = personDao.getByEmail(email);
		System.out.println(person);
		assertEquals("Mario", person.getName());
	}

}
