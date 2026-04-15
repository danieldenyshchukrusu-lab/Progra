package pooUD5.funcionesEjercicios5_1;

import java.util.Scanner;

public class Ejercicio9 {
	//Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
	//des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
	//y utiliza las funciones:
	public static int suma1aN(int n) {
		int resultado1=0;
		int sumatorio=0;
		
		for (int i=1;i<=n;i++) {
			sumatorio=sumatorio+i;
		}
		
		resultado1=sumatorio;
		return resultado1;
	}
	
	public static int producto1aN(int n) {
		int resultado2=0;
		int productorio=1;
		
		for (int i=1;i<=n;i++) {
			productorio=productorio*i;
		}
		
		resultado2=productorio;
		return resultado2;
	}
	
	public static double intermedio1aN(int n) {
		double resultado3=0;
		double intermedio=0;
		
		if (n%2!=0) {
			intermedio=(n/2)+.5;
		} else {
			intermedio=(n/2);
		}
		
		resultado3=intermedio;
		return resultado3;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int resultado1=0;
		int resultado2=0;
		double resultado3=0;
		int n=0;
		
		System.out.println("Escribe un numero");
		n=leer.nextInt();
		resultado1 = suma1aN(n);
		resultado2 = producto1aN(n);
		resultado3 = intermedio1aN(n);
		System.out.println("El sumatorio de " +n+ " es: " +resultado1);
		System.out.println("El productorio de " +n+ " es: " +resultado2);
		System.out.println("El intermedio de " +n+ " es: " +resultado3);
	}
}
