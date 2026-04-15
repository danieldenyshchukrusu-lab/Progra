package pooUD5.funcionesEjercicios5_1;

import java.util.Scanner;

public class Ejercicio7_1 {

	public static double precioConIVA(double precio) {
		double precioIVA=0.21;
		double resultado;
		resultado = precioIVA * precio;
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double productoIVA=0.0;
		double a;
		double resultado=0.0;
		
		for (int i=0;i<5;i++) {
			System.out.println("introduce el precio del producto");
			a=leer.nextDouble();
			resultado = precioConIVA(a);
			productoIVA=resultado+a;
			System.out.println("El iva que hay que aplicarle al producto es: " +resultado);
			System.out.println("Producto con IVA " +productoIVA);
			productoIVA=0;
		}
	}
}
