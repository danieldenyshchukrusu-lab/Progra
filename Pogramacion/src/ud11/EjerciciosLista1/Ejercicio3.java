package ud11.EjerciciosLista1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		FileReader fr=null;
		BufferedReader entrada=null;
		PrintWriter pr=null; //es como salida
		
		String cadena;
		
		try {
			fr = new FileReader("C:/docs/datos2.txt");
			entrada = new BufferedReader(fr);
			
			pr = new PrintWriter("C:/docs/datos2volcar.txt");
			
			while((cadena=entrada.readLine())!=null) {
				pr.println(cadena.toUpperCase());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			pr.close();
			System.out.println("Fichero volcado correctamente");
		}
		
		
	}
}
