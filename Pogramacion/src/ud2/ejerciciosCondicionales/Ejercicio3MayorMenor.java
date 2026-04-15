package ud2.ejerciciosCondicionales;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3MayorMenor {
	/*Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’.
	*Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 mostrará
	*"ACEPTADA" si el género es "F" o "ACEPTADO" si el género es "M", si no se
	*cumplen estas condiciones, se mostrará "NO ACEPTADO/A".
	*/
	public static void main(String[] args) throws IOException {
		Scanner leer =new Scanner(System.in);
		char genero;
		int edad;
		int nota;
		
		System.out.println("¿Cual es tu edad?");
		edad=leer.nextInt();
		System.out.println("¿Cual es tu nota?");
		nota=leer.nextInt();
		leer.nextLine();
		System.out.println("¿Cual es tu género? (F O M)");
		genero=(char)System.in.read();
		leer.close();
		
		if (nota>=5&&edad>=18) {
				if (genero=='F') {
					System.out.println("ACEPTADA");
				} else if (genero=='M') {
					System.out.println("ACEPTADO");
				}
		} else {
			System.out.println("NO ACEPTADO/A");
		}
	}
}
