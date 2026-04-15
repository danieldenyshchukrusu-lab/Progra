package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio7MenuPrincipalSwitch {
//	Crea un programa en Java que muestre en pantalla un menú con las siguientes
//	opciones:
//	--- MENÚ PRINCIPAL ---
//	1. Iniciar sesión
//	2. Registrarse
//	3. Recuperar contraseña
//	4. Salir
//	El programa debe:
//	• Pedir al usuario que introduzca un número correspondiente a una opción del
//	menú.
//	• Usa un switch para mostrar un mensaje en función de la opción elegida:
//	i. Si elige 1, mostrar: "Has elegido Iniciar sesión".
//	ii. Si elige 2, mostrar: "Has elegido Registrarse".
//	iii. Si elige 3, mostrar: "Has elegido Recuperar contraseña".
//	iv. Si elige 4, mostrar: "Saliendo del programa...".
//	v. Si introduce un número que no está entre 1 y 4, mostrar: "Opción no
//	válida".
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("--- MENÚ PRINCIPAL ---");
		System.out.println("1. Iniciar sesión");
		System.out.println("2. Registrarse");
		System.out.println("3. Recuperar contraseña");
		System.out.println("4. Salir");
		
		System.out.println("Introduce un numero correspondiente a una opción del menu");
		
		int n;
		n=leer.nextInt();
		leer.close();
		switch (n) {
		case 1:
			System.out.println("Has elegido Iniciar sesión");
			break;
		case 2:
			System.out.println("Has elegido registrarte");
			break;
		case 3:
			System.out.println("Has elegido recuperar la contraseña");
			break;
		case 4:
			System.out.println("Saliendo del programa...");
			break;
		case 5:
			System.out.println("Opción no válida");
			break;
		}
	}
}
