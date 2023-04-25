package edu.ucjc.javagrado.ejercicios.productosElectronicos;

public class Portatiles extends ProductosElectronicosReiniciables{

	private String marca;
	private String modelo;
	private String tamanoPantalla;
	private String batería;
	private String procesador;
	
	public Portatiles(String nombre, int precio, int numeroUnidadesDisponibles, String marca, String modelo,
			String tamanoPantalla, String batería, String procesador) {
		super(nombre, precio, numeroUnidadesDisponibles);
		this.marca = marca;
		this.modelo = modelo;
		this.tamanoPantalla = tamanoPantalla;
		this.batería = batería;
		this.procesador = procesador;
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

	public String getTamanoPantalla() {
		return tamanoPantalla;
	}

	public void setTamanoPantalla(String tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	public String getBatería() {
		return batería;
	}

	public void setBatería(String batería) {
		this.batería = batería;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

}
