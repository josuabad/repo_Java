package edu.ucjc.javagrado.metodosestaticos;

public class PruebaMetodosEstaticos {

	public static void main(String[] args) {
		
		PruebaMetodosEstaticos pme = new PruebaMetodosEstaticos();
		pme.metodo1();
		
		for (String arg : args) {
			System.out.println(arg);
		}

	}

	public void metodo1 () {
		System.out.println("Llamando a metodo 1 no estatico");
		metodo2();
	}
	
	public static void metodo2 () {
		System.out.println("Llamando a metodo 2 estatico");
		Utilidades.metodo3();
		
		//Utilidades.metodo4();
		Utilidades utils = new Utilidades();
		utils.metodo4();
		
		String numero = "4";
		int num = Integer.parseInt(numero);
		Math.random();
		
	}
	
}





