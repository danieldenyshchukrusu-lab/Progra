package ud10.ejemplosMapa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemploMapa {
	public static void main(String[] args) {
		Map<String, Integer> edades = new HashMap<>();
		
		edades.put("Ana", 25);
		edades.put("Luis", 30);
		edades.put("Pedro", 20);
		
		for (Map.Entry<String, Integer> entry : edades.entrySet()) {
			System.out.println(entry.getKey() + " tiene " + entry.getValue() + " años");
		}
		if (edades.containsKey("Ana")) {
			System.out.println("Ana está en el mapa");
		}
		
		//Tambien se puede recorrer con Iterador (especialmente util a la hora de eliminar cosas)
		
		Iterator<Map.Entry<String,Integer>>it=edades.entrySet().iterator();
		while (it.hasNext()) {
		Map.Entry<String, Integer> valores = it.next();
		System.out.println(valores.getKey() + " -> " + valores.getValue());
		}
		
	}
}
