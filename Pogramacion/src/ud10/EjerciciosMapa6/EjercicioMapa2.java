package ud10.EjerciciosMapa6;

import java.util.HashMap;
import java.util.Map;

public class EjercicioMapa2 {
//	2. Mostrar solo las personas con edad > 18.
	public static void main(String[] args) {
		
		Map<String, Integer> personas = new HashMap<>();
		
		personas.put("Daniel",19);
		personas.put("Marco",17);
		personas.put("Antonio",12);
		personas.put("Mikel",20);
		
		for (Map.Entry<String, Integer> persona : personas.entrySet()) {
			if (persona.getValue()>18) {
				System.out.println(persona.getKey() +","+ persona.getValue());
			}
		}
		
	}
}
