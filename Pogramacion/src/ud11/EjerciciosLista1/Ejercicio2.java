package ud11.EjerciciosLista1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
	
//	2. Crea un programa que muestre el contenido de un fichero de texto, cuyo nombre
//	deberá introducir el usuario. Debe avisar si el fichero no existe.

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		File f=null;
		
		FileReader fr=null;
		BufferedReader entrada = null;
		String cadena;
		String fichero;
		
		System.out.println("Dime la ruta del fichero que quieres leer");
		fichero=leer.nextLine();
		
		try {
			
			f=new File(fichero);
			
			if (f.exists()) {
				
				fr = new FileReader(fichero);
				entrada = new BufferedReader(fr);
				
				while ((cadena=entrada.readLine())!=null) {
					System.out.println(cadena);
				}
			} else {
				System.out.println("El fichero no se encuentra");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe"); //Podriamos hacer esto, pero si queremos que el programa siga ejecutandose
		} catch (IOException e) {						//Tenemos que hacer lo de if con el "f.exists", que es un metodo que comprueba si existe el FILE o no.
			e.printStackTrace();
		}
	}
}
