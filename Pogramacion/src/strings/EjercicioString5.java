package strings;

public class EjercicioString5 {
//	Crea una cadena con el nombre a y el valor mesa. Crea el caracter (char) con
//	el nombre b y el valor s. ¿Cuál es el resultado de hacer a=a+b?¿Podemos
//	concatenar una cadena con un char?
	public static void main(String[] args) {
		String a="mesa";
		char b='s';
		
		System.out.println((a=a+b));
		System.out.println("La respuesta es si, podemos concatenar una String con un char");
	}
}
