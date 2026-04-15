package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio18SumarValoresHasta0 {
//Crear un programa que solicite y vaya sumando los números introducidos
//por teclado hasta que se introduzca el valor 0. Al finalizar debe mostrar
//el total de números introducidos y la suma.
	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		int suma=0;
		int cont=0;
		int n=1; //Inicializamos esta variable a 1 porque si no no entra al while ya que minetras no sea igual a 0 se van sumando y contando los numeros.
		
		while (n!=0) {
		System.out.println("Introduce numeros para ir sumando (0 PARA FINALIZAR)");
			n=leer.nextInt();
			suma=suma+n;
			cont=cont+1;
		}
		leer.close();
		System.out.println("La suma de los numeros introducidos es " +(suma));
		System.out.println("Has introducido " +(cont-1)); //El -1 es para que no cuente el 0 que ponemos.
	}
}
