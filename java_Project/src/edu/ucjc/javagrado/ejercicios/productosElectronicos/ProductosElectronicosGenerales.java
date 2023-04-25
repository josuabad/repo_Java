package edu.ucjc.javagrado.ejercicios.productosElectronicos;

public abstract class ProductosElectronicosGenerales {

	private String nombre;
	private int precio;
	private int numeroUnidadesDisponibles;
	
	public ProductosElectronicosGenerales(String nombre, int precio, int numeroUnidadesDisponibles) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.numeroUnidadesDisponibles = numeroUnidadesDisponibles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getNumeroUnidadesDisponibles() {
		return numeroUnidadesDisponibles;
	}

	public void setNumeroUnidadesDisponibles(int numeroUnidadesDisponibles) {
		this.numeroUnidadesDisponibles = numeroUnidadesDisponibles;
	}

	public void enceder() {
		System.out.println("Encendiendo " + getNombre());
	}
	
	public void apagar() {
		System.out.println("Apagando " + getNombre());
	}
}
