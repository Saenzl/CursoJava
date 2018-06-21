package com.orlando.login.dao;

import java.util.List;

import com.orlando.login.model.Person;
/*
 * DAO(Data Access Object)
 */
public interface PersonDAO {
	
	public void insert(Person person);
	
	public List<Person> getAllPersons();
	
	public Person getById(int id);
	
	public Person getByEmail(String email);
	
}
