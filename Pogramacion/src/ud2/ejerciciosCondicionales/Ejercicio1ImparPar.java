package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio1ImparPar {
	//Crea un programa que capture un número por teclado e indique si es par o impar.
	
	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		int numero;
		
		System.out.println("Escribe un numero");
		numero=leer.nextInt();
		leer.close();
		
		if (numero%2==0) {
			System.out.println("El numero " +numero+ " es par");
		} else {
			System.out.println("El numero " +numero+ " es impar");
		}
		

	}
}
