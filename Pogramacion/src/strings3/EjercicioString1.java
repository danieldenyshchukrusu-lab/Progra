package strings3;

import java.util.Scanner;

public class EjercicioString1 {
//	Escribe un programa que reciba una lista de correos separados por comas y:
//		• Verifique cuántos correos son válidos (contienen un @ y un dominio).
//		• Muestre los correos válidos.
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		String mails=" ";
		String substr=" ";
		String mailSep[]; 
		int pos=0;
		int cont=0;
		
		System.out.println("Introduce los correos separados por comas");
		mails=leer.nextLine();
		
		mailSep=mails.split(",");
		
		for (int i=0;i<mailSep.length;i++) {
			pos=mailSep[i].indexOf('@');
			System.out.println("La posicion de la @ en la direccion " +mailSep[i]+ " es " +pos);
			if (pos!=-1) {
				substr=mailSep[i].substring(pos);
				System.out.println(substr);
				pos=substr.indexOf('.');
				if (pos!=-1) {
					cont++;
					System.out.println("La direccion " +mailSep[i]+ " es una dirección válida");
				} else {
					System.out.println("La direccion " +mailSep[i]+ " no es una dirección válida");
				}
			} else {
				System.out.println("La direccion " +mailSep[i]+ " no es una dirección válida");
			}
		}
		leer.close();
	}
}
