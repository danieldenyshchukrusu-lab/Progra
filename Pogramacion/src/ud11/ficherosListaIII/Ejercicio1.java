package ud11.ficherosListaIII;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
	
//	1. Vamos a crear un registro de estudiantes. Para ello crearemos una lista de
//	estudiantes, de los cuales tendremos su nombre y su nota.
//	Una vez almacenados en la lista, los guardaremos en un fichero llamado
//	estudiantes.txt.
//	Después, leeremos el fichero y mostraremos el nombre de aquellos estudiantes
//	que tengan una nota superior a 5.
	
	public static void main(String[] args) {
		
		List<Estudiante> lista = new ArrayList<>();
		
		Estudiante alumno1 = new Estudiante("Juan",9);
		Estudiante alumno2 = new Estudiante("Daniel",8);
		Estudiante alumno3 = new Estudiante("Marcos",2);
		Estudiante alumno4 = new Estudiante("Mikel",3);
		Estudiante alumno5 = new Estudiante("Ana",10);
		
		lista.add(alumno1);
		lista.add(alumno2);
		lista.add(alumno3);
		lista.add(alumno4);
		lista.add(alumno5);
		
		PrintWriter pr = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		String cadena;
		String partes[];
		
		try {
			pr = new PrintWriter("C:/docs/estudiantes.txt");
			
			fr = new FileReader("C:/docs/estudiantes.txt");
			br = new BufferedReader(fr);
			
			for (int i=0;i<lista.size();i++) {
				pr.print(lista.get(i));
				pr.println();
			}
			pr.close();
			
			//TAMBIEN RECUERDA QUE PODEMOS HACER ESTO CON FOR EACH
			
			/* for(Estudiante alumno:lista) {
			 * 		pr.println(alumno.getNombre()+"---"+alumno.getNota())
			 * }
			 */
			
			while((cadena=br.readLine())!=null) {
				partes=cadena.split(", nota= ");
				if(Integer.parseInt(partes[1])>=5) {
					System.out.println(partes[0]);
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
