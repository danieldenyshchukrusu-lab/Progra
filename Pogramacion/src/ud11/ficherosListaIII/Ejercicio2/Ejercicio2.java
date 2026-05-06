package ud11.ficherosListaIII.Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
	
//	Desarrolla una aplicación en Java para la gestión de una agenda de contactos,
//	utilizando una estructura ArrayList para almacenar los datos y un archivo CSV
//	como sistema de persistencia.
	
//	La agenda debe permitir almacenar información de los contactos, compuesta por
//	dos campos: nombre y teléfono. Estos datos deben guardarse en un archivo
//	llamado agenda.csv, utilizando el formato estándar de los archivos CSV (valores
//	separados por comas), y comenzando con una línea de cabecera que contenga
//	los títulos Nombre y Teléfono.
	
//	Al iniciar el programa, si el archivo ya existe, debe cargarse su contenido en la
//	lista ArrayList, omitiendo la cabecera. Una vez cargados los datos, el programa
//	mostrará por pantalla todos los contactos existentes.
	
//	A continuación, el programa solicitará al usuario que introduzca un nuevo
//	contacto a través del teclado, pidiéndole el nombre y el teléfono. Este contacto
//	se añadirá al final de la lista, y posteriormente, toda la agenda (incluyendo el
//	nuevo contacto) se guardará de nuevo en el archivo agenda.csv, sobrescribiendo
//	el contenido anterior y asegurando que se mantenga la estructura del archivo.
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		List <String> Agenda = new ArrayList<>();
		
		PrintWriter pr = null;
		
		BufferedReader br = null;
		FileReader fr = null;
		
		String cadena;
		String partes[] = null;
		
		String fichero;
		File f = null;
		
		System.out.println("Escribe el nombre del archivo donde quieres pasar los contactos a la lista agenda");
		fichero=leer.nextLine();
		
		f = new File(fichero+".csv");
		
		
		try {
			if (f.exists()) {
				
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				
				cadena=br.readLine();
				
				while((cadena=br.readLine())!=null) {
					Agenda.add(cadena);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String a: Agenda) {
			partes=a.split(",");
			System.out.println(partes[0]+","+partes[1]);
		}
		
		System.out.println("Introduce un nuevo contacto para añadirlo al final de la lista");
		
		System.out.println("Introduce primero su nombre");
		partes[0]=leer.nextLine();
		System.out.println("Introduce su numero de telefono");
		partes[1]=leer.nextLine();
		
		Agenda.add(partes[0]+","+partes[1]);
		
		try {
			pr = new PrintWriter(f);
			
			for (String a: Agenda) {
				pr.println(a);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
