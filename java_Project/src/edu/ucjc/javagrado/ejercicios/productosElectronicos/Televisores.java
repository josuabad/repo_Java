package edu.ucjc.javagrado.ejercicios.productosElectronicos;

public class Televisores extends ProductosElectronicosGenerales {

	private String marca;
	private String modelo;
	private String tamanoPantalla;
	private String resolucion;
	
	public Televisores(String nombre, int precio, int numeroUnidadesDisponibles, String marca, String modelo,
			String tamanoPantalla, String resolucion) {
		super(nombre, precio, numeroUnidadesDisponibles);
		this.marca = marca;
		this.modelo = modelo;
		this.tamanoPantalla = tamanoPantalla;
		this.resolucion = resolucion;
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

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

}
