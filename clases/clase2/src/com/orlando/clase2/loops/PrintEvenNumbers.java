package com.orlando.clase2.loops;

/**
 * 
 * @author orlando
 * PrintEvenNumbers class
 */
public class PrintEvenNumbers {
	
	//Metodo main. corre la aplicacion
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
	}
	
}
