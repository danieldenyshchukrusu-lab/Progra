package strings;

public class EjercicioString3 {
//	Obtener la subcadena de la posición 4 a la 8 en una frase. Probar con la frase
//	"Ahora estamos en este ejercicio".
	public static void main(String[] args) {
		String str1="Ahora estamos en este ejercicio";
		
		String substr1=str1.substring(4,8);
		System.out.println(substr1);
	}
}
