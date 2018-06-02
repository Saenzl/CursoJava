package com.orlando.clase2;

public class ArithmeticOperators {
	
	//Metodo main. Corre la aplicaion
	public static void main(String[] args) {
		/*
		 * Operadores basicos.
		 * 
		 * Suma: +
		 * resta: -
		 * multiplicacion: *
		 * division: /
		 * modulus: %
		 */
		int val1 = 10;
		int val2 = 3;
		int result;
		System.out.println("--------Operadores Aritmeticos---------");
		result = val1 + val2;System.out.println(result);
		result = val1 - val2;System.out.println(result);
		result = val1 * val2;System.out.println(result);
		result = val1 / val2;System.out.println(result);
		result = val1 % val2;System.out.println(result);
		
		result = 10 + 5 / 3 * 2;
		System.out.println(result);
		
		result = (10 + 5) / 3;
		System.out.println(result);
		
		/*
		 * Operadores de incremento/decremento
		 * 
		 * incremento: ++
		 * decremento: --
		 */
		
		System.out.println("--------Operadores de incremento/decremento--------");
		System.out.println("Incremento");
		int val3 = 10;
		System.out.println(val3++); //postncrement
		System.out.println(val3);
		
		val3 = 10;
		System.out.println(++val3); //preincrement
		System.out.println(val3);
		
		System.out.println("Decremento");
		val3 = 10;
		System.out.println(val3--); //postdecrement
		System.out.println(val3);
		
		val3 = 10;
		System.out.println(--val3); //predecrement
		System.out.println(val3);
		
		//  
		/*
		 * Operadores de asignacion
		 * 
		 * suma: +=
		 * resta: -=
		 * multiplicaion: *=
		 * division: /=
		 * modulus: %=
		 */
		System.out.println("-------Operadores de asignacion------");
		int val4 = 100;
		val4 += 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 -= 10;
		System.out.println(val4);

		val4 = 100;
		val4 *= 10;
		System.out.println(val4);

		val4 = 100;
		val4 /= 10;
		System.out.println(val4);

		val4 = 100;
		val4 %= 10;
		System.out.println(val4);
	}
}
