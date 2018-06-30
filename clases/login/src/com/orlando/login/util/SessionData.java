package com.orlando.login.util;

import com.orlando.login.model.Person;

public class SessionData {
	
	private static Person currentPerson;
	
	public static Person getCurrentPerson(){
		return currentPerson;
	}
	
	public static void setCurrentPerson(Person currentPerson){
		SessionData.currentPerson = currentPerson;
	}
	
}
