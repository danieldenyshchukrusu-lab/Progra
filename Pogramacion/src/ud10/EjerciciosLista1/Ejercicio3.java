package ud10.EjerciciosLista1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio3 {
	public static void main(String[] args) {
		
//		3. Implementar una aplicación en la que se insertar 20 números enteros aleatorios
//		entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección. A
//		continuación, se crea una lista con los mismos elementos sin repeticiones.
		
		List<Integer> lista = new ArrayList<>();
		
		Set<Integer> conjunto = new HashSet<>();
		
		int x;
		
		for (int i=0;i<20;i++) {
			x=(int)(Math.random() * 10 + 1);
			lista.add(x);
		}
		
		System.out.println("Lista inicial");
		System.out.println(lista);
		
		System.out.println("El tamaño del conjunto es " +conjunto.size());
		conjunto.addAll(lista);
		System.out.println(conjunto);
		
		
		
	}
}
