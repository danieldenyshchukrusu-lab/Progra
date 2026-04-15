package strings;

public class EjercicioString8 {
//	Crea un programa que cuente el número de veces que aparece la letra "e"
//	(Mayúscula o minúscula). Probar con la frase "Este ejercicio es el primero
//	que cuenta letras".
	public static void main(String[] args) {
		String str1="Este ejercicio es el primero que cuenta letras";
		int cont=0;
		
		for (int i=0;i<str1.length();i++) {
			char e = str1.charAt(i);
			if (e=='e'||e=='E') {
				cont++;
			}
		}
		System.out.println("Hay " +cont+ " letras 'e' en esta string");
	}
}
