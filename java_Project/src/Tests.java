
public class Tests {

	public static void main(String[] args) {
		String valor1 = "Hola";
		String valor2 = "Hola";
		String valor3 = new String("Hola");
		
		System.out.println(valor1==valor2);
		System.out.println(valor1.equals(valor2));
		System.out.println(valor1==valor3);
		
		System.out.println(valor1.equals(valor3));

	}

}
