package edu.ucjc.javagrado.ejercicios.herencia.vehiculos;

public class UtilsCiudad {
	
	public static Vehiculo[] generaVehiculos() {
		Coche coche1 = new Coche("marca1","modelo",2018,"1234-HJD",5,"Gasolina");
		Coche coche2 = new Coche("marca2","modelo2",2021,"4567-HJD",5,"Diesel");
		Coche coche3 = new CocheElectrico("marca3", "modelo3", 2022, "8892-HJD", 4, "Hibrido", 90);
		
		Moto moto1 = new Moto("marca1","modelo",2018,"1234-HJD",1500);
		Moto moto2 = new SideCar("marca1","modelo",2018,"1234-HJD",90);
		
		Bicicleta bici1 = new Bicicleta("marcaBici1","modeloBici1",2020);
		Bicicleta bici2 = new Bicicleta("marcaBici2","modeloBici2",2022);
		
		Vehiculo[] vehiculos = {coche1, coche2,coche3,moto1,moto2,bici1,bici2};
		
		return vehiculos;
	}
}
