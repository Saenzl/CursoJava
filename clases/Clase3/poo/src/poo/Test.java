package poo;



public class Test {
	public static void main(String[] args) {
		Persona persona = new Persona();
		Gato gato = new Gato("Felix", 6);
		Persona persona2 = new Persona("Mario", 30, "Apodaca", new Gato("Pelusa", 8));
		
		System.out.println(persona.toString());
		
		persona.setDireccion("San Nicolas");
		persona.setGato(gato);
		persona.getGato().setEdad(persona.getGato().getEdad() + 1);
		System.out.println();
		System.out.println(persona.toString());
		
		System.out.println();
		
		System.out.println(persona2.toString());
		
		persona2.setDireccion("Guadalupe");
		persona2.getGato().setEdad(persona2.getGato().getEdad() + 1);
		System.out.println();
		System.out.println(persona2.toString());
	}
}
