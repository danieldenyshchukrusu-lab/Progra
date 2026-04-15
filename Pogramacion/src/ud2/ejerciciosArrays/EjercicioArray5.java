package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray5 {
//	Crea un programa que pida veinte números reales por teclado, los almacene en
//	un array y luego lo recorra para calcular y mostrar la media: (suma de valores) /
//	nº de valores.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int array1[]=new int [20];
		int SumaValores=0;
		int cont=0;
		
		System.out.println("Introduce 20 numeros para el array");
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
		}
		
		for (int i=0;i<array1.length;i++) {
			SumaValores=SumaValores+array1[i];
			cont=cont+1;
		}
		leer.close();
		
		System.out.println("La media de estos 20 numeros reales sumados es " +SumaValores+ " entre " +cont+ " es " +SumaValores/cont);
		
	}
}
