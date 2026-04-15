package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio5AñoBisiesto {
//	Escribe un programa que lea un año e indique si es bisiesto, teniendo en cuenta
//	que un año es bisiesto si:
//	• es un número divisible por 4 pero no es divisible por 100
//	• si es divisible por 400.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduce un año, comprobaremos si es un año bisiesto");
		n=leer.nextInt();
		leer.close();
		
		if (n%4==0 && n%100!=0 || n%400==0) {
			System.out.println("Este año " +n+ " es bisiesto");
		} else {
			System.out.println("Este año " +n+ " no es bisiesto");
		}
		
	}
}
