package ud6_7.FICHA4;

import java.util.Scanner;

public class MainEstudiante {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String nombre, curso;
		int edad=0;
		int IDestudiante=0;
		
		Estudiante estudiante2=new Estudiante("Ana",7,"2ºA");
		Estudiante estudiante3=new Estudiante();
		
		//Crea varios estudiantes usando ambos constructores.
		
		System.out.println("Introduce tu nombre");
		nombre=leer.nextLine();
		System.out.println("Introduce tu curso");
		curso=leer.nextLine();
		System.out.println("Introduce tu edad");
		edad=leer.nextInt();
		leer.nextLine();

		
		Estudiante estudiante1=new Estudiante(nombre,curso,edad);
		
		estudiante3.setNombre("Daniel");
		estudiante3.setCurso("3ºA");
		estudiante3.setEdad(8);

	
		//Muestra la información de cada estudiante
		
		System.out.println(estudiante1.mostrarInformacion());
		System.out.println(estudiante2.mostrarInformacion());
		System.out.println(estudiante3.mostrarInformacion());
		System.out.println(" ");
		//Modifica algún dato mediante los métodos adecuados.
		
		System.out.println("Modificaremos los datos del estudiante 3, y le sumaremos un año");
		estudiante3.cumplirAnios();
		
		System.out.println(estudiante3.mostrarInformacion());
		System.out.println(" ");
		
		//Muestra el total de estudiantes registrados.
		
		System.out.println("El total de estudiantes registrados es: " +Estudiante.getTotalEstudiantes());
		
		// ME HACE FALTA COMPROBAR LA EDAD DE LOS ESTUDIANTES
	}
}
