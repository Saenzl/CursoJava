package main;

import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("Felipe");
		
		PersonDaoImpl personDAO = new PersonDaoImpl();
		
		personDAO.getConnection();
		personDAO.insert(person);
		
		List<Person> persons = new ArrayList<Person>();
		
		persons = personDAO.select();
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}
		
		personDAO.closeConnection();
	}
}
