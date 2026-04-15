package ud2.ejerciciosArrays1;

public class EjercicioArray1 {
//	Crear un array1 unidimensional de enteros de longitud 10 y rellenarlo con los
//	números que van del 100 en adelante.
	public static void main(String[] args) {
		int array1[]=new int [10];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=i+100;
			System.out.println(array1[i]);
		}
	}
}
