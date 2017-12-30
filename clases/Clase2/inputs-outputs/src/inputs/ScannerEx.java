package inputs;

import java.util.Scanner;

/**
 * 
 * @author orlando
 * Esta clase muestra como recibir inputs desde consola.
 */
public class ScannerEx {
	
	/*
	 * Metodo main inicia la ejecución
	 * del programa
	 */
	public static void main(String[] args) {
		//Objeto scan de tipo Scanner lee los inputs del teclado en consola
		Scanner scan = new Scanner(System.in); 
		
		String input;
		System.out.print("Escribe un String: ");
		
		//Metodo nextLine() guarda el input como un valor de tipo String
		input = scan.nextLine(); 
		
		
		System.out.println("\n\nEscribiste : " + input);
	}
}
