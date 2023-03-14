package edu.ucjc.javagrado.ejercicios.carreracaballos;

public class Caballo {
	private String nombre;
	private int dorsal;
	private double velocidad;
	private double peso;
	private int edad;
	private int avance;// Siempre empieza en 0

	public Caballo(String nombre, int dorsal, double velocidad, 
			double peso, int edad) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.velocidad = velocidad;
		this.peso = peso;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}

	public void correr() {
		System.out.println("Caballo " + this.getNombre() + " corriendo");
		this.avance += UtilidadesCaballos.calcularAvance(this);
		System.out.println("avance: " + this.avance);
	}
}



