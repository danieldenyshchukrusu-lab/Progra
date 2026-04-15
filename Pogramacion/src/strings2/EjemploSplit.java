package strings2;

public class EjemploSplit {
	public static void main(String[] args) {
		String str1="Hola, cómo estas";
		String salida[];
		
		salida=str1.split("o");
		for (int i=0;i<salida.length;i++) {
			System.out.println(salida[i]);
		}
	}
}
