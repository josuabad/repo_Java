package edu.ucjc.javagrado.ejercicios.bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe numero de elementos:");
		int numerosSerie = scan.nextInt();
		int num1 = 0, num2 = 1;
		System.out.print(num1);
		System.out.print(","+num2);
		
		for (int i =0; i < numerosSerie-2; i++) {
			// primero sumamos
			int suma = num1 + num2;
			// muestro la suma
			System.out.print(","+suma);
			// Despues, cambiamos la segunda variable por la primera
			num1 = num2;
			// Por ultimo, cambiamos la suma por la segunda variable
			num2 = suma;

		}

	}

}
