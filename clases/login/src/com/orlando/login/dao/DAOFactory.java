package com.orlando.login.dao;

public class DAOFactory {
	
	public static MySqlDB getMySqlDB(){
		return new MySqlDB();
	}
	
}
