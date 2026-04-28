package ud11.EjerciciosLista1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1 {
	
//	1. Crea un programa que pida al usuario que introduzca frases, y guarde todas ellas
//	en un fichero de texto. Deberá terminar cuando el usuario introduzca "fin". Al
//	terminar, nos mostrará cuántas frases ha introducido.

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		PrintWriter salida=null; //Como solo hay PrintWriter, a la hora de que queramos escribir mas info en el fichero
								 //este sobreescribira todo lo anterior y pondra la nueva info. Si quisieramos que lo que escribamos a continuacion
								 //este despues de lo primero que escribimos, necesitariamos un FileWriter.
		String cadena; 
		
		int contador=0;
		
		System.out.println("Introduce frases, estas se guardaran en el fichero de texto");
		System.out.println("Introduzca 'FIN' para finalizar");
		
		try {
			
			salida=new PrintWriter("C:/docs/datos2.txt");
			cadena=leer.nextLine();
			
			while(!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena=leer.nextLine();
				contador++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			salida.close();
		}
		
		System.out.println("Se han escrito " +contador+ " lineas en el fichero datos2.txt.");
		
	}
}
