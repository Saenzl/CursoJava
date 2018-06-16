package loops;

/**
 * 
 * @author orlando
 * ForEx2 Class
 */
public class ForEx2 {
	
	//Metodo main. corre la aplicaion
	public static void main(String[] args) {
		for(char letter = 'a'; letter <= 'z'; letter++){
			System.out.print(letter);
			if(letter < 'z')System.out.print(", ");
		}
		
	}
	
}
