package edu.ucjc.javagrado.ejercicios.herencia.maniqui;

public class Ropa {
	private String color;
	private String talla;
	private double precio;

	public Ropa(String color, String talla, double precio) {
		System.out.println("Constructor de Ropa");
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void pintaDatos() {
		System.out.println("Color: "+this.color);
		System.out.println("Talla: "+this.talla);
		System.out.println("Precio: "+this.precio);
		
	}

	@Override
	public String toString() {
		return "Ropa [color=" + color + ", talla=" + talla + ", precio=" + precio + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Color: "+this.color + "\nTalla: "+this.talla + "\nPrecio: "+this.precio;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
