package ud8.ejercicio8.ClasesAvanzadas;

import java.util.Scanner;

public class MainInvernadero {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		//VALORES
		
		int opcion=1;
		int semana=1;
		
		Verduras arrayVerduras[] = new Verduras[18];
		
		//MENÚ
		
		System.out.println("MENÚ PRINCIPAL – SEMANA" + semana);
		System.out.println("1.- Cosechar planta");
		System.out.println("2.- Nueva planta");
		System.out.println("3.- Informe del invernadero");
		System.out.println("4.- Avanzar 1 semana");
		System.out.println("5.- Salir");
		opcion=leer.nextInt();

		do {
			
		switch (opcion) {
		case 1: {
			int numero;
			
			System.out.println("Listado de plantas.");
			for (int i=0;i<arrayVerduras.length;i++) {
				System.out.println(arrayVerduras[i]);
			}
			
			System.out.println("¿Qué planta quieres cosechar?");
			numero=leer.nextInt();
			arrayVerduras[numero].
			
			break;
		}
		case 2: {
			
			break;
		}
		case 3: {
	
			break;
		}
		case 4: {
	
			break;
		}
		case 5: {
	
			break;
		}
		default:
			System.out.println("Opcion invalida. Vuelve a introducir otra opción");
		}
		
		} while (opcion!=5);
		
		//COSECHA DE PLANTA
		
		
		
		//NUEVA PLANTA
		
		
		
		//INFORME DEL INVERNADERO
		
		
		
		//AVANZAR UNA SEMANA
		
		
		
	}
}
