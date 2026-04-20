package ud10.EjerciciosMapa6;

import java.util.HashMap;
import java.util.Map;

public class EjercicioMapa3 {
//	Dado un array de palabras:
//		String[] palabras = {"hola", "adios", "hola", "java", "java", "java"};
//		Cuenta cuántas veces aparece cada palabra usando un Map
	public static void main(String[] args) {
		String[] palabras = {"hola", "adios", "hola", "java", "java", "java"};
		int contador=0;
		
		int javaCont=0;
		int adiosCont=0;
		int holaCont=0;
		
		Map<Integer, String> palabra = new HashMap<>();
		
		//Metemos los valores del array dentro del mapa.
		
		for (int i=0;i<palabras.length;i++) {
			palabra.put(i, palabras[i]);
		}
		
		//contamos las palabras que hay en el mapa
		
		for (Map.Entry<Integer, String> recorrido : palabra.entrySet()) {
			if (recorrido.getValue()=="java") {
				javaCont++;
			} else if (recorrido.getValue()=="adios") {
				adiosCont++;
			} else {
				holaCont++;
			}
		}
		
		System.out.println("Java: " +javaCont+ ", Adios: " +adiosCont+ ", Hola: " +holaCont);
	}
}
