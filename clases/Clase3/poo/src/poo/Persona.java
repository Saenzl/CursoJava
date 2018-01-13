package poo;

import java.util.ArrayList;

/*
 * POJO(Plain Old Java Object)
 */
public class Persona {
	private String nombre;
	private int edad;
	private String direccion;
	private ArrayList<Gato> gatos = new ArrayList<Gato>();

	//Constructor sin parametros
	public Persona(){
		this.nombre = "Orlando";
		this.edad = 24;
		this.direccion = "Monterrey";
	}

	//Constructor parametrizado
	Persona(String nombre, int edad, String direccion, ArrayList<Gato> gatos){
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.gatos = gatos;
	}

	//Constructor parametrizado
	Persona(String nombre){
		this.nombre = nombre;
		this.edad = 24;
		this.direccion = "Monterrey";
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public ArrayList<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(ArrayList<Gato> gatos) {
		this.gatos = gatos;
	}

	/*
	 * Metodo toString Imprime los valores del objeto
	 */
	@Override
	public String toString(){
		return "Nombre: " + this.nombre + "\nEdad: " + 
				this.edad + "\nDireccion: " + this.direccion;
	}
}
