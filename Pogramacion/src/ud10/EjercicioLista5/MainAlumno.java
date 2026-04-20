package ud10.EjercicioLista5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainAlumno {
	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<>(); 
		
		//Definimos 3 alumnos
		
		Alumno Alumno1 = new Alumno("Daniel",19,7);
		Alumno Alumno2 = new Alumno("ubu1",19,8);
		Alumno Alumno3 = new Alumno("ubu2",19,5);
		
		//Los añadimos al ArrayList
		
		alumnos.add(Alumno1);
		alumnos.add(Alumno2);
		alumnos.add(Alumno3);
		
		//Antes de ordenar
		System.out.println("Antes de ordenar");
		
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
		
		//Después de ordenar
		System.out.println("Despues de ordenar");
		
		Collections.sort(alumnos); //Para poder utilizar el metodo sort, necesitamos el compareTo, si o si, si no.
								   //Si nuestra lista es de alumnos, y queremos ordenarla, si o si tenemos que ponerle implements comparable a la clase Alumno.
		
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
		
	}
}
