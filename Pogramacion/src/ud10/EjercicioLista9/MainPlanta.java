package ud10.EjercicioLista9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainPlanta { 
	
	
	
	public static void main(String[] args) throws RiegoExcesivoException {
		Scanner leer = new Scanner(System.in);
		
		List<Planta> listaPlanta=new ArrayList<>();
		
		//ARBOLES Y FLORES
		
		Planta arbol1 = new Arbol("pino",2.0,true,20,TipoDeHoja.PERENNE);
		Planta arbol2 = new Arbol("acacia",4.0,false,65,TipoDeHoja.CADUCA);
		
		Planta flor1 = new Flor("Rosa",2,false,"roja");
		Planta flor2 = new Flor("Tulipan",1,true,"blanco");
		
		//1. AÑADIMOS LAS PLANTAS.
		
		listaPlanta.add(arbol1);
		listaPlanta.add(arbol2);
		listaPlanta.add(flor1);
		listaPlanta.add(flor2);
		
		//2. Recorremos la lista y mostramos la ifnromacion de todas las plantas.
		System.out.println("Recorremos la lista y mostramos la info. de todas las plantas");
		System.out.println();
		
		for (Planta p : listaPlanta) {
			System.out.println(p.mostrarInformación());
		}
		System.out.println();
		
		//3. Regaremos todas las plantas que lo necesiten
		
		System.out.println("Regaremos las plantas que necesiten agua, y mostraremos la info");
		System.out.println();
		for (Planta p : listaPlanta) {
			if (p.isNecesitaAgua()) {
				p.regar();
			}
		}
		
		System.out.println();
		
		for (Planta p : listaPlanta) {
			System.out.println(p.mostrarInformación());
		}
		System.out.println();
		
		//4. Hacer que crezca un arbol
		System.out.println("Creceremos un arbol");
		System.out.println();
		arbol1.crecer();
		System.out.println();
		
		//5. Hacer que crezca una flor
		System.out.println("Creceremos una flor, y mostraremos a continuacion las plantas");
		System.out.println();
		flor1.crecer();
		System.out.println();
		
		for (Planta p : listaPlanta) {
			System.out.println(p.mostrarInformación());
		}
		System.out.println();
		
		//6. calcular altura media de todas las plantas y mostrar
		
		double alturaMedia=0.0;
		
		for (Planta p : listaPlanta) {
			alturaMedia+=p.getAltura();
		}
		
		System.out.println("La altura media de las plantas es: " +alturaMedia/listaPlanta.size());
		System.out.println();
		//7. Eliminar aquellas plantas que no necesiten agua
		
		System.out.println("Ahora eliminaremos aquellas plantas que necesiten agua, y mostraremos la info.");
		System.out.println();
		
		Iterator<Planta> it = listaPlanta.iterator(); 
		
		while(it.hasNext()) {
			if (it.next().isNecesitaAgua()==false) {
				it.remove();
			}
		}
		
		//8. Mostrar contenido de la lista
		
		for (Planta p : listaPlanta) {
			System.out.println(p.mostrarInformación());
		}
		
		//2.1 CREAR UN MAPA E INSERTAR LOS VALORES
		System.out.println();
		System.out.println("===MAPAS===");
		System.out.println();
		
		Map<Integer, Planta> mapaPlantas = new HashMap<>();
		
		mapaPlantas.put(0, arbol1);
		mapaPlantas.put(1, arbol2);
		mapaPlantas.put(2, flor1);
		mapaPlantas.put(3, flor2);
		
		//2.2 BUSCAR PLANTA POR SU ID Y MOSTRAR INFO. (en este caso flor 1).
		int opcion=0;
		
		do {
			System.out.println();
			System.out.println("Quieres mostrar una planta, introduciendo su ID?");
			System.out.println("1. SI");
			System.out.println("2. SALIR");
			opcion=leer.nextInt();
			
			switch (opcion) {
			
			
			case 1:
				int id;
				
				System.out.println("Introduce el ID de la planta que quieres mostrar");
				id=leer.nextInt();
				
				for (Map.Entry<Integer, Planta> a : mapaPlantas.entrySet()) {
					if (a.getKey()==id) {
						System.out.println(a.getValue().mostrarInformación());
					}
				}
				
				break;
				
			case 2:
				
				System.out.println("Saliendo del programa...");
				
				break;

			default:
				
				System.out.println("Opcion no valida, vuelve a introducir numero");
				
				break;
			}
		} while (opcion!=2);
		
		//2.3 ELIMINAR PLANTA DEL MAPA A PARTIR DE SU ID. !!!FALTA!!!
	
		Iterator<Map.Entry<Integer, Planta>> its = mapaPlantas.entrySet().iterator();
		
		while (its.hasNext()) {
			Map.Entry<Integer, Planta> p = its.next();
			
			if (p.getKey()==3) {
				its.remove();
			}
		}
		
		//2.4 MOSTRAR TODAS LAS PLANTAS DEL MAPA ALMACENADAS. !!!FALTA!!!
		
		for (Map.Entry<Integer, Planta> a : mapaPlantas.entrySet()) {
			a.getValue().mostrarInformación();
		}
	}
}
