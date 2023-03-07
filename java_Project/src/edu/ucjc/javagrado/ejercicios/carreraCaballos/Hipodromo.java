package edu.ucjc.javagrado.ejercicios.carreraCaballos;

public class Hipodromo {

	public static void main(String[] args) {
		Hipodromo hipodromo = new Hipodromo();
		hipodromo.arrancaHipodromo (args);
	}
	
	private void arrancaHipodromo (String[] args) {
		Caballo caballo1 = new Caballo("Pitufo",1,40,300,12);
		Caballo caballo2 = new Caballo("Tanos",2,60,250,15);
		Caballo caballo3 = new Caballo("Caballo1",3,70,340,16);
		
		//Defino variables y les doy valorp or defecto
		String nombreCarrera = "Grand Prix";
		int distanciaCarrera = 1000;
		if (args.length>0) {
			nombreCarrera = args[0];
			distanciaCarrera = Integer.parseInt(args[1]);
		}
		Carrera carrera = new Carrera (nombreCarrera,distanciaCarrera);
		
		Caballo [] cajon = new Caballo[3];
		cajon[0]= caballo1;
		cajon[1]= caballo2;
		cajon[2]= caballo3;

		carrera.setCajon(cajon);
				
		Caballo caballo = carrera.iniciarCarrera();
		System.out.println("Ha ganado el caballo " 
				+ caballo.getNombre() 
				+ " con dorsal "+ caballo.getDorsal());
	}

}
