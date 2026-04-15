package ud10.EjerciciosLista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {		
//		2. Implementar una aplicación donde se insertan 100 números enteros aleatorios
//		entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección. Después
//		se eliminarán todos los elementos que valen 5. Mostrar la colección antes y
//		después de la eliminación.
		
		List<Integer> lista = new ArrayList<>();
		int x;
		
		for (int i=0;i<100;i++) {
			x=(int)(Math.random() * 10 + 1);
			lista.add(x);
		}
		
		System.out.println("Lista inicial");
		System.out.println(lista);
		
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i)==5) {
				lista.remove(i);
			}
		}
		System.out.println();
		System.out.println("Lista sin los cincos");
		System.out.println(lista);
		
	}
}
