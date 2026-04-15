package strings2;

public class EjercicioString2 {
//	En cualquier frase sustituir todas las posiciones múltiplos de 3 por ‘#’.
//	Probarlo con “Esta es la frase donde vamos a poner almohadillas”.
	public static void main(String[] args) {
		String str1="Esta es la frase donde vamos a poner almohadillas";
		String strFinal="";
		char almohadilla='#';
		
		for (int i=0;i<str1.length();i++) {
			if (i%3==0 && i!=0) {
				strFinal = strFinal + "#";
			} else {
				strFinal = strFinal + str1.charAt(i);
			}
		}
		System.out.println(strFinal);
	}
}
