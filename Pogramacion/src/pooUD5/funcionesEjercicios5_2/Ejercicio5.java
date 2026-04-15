package pooUD5.funcionesEjercicios5_2;

import java.util.Scanner;

public class Ejercicio5 {
	//Escribe un método esPerfecto que determine si un número es perfecto (es
	//decir, la suma de sus divisores propios es igual al número).
	
	public static boolean númeroPerfecto (int n) {
		int sumaDivisores=0;
		boolean nPerfecto=false;
		
		for (int i=1;i<n;i++) {
			if (n%i==0) {
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
