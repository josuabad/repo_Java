package edu.ucjc.javagrado.ejercicios.arrays.alumnos;

public class AulaNotaMedia {

	public static void main(String[] args) {
		//Creo Alumno1
		Alumno alumno1 = new Alumno("Nombre1", "Apellidos1");

		Asignatura asignatura1 = new Asignatura("Asignatura1", 8.0);
		Asignatura asignatura2 = new Asignatura("Asignatura2", 6.0);
		Asignatura[] asignaturas = { asignatura1, asignatura2 };

		alumno1.setAsignaturas(asignaturas);
		
		//Creo Alumno2
		Asignatura asignatura3 = new Asignatura("Asignatura3", 5.0);
		Asignatura asignatura4 = new Asignatura("Asignatura4", 7.5);
		Asignatura[] asignaturasAlumno2 = { asignatura3, asignatura4 };
		Alumno alumno2 = new Alumno("Nombre2", "Apellidos2",asignaturasAlumno2);
		
		//Creo Alumno3
		Asignatura asignatura5 = new Asignatura("Asignatura5", 9.0);
		Asignatura asignatura6 = new Asignatura("Asignatura6", 4.5);
		Asignatura[] asignaturasAlumno3 = { asignatura5, asignatura6 };
		Alumno alumno3 = new Alumno("Nombre3", "Apellidos3",asignaturasAlumno3);
				
		//Almaceno todos los alumnos para recorrerlos
		Alumno[] aula = {alumno1,alumno2,alumno3};
		
		//Inicializo variable para guardar la nota más alta
		double notaMasAlta = 0;
		String nombreAlumnoNotaMasAlta = "";
		Alumno alumnoNotaMasAlta = null;
		for (Alumno alumno : aula) {
			//Cojo todas las asignaturas del alumno
			Asignatura [] asignaturasAlumno = alumno.getAsignaturas();
			//Recorro las asignaturas
			double notasAlumno = 0;
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumno+=asignatura.getNota();
			}
			double notaMedia = notasAlumno/asignaturasAlumno.length;
			System.out.println("Nota media del alumno "
					+alumno.getNombre() + " es "+ notaMedia);
			
			if (notaMedia>notaMasAlta) {
				notaMasAlta = notaMedia;
				nombreAlumnoNotaMasAlta = alumno.getNombre();
				alumnoNotaMasAlta = alumno;
			}
			
		}
		System.out.println("La nota media más alta es "+notaMasAlta +
				" del alumno "+ alumnoNotaMasAlta.getNombre());

	}

}
