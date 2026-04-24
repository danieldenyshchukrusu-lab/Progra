package ud10.EjercicioLista9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainPlanta { 
	
	
	
	public static void main(String[] args) throws RiegoExcesivoException {
		
		List<Planta> listaPlanta=new ArrayList<>();
		
		//ARBOLES Y FLORES
		
		Planta arbol1 = new Arbol("pino",2.0,true,20,TipoDeHoja.PERENNE);
		Planta arbol2 = new Arbol("acacia",4.0,false,65,TipoDeHoja.CADUCA);
		
		Planta flor1 = new Flor("Rosa",0.2,false,"roja");
		Planta flor2 = new Flor("Tulipan",0.1,true,"blanco");
		
		//1. AÑADIMOS LAS PLANTAS.
		
		listaPlanta.add(arbol1);
		listaPlanta.add(arbol2);
		listaPlanta.add(flor1);
		listaPlanta.add(flor2);
		
		//2. Recorremos la lista y mostramos la ifnromacion de todas las plantas.
		
		for (Planta p : listaPlanta) {
			p.mostrarInformación();
		}
		
		//3. Regaremos todas las plantas que lo necesiten
		
		for (Planta p : listaPlanta) {
			if (p.isNecesitaAgua()==true) {
				p.regar();
			}
		}
		
		//4. Hacer que crezca un arbol
		
		arbol1.crecer();
		
		//5. Hacer que crezca una flor
		
		flor1.crecer();
		
		//6. calcular altura media de todas las plantas y mostrar
		
		double alturaMedia=0.0;
		
		for (Planta p : listaPlanta) {
			alturaMedia+=p.getAltura();
		}
		
		System.out.println("La altura media de las plantas es: " +alturaMedia/listaPlanta.size());
		
		//7. Eliminar aquellas plantas que no necesiten agua
		
		Iterator<Planta> it = listaPlanta.iterator();
		
		while(it.hasNext()) {
			if (it.next().isNecesitaAgua()==false) {
				it.remove();
			}
		}
		
		//8. Mostrar contenido de la lista
		
		for (Planta p : listaPlanta) {
			p.mostrarInformación();
		}
		
		//2.1 CREAR UN MAPA E INSERTAR LOS VALORES
		
		Map<Integer, Planta> mapaPlantas = new HashMap<>();
		
		mapaPlantas.put(0, arbol1);
		mapaPlantas.put(1, arbol2);
		mapaPlantas.put(2, flor1);
		mapaPlantas.put(3, flor2);
		
		//2.2 BUSCAR PLANTA POR SU ID Y MOSTRAR INFO. !!!FALTA!!!
		
		for (Map.Entry<Integer, Planta> a : mapaPlantas.entrySet()) {
			
		}
		
		//2.3 ELIMINAR PLANTA DEL MAPA A PARTIR DE SU ID. !!!FALTA!!!
		
		//2.4 MOSTRAR TODAS LAS PLANTAS DEL MAPA ALMACENADAS. !!!FALTA!!!
		
	}
}
