package pooUD5.funcionesEjercicios5_2;

import java.util.Scanner;

public class Ejercicio6 {
	//Crea un programa que almacene 10 valores en un array y después, usando
	//el método anterior, nos muestre aquellos que son perfectos.
	
	public static boolean númeroPerfecto (int[] Array1) {
		int sumaDivisores=0;
		boolean nPerfecto=false;
		
		for (int i=1;i<Array1.length;i++) {
			if (Array1[i]%i==0) {
				sumaDivisores=sumaDivisores+i;
			}
 		}
		if (sumaDivisores==n) {
			nPerfecto=true;
		} 
		
		return nPerfecto;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n=0;
		
		System.out.println("Escribe un numero y veremos si es perfecto o no");
		n=leer.nextInt();
		
		if (númeroPerfecto(n)==true) {
			System.out.println("El numero " +n+ " es perfecto");
		} else {
			System.out.println("El numero " +n+ " NO es perfecto");
		}
	}
	}
}
