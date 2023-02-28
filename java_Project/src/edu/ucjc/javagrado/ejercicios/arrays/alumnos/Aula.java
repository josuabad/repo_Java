package edu.ucjc.javagrado.ejercicios.arrays.alumnos;

public class Aula {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Nombre1", "Apellidos1");
		System.out.println(alumno1.getNombre());

		Asignatura asignatura1 = new Asignatura("Asignatura1", 8.0);
		Asignatura asignatura2 = new Asignatura("Asignatura2", 6.0);
		Asignatura asignatura3 = new Asignatura("Asignatura3", 5.0);

		Asignatura[] asignaturas = { asignatura1, asignatura2 };

		alumno1.setAsignaturas(asignaturas);

		System.out.println(alumno1.getAsignaturas()[1].getNota());

		Asignatura[] asignaturasAlumno1 = alumno1.getAsignaturas();

		//Booleano para saber si encuentro una asignatura
		boolean asignaturaEncontrada = false;
		
		for (Asignatura asignatura : asignaturasAlumno1) {
			if (asignatura.getNombre().equals("Asignatura3")) {
				System.out.println("La nota de la Asignatura1 del alumno "
						+ alumno1.getNombre() + "es "  
							+ asignatura.getNota());
				//Asignatura encontrada, le cambio el valor a true
				asignaturaEncontrada = true;
				break;
			}
			//El else no sirve porque aparece tantas veces como asignaturas tengamos
			/*else {
				System.out.println("El alumno "+ alumno1.getNombre() + 
						" no tiene Asignatura3");
			}*/
		}
		
		//Si no ha encontrado asignatura
		if (!asignaturaEncontrada) {
			System.out.println("El alumno "+ alumno1.getNombre() + 
					" no tiene Asignatura3");
		}
			

	}

}
