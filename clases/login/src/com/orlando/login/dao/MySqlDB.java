package com.orlando.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDB {
	
	private static final String URL = "jdbc:mysql://35.226.45.38:3306/";
	
	private static final String DATABASE = "medcongress?useSSL=false";
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String USER = "root";
	
	private static final String PASSWORD = "medcongress";
	
	public Connection openConnection() {
		try{
			Class.forName(DRIVER).newInstance();
			Connection connection = DriverManager.getConnection(URL+DATABASE, USER, PASSWORD);
			return connection;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
