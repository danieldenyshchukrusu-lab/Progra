package ud6_7.ejercicio17;

public class EjecuciónCuentaCorriente {
	public static void main(String[] args) {
		CuentaCorriente cuenta1=new CuentaCorriente("06690345J","Daniel");
		
		cuenta1.muestraInformacion();
		cuenta1.sacardinero(20);
		cuenta1.muestraInformacion();
		cuenta1.ingresarDinero(100);
		cuenta1.sacardinero(20);
		cuenta1.muestraInformacion();
		
		CuentaCorriente cuenta2=new CuentaCorriente("123456J",100); 
			
		cuenta2.muestraInformacion();
		cuenta2.sacardinero(20);
		cuenta2.muestraInformacion();
		cuenta2.ingresarDinero(100);
		cuenta2.sacardinero(20);
		cuenta2.muestraInformacion();
	}
}
