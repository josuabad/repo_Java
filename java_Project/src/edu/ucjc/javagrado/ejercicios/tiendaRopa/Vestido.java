package edu.ucjc.javagrado.ejercicios.tiendaRopa;

public class Vestido {
	private String talla;
	private String color;
	private int precio;
	
	public Vestido(String talla, String color, int precio) {
		super();
		this.talla = talla;
		this.color = color;
		this.precio = precio;
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
	
}
