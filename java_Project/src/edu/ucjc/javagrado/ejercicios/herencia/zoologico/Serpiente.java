package edu.ucjc.javagrado.ejercicios.herencia.zoologico;

public class Serpiente extends Animal {
	private double longitud;

	public Serpiente(String nombre, String tipo, double longitud) {
		super(nombre, tipo);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public void desplazar() {
		System.out.println("La serpiente "+ getNombre() + " se desplaza reptando");
	}
	
	
}
