package main;

import java.util.List;

public interface PersonDao {
	public void insert(Person person);
	public void update(Person person);
	
	public void delete(int id);
	public List<Person> select();
	
	
}
