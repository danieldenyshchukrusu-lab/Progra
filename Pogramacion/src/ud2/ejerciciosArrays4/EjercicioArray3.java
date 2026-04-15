package ud2.ejerciciosArrays4;

public class EjercicioArray3 {
//	Imprimir en pantalla los elementos del siguiente array {2, 3, 4, 7, 8, 10, 11}
//	indicando para cada uno de ellos si es par o impar.
	public static void main(String[] args) {
		int array1[]=new int[] {2, 3, 4, 7, 8, 10, 11};
		for (int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
			if (array1[i]%2==0) {
				System.out.println("Este numero es par");
			} else {
				System.out.println("Este numero es impar");
			}
		}
		
	}
}
