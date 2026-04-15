package ud6_7.ejercicio16;

public class EjeccuciónCuentaCorriente {
	public static void main(String[] args) {
		CuentaCorriente cuenta1=new CuentaCorriente("06690345J","Daniel");
		
		cuenta1.muestraInformacion();
		cuenta1.sacardinero(20);
		cuenta1.muestraInformacion();
		cuenta1.ingresarDinero(100);
		cuenta1.sacardinero(20);
		cuenta1.muestraInformacion();
		
		
	}
}
