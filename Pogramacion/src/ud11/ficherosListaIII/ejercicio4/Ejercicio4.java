package ud11.ficherosListaIII.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
	
//	4. Implementa un pequeño sistema de gestión de productos que funcione
//	completamente desde consola y que permita realizar las operaciones CRUD:
//	crear, leer, actualizar y eliminar productos. Cada producto tiene un nombre, un
//	precio y una cantidad en stock, y todos ellos deben almacenarse en un archivo
//	productos.csv. El programa debe permitir al usuario añadir un nuevo producto,
//	listar todos los existentes, modificar el precio o el stock de un producto
//	determinado, y eliminarlo del registro. Para ello, utiliza una clase Producto y un
//	ArrayList como almacenamiento temporal. Asegúrate de que todas las
//	modificaciones se reflejan correctamente en el archivo al guardar los cambios.
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		Map<Producto,String> productos = new HashMap<>();
		
		String fichero;
		// File f = (fichero+".csv"););
		int opcion;
		
		do {
		System.out.println("---MENU---");
		System.out.println("1. Crear PRODUCTO");
		System.out.println("2. Leer PRODUCTO");
		System.out.println("3. Actualizar PRODUCTO");
		System.out.println("4. Eliminar PRODUCTO");
		System.out.println("5. Salir programa");
		opcion=leer.nextInt(); //Recuerda que como lo primero que introducimos es un int, cuando queramos introducir un String a continuacion, primero tendremos que hacer un "leer.nextLine()" suelto.
			switch (opcion) {
				case 1: 
					String varNombreObjeto;
					String varNombre;
					double precio;
					int stock;
					
					System.out.println("Qué ID quieres introducir al producto");
					leer.nextLine();
					varNombreObjeto=leer.nextLine();
					
					System.out.println("Que nombre tiene tu producto?");
					varNombre=leer.nextLine();
					
					System.out.println("Cuanto cuesta tu producto?");
					precio=leer.nextDouble();
					
					System.out.println("Cuanto stock tiene tu producto?");
					stock=leer.nextInt();
					
					Producto p = new Producto(varNombre,precio,stock);
					
					productos.put(p,varNombreObjeto);
					
					for (Map.Entry<Producto,String> prod : productos.entrySet()) {
						System.out.println(prod.getKey()+"-"+prod.getValue());
					}
					
					System.out.println("El producto ha sido creado correctamente");
					
					break;
				case 2: 
					String productoLeer;
					
					System.out.println("Qué producto quieres leer?");
					leer.nextLine();
					productoLeer=leer.nextLine();
					
					for (Map.Entry<Producto,String> prod : productos.entrySet()) {
						if (prod.getValue().equals(productoLeer)) { // Cuando son Strings lo que comparas, no es con "==" es con EQUALS.
							System.out.println(prod.getKey().toString());
						} 
					}
					
					break;
				case 3:
					String producto;
					String productoNombreValue;
					String productoNombre;
					double productoPrecio;
					int productoStock;
					
					System.out.println("Que producto quieres actualizar?");
					for (Map.Entry<Producto,String> produc : productos.entrySet()) {
						System.out.println(produc.getKey()+"-"+produc.getValue());
					}
					
					leer.nextLine();	
					producto=leer.nextLine();
					for (Map.Entry<Producto,String> produc : productos.entrySet()) {
						if (produc.getValue().equals(producto)) {
							
							System.out.println("Actualiza el nombre del identificador del objeto");
							productoNombreValue=leer.nextLine();
							productos.put(produc.getKey(), productoNombreValue);
							
							System.out.println("Actualiza el nombre del producto");
							productoNombre=leer.nextLine();
							produc.getKey().setNombre(productoNombre);
							
							System.out.println("Actualiza el precio del producto");
							productoPrecio=leer.nextDouble();
							produc.getKey().setPrecio(productoPrecio);
							
							System.out.println("Actualiza el stock del producto");
							productoStock=leer.nextInt();
							produc.getKey().setStock(productoStock);
							
						}
					}
					
					System.out.println("Producto actualizado correctamente");
					
					for (Map.Entry<Producto,String> produc : productos.entrySet()) {
						System.out.println(produc.getKey()+"-"+produc.getValue());
					}
					
					break;
				case 4: 
					String productoEliminar;
			
					System.out.println("Que producto quieres eliminar?");
					leer.nextLine();
					productoEliminar=leer.nextLine();
					
					Iterator <Map.Entry<Producto,String>> it = productos.entrySet().iterator();
					
					while(it.hasNext()) {
						Map.Entry<Producto,String> prod = it.next();
						
						if (prod.getValue().equals(productoEliminar)) {
							it.remove();
						}
					}
					
					System.out.println("Producto borrado correctamente");
					
					break;
				case 5:
					
					System.out.println("Saliendo del programa...");
					
					break;
				default:
					
					System.out.println("Numero introducido invalido, vuelva a introducir un numero");
					
					break;
				}
		} while (opcion!=5);
		
		
		
	}
	
}
