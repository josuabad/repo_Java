package edu.ucjc.javagrado.arrays;

//Array con datos conocidos
public class PruebaArrays {

	public static void main(String[] args) {
		
		//Arrays, matrices o arreglos
		String [] colores = {"Blanco","Azul","Rojo"};
		//System.out.println(colores[2]);
		
		for ( int i=0 ; i<colores.length ; i++) {
			System.out.println(colores[i]);
		}
		
		System.out.println("===========================");
		
		for (  String color  : colores ) {
			System.out.println(color);
		}
		
		for (String string : colores) {
			
		}
	}

}





