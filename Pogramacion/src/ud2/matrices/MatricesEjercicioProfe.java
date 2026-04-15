package ud2.matrices;

public class MatricesEjercicioProfe {
	public static void main(String[] args) {
		int matriz1[][]=new int [5][5];
		int cont=1;
		
		for (int i=0;i<matriz1.length;i++) {
			for (int j=0;j<matriz1[i].length;j++) {	
				System.out.print(cont+"\t");
				matriz1[i][j]=cont++;
			}
		System.out.println();
		}
	}
}

