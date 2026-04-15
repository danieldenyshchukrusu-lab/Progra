package ud2.ejerciciosRepetitivas;

import java.util.Scanner;

public class Ejercicio1MultiplosDeN {
//	Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
//	introducimos por teclado.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n=0;
		int cont=0;
		
		System.out.println("Introduce un numero para comprobar cuantos multiplos de 3 tiene");
		n=leer.nextInt();
		leer.close();
		
		for (int i=1;i<=n;i++) { //inicializamos a uno la "i" para que no nos sume 1 de mas al contador
			if (i%3==0) {
				cont=cont+1;
			}
		}
		System.out.println("El numero " +n+ " tiene " +cont+ " multiplos de 3");
	}
}
