package strings2;

public class EjercicioString6 {
//	En cualquier frase sustituir las primeras tres letras ‘a’ por tres asteriscos.
//	Probarlo con la frase “Esta es la frase en la que vamos a probar”.
	public static void main(String[] args) {
		String str1="Esta es la frase en la que vamos a probar";
		char caracter='a';
		int cont=0;
		
		System.out.println(str1);
		
		for (int i=0;i<str1.length();i++) {
			caracter = str1.charAt(i);
			if (cont<3) {
				if (caracter=='a') {
					System.out.print("*");
				}
			}
		}
		System.out.println(" ");
		System.out.println(str1);
	}
}
