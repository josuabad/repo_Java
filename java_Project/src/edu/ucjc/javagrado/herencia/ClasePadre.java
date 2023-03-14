package edu.ucjc.javagrado.herencia;

public class ClasePadre {
	private String atributo1;
	private int atributo2;
	
	
	
	public ClasePadre(String atributo1, int atributo2) {
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}
	
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public int getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}
	
	
	public void metodo1 () {
		System.out.println("Metodo1 de la clase padre");
	}
	
	public void metodo2 () {
		metodo1();
		System.out.println("Metodo2 de la clase padre");
	}
	
	
}
