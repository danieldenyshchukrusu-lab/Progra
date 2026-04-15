package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray9 {
//	Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
//	valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
//	pedirá un valor N y mostrará en qué posiciones del array aparece N.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int array1[]=new int [100];
		int n=0;
		
		System.out.println("Introduce un valor entre 1 y 10 y te diremos cuantos hay en el array");
		n=leer.nextInt();
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=(int) (1+Math.random()*10);
				System.out.println(array1[i]);
			if (n==array1[i]) {
				System.out.println("Este numero esta en la posición " +i+ " del array");
			}
			leer.close();
		}
	}
}
