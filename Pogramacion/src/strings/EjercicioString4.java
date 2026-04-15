package strings;

public class EjercicioString4 {
//	Crea cuatro String con los valores "uno", "dos", "tres" y "cuatro".
//	A partir de estos String crear otro que contenga "uno, dos, tres y cuatro".
	public static void main(String[] args) {
		String str1="uno, ";
		String str2="dos, ";
		String str3="tres y ";
		String str4="cuatro";
		String strCombinada="";
		
		strCombinada=str1+str2+str3+str4;
		
		System.out.println(strCombinada);
		
	}
}
