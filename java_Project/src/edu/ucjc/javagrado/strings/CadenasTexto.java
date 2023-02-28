package edu.ucjc.javagrado.strings;

import java.lang.reflect.Array;

public class CadenasTexto {

	public static void main(String[] args) {
		
		String nombre = "Nombre1";
		//Un String es inmutable
		nombre = "Nombre2";
		
		nombre.toUpperCase();
		System.out.println(nombre);
		
		System.out.println(nombre.contains("bres"));
		System.out.println(nombre.endsWith("2"));
		
		String valor = "    asas.es.    da.ese    ";
		System.out.println(valor.indexOf("."));
		System.out.println(valor.lastIndexOf("."));
		
		System.out.println("'"+valor.trim()+"'");
		System.out.println("'"+valor.replace(" ","")+"'");
		
		//Accedemos a la posicio +1 del último punto 
		int posicionUltimoPunto = valor.lastIndexOf(".")+1;
		//Obtenemos la subcadena
		String cadena = valor.substring(posicionUltimoPunto);
		//Eliminamos espacios en blanco
		System.out.println(cadena.trim());

		System.out.println(valor.substring(valor.lastIndexOf(".")+1).trim());
		
		//Subcadena con punto de comienzo y punto final
		int posicionPrimerPunto = valor.indexOf(".")+1;
		String cadena2 = valor.substring(posicionPrimerPunto, posicionUltimoPunto-1);
		System.out.println(cadena2.replace(" ",""));
		
		System.out.println("===================");
		String texto = "qwe;asdasd;asdsad;asdsad;asdasd";
		String [] valores = texto.split(";");
		
		System.out.println(texto.split(";")[3]);
		System.out.println(valores[1]);
		
		for (String valorTexto : valores) {
			System.out.println(valorTexto);
		}

		
	}

}



