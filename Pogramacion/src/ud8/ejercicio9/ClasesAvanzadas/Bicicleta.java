package ud8.ejercicio9.ClasesAvanzadas;

public class Bicicleta {
	
	private int velocidadMaxima;
	private boolean tieneAsientoPasajero;

	public Bicicleta(int velocidadMaxima, boolean tieneAsientoPasajero) {
	    this.velocidadMaxima = velocidadMaxima;
	    this.tieneAsientoPasajero = tieneAsientoPasajero;
	}

	public int getVelocidadMaxima() {
	    return velocidadMaxima;
	}

	public boolean puedeTransportarPasajeros() {
	    return tieneAsientoPasajero;
	}
}
