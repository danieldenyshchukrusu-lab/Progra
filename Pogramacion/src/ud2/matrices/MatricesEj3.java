package ud2.matrices;

import java.util.Scanner;

public class MatricesEj3 {
//	Crea un programa que cree una matriz de tamaño NxM (tamaño introducido
//			por teclado) e introduzca en ella NxM valores (también introducidos por
//			teclado). Luego deberá recorrer la matriz y al final mostrar por pantalla
//			cuántos valores son mayores que cero, cuántos son menores que cero y
//			cuántos son igual a cero.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n=0;
		int m=0;
		int contIguales=0;
		int contMayores=0;
		int contMenores=0;
		
		System.out.println("Introduce cuantas filas quieres");
		n=leer.nextInt();
		System.out.println("Introduce cuantas columnas quieres");
		m=leer.nextInt();
		
		int matriz1[][]=new int[n][m];
		
		for (int i=0;i<matriz1.length;i++) {
			System.out.println("Pasamos a la fila: " +i);
			for (int j=0;j<matriz1[i].length;j++) {
				System.out.println("Introduce el siguiente numero");
				matriz1[i][j]=leer.nextInt();
			}
		}
		
		for (int i=0;i<matriz1.length;i++) {
			for (int j=0;j<matriz1[i].length;j++) {
				System.out.print(matriz1[i][j]+"\t");
			if(matriz1[i][j]>0) {
				contMayores++;
			} if (matriz1[i][j]<0) {
				contMenores++;			
			} if (matriz1[i][j]==0) {
				contIguales++;			
			} 
			System.out.println();
		}
	}
		System.out.println("Valores mayores que 0: " +contMayores);
		System.out.println("Valores menores que 0: " +contMenores);
		System.out.println("Valores iguales que 0: " +contIguales);
		leer.close();
}
}