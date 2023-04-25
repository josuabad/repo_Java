package edu.ucjc.javagrado.ejercicios.productosElectronicos;

public class Cliente {

	public static void main(String[] args) {
		// Creacion de los productos
		ProductosElectronicosGenerales[] carritoCompra = new ProductosElectronicosGenerales[6];
		// Precio de la compra
		System.out.println(descuentos(carritoCompra));
	}
	
	public static double descuentos(ProductosElectronicosGenerales[] productos) {
		// Numero de unidades
		int numTelefonos = 0;
		int numTelevisores = 0;
		int numPortatiles = 0;
		// Precio de las unidades
		int precioTelefonos = 0;
		int precioTelevisores = 0;
		int precioPortatiles = 0;
		for (ProductosElectronicosGenerales compra : productos) {
			if (compra instanceof TelefonosMoviles) {
				numTelefonos++;
			} else if (compra instanceof Televisores) {
				numTelevisores++;
			} else {
				numPortatiles++;
			}
			if (precioTelefonos == 0) {
				precioTelefonos = compra.getPrecio();
				precioTelevisores = compra.getPrecio();
				precioPortatiles = compra.getPrecio();
			}
		}
		// Numero de desuentos por unidad
		int descuentoTelefonos = numTelefonos / 2;
		int descuentoTelevisores = numTelevisores / 2;
		int descuentosPortatiles = numPortatiles / 2;
		// Precio compra
		return (numTelefonos * precioTelefonos * (Math.pow(0.95, descuentoTelefonos))) + (numTelevisores * precioTelevisores * (Math.pow(0.90, descuentoTelevisores))) + (numPortatiles * precioPortatiles * (Math.pow(0.85, descuentosPortatiles)));
	}

}