package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjerciciArray7 {
//	Crea un programa que pida dos valores enteros P y Q, luego cree un array que
//	contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int p=0;
		int q=0;
		
		System.out.println("Introduce un valor para la p");
		p=leer.nextInt();
		System.out.println("Introduce un valor para la q");
		q=leer.nextInt();
		
		int array1[]=new int [q-p+1];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=p;
			p++;
			System.out.println(array1[i]);
		}
		leer.close();
	}
}
