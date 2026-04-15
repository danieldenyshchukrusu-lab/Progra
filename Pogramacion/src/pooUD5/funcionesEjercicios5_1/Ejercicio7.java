package pooUD5.funcionesEjercicios5_1;

import java.util.Scanner;

public class Ejercicio7 {

	public static double precioConIVA(double precio) {
		double precioIVA=1.21;
		double resultado;
		resultado = precioIVA * precio;
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double a;
		double resultado=0.0;
		
		for (int i=0;i<5;i++) {
			System.out.println("introduce el precio del producto");
			a=leer.nextDouble();
			resultado = precioConIVA(a);
			System.out.println(resultado);
		}
	}
}
