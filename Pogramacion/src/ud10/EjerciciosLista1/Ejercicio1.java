package ud10.EjerciciosLista1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
//		1. Implementar una aplicación que pida por consola números enteros no negativos
//		hasta que se introduce -1. Los números se irán insertando en una colección,
//		pudiéndose repetir. Al terminar, se mostrará la colección por pantalla. A
//		continuación, se mostrarán todos los valores pares. Por último, se eliminarán
//		todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
		
		List<Integer> lista = new ArrayList<>();
		int x;
		
		System.out.println("Introduce numeros positivos hasta introducir un negativo");
		x=leer.nextInt();
		do {
			lista.add(x);
			x=leer.nextInt();
		} while (x!=-1 && x >= 0);
		
		System.out.println("Lista inicial");
		System.out.println(lista);
		System.out.println();
		
		System.out.println("Todos los numeros pares de la lista");
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i)%2==0) {
				System.out.print(lista.get(i)+" ");
			}
		}
		System.out.println();
		
		System.out.println("Eliminamos todos los multiplos de 3");
		
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i)%3==0) {
				lista.remove(i);
			}
		}
		
		System.out.println(lista);
		
		//RECORREMOS LISTA CON ITERADOR
		
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
		    int num = it.next();
		    if(num % 3 == 0) {
		        it.remove();
		    }
		}
		
	}
}
