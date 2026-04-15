package ud2.ejerciciosCondicionales;

public class Ejercicio10ListadoPares {
//	Obtener un listado de todos los números del -30 al 30. Para los números que se
//	encuentren entre 0 y 8 sólo aparecerán los pares.
	public static void main(String[] args) {

		
		for (int i=-30;i<=30;i=i+1) {
			if (i >= 0 && i <=8) { 
				if (i%3!=0) {
					i=i+1;
				} 

			}
			System.out.println(i);
		}
	}
}
