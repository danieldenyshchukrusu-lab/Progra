package ud2.ejerciciosCondicionales;

public class Ejercicio11SinFOR {
//	Sin utilizar la estructura FOR sacar un listado de todos los números impares del 7
//	al 21.
	public static void main(String[] args) {
		
		int n=0;
		
		while (n<=21) {
			if (n>=7) {
				if (n%2!=0) {
					System.out.println(n);
				}
			}
			n=n+1;
		}
	}
}
