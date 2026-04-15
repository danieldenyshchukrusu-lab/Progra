package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray6 {
//	Crea un programa que pida dos valores enteros N y M, luego cree un array de
//	tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n=0;
		int m=0;
		
		System.out.println("Dame un valor para la n");
		n=leer.nextInt();
		System.out.println("Dame un valor para la m");
		m=leer.nextInt();
		
		int array1[]=new int [n];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=m;
			System.out.println(array1[i]);
		}
		leer.close();
		
		
	}
}
