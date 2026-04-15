package strings;

public class EjercicioString7 {
//	Crea un programa que obtenga en qué posición aparece por primera vez un
//	espacio. Y después del primer espacio en qué posición aparece el tercer
//	espacio. Prueba con la frase "En esta frase hay varios espacios".
	public static void main(String[] args) {
		String str1="En esta frase hay varios espacios";
		
		System.out.println(str1);
		int cont=0;
		
		for (int i=0;i<str1.length();i++) {
			char espacio = str1.charAt(i);
			
			if (espacio==' ') {
				cont++;
				if (cont==1) {
					System.out.println("El primer espacio se encuentra en la posicion " +i);
				} 
				if (cont==3) {
					System.out.println("El tercer espacio se encuentra en la posicion " +i);
				}
			}
		}	
	}
}
