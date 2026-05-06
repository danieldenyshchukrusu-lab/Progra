package ud11.ficherosListaII;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String nombreFichero=" "; /*Esto se puede hacer co split también, intentalo.*/
		
		int letraASCII = 0;
		char letra = ' ';
		
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.println("Introduce el nombre del fichero");
		nombreFichero = leer.nextLine();
		
		try {
			fr = new FileReader("C:/docs/"+nombreFichero+".csv");
			br = new BufferedReader(fr);
			
			while ((letraASCII= br.read()) != -1) {
				letra = (char) letraASCII;
				if (letra==';') {
					System.out.print(' ');
				} else {
					System.out.print(letra);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
