package ud2.ejerciciosArrays3;

import java.util.Scanner;

public class EjercicioArray7 {
//	Realiza un programa que pida un número y construya por pantalla su pirámide.
//	Ejemplo:
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int piramide=0;
		int cont=0;
		
		System.out.println("Dime la altura de la piramide");
		piramide=leer.nextInt();
		
//		for(int i=0;i<piramide;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<piramide;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

