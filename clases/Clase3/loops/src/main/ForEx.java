package main;

import java.util.ArrayList;

public class ForEx {
	public static void main(String[] args) {
		
		// For Loop
		System.out.println("For Example");
		for(int i = 0;i <= 10; i++){
			System.out.printf("%d ", i);
		}
		
		//For Each Loop
		System.out.println("\n\nFor Each Example");
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Tree");
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	//Katy Sierra -- OCP Java Certified Programmer
	
	
}
