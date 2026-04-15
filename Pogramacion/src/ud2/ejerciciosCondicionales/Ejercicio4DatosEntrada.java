package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio4DatosEntrada {
	/*Crea un programa que lea 3 datos de entrada A, B y C. Estos datos corresponden
	 *a las dimensiones de los lados de un triángulo.
	 *El programa debe determinar qué tipo de triangulo es, teniendo en cuenta los
	 *siguiente:
	 *• Si se cumple Pitágoras entonces es triángulo rectángulo.
	 *• Si sólo dos lados del triángulo son iguales entonces es isósceles.
	 *• Si los 3 lados son iguales entonces es equilátero.
	 *• Si no se cumple ninguna de las condiciones anteriores, es escaleno.
	 */
	
	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Escribeme los valores de un triangulo");
		a=leer.nextInt();
		b=leer.nextInt();
		c=leer.nextInt();
		leer.close();
		
		if ((a^2+b^2)==(c^2)) {
			System.out.println("Es un triangulo rectangulo");
		} else {
			if (a==c && a==b || b==a && b==c || c==a && c==b){ 
				System.out.println("Es un triangulo isósceles");
			} else {
				if (a==b || b==c || c==a){
					System.out.println("Es un triangulo equilátero");
				} else {
						System.out.println("Es un triangulo escaleno");
					
				}
			}
		}
	}
}
