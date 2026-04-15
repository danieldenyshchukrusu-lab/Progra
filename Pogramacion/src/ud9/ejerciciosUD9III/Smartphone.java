package ud9.ejerciciosUD9III;

import java.io.IOException;
import java.util.Scanner;

public abstract class Smartphone extends Dispositivo {
	
	//ATRIBUTOS
	
	private int mAh;
	
	//CONSTRUCTORES
	
	public Smartphone(String nombre, int precio, String firmware, Fabricante fabricante, int mAh) {
		super(nombre, precio, firmware, fabricante);
		this.mAh=mAh;
	}
	
	//MÉTODOS
	
	@Override
	public void activarWallet() throws WalletException {
	    Scanner leer = new Scanner(System.in);
	    System.out.print("¿Biometría activada? (true/false): ");
	    Boolean respuesta = leer.nextBoolean();

	    if (respuesta==true) {
	        System.out.println("Wallet activado");
	    } else {
	        throw new WalletException("Biometría no activada");
	    }
	}
}
