package strings;

public class EjercicioString1 {
//	Obtener la suma de la longitud de estas tres palabras: "coche",
//	"locomotora","camión".
	public static void main(String[] args) {
		String str1="coche";
		String str2="locomotora";
		String str3="camión";
		int suma=0;
		
		int longitud=str1.length();
		int longitud1=str2.length();
		int longitud2=str3.length();
		
		suma=longitud+longitud1+longitud2;
		
		System.out.println(suma);
		
	}
}
