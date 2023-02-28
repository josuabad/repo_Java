package edu.ucjc.javagrado.poo.encapsulacion;

public class Universidad {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Nombre1","Apellido1",23,"123A");
		//System.out.println(alumno1.);
		System.out.println(alumno1.getNombre());
		alumno1.setNombre("Nombre2");
		System.out.println(alumno1.getNombre());
		
		Asignatura asignatura1 = new Asignatura("Programación", 8);
		
		alumno1.setAsignatura(asignatura1);

		System.out.println(alumno1.getAsignatura().getNota());

	}

}
