package ud2.ejerciciosArrays1;

public class EjercicioArray6 {
//	Copia en el array1 desde la posición 2, los 6 primeros elementos del array2.
	public static void main(String[] args) {
		int array2[]=new int [20];
		int array1[]=new int [10];
		
		for (int i=0;i<array2.length;i++) {
			array2[i]=20-i;
		}
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=i+100;
		}
		
		for (int i=0;i<array1.length;i++) {
			if (i>=2 && i<8) {
				array1[i]=array2[i-2]; //este -2, es para que vaya al principio de i (i=0)
			}
		System.out.println(array1[i]);
		}
	}
}

