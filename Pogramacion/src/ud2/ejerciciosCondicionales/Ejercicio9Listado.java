package ud2.ejerciciosCondicionales;

public class Ejercicio9Listado {
//	Obtener un listado con los números del 1 al 10. En la posición del cinco en lugar de
//	salir el número ha de salir la palabra ‘CINCO’.
	public static void main(String[] args) {
		
			for (int i=1;i<10;i = i + 1) {
				if (i==5){
					System.out.println("CINCO");
				} else {
					System.out.println(i); // Si no pones el else, saldria algo como "2,3,4,5,CINCO,6" 
				}
		}
	}
}
