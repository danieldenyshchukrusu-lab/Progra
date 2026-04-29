package ud11.EjerciciosLista1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4 {
	
//	4. Crea un programa que pida al usuario el nombre de un fichero y una palabra a
//	buscar en él. Debe mostrar en pantalla todas las líneas del fichero que contengan
//	esa palabra.
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String fichero;
		String palabraBuscar;
		String linea;
		
		//SI QUISIERA HACER ESTE EJERCICIO CON ARRAY, DEBERIA DE UTILIZAR UN SPLIT().
		//Pero como en mi documento solo tengo una palabra por linea, no hace falta, si tuviera mas,
		//deberia de guardar cada palabra que este separada por un espacio con split, y luego recorrer el array.
		
		int contador=0;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.println("Introduce el nombre de un fichero");
		fichero=leer.nextLine();
		
		System.out.println("Que palabra quieres buscar en el fichero?");
		palabraBuscar=leer.nextLine();
		
		try {
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
			
			while((linea=br.readLine())!=null) {
				if (linea.equals(palabraBuscar)) {
					contador++;
					System.out.println(contador+ " " +linea);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("La palabra '" +palabraBuscar+ "' ha aparecido en el fichero: " +contador+ " veces");
		}
		
	}
}
