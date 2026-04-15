package ud2.ejerciciosCondicionales;

public class Ejercicio16SumaImparesExcepto13y17 {
	public static void main(String[] args) {
		
		int suma=0;
		
		for (int i=3;i<=21;i=i+1) {
			if (i%2!=0) {
			} if (i!=13 || i!=17) {
				suma=suma+i;
			}
		}
		System.out.println(suma);
	}
}
