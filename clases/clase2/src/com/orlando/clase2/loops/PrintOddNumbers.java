package com.orlando.clase2.loops;


/**
 * 
 * @author orlando
 * PrintNonNumbers class
 */
public class PrintOddNumbers {
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 100){
			if(i % 2 != 0){
				System.out.println(i);
			}
			i++;
		}
		
	}
	
}
