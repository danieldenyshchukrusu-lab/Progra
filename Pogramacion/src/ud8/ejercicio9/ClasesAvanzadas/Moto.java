package ud8.ejercicio9.ClasesAvanzadas;

public class Moto {
	private int velocidadMaxima;

	public Moto(int velocidadMaxima) {
	    this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadMaxima() {
	    return velocidadMaxima;
	}

	public boolean puedeTransportarPasajeros() {
	    return false;
	}
}
