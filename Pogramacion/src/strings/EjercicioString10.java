package strings;

import java.util.Scanner;

public class EjercicioString10 {
//	Captura una frase por teclado y mostraremos todas las vocales en
//	mayúsculas.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce una frase por teclado, y la mostraremos en mayuscula");
		String str1="";
		
		str1=leer.nextLine();
		
		str1=str1.replace("a","A");
		str1=str1.replace("e","E");
		str1=str1.replace("i","I");
		str1=str1.replace("o","O");
		str1=str1.replace("u","U");
		
		System.out.println(str1);
		leer.close();
	
	}
}
