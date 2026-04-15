package ud2.matrices;

import java.util.Scanner;

public class MatricesEjemplo {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		//Creo una matriz 3x2 (3alumnos, 2 asignaturas/alumno)
		double notas[][]=new double [3][2];
		//Recorremos la matriz
		//Recorremos las filas
		for(int i=0;i<notas.length;i++) {
			System.out.println("Las notas del alumno " +i+ " son: ");
			for(int j=0;j<notas[i].length;j++) {
				System.out.println("Dime la nota de la asignatura " +j);
				notas[i][j]=leer.nextDouble();
			}
		}
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				System.out.println("Las notas del alumno " +i+ "  en la asignatura " +j+ " es un " +notas[i][j]);
			}
		}
		leer.close();
	}
}
