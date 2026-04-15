package ud2.ejerciciosArrays5;

public class EjercicioArray4 {
//	Dados dos arrays de 10 posiciones, los cuales se rellenarán con valores
//	aleatorios, los evaluaremos para finalmente crear un tercer array que
//	contenga solo los valores únicos de ambos arrays, es decir, aquellos que no
//	están repetidos.
	public static void main(String[] args) {
		int cont=0;
		int array1[]=new int [10];
		int array2[]=new int [10];
		
		for (int i=0;i<array1.length;i++) {
			array1[i]=(int) (Math.random() * 40);
		}
		
		System.out.println("Valores array1[i]");
		for (int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
		for (int i=0;i<array2.length;i++) {
			array2[i]=(int) (Math.random() * 40);
		}
		
		System.out.println("Valores array2[i]");
		for (int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("--------------------------------------------------------");
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				if (array1[i] != array2[j]) {
					cont++;
				}
			}
		}
		
		int array3[]=new int [cont];
		cont=0;
		
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				if (array1[i] != array2[j]) {
					array3[cont]=array1[i];
					cont++;
				}
			}
		}
		
//		for (int i=0;i<array1.length;i++) {
//			for (int j=0;j<array1.length;j++) {
//				if (array1[i] != array1[j]) {
//					array3[cont]=array1[i];
//					cont++;
//				}
//			}
//		}
//		
//		for (int i=0;i<array2.length;i++) {
//			for (int j=0;j<array2.length;j++) {
//				if (array2[i] != array2[j]) {
//					array3[cont]=array2[i];
//					cont++;
//				}
//			}
//		}
		
//		for (int i=0;i<array2.length;i++) {
//			for (int j=0;j<array1.length;j++) {
//				if (array2[i] == array1[j]) {
//					array3[cont]=array2[i];
//					cont++;
//				}
//			}
//		}
		
		for (int i=0;i<array3.length;i++) {
			System.out.println(array3[i]);
		}
		
	}
}
