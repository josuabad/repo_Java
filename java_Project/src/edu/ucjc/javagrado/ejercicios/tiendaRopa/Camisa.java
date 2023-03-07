package edu.ucjc.javagrado.ejercicios.tiendaRopa;

public class Camisa {
	private String talla;
	private String color;
	private int precio;
	private Boton[] boton; // Varios botones
	
	public Camisa(String talla, String color, int precio, Boton[] boton) {
		super();
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.boton = boton;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Boton[] getBoton() {
		return boton;
	}

	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}

}
