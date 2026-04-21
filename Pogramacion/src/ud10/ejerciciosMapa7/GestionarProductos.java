package ud10.ejerciciosMapa7;

import java.util.HashMap;
import java.util.Map;

public class GestionarProductos {
//	2. Desarrollar un programa en Java que utilice un mapa para gestionar
//	productos, donde cada producto esté representado por un objeto con
//	atributos como nombre, precio y cantidad en stock.
//	La clave será el nombre y el valor será el objeto producto representado
//	por ese nombre.
//	El programa debe crear un mapa con 5 productos, cada uno representado
//	por un objeto Producto. Luego calculará la cantidad media y el precio
//	medio de los productos almacenados en el mapa.
	public static void main(String[] args) {
		
		Producto prod1 = new Producto("Bollo",2.5,5);
		Producto prod2 = new Producto("Croissant",1,12);
		Producto prod3 = new Producto("Pan",0.5,20);
		Producto prod4 = new Producto("Tarta",5,11);
		Producto prod5 = new Producto("Mantecado",3,8);
		
		int i=0;
		
		double cantidadMedia=0.0;
		double precioMedio=0.0;
		
		Map<String,Producto> productos = new HashMap<>();
		
		productos.put(prod1.getNombre(),prod1);
		productos.put(prod2.getNombre(),prod2);
		productos.put(prod3.getNombre(),prod3);
		productos.put(prod4.getNombre(),prod4);
		productos.put(prod5.getNombre(),prod5);
		
		//Calcular la cantidad media y el precio medio de los productos almacenados.
		
		for (Map.Entry<String,Producto> a : productos.entrySet()) {
			precioMedio+=a.getValue().getPrecio();
			cantidadMedia+=a.getValue().getStock();
		}
		
		System.out.println("El precio medio de todos los productos es: "+ precioMedio/productos.size());
		System.out.println("La cantidad media de todos los productos es: "+ cantidadMedia/productos.size());
		
	}
}
