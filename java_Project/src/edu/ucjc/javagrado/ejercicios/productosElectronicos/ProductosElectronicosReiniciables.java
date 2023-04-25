package edu.ucjc.javagrado.ejercicios.productosElectronicos;

public class ProductosElectronicosReiniciables extends ProductosElectronicosGenerales {

	public ProductosElectronicosReiniciables(String nombre, int precio, int numeroUnidadesDisponibles) {
		super(nombre, precio, numeroUnidadesDisponibles);
	}
	
	public void reiniciar() {
		System.out.println("Reiniciando " + getNombre());
	}

}
