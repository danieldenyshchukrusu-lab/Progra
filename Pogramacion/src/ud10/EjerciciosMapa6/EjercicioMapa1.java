package ud10.EjerciciosMapa6;

import java.util.HashMap;
import java.util.Map;

public class EjercicioMapa1 {
//	1. Muestra todas las claves y valores usando entrySet().

	public static void main(String[] args) {
		
		Map<String, Integer> abecedario = new HashMap<>();
		
		abecedario.put("A", 0);
		abecedario.put("B", 1);
		abecedario.put("C", 2);
		
		System.out.println("Mostramos claves y valores");
		for (Map.Entry<String, Integer> a : abecedario.entrySet()) {
			System.out.println(a.getKey() + "," +a.getValue());
		}
		
	}
}
