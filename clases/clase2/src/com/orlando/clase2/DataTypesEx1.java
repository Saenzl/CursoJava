package com.orlando.clase2;

public class DataTypesEx1 {
	
	/*
	 * Tipos de datos primitivos.
	 */
	
	//(Punto Flotante)
	//Tipo de dato de punto flotante (float) 32 bits
	float floatVal = 1.0f;
	//Tipo de dato de punto flotnte (double) 64 bits
	double doubleVal = 4.0;
	
	//(Tipo Entero)
	//Tipo de dato de tipo entero (int) 32 bits
	int intVal = 20;
	//Tipo de dato de tipo enter (byte) 8 bits -128 a 127
	byte byteVal = 126;
	//Tipo de dato de tipo entero (short) 16 bits
	short shortVal = 7;
	//Tipo de dato de tipo entero (long) 64 bits
	long longVal = 5L;
	
	//(Tipo Character % Boolean)
	//Tipo de datao tipo char, Guarda caracteres simples
	char charVar = 'a';
	//Tipo de dato boolean, guarda valores booleanos(true o false)
	boolean flag = true;
	
	
	
	public static void main(String[] args) {
		//Tipo de dato no primitivo
		String str = "un string";
		System.out.println(str.equals("un string"));
	}
	
}
