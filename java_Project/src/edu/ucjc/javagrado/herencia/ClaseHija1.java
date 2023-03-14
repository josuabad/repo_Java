package edu.ucjc.javagrado.herencia;

public class ClaseHija1 extends ClasePadre{

	public ClaseHija1(String atributo1, int atributo2) {
		super(atributo1, atributo2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClaseHija1 [getAtributo1()=" + getAtributo1() + ", getAtributo2()=" + getAtributo2() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	//Sobreescribo metodo1 clase padre
	@Override
	public void metodo1() {
		System.out.println("Metodo1 de la clase hija");
	}
	
}
