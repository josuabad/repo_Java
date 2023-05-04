package edu.ucjc.javagrado.ejercicios.formula1;

import java.util.List;
import java.util.Random;

public class CocheF1 {

	private int numero;
	private String nombre;
	private String escuderia;
	private List<String> patrocinadores;
	private int velMaxima = 300;
	
	public CocheF1(int numero, String nombre, String escuderia, List<String> patrocinadores) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.escuderia = escuderia;
		this.patrocinadores = patrocinadores;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEscuderia() {
		return escuderia;
	}
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	public List<String> getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(List<String> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	public int getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	public void correr() {
		Random random = new Random();
		int velocidad = random.nextInt(301);
		System.out.println("Corriendo a " + velocidad + "km/h");
	}

	@Override
	public String toString() {
		return "CocheF1 [numero=" + numero + ", nombre=" + nombre + ", escuderia=" + escuderia + ", patrocinadores="
				+ patrocinadores + ", velMaxima=" + velMaxima + "]";
	}
	
	
	
}
