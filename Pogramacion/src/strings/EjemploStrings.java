package strings;

public class EjemploStrings {
	public static void main(String[] args) {
		String cad="Hola mundo***";
		int longitud=cad.length();
		System.out.println("La longitud de la cadena es de"+longitud);
		
		String subCad=cad.substring(2,5);
		System.out.println(subCad);
		System.out.println("La longitud de la subcadena es "+subCad);
		
		System.out.println("--------------------------------------------------------");
		
		int edad=14;
		if(edad==18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		String nombre1="Ana";
		String nombre2="Cristina";
		if (nombre1==nombre2) {
			System.out.println("La persona es Ana");
		} else {
			System.out.println("La persona no es Ana");
		}
	}
}
