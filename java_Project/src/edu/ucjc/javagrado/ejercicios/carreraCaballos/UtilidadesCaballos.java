package edu.ucjc.javagrado.ejercicios.carreraCaballos;

public class UtilidadesCaballos {
	
	public static double calcularAvance (Caballo caballo) {
		return calcularAvance(caballo.getVelocidad(), 
				caballo.getEdad(), caballo.getPeso());
	}
	
	public static double calcularAvance (double velocidad, int edad, double peso) {
		double avance = (Math.random()*100) + velocidad  
			- (edad*0.5) - (peso*0.1);
				
		return avance;
	}

}
