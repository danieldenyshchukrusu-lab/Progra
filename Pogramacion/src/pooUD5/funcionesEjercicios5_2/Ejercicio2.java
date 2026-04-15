package pooUD5.funcionesEjercicios5_2;

import java.util.Scanner;

public class Ejercicio2 {
	//Escribe un método sumaArray que tome un array de enteros y devuelva la
	//suma de sus elementos.
	public static int sumaArray(int[] sumaArray) {
		
		int totalSuma=0;
		
		for (int i=0;i<sumaArray.length;i++) {
			totalSuma=totalSuma+sumaArray[i];
		}
		
		return totalSuma;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int[] Array1=new int[5];
		int arraysuma=0;
		int totalSuma=0;
		
		System.out.println("Introduce elementos en el array");
		
		for (int i=0;i<Array1.length;i++) {
			Array1[i]=leer.nextInt();
			
		}
		
		totalSuma=sumaArray(Array1);
			System.out.println("La suma total es " +totalSuma);
	}
}
