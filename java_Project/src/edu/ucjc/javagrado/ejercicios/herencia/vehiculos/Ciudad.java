package edu.ucjc.javagrado.ejercicios.herencia.vehiculos;

public class Ciudad {

	private String nombre;
	
	public Ciudad(String nombre) {
		super();
		this.setNombre(nombre);
	}

	public static void main(String[] args) {
		Ciudad ciudad1 = new Ciudad("Madrid");
		ciudad1.iniciaCiudad();
		
	}
	
	private void iniciaCiudad() {
		Vehiculo[] vehiculos = UtilsCiudad.generaVehiculos();

		Garaje garaje = new Garaje("Garaje1");
		garaje.aparcar(vehiculos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
