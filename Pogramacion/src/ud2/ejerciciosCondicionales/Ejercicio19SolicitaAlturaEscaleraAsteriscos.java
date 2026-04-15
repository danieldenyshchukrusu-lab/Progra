package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio19SolicitaAlturaEscaleraAsteriscos {
//	Crea un programa que solicite la altura de una escalera N por teclado y muestre una escalera de asteriscos de este tipo
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n=0;
		System.out.println("Introduce un numero para la altura de la escalera de asteriscos");
		n=leer.nextInt();		
		leer.close();
		
		for (int i=0; i<n ;i++) {
			for (int j=1; j<=i ;j++ ) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
