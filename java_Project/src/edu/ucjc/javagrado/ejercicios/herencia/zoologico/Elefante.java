package edu.ucjc.javagrado.ejercicios.herencia.zoologico;

public final class Elefante extends Animal {
	private double longTrompa;

	public Elefante(String nombre, String tipo, double longTrompa) {
		super(nombre, tipo);
		this.longTrompa = longTrompa;
	}

	public double getLongTrompa() {
		return longTrompa;
	}

	public void setLongTrompa(double longTrompa) {
		this.longTrompa = longTrompa;
	}

	@Override
	public void desplazar() {
		super.desplazar();
		System.out.println("Despacio");
	}
	
	public void programarJava() {
		System.out.println("El elefante "+ getNombre() + " est� programando en Java");
	}
	
	
	

}
