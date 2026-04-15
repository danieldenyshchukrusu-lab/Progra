package ud8.ejercicio6.ClasesAvanzadas;

import java.util.Scanner;

public class MainArticulo {
	
	static Scanner leer=new Scanner(System.in);
	
	static Almacen almacen=new Almacen();
	
	public static void main(String[] args) {
		
		int opcion;
		
		System.out.println("Introduce una opcion");
		System.out.println("");
		opcion=leer.nextInt();
		
		do {
			
		System.out.println("---MENU---");
		System.out.println("1. Introducir articulo SOFTWARE");
		System.out.println("2. Introducir articulo HARDWARE");
		System.out.println("3. MOSTRAR TODOS LOS ARTICULOS");
		System.out.println("4. Salir");
		
		} while (opcion<1 || opcion>4); 
		
		switch (opcion ) {
		case 1:
			nuevoSoftware();
			break;
		case 2: 
			nuevoHardware();
			break;
		case 3: 
			mostrarArticulos();
			break;
		case 4: 
			salir();
			break;
		}
	}
	
	public static void nuevoSoftware() {
		Articulo s1=new Software();
		
		System.out.println("Dime código");
		s1.setCodigo(leer.nextLine());
		System.out.println("Dime nombre");
		s1.setNombre(leer.nextLine());
		System.out.println("Dime precio");
		s1.setPrecio(leer.nextDouble());
		System.out.println("Dime precio");
		s1.setPrecio(leer.nextDouble());
		System.out.println("Dime Stock");
		s1.setStock(0);
		System.out.println("Dime tipo de software");
		((Software)s1).setTipo(leer.nextLine());
		
		almacen.aniadirArticulo(s1);
	}
	
	public static void nuevoHardware() {
		Articulo h1=new Hardware();
		
		System.out.println("Dime código");
		h1.setCodigo(leer.nextLine());
		System.out.println("Dime nombre");
		h1.setNombre(leer.nextLine());
		System.out.println("Dime precio");
		h1.setPrecio(leer.nextDouble());
		System.out.println("Dime precio");
		h1.setPrecio(leer.nextDouble());
		System.out.println("Dime Stock");
		h1.setStock(0);
		System.out.println("Dime tipo de software");
		((Hardware)h1).setPeriferico(leer.nextBoolean());
		
		almacen.aniadirArticulo(h1);
	}
	
	public static void salir() {
		System.out.println("Saliendo...");
	}
	
	public static void mostrarArticulos() {
		for (int i=0;i<almacen.length || almacen[i]!=null;i++) {
			almacen[i].toString();
		}
	}
}
