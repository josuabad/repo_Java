package edu.ucjc.javagrado.ejercicios.herencia.vehiculos;

public class Coche extends VehiculosMotorizados {

	private int numPuertas;
	private String tipoCombustible;
	
	public Coche(String marca, String modelo, int anioFabricacion, String matricula, int numPuertas,
			String tipoCombustible) {
		super(marca, modelo, anioFabricacion, matricula);
		this.numPuertas = numPuertas;
		this.tipoCombustible = tipoCombustible;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", tipoCombustible=" + tipoCombustible + ", getNumPuertas()="
				+ getNumPuertas() + ", getTipoCombustible()=" + getTipoCombustible() + "]";
	}
	
	

}
