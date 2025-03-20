package Ej2practicas;

public class Persona {

	// Creamos nuestros atributos de la clase Asignatura.

	protected String nombre, direccion;

	// Aqui creamos los constructores vacios y con parametros

	public Persona() {
	}

	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// Aqui los setters y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void conducir() {
		System.out.println(nombre+" Está conduciendo.");
	}

}
