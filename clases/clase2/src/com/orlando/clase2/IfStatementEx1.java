package com.orlando.clase2;

import java.util.Scanner;

/**
 * 
 * @author orlando
 * Clase IsStatementEx1
 */
public class IfStatementEx1 {
	//Metodo main. corre la aplicacion
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		int val1 = scan.nextInt();
		
		System.out.println("Escribe otro numero:");
		int val2 = scan.nextInt();
		if (val1 == val2) {
			System.out.println(val1 + " es igual a " + val2);
		}else if(val1 < val2){
			System.out.println(val1 + " es menor a " + val2);
		}else if(val1 > val2){
			System.out.println(val1 + " es mayor a " + val2);
		}else if(val1 <= val2){
			System.out.println(val1 + " es menor o igual a " + val2);
		}else if(val1 >= val2){
			System.out.println(val1 + " es mayor o igual a " + val2);
		}else if(val1 != val2){
			System.out.println(val1 + " es diferente a " + val2);
		}
		
		
		if(val1 + 2 == val2){
			
		}
		
//		if (val1 == val2) {
//			System.out.println(val1 + " es igual a " + val2);
//		}
//		
//		if(val1 < val2){
//			System.out.println(val1 + " es menor a " + val2);
//		}
//		
//		if(val1 > val2){
//			System.out.println(val1 + " es mayor a " + val2);
//		}
//		
//		if(val1 <= val2){
//			System.out.println(val1 + " es menor o igual a " + val2);
//		}
//		
//		if(val1 >= val2){
//			System.out.println(val1 + " es mayor o igual a " + val2);
//		}
//		
//		if(val1 != val2){
//			System.out.println(val1 + " es diferente a " + val2);
//		}
	}
}
