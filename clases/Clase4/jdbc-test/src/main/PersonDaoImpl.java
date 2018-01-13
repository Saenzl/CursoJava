package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonDaoImpl implements PersonDao{
	
	Connection connection = null;
	
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			if(connection == null){
				connection = DriverManager.getConnection("jdbc:mysql://localhost/curso?user=root&password=16119321o");
			}
		}catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		try{
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PERSON (prs_Id, prs_Name) VALUES (NULL, ?)");
			preparedStatement.setString(1, person.getName());
			preparedStatement.executeUpdate();
			System.out.println("Person saved correctly");
			preparedStatement.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> select() {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();
		try{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSON");
			
			Person person = null;
			while(resultSet.next()){
				person = new Person();
				person.setId(Integer.parseInt(resultSet.getString("prs_Id")));
				person.setName(resultSet.getString("prs_Name"));
				
				persons.add(person);
			}
			
			resultSet.close();
			statement.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return persons;
	}
	
	public void closeConnection(){
		try{
			if (connection != null){
				connection.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
