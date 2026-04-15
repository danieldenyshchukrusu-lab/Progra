package ud9.ejerciciosUD9I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
//		Implementa un programa que pida dos valores int A y B utilizando un nextInt()
//		(de Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán tratar
//		de forma independiente las dos posibles excepciones,
//		InputMismatchException y ArithmeticException, mostrando en cada caso un
//		mensaje de error diferente en cada caso.
		
		int resultado=0;
		int a;
		int b;
		
		try {
			System.out.println("Introduce dos numeros para calcular su division");
			a=leer.nextInt();
			b=leer.nextInt();
			resultado=a/b;
			System.out.println("Resultado: " + resultado);
			} catch (InputMismatchException a1) {	
				System.out.println("Valor introducido incorrecto");
			} catch (ArithmeticException b1 ){
				System.out.println("Los numeros no son divisibles entre ellos");
			} finally {
				leer.close();
			}
	}
}
