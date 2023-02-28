package edu.ucjc.javagrado.arrays;

import java.util.Scanner;

public class ArraysDatosDesconocidos {

	public static void main(String[] args) {
		
		int [][] numeros = new int [2][3];
		
		numeros[0][1]= 19;
		
		//Preguntamos y guardamos datos
		for (int i=0; i<numeros.length;i++) {
			for (int j=0; j<numeros[i].length;j++) {
				System.out.println(""
						+ "Introduce el elemento["+i+"],["+j+"]");
				Scanner scan = new Scanner(System.in);
				numeros[i][j]=scan.nextInt();
			}
		}
		
		//Mostramos todos los datos de la matriz
		for (int i=0; i<numeros.length;i++) {
			for (int j=0; j<numeros[i].length;j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}

	}

}
