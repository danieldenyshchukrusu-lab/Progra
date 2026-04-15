package ud10.EjerciciosLista2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
	public static void main(String[] args) {
//		1. Crea un programa que permita:
//			• Agregar nombres de estudiantes en una lista.
//			• Insertar un nuevo estudiante en una posición específica.
//			• Modificar el nombre de un estudiante dado su índice.
//			• Eliminar a un estudiante de la lista.
//			• Mostrar la lista actualizada.
		
		List<String> lista = new ArrayList<>();
		
//		Agregar nombres de estudiantes en una lista.
		
		lista.add("Daniel");
		lista.add("Mikel");
		lista.add("Mateo");
		
//		Insertar un nuevo estudiante en una posición específica.
		
		lista.add(2, "Nicolas");
		
//		Modificar el nombre de un estudiante dado su índice.
		
		lista.set(1, "MikelMod");
		
//		Eliminar a un estudiante de la lista.
		
		lista.remove(0);
		
//		Mostrar la lista actualizada.
		
		System.out.println(lista);
		
	}
}
