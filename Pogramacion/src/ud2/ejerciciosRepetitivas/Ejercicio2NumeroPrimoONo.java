package ud2.ejerciciosRepetitivas;

import java.util.Scanner;

public class Ejercicio2NumeroPrimoONo {
//	Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
	
//Recuerda si un numero es divisible por mas de 2 numeros, ya no es primo. ya que un primo es divisible entre si y 1.
	public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	
	int n=0;
	int cont=0;
	
		System.out.println("Introduce un numero e identificaremos si es primo o no");
		n=leer.nextInt();
		leer.close();
		
		for (int i=0;i<=n;i++) {
			if (n%i==0) {
				cont=cont+1;
			}
			
		}
	}
}
