package ud8.ejercicio2.ClasesAvanzadas;

import java.util.Scanner;

public class MainElectrodoméstico {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		Electrodoméstico e[]=new Electrodoméstico[4]; //Los corchetes del array se pueden poner delante de electrodomestico o delante de "e" en este caso
		
		//creo 4 objetos de tipo electrodoméstico
		Electrodoméstico l1=new Lavadora(); //deberia ser 120.
		Electrodoméstico e1=new Electrodoméstico(150, 7); //Esto esta bien
		Electrodoméstico e2=new Televisión (120, "negro", 'C', 4, 30, false); //deberia ser 190.
		Electrodoméstico tv1=new Televisión(90,6); //deberia ser 110.
		
		//relleno el array electrodomestico
		e[0]=l1;
		e[1]=e1;
		e[2]=e2;
		e[3]=tv1;
		
		//Ejecutamos precio final en las posiciones del array.
//		System.out.println("El precio final de l1 es:" + l1.precioFinal());
//		System.out.println("El precio final de e1 es:" + e1.precioFinal());
//		System.out.println("El precio final de e2 es:" + e2.precioFinal());
//		System.out.println("El precio final de tv1 es:" + tv1.precioFinal());
		
		double sumaTotal=0;
		for(int i=0;i<e.length;i++) {
			System.out.println("El precio final del electrodoméstico es " +e[i].precioFinal());
			sumaTotal=sumaTotal+e[i].precioFinal();
		}
		
		double sumaPreciosLavadoras=0;
		double sumaPreciosTelevisores=0;
		for (int i=0;i<e.length;i++) {
			if (e[i] instanceof Lavadora) { //Con el instanceof comprobamos si el objeto ha sido creado con un constructor de lavadora.
				sumaPreciosLavadoras=sumaPreciosLavadoras+e[i].precioFinal();
			} else if (e[i] instanceof Televisión) {
				sumaPreciosTelevisores=sumaPreciosTelevisores+e[i].precioFinal();
			}
		}
		System.out.println("El precio de todas las lavadoras es: " +sumaPreciosLavadoras);
		System.out.println("El precio de todos los televisores es: " +sumaPreciosTelevisores);
		
		//CRISTINA: PildoraInformatica, tutoriales youtube. (Y tambien Disco Duro de Roer ejercicios POO)
	}
}
