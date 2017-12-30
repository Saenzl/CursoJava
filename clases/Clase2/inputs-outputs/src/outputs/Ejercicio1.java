package outputs;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.print("Este es un mensaje impreso en consola"); // print imprime sin saltar de linea
		System.out.println("Este es otro mensaje impreso en consola"); // println imprime y salta de linea
		
		/*
		 * Escape Sequences:
		 * \n --- Salta de linea
		 * \t --- hace un tab horizontal
		 * \r --- Regresa el cursos al principio de linea
		 * \\ --- escrbe un \ en el string
		 * \" --- Escribe " en el String
		 */
		
		
		
		/*
		 * Impresión de formato en Java :D
		 */
		System.out.print("Aqui se usa un \\ n para\n hacer un salto de linea\n");
		
		System.out.printf("Impresión de formato... %nnumeros: %d%nStrings: %s", 3, "texto");
	}
}
