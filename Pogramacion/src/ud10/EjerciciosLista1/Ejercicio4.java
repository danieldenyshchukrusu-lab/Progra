package ud10.EjerciciosLista1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	public static void main(String[] args) {
		
//		4. Repite el ejercicio anterior usando un iterador para eliminar los elementos cuyo
//		valor es 5.
		
		List<Integer> lista = new ArrayList<>();
		int x;
		
		for (int i=0;i<20;i++) {
			x=(int)(Math.random() * 10 + 1);
			lista.add(x);
		}
		
		System.out.println("Lista inicial");
		System.out.println(lista);
		
		
	}
}
