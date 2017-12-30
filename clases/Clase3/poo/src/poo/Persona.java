package poo;

/*
 * POJO(Plain Old Java Object)
 */
public class Persona {
	private String nombre;
	private int edad;
	private String direccion;
	private Gato gato;

	//Constructor sin parametros
	public Persona(){
		this.nombre = "Orlando";
		this.edad = 24;
		this.direccion = "Monterrey";
		this.gato = new Gato("Yoshi", 3);
	}

	//Constructor parametrizado
	Persona(String nombre, int edad, String direccion, Gato gato){
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.gato = gato;
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

	public Gato getGato() {
		return gato;
	}

	public void setGato(Gato gato) {
		this.gato = gato;
	}

	/*
	 * Metodo toString Imprime los valores del objeto
	 */
	@Override
	public String toString(){
		return "Nombre: " + this.nombre + "\nEdad: " + 
				this.edad + "\nDireccion: " + this.direccion
				+ "\nGato: " + this.gato.toString();
	}
}
