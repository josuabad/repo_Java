package edu.ucjc.javagrado.ejercicios.condicionales;

import java.util.Scanner;

/*
 * Ejercicio1. Declarar variable de tipo String para almacenar 
 * el nombre de un mes. Dependiendo del mes establecer la estación. 
 */
public class EjercicioCondicionales {

	public static void main(String[] args) {
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del mes");
		mes = scan.nextLine();
		System.out.println(mes);
		
		//Usando if
		String estacion = "a";
		if (mes.equalsIgnoreCase("Enero") 
				|| mes.equalsIgnoreCase("Febrero") 
				|| mes.equalsIgnoreCase("Marzo")) {
			estacion = "Invierno";
		}else if (mes.equalsIgnoreCase("Abril") 
				|| mes.equalsIgnoreCase("Mayo") 
				|| mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";
		}else if (mes.equalsIgnoreCase("Julio") 
				|| mes.equalsIgnoreCase("Agosto") 
				|| mes.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
		}else if (mes.equalsIgnoreCase("Octubre") 
				|| mes.equalsIgnoreCase("Noviembre") 
				|| mes.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}else {
			estacion = "te has equivocado";
		}
		
		System.out.println("Estación: "+ estacion);
		
		
		//Usando switch
		switch(mes.toLowerCase()) {
			case "enero":
			case "febrero":
			case "marzo":System.out.println("Invierno");break;
			case "abril":
			case "mayo":
			case "junio":System.out.println("Primavera");break;
			case "julio":
			case "agosto":
			case "septiembre":System.out.println("Verano");break;
			case "octubre":
			case "noviembre":
			case "diciembre":System.out.println("Otoño");break;
			default:System.out.println("Te has equivocado");
		}
		
		
		

	}

}






