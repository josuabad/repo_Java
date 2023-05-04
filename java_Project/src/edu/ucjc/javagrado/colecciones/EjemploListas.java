package edu.ucjc.javagrado.colecciones;

import java.util.ArrayList;
import java.util.List;

import edu.ucjc.javagrado.ejercicios.herencia.zoologico.Elefante;

public class EjemploListas {
	
	public static void main(String[] args) {
		
		List<String> colores = new ArrayList<String>();
		Elefante elefante = new Elefante("E1", "Asiatico", 2);
		
		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Amarillo");
		//colores.add(2);
		//colores.add(elefante);
		
		for (String color : colores) {
			System.out.println(color);
		}
		
		colores.add(1, "Verde");
		
		System.out.println(colores.get(2));
		
		for (String color : colores) {
			System.out.println(color);
		}
		
	}
	
}
