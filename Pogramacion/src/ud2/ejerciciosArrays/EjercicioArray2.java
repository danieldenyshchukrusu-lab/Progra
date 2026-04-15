package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray2 {
//	Crea un programa que pida diez números reales por teclado, los almacene en
//	un array, y luego muestre la suma de todos los valores.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int sumaTotal=0;
		int array1[]=new int[10];
		
		System.out.println("Introduce 10 numeros al array");
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
			sumaTotal=sumaTotal+array1[i];
		}
		leer.close();
		
		for (int i=0;i<array1.length;i++) {
		System.out.println(array1[i]);
		}
		System.out.println("Esta es la suma total: " +sumaTotal);
	}
}
