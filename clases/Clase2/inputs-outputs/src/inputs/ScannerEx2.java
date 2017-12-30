package inputs;

import java.util.Scanner;

/**
 * 
 * @author orlando
 * Clase ScannerEx2
 * muestra como leer inputs de tipo numerico
 */
public class ScannerEx2 {
	public static void main(String[] args) {
		//se crea objeto scan de tipo Scanner
		Scanner scan = new Scanner(System.in);
		
		int val1, val2, sum;
		
		System.out.println("Escribe el primer valor: ");
		//El metodo nextInt() del objeto scan lee el input como valor numerico
		val1 = scan.nextInt();
		
		System.out.println("Escribe el segundo valor: ");
		val2 = scan.nextInt();
		
		sum = val1 + val2;
		
		System.out.printf("La suma de los valores es: %d", sum);
		
	}
}
