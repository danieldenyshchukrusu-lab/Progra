package pooUD5.funcionesEjemplo;

import java.util.Scanner;

public class Ejemplo4 {
	//Método que nos devuelva cuál es el máximo de tres valores pasados.
	public static int máximo(int a, int b, int c) {
		int resultado = 0;
		
		if (a>b && a>c) {
			resultado=a;
		} else if (b>a && b>c) {
			resultado=b;
		} else if (c>a && c>b) {
			resultado=c;
		} 
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros y te diremos cual es el mayor");
		int x;
		int y;
		int z;
		int resultado;
		
		System.out.println("Primer numero");
		x=leer.nextInt();
		System.out.println("Segundo numero");
		y=leer.nextInt();
		System.out.println("Tercer numero");
		z=leer.nextInt();
		
		resultado=máximo(x,y,z);
		System.out.println("El mayor de estos 3 numeros es " + resultado);
	}
}
