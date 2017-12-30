package main;

public class WhileEx {
	public static void main(String[] args) {
		System.out.println("Metodo while");
		whileMethod();	//Llamada al metodo while
		
		System.out.println("\nMetodo doWhile");
		doWhileMethod();  //Llamada al metodo Do While


	}
	
	/*
	 * declaración de metodo while
	 */
	public static void whileMethod(){
		int i = 1;
		while(booleanExpresion()){ //Se evalua Expresion booleana desde un metodo
			System.out.printf("%d, ", i);
			i++;
			if(i == 10)break; //Si la condición se cumple se usa break para salir del while
		}
	}
	
	/*
	 * Declaración de metodo Do While
	 */
	public static void doWhileMethod(){
		int i = 1;
		do{
			System.out.printf("%d, ", i);
			i++;
			if(i == 10)break;
		}while(booleanExpresion());
	}
	
	/*
	 * Declaración de expresión booleana
	 */
	public static boolean booleanExpresion(){
		System.out.println("Se evalua la expresión");
		return true;
	}
}
