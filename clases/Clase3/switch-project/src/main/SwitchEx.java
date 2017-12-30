package main;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int val;
		System.out.println("Escribe un numero");
		
		val = scan.nextInt();
		String str = "";
		switch(val){
		case 1: str = "El valor es 1";break;
		case 2: str = "El valor es 2";break;
		case 3: str = "El valor es 3";break;
		default: str = "Se escribio otro valor";break;
		}
		System.out.println(str);
	}
}
