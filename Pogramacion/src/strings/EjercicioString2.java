package strings;

public class EjercicioString2 {
//	Obtener qué tres caracteres hay en las posiciones 0, 13 y 18 de una frase,
//	probar con "En un lugar de la Mancha".
	public static void main(String[] args) {
		String str1="En un lugar de la Mancha";
		
		char caracter = str1.charAt(0);
		char caracter1 = str1.charAt(13);
		char caracter2 = str1.charAt(18);
		
		System.out.println(caracter);
		System.out.println(caracter1);
		System.out.println(caracter2);
	}
}
