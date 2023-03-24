package edu.ucjc.javagrado.ejercicios.herencia.maniqui;

/**
 * Clase que representa a un objeto de tipo botón
 * @author Jose Luis
 *
 */
public class Boton {
	private String color;
	private String forma;
	private String tamanio; 
	
	public Boton(String color, String forma) {
		super();
		this.color = color;
		this.forma = forma;
	}
	
	public Boton(String color, String forma, String tamanio) {
		super();
		this.color = color;
		this.forma = forma;
		this.tamanio = tamanio;
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
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	
}
