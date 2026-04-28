package ud11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploReaderCaracteres {
	public static void main(String[] args) {
		//dile a alguien o a cristina si tiene el ejemplo de reader, y tambien, recuerda estudiar muy bien las interfaces bro.
		
		FileReader fr=null;
		BufferedReader entrada = null;
		int c;
		
		try {
			fr =new FileReader("C:/docs/datos.txt");
			entrada=new BufferedReader(fr);
			
			 /*El metodo read me devuelve un -1 cuando no hay mas caracteres que leer en el fichero. */
			while((c=entrada.read())!=-1) { 
				System.out.print((char)c);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("No encuentra la ruta");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Tipo de datos incorrecto");
		}
	}
}
