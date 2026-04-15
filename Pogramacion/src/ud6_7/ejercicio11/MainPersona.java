package ud6_7.ejercicio11;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		Persona per1=new Persona();
		Persona per2=new Persona();
		Persona per3=new Persona("06690345J","Daniel","Denyshchuk",18);
		
		System.out.println("Dime dni");
		per1.dni=leer.nextLine();
		System.out.println("Dime nombre");
		per1.nombre=leer.nextLine();
		System.out.println("Dime apellidos");
		per1.apellidos=leer.nextLine();
		System.out.println("Dime edad");
		per1.edad=leer.nextInt();
		leer.nextLine();
		
		System.out.println("Persona 1: "+per1.nombre+ " " +per1.apellidos+ " " +per1.dni+ " " +per1.edad);
		
		System.out.println("Dime dni");
		per2.dni=leer.nextLine();
		System.out.println("Dime nombre");
		per2.nombre=leer.nextLine();
		System.out.println("Dime apellidos");
		per2.apellidos=leer.nextLine();
		System.out.println("Dime edad");
		per2.edad=leer.nextInt();
		leer.nextLine();
		
		System.out.println("Persona 2: "+per2.nombre+ " " +per2.apellidos+ " " +per2.dni+ " " +per2.edad);
	}
}
