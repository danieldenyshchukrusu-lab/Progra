package ud2.ejerciciosArrays4;

public class EjercicioArray1 {
//	Dados estos dos arrays: {1, 3, 5, 7, 8} y {1, 2, 3, 4, 5} obtener y mostrar un
//	array llamado resultado que sea la suma de ambos (suma de elementos de
//	la misma posición).
	public static void main(String[] args) {
		int array1[]=new int [] {1, 3, 5, 7, 8};
		int array2[]=new int [] {1, 2, 3, 4, 5};
		int resultado[]=new int [5];
		
		for (int i=0;i<resultado.length;i++) {
			resultado[i]=array1[i]+array2[i];
			System.out.println(resultado[i]);
		}
	}
}
