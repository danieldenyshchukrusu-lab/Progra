package ud10.ejerciciosMapa7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestionPersonas {
//	1. Crea un programa que gestione personas definidas por dos atributos, su
//	nombre (clave) y su edad (valor).
//	El programa debe crear un mapa con 5 personas, acceder a cada valor y
//	mostrarlo, modificar un valor, eliminar un elemento y recorrer el mapa para
//	imprimir todos los nombres y edades almacenados.
//	Por último, mostrará la media de edad de las personas incluidas en el
//	mapa.
	public static void main(String[] args) {
		
		Map<String,Integer> personas=new HashMap<>();
		
		double mediaEdad=0.0;
		
		personas.put("Ana", 16);
		personas.put("Marcos", 32);
		personas.put("Tadeo", 25);
		personas.put("Mikel", 20);
		personas.put("Daniel", 18);
		
		//Acceder a cada valor y mostrarlo
		
		System.out.println("Acceder a cada valor y mostrarlo: ");
		System.out.println();
		
		for (Map.Entry<String,Integer> a : personas.entrySet()) {
			System.out.println("Nombre: "+a.getKey()+", Edad: "+a.getValue());
		}
		
		//modificar un valor
		
		personas.replace("Tadeo", 25, 32);
		
		//eliminar un elemento
		
		Iterator<Map.Entry<String,Integer>> it = personas.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> a = it.next();
			
			if (a.getValue() < 17) {
				it.remove();
			}
		}
		
		//Volver a imprimir los nombres y edades
		
		System.out.println();
		System.out.println("Volvemos a mostrar el mapa ya modificado: ");
		System.out.println();
		
		for (Map.Entry<String,Integer> a : personas.entrySet()) {
			System.out.println("Nombre: "+a.getKey()+", Edad: "+a.getValue());
		}
		
		//Mostrar la media de la edad
		
		for (Map.Entry<String,Integer> a : personas.entrySet()) {
			mediaEdad+=a.getValue();
		}
		
		System.out.println();
		System.out.println("La media de las edades son: "+ mediaEdad/personas.size());
		
	}
}	
