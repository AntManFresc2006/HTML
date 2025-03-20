package Ej2practicas;

public class Alumno extends Persona {
	
	
	// Creamos nuestros atributos de la clase Asignatura.

	private int numMatricula;
	private double notaAsignatura;
	private Centro centro;
	private Asignatura asignatura;

	// Aqui creamos los constructores vacios y con parametros

	public Alumno() {
		super();
	}

	
	
	public Alumno(String nombre, String direccion, int numMatricula, double notaAsignatura, Centro centro,
			Asignatura asignatura) {
		super(nombre, direccion);
		this.numMatricula = numMatricula;
		this.notaAsignatura = notaAsignatura;
		this.centro = centro;
		this.asignatura = asignatura;
	}


	// Aqui los setters y getters

	public int getNumMatricula() {
		return numMatricula;
	}



	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}



	public double getNotaAsignatura() {
		return notaAsignatura;
	}



	public void setNotaAsignatura(double notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}



	public Centro getCentro() {
		return centro;
	}



	public void setCentro(Centro centro) {
		this.centro = centro;
	}



	public Asignatura getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}


	@Override
	public void conducir() {
		System.out.println("El profesor arranca el coche.");
	}
	
	
}
