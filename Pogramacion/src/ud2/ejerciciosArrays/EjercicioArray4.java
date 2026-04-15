package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray4 {
//	||Crea un programa que pida veinte números enteros por teclado, los almacene
//	en un array y|| luego muestre por separado la suma de todos los valores positivos
//	y negativos.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int array1[]=new int[20];
		
		System.out.println("Introduce 20 numeros al array");
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
		}
		
		int SumaNegativos=0;
		int SumaPositivos=0;
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i]<0) {
				SumaNegativos=SumaNegativos+array1[i];
			} else if (array1[i]>0) {
				SumaPositivos=SumaPositivos+array1[i];
			}
		}
		leer.close();
		
		System.out.println("La suma de los valores negativos son: " +SumaNegativos);
		System.out.println("La suma de los valores positivos son: " +SumaPositivos);
	}
}
