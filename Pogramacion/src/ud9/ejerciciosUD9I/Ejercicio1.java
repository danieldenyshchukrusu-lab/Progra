package ud9.ejerciciosUD9I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
//		Implementa un programa que pida al usuario un valor entero A utilizando un
//		nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor
//		introducido: …”. Se deberá tratar la excepción InputMismatchException que
//		lanza nextInt() cuando no se introduce un entero válido. En tal caso se mostrará
//		el mensaje “Valor introducido incorrecto”.
		
		int a=0;
		try {	//Try: aqui dentro pondremos el codigo que nos podria dar error
		System.out.println("Introduce un numero entero");
		a=leer.nextInt();
		System.out.println(a);
		} catch (InputMismatchException a1) {	//Catch: el bloque donde controlaremos ESE error, que podria pasar en el Try.
			System.out.println("Valor introducido incorrecto");
		}
		leer.close();
	}
}