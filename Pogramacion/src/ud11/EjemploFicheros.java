package ud11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjemploFicheros {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		PrintWriter salida = null;
		
		//En el caso de meter el printWriter dentro del try como parametro "try (...)" ya no nos haria falta poner tampoco salida.close. (Tienes ejemplos de esto en el documento de teoria de ficheros)
		
		//Tambien, si queremos hacer todo con printwriter pero, queremos meter mas datos continuamente en el fichero, deberiamos hacer algo tal que asi
		// try (FileWriter fw=new FileWriter(ruta,true); PrintWriter salida=new PrintWriter(fw)) {
		
		try {
			salida=new PrintWriter("C:/docs/datos.txt"); //Printwriter crea ficheros, pero no rutas si es que no existe esa ruta.
			String cadena;
			System.out.println("Introduce texto. FIN para terminar");
			//Leo por teclado lo que quiero escribir en el fichero
			cadena=leer.nextLine();
			//escribo lo leido de teclado y creo bucle hasta recibir 
			
			while(!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena=leer.nextLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			salida.close(); //si quitamos close, pàra forzar a que se ponga la info, seria con salida.flush, (si llegaramos a tener solo el close, el metodo flush esta ya por default en close.) pero,
			//si en vez de printwriter tenemos buffered writer, estamos tambien obligados a pòner el flush.
		}
	}
}
