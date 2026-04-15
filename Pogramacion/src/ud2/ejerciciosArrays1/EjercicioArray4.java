package ud2.ejerciciosArrays1;

public class EjercicioArray4 {
//	Busca la posición en la que se encuentra el número 5 en el array3.
	public static void main(String[] args) {
		int array2[]=new int [20];
		int array1[]=new int [10];
		int array3[]=new int [30];
		
		for (int i=0;i<array2.length;i++) {
			array2[i]=20-i;
		}
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=i+100;

		}
		for (int i=0;i<array2.length;i++) {
			array3[i]=array2[i];
			System.out.println(array3[i]);
		}
		
		for (int i=20;i<array3.length;i++) {
			array3[i]=array1[i-20];
			System.out.println(array3[i]);
		}
		
		for (int i=0;i<array3.length;i++) {
			if (array3[i]==5) {
				System.out.println("El numero 5 esta en la posición: "+i);
			}
		}
	}
}
