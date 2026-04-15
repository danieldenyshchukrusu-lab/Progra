package ud10.ejemplosColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int a;
		int sumaPos=0;
		int sumaNeg=0;
		
		List<Integer> pos=new ArrayList<>();
		List<Integer> neg=new ArrayList<>();
		
		do {
			System.out.println("Introduce un valor");
			a=leer.nextInt();
			
			if (a>0) {
				pos.add(a);
			} else if (a<0){
				neg.add(a);
			}
			
		} while (a!=0);
		
		//Muestra el valor que hay en posiciones pares
		
		int j=0;
		for (Integer n: pos) {
			if (j%2==0) {
				System.out.println(n);
			}
			j++;
		}
		
		//Esto es lo mismo pero con for, ve comparando.
		
		for (int i=0;i<pos.size();i++) {
			if (i%2==0) {
				System.out.println(pos.get(i));
			}
		}
		
	}
}
