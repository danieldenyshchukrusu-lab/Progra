package ud9.ejerciciosUD9.UD9II;

import java.util.Scanner;

public class EjercicioBanco1 {
//	Crea una clase Banco que tenga una lista de cuentas bancarias. Implementa un
//	método retirarDinero que tome como parámetros una cuenta bancaria y una
//	cantidad de dinero a retirar. Si la cuenta no tiene suficiente dinero, lanza una
//	excepción personalizada SaldoInsuficienteException.
	
	public String nombreCuenta;
	public double dineroCuenta;

	public EjercicioBanco1 (String nombreCuenta, double dineroCuenta) {
		this.nombreCuenta=nombreCuenta;
		this.dineroCuenta=dineroCuenta;
	}
	
	public static double retirarDinero(EjercicioBanco1 cuentabancaria, double retirarDinero) throws IllegalArgumentException {
		
		if (cuentabancaria.dineroCuenta<=retirarDinero) {
			throw new IllegalArgumentException("SaldoInsuficenteException");
		} else {
			cuentabancaria.dineroCuenta-=retirarDinero;
			System.out.println("Dinero retirado exitosamente");
		}
		return retirarDinero;
	}
	
	@Override
	public String toString() {
		return "EjercicioBanco1 [nombreCuenta=" + nombreCuenta + ", dineroCuenta=" + dineroCuenta + "]";
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		EjercicioBanco1 lista[]=new EjercicioBanco1[3];
		
		EjercicioBanco1 cuentabancaria1=new EjercicioBanco1("Daniel",250.5);
		EjercicioBanco1 cuentabancaria2=new EjercicioBanco1("Ubu",200.8);
		EjercicioBanco1 cuentabancaria3=new EjercicioBanco1("Mikel",550.2);
		
		lista[0]=cuentabancaria1;
		lista[1]=cuentabancaria2;
		lista[2]=cuentabancaria3;
		
		System.out.println(lista[0]);
		
		retirarDinero(cuentabancaria1,100.5);
		
		System.out.println(lista[0]);
		
	}
}
