package edu.ucjc.javagrado;

import java.util.Scanner;

import edu.ucjc.javagrado.ejercicios.pojos.Persona;
import edu.ucjc.javagrado.utils.UtilidadesEjercicios;

public class Menu {

	public static void main(String[] args) {
		int opcion = 0;
		do {
			String menu = "1. Opcion1\n2. Opcion 2";  
			String [] menu_array = {"1. Opcion1","2. Opcion 2"};
			String menu_carcateres = "1. Opcion1;2. Opcion 2;3. Opcion 3;4. Opcion 4";
			//UtilidadesEjercicios.pintaMenu(menu_array);
			UtilidadesEjercicios.pintaMenu(menu_carcateres,";");

			System.out.println("Selecciona una opcion");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

//			if (opcion==1) {
//				
//			}else if (opcion ==2) {
//				pintaCuadrado();
//			}

			switch (opcion) {
			case 1:
				UtilidadesEjercicios.validarEmail();
				break;
			case 2:
				pintaCuadrado();
				break;
			case 3:
				mostrarDatos();
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (opcion != 4);

	}

	public static void pintaCuadrado() {
		System.out.println("Pintando cuadrado");
		int numLados = 5;
		for (int i = 0; i < numLados; i++) {// Filas
			for (int j = 0; j < numLados; j++) {// Columnas
				if (i == 0 || i == numLados - 1) {// Primera y última fila
					System.out.print("*\t");
				} else {
					if (j == 0 || j == numLados - 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}
			System.out.println();
		}
	}

	// método mostrarDatos()
	// Crear clase Persona (nombre, apellidos,
	// dni (no se modifica), email)
	// 3 objetos de tipo de Persona
	// Metemos los objetos en un array
	// Mostrar los nombres de todas las personas del array
	public static void mostrarDatos() {
		// Defino objetos de tipo persona
		Persona persona1 = new Persona("Persona1", "Apellidos1", "1111A", "asdasd@asdas.es");
		Persona persona2 = new Persona("Persona2", "Apellidos2", "2222B", "asdasd@asdas.es");
		Persona persona3 = new Persona("Persona3", "Apellidos3", "3333C", "asdasd@asdas.es");

		// Array de personas
		Persona[] personas = { persona1, persona2, persona3 };

		// System.out.println(personas[0].getNombre());
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}
	}

	

}
