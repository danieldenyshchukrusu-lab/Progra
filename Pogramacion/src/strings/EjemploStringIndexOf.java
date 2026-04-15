package strings;

public class EjemploStringIndexOf {
	public static void main(String[] args) {
		String str1="En esta fase hay que variar espacios";
		
		int pos=str1.indexOf(' ');
		System.out.println("El primer espacio esta en la posición " +pos);
		
		pos=str1.indexOf(' ',pos+1);
		pos=str1.indexOf(' ',pos+1);
		System.out.println("El tercer espacio esta en la posicion " +pos);
	}
}
