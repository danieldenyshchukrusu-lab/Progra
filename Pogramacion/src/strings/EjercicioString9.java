package strings;

public class EjercicioString9 {
//	De cualquier palabra con un número par de letras, conseguir que la primera
//	mitad esté en mayúsculas y la segunda mitad en minúsculas. Probar con
//	"LoCoMoToRa"--> "LOCOMotora".
	public static void main(String[] args) {
		String str1="LoCoMoToRa";
		
		str1=str1.toLowerCase();
		String mitad=str1.substring(0,str1.length()/2);
		System.out.println(mitad);
		str1=str1.replace(mitad,mitad.toUpperCase());
		System.out.println(str1);
		
//		str1=str1.substring(0,str1.length()/2.toUpperCase()+str1.substring(str.length()/2);
//		System.out.println();
	}
}
