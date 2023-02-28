package edu.ucjc.javagrado.utils;

public class Test {

	public static void main(String[] args) {
		UtilidadesEjercicios.variable1 = "Hola";
		
		UtilidadesEjercicios ues = new UtilidadesEjercicios();
		ues.variable1 = "Adios";
		
		UtilidadesEjercicios ues2 = new UtilidadesEjercicios();
		System.out.println(ues2.variable1);

	}

}
