package edu.ucjc.javagrado.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		
		int num1=9;
		int num2=8;
		boolean condicion = num1>num2 || num1<0;
		//If
		if (condicion) {
			System.out.println("Num1 es mayor que num2");
		}else if (num1<0) {
			System.out.println("Num1 es menor que 0");
		}else {
			System.out.println("No se cumple ninguna condicion");
		}
				
		//Switch
		String letra ="N";
		switch (letra) {
			
			case "A": System.out.println("El valor es A");break;
			case "E": System.out.println("El valor es E");break;
			case "I": System.out.println("El valor es I");break;
			case "O": System.out.println("El valor es O");break;
			case "U": System.out.println("El valor es U");break;
			default: System.out.println("Es una consonante");
		}
		

	}

}
