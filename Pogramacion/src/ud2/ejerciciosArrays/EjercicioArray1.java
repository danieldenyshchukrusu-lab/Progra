package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray1 {
//	Crea un programa que pida diez números reales por teclado, los almacene en
//	un array, y luego muestre todos sus valores.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int array1[]=new int [10];
		
		System.out.println("Introduce 10 numeros al array");
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
		}
		leer.close();
		
		for (int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
	}
}