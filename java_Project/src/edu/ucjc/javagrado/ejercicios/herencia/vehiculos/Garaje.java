package edu.ucjc.javagrado.ejercicios.herencia.vehiculos;

public class Garaje {
	
	private String nombre;
	private Coche [] plazasCoches;
	private Moto [] plazasMotos;
	private Bicicleta [] plazasBicis;
	
	public Garaje(String nombre) {
		super();
		this.nombre = nombre;
		plazasCoches = new Coche[2];
		plazasMotos = new Moto[2];
		plazasBicis = new Bicicleta[2];
	}
	
	public Garaje(String nombre, int numPlazasCoche, int numPlazasMoto,
			int numPlazasBicis) {
		super();
		this.nombre = nombre;
		plazasCoches = new Coche[numPlazasCoche];
		plazasMotos = new Moto[numPlazasMoto];
		plazasBicis = new Bicicleta[numPlazasBicis];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void aparcar(Vehiculo [] vehiculos) {
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof VehiculosMotorizados) {
				VehiculosMotorizados vm = (VehiculosMotorizados)vehiculo;
				System.out.println("Aparcando vehiculo con matricula "+vm.getMatricula());
			}else {
				Bicicleta bici = (Bicicleta)vehiculo;
				System.out.println("Aparcando bici"+bici.getMarca());
				boolean hayPlazasLibres=false;
				
				for (int i = 0; i < plazasBicis.length; i++) {
					if (plazasBicis[i]==null) {
						plazasBicis[i]=bici;
						System.out.println("Aparcada la bici "+bici.getMarca() + 
								"con "+bici.getNumMarchas() + " marchas ");
						hayPlazasLibres=true;
					}
				}
				if(!hayPlazasLibres) {
					System.out.println("No hay plazas libres para la bici" +bici.getMarca() 
							 + "con "+bici.getNumMarchas() + " marchas ");
				}
			}
		}
		
	}
	
}
