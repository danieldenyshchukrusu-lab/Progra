package strings2;

public class EjercicioString4 {
//	Obtener el número de palabras que hay en cualquier frase. Probarlo con “A
//	ver cuántas palabras hay aquí.”
	public static void main(String[] args) {
		String str1="A ver cuántas palabras hay aquí.";
		String palabras[];
		int contPalabras=0;
		
		palabras=str1.split(" ");
//		for (int i=0;i<palabras.length;i++) {
//			System.out.println(palabras[i]);
//			contPalabras++;
//		}
//		System.out.println(" ");
//		System.out.println("En esta frase hay " +contPalabras +" palabras");
		
		System.out.println("Hay " +palabras.length+ " palabras");
		
	}
}

