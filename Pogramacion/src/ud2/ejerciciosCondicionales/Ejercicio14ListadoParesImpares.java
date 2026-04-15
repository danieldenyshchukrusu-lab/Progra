package ud2.ejerciciosCondicionales;

public class Ejercicio14ListadoParesImpares {
	public static void main(String[] args) {
//		 Obtener un listado de los números pares entre -20 y 0 y a partir del 0 un listado de
//		 los números impares entre 1 y 21.
		for (int i=-20;i<=20;i=i+1) {
			if (i>=-20 && i<=0) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
			if (i>=0 && i<=20) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		}
	}
}
