package edu.ucjc.javagrado.ejercicios.herencia.vehiculos;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private int anioFabricacion;

	public Vehiculo(String marca, String modelo, int anioFabricacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}

	public Vehiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(String marca, int anioFabricacion) {
		super();
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + "]";
	}

	public void acelerar() {
		System.out.println("El vehiculo con marca " + this.marca + " esta acelerando ");
	}

	public void frenar() {
		System.out.println("El vehiculo con marca " + this.marca + " esta frenando ");
	}

}
