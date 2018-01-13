package poo;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Persona persona = new Persona();
		Gato gato = new Gato("Felix", 6);
		ArrayList<Gato> gatos = new ArrayList<>();
		persona.getGatos().add(new Gato("nombre de gato", 9));
		gatos.add(new Gato("Felix", 3));

		gatos.add(new Gato("Mike", 2));
		
		Persona persona2 = new Persona("Mario", 30, "Apodaca", gatos);
		
		System.out.println(persona.toString());
		
		persona.setDireccion("San Nicolas");
		persona.getGatos().set(0, gato);
		//persona.getGato().setEdad(persona.getGato().getEdad() + 1);
		System.out.println();
		System.out.println(persona.toString());
		
		System.out.println();
		
		System.out.println(persona2.toString());
		
		persona2.setDireccion("Guadalupe");
		System.out.println();
		System.out.println(persona2.toString());
	}
}
