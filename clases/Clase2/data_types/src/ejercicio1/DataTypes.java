package ejercicio1;

/**
 * 
 * @author orlando
 * Esta clase es para conocer DataTypes
 */
public class DataTypes {
	public static void main(String[] args) {
		int a = 3, f =3;  //esta es una variable de tipo int
		float b = 4.5f;    //esta es una variable de tipo float
		double c;   //esta es una variable de tipo double
		boolean d;  //esta es una variable de tipo boolean
		
		/*
		 * Wrapper Classes
		 */
		Integer a2 = new Integer(9); 
		Float b2 = new Float(6.0f);
		Double c2 = new Double(6.0);
		Boolean d2 = new Boolean(false);
		
		/*
		 * Autoboxing:
		 * Cuando asignamos un valor de tipo primitivo
		 * a un wrapper class
		 */
		Integer v1 = 12; //Autoboxing
		
		/*
		 * Unboxing:
		 * cuando asignamos un valor de un Wrapper Class 
		 * a un valor de tipo primitivo
		 */
		int v2 = a2;  //Unboxing
		
		
		/*
		 *Este es un comentario de bloque 
		 *:D 
		 */
		String e = "Hola!";    
		a = 5;
		
		e = "adios";
		
		
		
		/*
		 * variables tipo String
		 */
		String s1 = "HelloWorld!";
		String s2 = new String("HelloWorld!");
		
		s2 = s1;
		
		if(s1 == s2){
			System.out.println("s1 == s2");
		}
		
		if(s1.equals(s2)){
			System.out.println("s1.equals(s2)");
		}
		
	}
}
