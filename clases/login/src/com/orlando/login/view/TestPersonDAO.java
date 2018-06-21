package com.orlando.login.view;

import java.util.List;

import com.orlando.login.dao.PersonDAO;
import com.orlando.login.daoimpl.PersonDAOImpl;
import com.orlando.login.model.Person;

public class TestPersonDAO {

	public static void main(String[] args) {
		printUsers();
	}

	public static void createPersons(){
		Person person = new Person();

		person.setName("Julio");
		person.setLastName("Perez");
		person.setEmail("julio@a.com");
		person.setAge(35);
		person.setAddress("Monterrey");
		person.setPassword("password");

		PersonDAO personDao = new PersonDAOImpl();
		personDao.insert(person);
	}
	
	public static void printUsers(){
		PersonDAO personDao = new PersonDAOImpl();
		
		List<Person> persons = personDao.getAllPersons();
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
