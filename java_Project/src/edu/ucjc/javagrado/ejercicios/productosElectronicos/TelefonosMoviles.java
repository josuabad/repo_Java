package edu.ucjc.javagrado.ejercicios.productosElectronicos;

public class TelefonosMoviles extends ProductosElectronicosReiniciables {

	private String marca;
	private String modelo;
	private String tamanoPantalla;
	private String bateria;
	
	public TelefonosMoviles(String nombre, int precio, int numeroUnidadesDisponibles, String marca, String modelo,
			String tamanoPantalla, String bateria) {
		super(nombre, precio, numeroUnidadesDisponibles);
		this.marca = marca;
		this.modelo = modelo;
		this.tamanoPantalla = tamanoPantalla;
		this.bateria = bateria;
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

	public String getPantalla() {
		return tamanoPantalla;
	}

	public void setPantalla(String pantalla) {
		this.tamanoPantalla = pantalla;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

}
