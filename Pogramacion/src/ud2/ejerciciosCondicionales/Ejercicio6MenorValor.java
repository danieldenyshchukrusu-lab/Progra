package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio6MenorValor {
//	Crea un programa que determine el menor valor de 5 números introducidos por
//	teclado. Considera que el menor valor puede repetirse.
//	Por ejemplo: Si los números introducidos fueran. 14, 19, 14, 16 y 15. El menor valor
//	introducido es 14.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n;
		int menor;
		System.out.println("Escribe un numero para detrminar cual es menor");
		n=leer.nextInt();
		menor=n; //Cuidado de la forma en la que ordenas tu programa, "menor=n" no es lo mismo que "n=menor".
		
		System.out.println("Escribe 5 numeros y determinaremos cual es el menor");
			for (int i=0;i<=4;i++) {
				n=leer.nextInt();
				if (n<=menor) {
					menor=n;
				}
			}
		leer.close();
		System.out.println("El numero menor es " +menor);
	}
} 
