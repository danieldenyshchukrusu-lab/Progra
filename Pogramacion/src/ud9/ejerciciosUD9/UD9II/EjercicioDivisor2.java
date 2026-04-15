package ud9.ejerciciosUD9.UD9II;

import java.util.Scanner;

public class EjercicioDivisor2 {
//	Crea una clase Divisor que tenga un método dividir que tome como parámetros
//	dos números. Si el segundo es cero, lanza una excepción
//	DivisionPorCeroException.
	
	public static void Divisor(int n, int m) throws ArithmeticException {
		int resultado;
		if (m==0) {
			throw new ArithmeticException("DivisionPorCeroException");
		} else
		resultado=n/m;
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int n;
		int m;
		
		System.out.println("Introduce el primer numero para la division");
		n=leer.nextInt();
		System.out.println("Introduce el segundo numero para la division");
		m=leer.nextInt();
		
		Divisor(n,m);
	}
}
