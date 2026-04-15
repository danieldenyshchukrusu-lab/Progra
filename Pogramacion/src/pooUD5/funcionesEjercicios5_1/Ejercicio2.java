package pooUD5.funcionesEjercicios5_1;

import java.util.Scanner;

public class Ejercicio2 {
//Escribe un método al que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
	public static int[] numerosComprendidos(int x, int y) {
		int resultado[] = new int[y-x];
		
		for (int i=x;i<=y;i++) {
			System.out.println(i);
		}
		
		return resultado;
		
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int x,y;
		
		 
		System.out.println("Introduce dos numeros enteros y muestra todos los numeros comprendidos entre ellos");
		System.out.println("Introduce el primer número");
		x=leer.nextInt();
		System.out.println("Introduce el segundo número");
		y=leer.nextInt();
		int resultado[] = new int[y-x];
		
		numerosComprendidos(x,y);
	}
}
