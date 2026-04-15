package ud2.matrices;

public class MatricesEj2 {
// Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicr del 1 al 10 (cada tabla en una fila)
//Luego mostrará la matriz por pantalla.
//
	public static void main(String[] args) {
		int matriz1[][]=new int[11][11];
			for(int i=1;i<matriz1.length;i++) {
				System.out.println("Tabla de multiplicar del: " +i);
				for(int j=1;j<matriz1[i].length;j++) {
					matriz1[i][j]=(i*j);
					System.out.print(matriz1[i][j]+ "\t");
				}
			System.out.println();
			}
	}
}
