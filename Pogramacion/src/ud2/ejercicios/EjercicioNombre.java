package ud2.ejercicios;

import java.util.Scanner;

public class EjercicioNombre {
	
	public static void main(String[] args) {
		// Declaro objeto de tipo "scanner" para ESCRIBIR POR TECLADO
		Scanner leer =new Scanner(System.in);
		
		// Declaro las variables
		String nombre;
		int edad=0;
		
		// Pedimos los valores por pantalla
		System.out.println("Hola, cual es tu nombre");
		nombre=leer.nextLine();
		System.out.println("¿Y tu edad?");
		edad=leer.nextInt();
		
		/*En el caso de pedir primero la edad y luego el nombree, como lo primero es un nextInt y no un nextLine
		 *no pasa a poder leer el siguiente valor, por lo tanto deberiamos hacer lo siguiente
		 *
		 * System.out.println("¿Y tu edad?");
		 * edad=leer.nextInt();
		 * leer.nextLine();  <-- ESTO DE AQUI
		 * System.out.println("Hola, cual es tu nombre");
		 * nombre=leer.nextLine();
		 */
		
		// Muestro los valores de pantalla y cerramos el scanner
		System.out.println("Hola " +nombre+ " tienes " +edad);
		leer.close();
	}
}
