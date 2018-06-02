package com.orlando.clase2;

/**
 * 
 * @author orlando
 * Clase IfStatement
 */
public class IfStatement {
	
		//Metodo main. corre la aplicacion
		public static void main(String[] args) {
			//Sentencias if evaluan una condicion
			/*
			 * if(condition){
			 * 	print("string");
			 * 	se ejecuta solo si la sentencia resulta verdadera
			 * }
			 * 
			 * Operadores de comparacion:
			 * a == b igual que
			 * a < b  menor que
			 * a > b  mayor que
			 * a >= b mayor e igual que
			 * a <= b menor e igual que
			 * a != b diferente de
			 */
			System.out.println("If Statement");
			int val = 5;
			int val2 = 10;
			if (val == val2) {
				System.out.println(val + " es igual a " + val2);
			}else if(val < val2){
				System.out.println(val + " es menor a " + val2);
			}else if(val > val2){
				System.out.println(val + " es mayor a " + val2);
			}
			
			/*
			 * Ternary operator
			 * result = condition ? trueValue : falseValue
			 */
			System.out.println("Ternary operator");
			String str = (val > val2) ? "La condicion es verdadera" : "La condicion es falsa";
			System.out.println(str);
		}
	
}
