package strings;

public class EjercicioString6 {
//	Crea un programa que muestre cada una de las letras de una frase en una
//	línea, exceptuando los espacios. Probar con "Este es el Ejercicio 5". El
//	resultado debe mostrar:
	public static void main(String[] args) {
		String str1="Este es el Ejercicio 5";
		
		System.out.println(str1);
		
		for (int i=0;i<str1.length();i++) {
			char caracter = str1.charAt(i);
			if(caracter!=' ')
			System.out.println(caracter);
		}
	}
}
