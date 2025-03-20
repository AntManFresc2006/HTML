package Ej2practicas;

public class Profesor extends Persona{
	
	// Creamos nuestros atributos de la clase Asignatura.
	
	private String titulacion;
	

	// Aqui creamos los constructores vacios y con parametros

	public Profesor() {
		super();
	}


	public Profesor(String nombre, String direccion, String titulacion) {
		super(nombre, direccion);
		this.titulacion = titulacion;
	}

	
	// Aqui los setters y getters

	public String getTitulacion() {
		return titulacion;
	}


	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	@Override
	public void conducir() {
		System.out.println("El profesor arranca el coche.");
	}
	
	public static void trabajar() {
		System.out.println("El profesor esta trabajando.");
	}
	
	
	
}
