package edu.ucjc.javagrado.bucles;

public class BucleFor {

	public static void main(String[] args) {
		//Bucle for
		for (int i=0 ; i<10 ; i+=3 ) {
			if (i%2==0 && i<8) {
				continue;
			}else if (i%3==0) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("FIN");

		//Bucle foreach
		
	}

}
