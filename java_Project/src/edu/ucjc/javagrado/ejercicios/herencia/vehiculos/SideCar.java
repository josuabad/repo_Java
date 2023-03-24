package edu.ucjc.javagrado.ejercicios.herencia.vehiculos;

public final class SideCar extends Moto {

	private int tamanio;
	
	public SideCar(String marca, String modelo, int anioFabricacion, String matricula) {
		super(marca, modelo, anioFabricacion, matricula);
		// TODO Completar el constructor
	}

	public SideCar(String marca, String modelo, int anioFabricacion, String matricula, int tamanio) {
		super(marca, modelo, anioFabricacion, matricula);
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void desmontar () {
		System.out.println("Desmontando el sidecar con matricula "+getMatricula());
	}

}
