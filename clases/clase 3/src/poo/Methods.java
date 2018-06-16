package poo;

/**
 * 
 * @author orlando
 * Methods Class
 */
public class Methods {
		
		//Metodo main. Corre la aplicaion
		public static void main(String[] args) {
			for(int i = 1; i <= 10;i++){
				System.out.println("--------Tabla del " + i + "--------");
				imprimirTabla(i);
			}
		}
		
		
		/*
		 * modificador de acceso - tipo de retorno - nombre del metodo(parametros){
		 * 		
		 * }
		 */
		
		/**
		 * Metodo suma:
		 * regresa la suma de dos numeros.
		 * 
		 * @param num1
		 * @param num2
		 * @return num1 + num2
		 */
		public static void imprimirTabla(int num){
			for(int i = 1; i <= 10; i++){
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		}
		
		
	
}
