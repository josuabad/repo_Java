package edu.ucjc.javagrado.ejercicios.herencia.zoologico;

public class Zoologico {

	private static final double SUPERFICIE=123.5;
	
	public static void main(String[] args) {
		
		System.out.println(SUPERFICIE);
		
		Elefante elefante = new Elefante("Elefante1","Asiatico",2);
		elefante.programarJava();
		
		Animal elefante2 = new Elefante("Elefante2","Asiatico",1.5);
		elefante2.desplazar();
		//elefante2.programarJava();
		//Animal a = new Animal("","");
		
		Animal vaca1 = new Vaca("Vaca1","Lechera",2);
		
		
		if (elefante2 instanceof Elefante) {
			//Hago Casting
			Elefante elefante3 = (Elefante)elefante2;
			elefante3.programarJava();
		}
		
		System.out.println("Fin");
		
		Serpiente serpiente1 = new Serpiente("Serpiente","Vibora",3);
		
		Animal [] animales = {elefante,vaca1, serpiente1};
		
		Zoologico zoo = new Zoologico();
		zoo.alimentarAnimales(animales);
	}
	
	
	public void alimentarAnimales (Animal [] animales) {
		
		for (Animal animal : animales) {
			animal.comer();
			if (animal instanceof Elefante) {
				Elefante elefante = (Elefante)animal;
				elefante.programarJava();
			}
		}
		
	}

}
