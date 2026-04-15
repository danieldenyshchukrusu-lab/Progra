package ud2.ejerciciosCondicionales;

public class Ejercicio15Suma5y15 {
	// Obtener la suma de todos los números entre 5 y 15
	public static void main(String[] args) {
		
		int suma=0;
		
		for (int i=5;i<=15;i=i+1) {
			suma=suma+i;
		}
		System.out.println(suma);
	}
}
