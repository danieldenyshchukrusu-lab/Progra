package strings2;

public class EjercicioString1 {
//	Vamos a partir una frase en cuatro partes, para ellos:
//		• Partiremos la frase en dos.
//		• A continuación, partir cada una de las dos mitades en otras dos.
//		• Mostramos las cuatro partes. (Si en cualquier división el número es
//		impar, la segunda mitad tendrá un carácter más).
//		Probarlo con “Esta es la frase que vamos a partir en cuatro”
	public static void main(String[] args) {
		
		String str1="Esta es la frase que vamos a partir en cuatro";
		String resultado1=" ";
		String resultado2=" ";
		String resultado3=" ";
		String resultado4=" ";
		
		resultado1=str1.substring(0,str1.length()/2);
		System.out.println(resultado1);
		
	}
}
