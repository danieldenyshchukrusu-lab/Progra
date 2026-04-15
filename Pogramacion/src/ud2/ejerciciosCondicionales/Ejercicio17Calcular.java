package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio17Calcular {
//	 Introducir un número entero por teclado. El programa debe calcular y mostrar por
//	 pantalla todos los números pares entre el 1 y el número introducido por teclado.
//	 Debe comprobar que el número introducido es mayor que 1, en caso contrario debe
//	 solicitar el nº indefinidamente.
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int n=0;

		System.out.println("Introduce un numero");
		n=leer.nextInt();
		while (n<=1) {
			System.out.println("Vuelve a introducir un numero");
			n=leer.nextInt();
		}
		leer.close();
		
		for (int i=1;i<=n;i=i+1) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
}