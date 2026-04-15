package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio20SolicitaAlturaEscaleraNumeros {
// 	Crea un programa que pinte una escalera de números, siendo cada línea un número:
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int n = 0;
		System.out.println("Introduce un numero para definir la altura de la escalera de numeros");
		n = leer.nextInt();
		leer.close();

		for (int i=0; i<n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i + 1); // Quitamos del print el "ln" para que no pase a la siguiente linea
			}
			System.out.println(i + 1);
		}
		// Ponemos el "+1" al lado del "i" en cada syso porque si no en vez de hacer
		// 1223334444 haria, 0112223333.
		//O simplemente inicializa la i a 1 al principio del primer for.
	}
}
