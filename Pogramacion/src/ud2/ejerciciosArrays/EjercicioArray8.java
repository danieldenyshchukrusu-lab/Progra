package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray8 {
//	Crea un programa que cree un array con 100 números reales aleatorios entre
//	0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por
//	último, mostrará cuántos valores del array son igual o superiores a R.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double n=0;
		int cont=0;
		double array1[]=new double[100];
		
		System.out.println("Introduce un numero entre 0.0 y 1.0, para ver cuantos valores son iguales o superiores al tuyo");
		n=leer.nextDouble();
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=Math.random();
			if (n<=array1[i]) {
				cont=cont+1;
				System.out.println("El valor " +array1[i]+ " es superior al valor " +n);
			}
		}
		System.out.println("Hay " +cont+ " valores mayores que " +n);
		leer.close();
	}
}
