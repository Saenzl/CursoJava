package inputs;

import javax.swing.JOptionPane;

/**
 * 
 * @author orlando
 * Clase SwingInput
 * muestra lecturas de texto en una ventana swing
 */
public class SwingInput {
	public static void main(String[] args) {
		String strVal1, strVal2;
		int val1, val2, sum;
		
		/*
		 * El metodo showInputDialog de la clase JOptionPane
		 * muestra un mensaje y espera a que ingreses un valor
		 * para guardarlo como String
		 */
		strVal1 = JOptionPane.showInputDialog("Escribe el primer numero");
		strVal2 = JOptionPane.showInputDialog("Escribe el segundo numero");
		
		/*
		 * El metodo parseInt de la clase Integer
		 * toma como parametro un valor de tipo String
		 * y lo regresa como un valor decimal si el String
		 * esta compuesto por un valor numerico
		 */
		val1 = Integer.parseInt(strVal1);
		val2 = Integer.parseInt(strVal2);
		
		sum = val1 + val2;
		System.out.printf("La suma es: %d", sum);
		
		JOptionPane.showMessageDialog(null, "La suma es: " + sum);
		
		/*
		 * Ejercicio:
		 * Escribe una aplicación que reciba como entrada un numero de 5 digitos,
		 * separe los numeros en digitos individuales y los imprima con un tab 
		 * de separación cada digito.
		 * 
		 * 12345
		 * 
		 * 123 % 10 = 3
		 * 
		 * 1	2	3	4	5
		 */
		
		
		
	}
}
