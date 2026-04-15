package ud2.ejerciciosCondicionales;

public class Ejercicio8ForWhileDoWhile {
//	Crea un programa para obtener un listado de todos los números pares del 2 al 20.
//	Realiza el ejercicio de 3 formas diferentes (utilizando un bucle for, while y do-
//	while).

	public static void main(String[] args) {
		
		int n=0;
		int n1=0;
		
		//1. FOR
		for (int i=2;i<=20;i = i + 2) {
				System.out.println(i); 
				
		//2. WHILE
		while (n<20) {
			n=n+1;
			if (n%2==0) {
				System.out.println(n);
			}
		}
		//3. DO-WHILE
		do {
			n1=n1+2;
				System.out.println(n1);
		} while (n1<=18);
		
			}
		}
	}

