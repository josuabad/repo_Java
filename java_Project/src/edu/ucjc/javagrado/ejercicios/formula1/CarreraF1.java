package edu.ucjc.javagrado.ejercicios.formula1;

import java.util.Arrays;
import java.util.List;

public class CarreraF1 {

	public static void main(String[] args) {
		List<String> patrocinadores1 = Arrays.asList("RedBull", "Rolex");
		CocheF1 coche1 = new CocheF1(1, "Josu", "Ferrari", patrocinadores1);
		List<String> patrocinadores2 = Arrays.asList("UCJC", "McAfee");
		CocheF1 coche2 = new CocheF1(2, "Matias", "AMG", patrocinadores2);
		List<String> patrocinadores3 = Arrays.asList("Rolex", "UCJC");
		CocheF1 coche3 = new CocheF1(3, "Jesus", "Aston Martin", patrocinadores3);
		
		CocheF1[] f1 = {coche1, coche2, coche3};
		
		CarreraF1 carrera = new CarreraF1();
		carrera.informacion(f1);
		
	}
	
	private void informacion(CocheF1[] coches) {
		for (CocheF1 cocheF1 : coches) {
			System.out.println(cocheF1.toString());
			cocheF1.correr();
			System.out.println();
		}
	}
}
