package ejercicios;

import java.util.Scanner;

public class SeparateValues {
	public static void main(String[] args) {
		int v1, v2, v3, v4, v5;
		
		System.out.println("Escribe un numero de 5 digitos: ");
		
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		
		v5 = val%10; //12345 % 10 = 5
		v4 = (val/10) % 10; //(12345/10) % 10 = 1234 % 10 = 4
		v3 = (val/100) % 10;
		v2 = (val/1000) % 10;
		v1 = (val/10000) % 10;
		
		System.out.printf("%d\t%d\t%d\t%d\t%d\t", v1, v2, v3, v4, v5);
	}
}
