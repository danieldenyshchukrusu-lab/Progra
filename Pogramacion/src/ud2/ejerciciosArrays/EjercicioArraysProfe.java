package ud2.ejerciciosArrays;

import java.util.Scanner;

public class EjercicioArraysProfe {
	//Crea un programa en Java que nos pida por teclado la nota de 4 alumnos, las almacene en un array después nos muestre por pantalla la nota media.
	public static void main(String[] args) {
		
		int notas[]=new int[4];
		int notasTotal=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Media de 4 alumnos");
		
		for (int i=0;i<notas.length;i++) {
			System.out.println("Di la nota del alumno " +(i+1));
			notas[i]=leer.nextInt();
			notasTotal=notasTotal+notas[i];
		}
		for (int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
		}
		leer.close();
		
		System.out.println("El total de las notas de los alumnos es: " +notasTotal);
		System.out.println("Y su media es " +notasTotal/notas.length);
		//En vez de poner /4, ponemos notas.length, debido a que si nosotros llevasemos este mismo programa pero en vez 
		//de que el array sea de longitud 4, sea de longitud 5, esto ya no serviria, por lo tanto ponemos NOTAS.LENGTH para que esta
		//haga la media siempre con la longitud del array.
	}
}
