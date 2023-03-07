package edu.ucjc.javagrado.ejercicios.carreraCaballos;

public class Carrera {
	private String nombre;
	private int distancia;
	private Caballo[] cajon;

	public Carrera(String nombre, int distancia, Caballo[] cajon) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.cajon = cajon;
	}

	public Carrera(String nombre, int distancia) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caballo[] getCajon() {
		return cajon;
	}

	public void setCajon(Caballo[] cajon) {
		this.cajon = cajon;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public Caballo iniciarCarrera() {
		System.out.println("Iniciando la carrera " + this.getNombre() 
			+" con una distancia de "+this.distancia +" metros");
		boolean hayCaballoGanador = false;
		Caballo caballoGanador = null;
		
		while (!hayCaballoGanador) {
			for (Caballo caballo : this.cajon) {
				caballo.correr();
				//Si el avance que lleva el caballo es mayor 
				//que la distancia de la carrera habrá ganado 
				if (caballo.getAvance() >= this.distancia) {
					hayCaballoGanador = true;
					caballoGanador = caballo;
					//System.out.println("Ha ganado el caballo " 
					//+ caballo.getNombre() + " con dorsal "+ caballo.getDorsal());
					break;
				}
			}
		}

		return caballoGanador;
	}

}
