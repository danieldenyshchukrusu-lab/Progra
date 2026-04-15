package pooUD5.funcionesEjercicios5_2;

import java.util.Scanner;

public class Ejercicio3 {
	//Escribe un método invertirCadena que tome una cadena como entrada y
	//devuelva la cadena invertida.
	public static String invertirCadena (String cadena) {
		String cadenaInvertida="";
		
		for (int i = (cadena.length() - 1);i >= 0;i-- ) {
			cadenaInvertida=cadenaInvertida+cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		String cadena=leer.nextLine();
		
		System.out.println(cadena+ " invertida sería: " +invertirCadena(cadena));
		leer.close();
	}
}
