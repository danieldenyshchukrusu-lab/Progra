package ud9.ejerciciosUD9III;

import java.io.IOException;
import java.util.Scanner;

public abstract class Laptop extends Dispositivo {
	
	//ATRIBUTOS
	
	private int RAM;
	
	//CONSTRUCTORES
	
	public Laptop(String nombre, int precio, String firmware, Fabricante fabricante, int RAM) {
		super(nombre, precio, firmware, fabricante);
		this.RAM=RAM;
	}
	
	//MÉTODOS
	
	@Override
	public void activarWallet() throws WalletException {
	    Scanner leer = new Scanner(System.in);
	    System.out.print("Introduce PIN: ");
	    String pin = leer.nextLine();

	    if (pin.length() == 4) {
	    	for(int i=0;i<pin.length();i++) {
	    		if (pin.charAt(i)=='$') {
	    			 System.out.println("Wallet activado");
	    		}
	    	}
	    } else {
	        throw new WalletException("PIN inválido");
	    }
	}	
}
