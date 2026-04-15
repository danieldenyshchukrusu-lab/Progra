package ud2.ejerciciosArrays5;

import java.util.Scanner;

public class EjercicioArray3 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
//		Crea un programa que pida 10 números enteros y los almacene en un array.
//		De los valores pasados ninguno puede ser 0, si se recibe un 0 se pedirá de
//		nuevo el valor hasta que sea válido.
//		Una vez relleno, pedirá un valor por teclado y lo buscará en el array, si no
//		está mostrará un mensaje “Valor no encontrado”; si, por el contrario, se
//		encuentra almacenado en el array, lo sustituirá por un 0 en esa posición.
		
		int array1[]=new int [10];
		int encontrar=0;
		
		System.out.println("Introduce 10 valores en la array");
		for (int i=0;i<array1.length;i++) {
			array1[i]=leer.nextInt();
			do {
				
			if(array1[i]==0) {
				System.out.println("Valor introducido incorrecto, vuelve a introducir el valor");
				array1[i]=leer.nextInt();
			}
			
			} while (array1[i]==0);
		}
		
		System.out.println("Introduce un valor y buscaremos si existe en el array");
		encontrar=leer.nextInt();
		for (int i=0;i<array1.length;i++) {
			if (encontrar!=array1[i]) {
				System.out.println("valor no encontrado en la posición " +i);
			} else if (encontrar==array1[i]) {
				System.out.println("valor encontrado en la posición " +i);
				array1[i]=0;
			}
		}
		
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+ "\t");
		}
	}
}
