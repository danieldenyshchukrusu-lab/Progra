package ud11;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjemploFicherosFILEWRITER {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		PrintWriter salida = null;
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("C:/docs/datos.txt", true); //con file writer, nos permite añadir contenido al fichero, con true o false, con printwriter no se podria, a no ser de que le pasemos el objeto filewriter. Mas o menos asi.
			
			
			
			salida=new PrintWriter(fw);
			System.out.println("Introduce texto. FIN para terminar");
			//Leo por teclado lo que quiero escribir en el fichero
			String cadena;
			cadena=leer.nextLine();
			//escribo lo leido de teclado y creo bucle hasta recibir 
			
			while(!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena=leer.nextLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			salida.close(); //si quitamos close, pàra forzar a que se ponga la info, seria con salida.flush, (si llegaramos a tener solo el close, el metodo flush esta ya por default en close.) pero,
			//si en vez de printwriter tenemos buffered writer, estamos tambien obligados a pòner el flush.
		}
	}
}
