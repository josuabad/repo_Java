package edu.ucjc.javagrado.ejercicios.tiendaRopa;

public class Boton {
	private String color;
	private String forma;
	private String talla;
	
	public Boton(String color, String forma, String tamanio) {
		super();
		this.color = color;
		this.forma = forma;
		this.talla = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamanio() {
		return talla;
	}

	public void setTamanio(String tamanio) {
		this.talla = tamanio;
	}
	
}
