package ud10.EjerciciosMapa6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjercicioMapa5 {
//	5. Elimina todos los elementos con valor < 10 usando Iterator.
	public static void main(String[] args) {
		
		Map<Integer,Integer> numeros = new HashMap<>();
		
		numeros.put(0, 5);
		numeros.put(1, 9);
		numeros.put(2, 13);
		
		//Recorremos todos los numeros
		
		for (Map.Entry<Integer, Integer> num : numeros.entrySet()) {
			System.out.println(num.getKey()+","+num.getValue());
		}
		System.out.println();
		
		//Declaramos iterador para recorrer el mapa numeros, y eliminar los que tienen de valor menos de 10
		
		Iterator<Map.Entry<Integer,Integer>>it=numeros.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> numero = it.next();
			
			if (numero.getValue()<10) {
				it.remove();
			}
		}
		
		//Recorremos todos los numeros, otra vez.
		
		for (Map.Entry<Integer, Integer> num : numeros.entrySet()) {
			System.out.println(num.getKey()+","+num.getValue());
		}
		System.out.println();
		
	}
}
