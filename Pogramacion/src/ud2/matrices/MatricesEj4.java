package ud2.matrices;

import java.util.Scanner;

public class MatricesEj4 {
//	Necesitamos crear un programa para almacenar las notas de 4 alumnos
//	(llamados “Alumno1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá
//	las notas por teclado y luego el programa mostrará la nota mínima, máxima
//	y media de cada alumno.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int matriz1[][]=new int [4][5];
		int cont=0;
		int minima=10;
		int maxima=0;
		
		int suma=0;
		int media=0;
		
		for (int i=0;i<matriz1.length;i++) {
			System.out.println("Notas de Alumno"+(i+1));
			for (int j=0;j<matriz1[i].length;j++) {
				System.out.println("Asignatura"+(j+1));
				suma=suma+j;
				matriz1[i][j]=leer.nextInt();
				if(matriz1[i][j]<minima) {
					minima=matriz1[i][j];
				} if(matriz1[i][j]>maxima) {
					maxima=matriz1[i][j];
				}
			}
		System.out.println(media);
		System.out.println("Nota minima de alumno " +(i+1)+ " es " +minima);
		System.out.println("Nota maxima de alumno " +(i+1)+ " es " +maxima);
		
		}	
		for (int i=0;i<matriz1.length;i++) {
			for (int j=0;j<matriz1[i].length;j++) {
				System.out.print(matriz1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
