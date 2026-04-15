package ud2.ejerciciosCondicionales;

public class Ejercicio13ListadoMultiplos4 {
	// Obtener un listado de todos los números múltiplos de 4 entre 4 y 40.
	public static void main(String[] args) {
		
		for ( int i=4;i<=40;i=i+1) {
			if (i%4==0) {
				System.out.println(i);
			}
		}
	}
}
