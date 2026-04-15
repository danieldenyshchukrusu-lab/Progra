package ud2.ejerciciosArrays4;

public class EjercicioArray2 {
//	Obtener la suma de los elementos del siguiente array: {1, 4, 6, 10, -3, 4, 6, -
//		5}.
	public static void main(String[] args) {
		int array1[]=new int [] {1, 4, 6, 10, -3, 4, 6, -5};
		int arrayTotal=0;
		for (int i=0;i<array1.length;i++) {
		
		arrayTotal=arrayTotal+array1[i];
		}
		System.out.println(arrayTotal);
	}
}
