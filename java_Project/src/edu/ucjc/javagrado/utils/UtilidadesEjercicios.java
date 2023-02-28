package edu.ucjc.javagrado.utils;

import java.util.Scanner;

public class UtilidadesEjercicios {
	//Variable estatica
	static String variable1; 
	
	/**
	 * Pinta el menu por defecto
	 */
	public static void pintaMenu() {
		String [] menuPorDefecto = {"1. Validar email","2. Pintar Cuadrado",
				"3. Mostrar datos","4. Salir"};
		pintaMenu (menuPorDefecto);
	}
	
	public static void pintaMenu(String menu) {
		pintaMenu(menu.split("\n"));
	}
	
	public static void pintaMenu(String menu, String carcaterSeparador) {
		pintaMenu(menu.split(carcaterSeparador));
	}
	
	public static void pintaMenu(String [] menu) {
		for (String opcion : menu) {
			System.out.println(opcion);
		}
		
	}
	
	
	/**
	 * Método que valida el email pasado como parámetro 
	 * @param email
	 */
	public static void validarEmail(String email) {
		System.out.println(variable1);
		
		String mensajeError = "";

		// email=" bhshsg@xc.vxv.es "
		// Quito espacioes en blanco a izqda y dcha
		email = email.trim();

		// Controlamos el numero de @
		if (email.indexOf("@") == -1) {
			mensajeError += "El email debe tener una @. ";
		} else if (email.indexOf("@") != email.lastIndexOf("@")) {
			mensajeError += "Solo debe de haber una @. ";
		}

		// No puede tener espacios en blanco
		if (email.contains(" ")) {
			mensajeError += "No puede tener espacios en blanco. ";
		}

		// Despues de la @ tiene que haber al menos un punto
		// Primer forma
/*		if (email.lastIndexOf(".") < email.lastIndexOf("@")) {
			mensajeError += "Despues de la @ tiene que haber un punto. ";
		}*/

		// Segunda forma
		int posicionArroba = email.indexOf("@");
		String dominio = email.substring(posicionArroba+1);
		if (email.contains("@") && !dominio.contains(".")) {
			mensajeError += "Despues de la @ tiene que haber un punto. ";
		} else {
			//Miramos la longitud desde el último punto
			int posicionUltimoPunto = dominio.lastIndexOf(".");
			String subdominio = dominio.substring(posicionUltimoPunto + 1);
			if (subdominio.length() < 2 || subdominio.length() > 6) {
				mensajeError += "Despues del último punto no puede "
						+ "haber menos de 2 ni mas de 6 caracteres. ";
			}
		}
		
		
		if (mensajeError.equals("")){
			System.out.println("El email "+email+ " es correcto");
		}else {
			System.out.println("El email "+email+ " no es correcto: "+mensajeError);
		}
	}
	
	
	/**
	 * Método que me solicita un email y me dice si es correcto o no
	 */
	public static void validarEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un email");
		String email = scan.nextLine();

		validarEmail(email);
	}
}
