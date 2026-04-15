package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArray3 {
//	Crea un programa que pida diez números reales por teclado, los almacene en
//	un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
//	pantalla.
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int array1[]=new int[10];
		
		System.out.println("Introduce 10 numeros reales");
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
		}
		
		int maximo=array1[0]; 
		int minimo=array1[0];
		
		for (int i=0;i<array1.length;i++) {
			
			if (array1[i]>=maximo) { //RECUERDA, NO ES LO MISMO PONER maximo=array1[i], que poner array1[i]=maximo.LO DE LA DERECHA SIEMPRE SE ASIGNA A LO DE LA IZQUIERDA
				maximo=array1[i];
			} if (array1[i]<=minimo) {
				minimo=array1[i];
			}
		}
		leer.close();
		
		System.out.println("El numero minimo de este array es: " +minimo+ " y el numero maximo es: " +maximo);
	}
}
