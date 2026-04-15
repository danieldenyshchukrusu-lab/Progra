package ud9.ejerciciosUD9III;

import java.io.IOException;

public abstract class Dispositivo {
	
	//ATRIBUTOS
	
	private String nombre;
	private int precio;
	private String firmware;
	private Fabricante fabricante;
	
	//CONSTRUCTORES
	
	public Dispositivo(String nombre, int precio, String firmware, Fabricante fabricante) {
		this.nombre=nombre;
		this.precio=precio;
		this.firmware=firmware;
		this.fabricante=fabricante;
	}
		
	//MÉTODOS
	
	 public void actualizarFirmware(String nuevaVersion) {
	     if (esVersionSuperior(nuevaVersion, this.firmware)) {
	         this.firmware = nuevaVersion;
	         System.out.println("Firmware actualizado a " + nuevaVersion);
	     } else {
	         System.out.println("No se ha actualizado. La versión es inferior o igual.");
	     }

	 }

	 private boolean esVersionSuperior(String nueva, String actual) {
	    String[] nuevaPartes = nueva.split("\\.");
	    String[] actualPartes = actual.split("\\.");

	    int longitud = Math.max(nuevaPartes.length, actualPartes.length);

	    for (int i = 0; i < longitud; i++) {
	        int n = i < nuevaPartes.length ? Integer.parseInt(nuevaPartes[i]) : 0;
	        int a = i < actualPartes.length ? Integer.parseInt(actualPartes[i]) : 0;

	        if (n > a) return true;
	        if (n < a) return false;
	    }
	    return false; // son iguales
	}

	public abstract void activarWallet() throws WalletException;

}
