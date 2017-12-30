package ifstatement;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean a = true;
		if(a){
			System.out.println("Siempre se cumple :D");
			System.out.println("Esto tambien");
		}else{
			System.out.println("Esto no :(");
		}
		
		int b = a? 5 : 0;
		
		System.out.println(b);
	}
}
