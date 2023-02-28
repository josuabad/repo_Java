package edu.ucjc.javagrado.poo;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		Cliente c1 = new Cliente();
		c1.nombre = "Juan";
		c1.comprar(5);
		
		System.out.println(c1.nombre);
		Cliente c2 = c1;
		c2.nombre = "Maria";
		
		System.out.println(c1.nombre);
		
		c2 = null;
		//System.out.println(c2.nombre);
		
		System.out.println(c1.apellidos);
		System.out.println(c1.edad);
		
		
		

	}

}
