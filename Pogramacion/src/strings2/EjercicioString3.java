package strings2;

public class EjercicioString3 {
//	Obtener en qué posición está la cuarta ‘a’ en una frase. Si la frase tiene
//	menos de 4 aes tiene que indicarlo. “Probarlo con “Esta es una frase con
//	unas cuantas aes”.
	public static void main(String[] args) {
		String str1="Esta es una frase con unas cuantas aes";
		char caracter='a';
		int cont=0;
		
		for (int i=0;i<str1.length();i++) {
			caracter=str1.charAt(i);
			
			if (caracter=='a') {
				cont++;
				if (cont==4) {
					System.out.println("la cuarta a esta en la posicion " +i);
				}
			}
		}
		if (cont<4) {
			System.out.println("El array tiene menos de 4 aes");
		}
	}
}
