package com.orlando.clase2.loops;

/**
 * 
 * @author orlando DoWhileEx class
 */
public class DoWhileEx {

	// Metodo main. corre la aplicaion
	public static void main(String[] args) {
		/*
		 * Bloque do-while primero ejecuta la sentencia y despues compara se
		 * ejecuta al menos una vez
		 */
		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
