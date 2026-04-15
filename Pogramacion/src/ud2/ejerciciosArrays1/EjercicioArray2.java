package ud2.ejerciciosArrays1;

public class EjercicioArray2 {
//	Crear un array2 unidimensional de enteros de longitud 20 y rellenarlo con los
//	números que van del 20 hacia atrás.
	public static void main(String[] args) {
		int array1[]=new int [20];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=20-i;
			System.out.println(array1[i]);
		}
	}
}
