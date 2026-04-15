package ud2.matrices.EjercicioRandomArray;

import java.util.Scanner;

public class ArrayEj1 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int array1[]=new int [10];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
		}
		
		for (int i=0;i<array1.length;i++) {
			System.out.println();
		}
	}
}
