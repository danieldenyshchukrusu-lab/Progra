package ud9.ejerciciosUD9I;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
//		Implementa un programa que cree un vector tipo double de tamaño 5 y luego,
//		utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.
//		Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores
//		hasta rellenar completamente el vector.
		
		double array1[] = new double[5];
		
		for (int i=0;i<=5;i++) {
			System.out.println("Introduce unn valor");
			array1[i]=leer.nextDouble();
		}
	}
}
