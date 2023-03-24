package edu.ucjc.javagrado.ejercicios.herencia.zoologico;

public abstract class Animal {
	private String nombre;
	private String tipo;

	public Animal(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void comer() {
		System.out.println("El animal " + this.nombre + " esta comiendo.");
	}

	public void desplazar() {
		System.out.println("El animal " + this.nombre + " camina a 4 patas.");
	}

}
