package edu.ucjc.javagrado.ejercicios.herencia.maniqui;

public class Tienda {
	
	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		Tienda tienda = new Tienda("tienda1");
		tienda.abrirTienda();
	}
	
	public void abrirTienda () {
		System.out.println("Se esta abriendo la tienda "+this.nombre);
		
		Boton[] botones = stockBotones();
		
		Pantalon pantalon = new Pantalon("Vaquero","L",30, botones[0]);
		System.out.println("===== Datos pantalon ======");
		pantalon.pintaDatos();
		System.out.println(pantalon);
		System.out.println("==============");
		
		System.out.println(pantalon.getBoton().getColor());
		botones[0] = null;
		
		Camisa camisa1 = new Camisa("Blanco","L",40);
		camisa1.setBotones(getBotones(botones));
		System.out.println("===== Datos Camisa ======");
		camisa1.pintaDatos();
		System.out.println("==============");
		Vestido vestido = new Vestido ("Verde","M",50);
		
		Maniqui maniqui = new Maniqui(1);
		maniqui.vestir(vestido);
		maniqui.vestir(camisa1,pantalon);
		
		if (maniqui.getVestido()!=null) {
			System.out.println(maniqui.getVestido().getPrecio());
		}
		Maniqui maniqui2 = new Maniqui(2,vestido);
		
		Maniqui[] maniquisTienda = {maniqui,maniqui2};
		precioManiquis(maniquisTienda);
	}
	
	private void precioManiquis(Maniqui[] maniquis) {
		
		for (Maniqui maniqui : maniquis) {
			double precio = 0;
			if (maniqui.getCamisa()!=null) {
				precio += maniqui.getCamisa().getPrecio();
			}
			if (maniqui.getPantalon()!=null) {
				precio += maniqui.getPantalon().getPrecio();
			}
			if (maniqui.getVestido()!=null) {
				precio += maniqui.getVestido().getPrecio();
			}
			System.out.println("Precio de la ropa del maniqui"
					+ maniqui.getId() + " es "+precio);
		}
		
	}
	
	
	private Boton[] getBotones(Boton[] botones) {
		int numBotones = 0;
		//Cuento el numero de botones que quedan
		for (Boton boton : botones) {
			if (boton!=null) {
				numBotones++;
			}
		}
		
		Boton[] botonesExistentes = new Boton[numBotones];
		int i=0;
		for (Boton boton : botones) {
			if (boton!=null) {
				botonesExistentes[i]= boton;
				i++;
			}
		}
		
		return botonesExistentes;
	}
	

	private Boton[] stockBotones() {
		Boton boton1 = new Boton("Blanco1","Redondo","Peqeño");
		Boton boton2 = new Boton("Blanco2","Redondo","Peqeño");
		Boton boton3 = new Boton("Blanco3","Redondo","Peqeño");
		Boton boton4 = new Boton("Blanco4","Redondo","Peqeño");
		Boton boton5 = new Boton("Blanco5","Redondo","Peqeño");
		
		Boton[] botones = {boton1,boton2,boton3,boton4,boton5};
		
		return botones;
	}
	
	
}
