package ud2.matrices.EJ7;

import java.util.Scanner;

public class MatricesEj7Extenso {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		char menu;
		int matriz1[][]=new int[5][5];
		
		System.out.println("a. Generación de Matriz");
		System.out.println("b. Suma de filas");
		System.out.println("c. Suma de columnas");
		System.out.println("d. Diagonal principal");
		System.out.println("e. Suma total matriz");
		System.out.println("f. Reemplazo de valores");
		System.out.println("g. Mostrar la matriz despues de reemplazo");
		System.out.println("h. Comprobación de simetria");
		System.out.println("i. SALIR");
		do {
		menu = leer.next().charAt(0);
		
			switch (menu) {
			case 'a':
				for (int i=0;i<matriz1.length;i++) {
					for (int j=0;j<matriz1[i].length;j++) {
						matriz1[i][j]=(int)(Math.random()*(100+1));
					}
				}
			
				for (int i=0;i<matriz1.length;i++) {
					for (int j=0;j<matriz1[i].length;j++) {
						System.out.print(matriz1[i][j]+ "\t");
					}
					System.out.println();
				}
				menu = leer.next().charAt(0);
				break;
			case 'b':
				int sumaFilas=0;
			
				for (int i=0;i<matriz1.length;i++) {
					sumaFilas=0;
						for (int j=0;j<matriz1[i].length;j++) {
							sumaFilas=sumaFilas+matriz1[i][j];
					}
					System.out.println("La suma de la fila " +i+ ": "+sumaFilas);
					}
				break;
			case 'c':
				int sumaColumnas=0;
				
				for (int i=0;i<matriz1[0].length;i++) {
					sumaColumnas=0;
					for (int j=0;j<matriz1.length;j++) {
						sumaColumnas=sumaColumnas+matriz1[j][i];
				
					}
					System.out.println("La suma de la columna "+i+ ": "+sumaColumnas);
				}
				break;
			case 'd':
				int sumaDiagonal=0;
				 for (int i=0;i<matriz1.length;i++) {
					 sumaDiagonal=sumaDiagonal+matriz1[i][i];
				 }
				 System.out.println("La suma de la diagonal principal es: " +sumaDiagonal);
			case 'e':
				int sumaTotal=0;
				
				for (int i=0;i<matriz1.length;i++) {
					for (int j=0;j<matriz1[i].length;j++) {
						sumaTotal=sumaTotal+matriz1[i][j];
					}
				}
				System.out.println(sumaTotal);
				break;
			case 'f':
				for (int i=0;i<matriz1.length;i++) {
					matriz1[i][matriz1.length-1-i]=matriz1[i][matriz1.length-1-i]*matriz1[i][matriz1.length-1-i];
				}
				break;
			case 'g':
				for (int i=0;i<matriz1.length;i++) {
					for (int j=0;j<matriz1[i].length;j++) {
						System.out.println();
					}	
				}
				break;
			case 'h':
				boolean simetrica=true;
				for (int i=0;i<matriz1.length;i++) {
					for (int j=0;j<matriz1[i].length;j++) {
						if(matriz1[i][j]==matriz1[j][i]) {
							
						}
					}	
				}
				if (simetrica==true) {
					System.out.println("La matriz es simetrica con respecto a su diagonal principal");
				} else {
					System.out.println("La matriz no es simetrica con respecto a su diagonal principal");
				}
				break;
			}
		} while (menu!='i');
	}
}
