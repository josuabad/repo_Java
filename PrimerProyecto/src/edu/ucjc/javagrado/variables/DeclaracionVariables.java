package edu.ucjc.javagrado.variables;

public class DeclaracionVariables {
	//Variable de instancia o clase
	private static int numero4;
	/**
	 * Comentarios de Javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		//Comentario de línea
		
		/*
		 * Comentario 
		 * de 
		 * bloque
		 */
		
		
		//Tipos de datos
		int numero = 12;
		double numeroDecimal = 7.5;
		
		boolean isMayorEdad = false;
		String nombre = "Jose Luis";
		//Arrays 
		int [] numeros = {1,2,3,4};
		
		System.out.println("Suma: "+ (numero + 9));
		
		String numero2 = "24.5";
		
		//int resultado = numero + Integer.parseInt(numero2);
		double numero3 = Double.parseDouble(numero2);
		System.out.println(numero3);
		
		//Variable de método
		int num;//Declaración
		System.out.println("numero"+numero4);
		
		num = 8;//Incialización
		num = 9;
		
		int num2 = 5;
		
		
		
	}
}






