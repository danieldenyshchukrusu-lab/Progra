package ud2.ejerciciosArrays1;

public class EjercicioArray5 {
//	Rellena en el array2 desde la posición 5 a la posición 8 con el número 99.
	public static void main(String[] args) {
		int array1[]=new int [20];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=20-i;
		}
		
		for (int i=0;i<array1.length;i++) {
			if(i>=5 && i<=8) {
				array1[i]=99;
			} 
			System.out.println(array1[i]);
		}
	}
}
