package pooUD5.funcionesEjercicios5_2;

import java.util.Scanner;

public class Ejercicio4 {
	//Implementa un método contarPalabras que reciba una cadena y devuelva
	//cuántas palabras tiene (las palabras están separadas por espacios).
	
	public static int contarPalabras (String cadena) {
		
		int palabras=0;
		String espacio[];
		
		espacio = cadena.split(" ");
		
		palabras=espacio.length;

		return palabras;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String cadena="";
		
		System.out.println("Introduce una cadena");
		cadena=leer.nextLine();
		
		System.out.println("La cadena " +cadena+ " tiene " +contarPalabras(cadena));
	}
}
