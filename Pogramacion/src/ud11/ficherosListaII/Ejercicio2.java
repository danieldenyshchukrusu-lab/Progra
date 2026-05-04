package ud11.ficherosListaII;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		PrintWriter pr = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		int contador = 0;
		int contadorNumeros = 0;
		
		String cadena;

		try {
			pr = new PrintWriter("C:/docs/numeros1-1000.csv");
			
			for (int i=0;i<=1000;i++) {
				while (contador < 10) {
					if (contador == 9) {
						contador++;
						contadorNumeros++;
						pr.print(contadorNumeros);
					} else {
						contador++;
						contadorNumeros++;
						pr.print(contadorNumeros+";");
					}
				}
				pr.println();
				contador=0;
			}
			pr.close();
			
			System.out.println("Completado correctamente");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
