package ud8.ejercicio9.ClasesAvanzadas;

public class Coche {
	private int velocidadMaxima;
    private int capacidadPasajeros;

    public Coche(int velocidadMaxima, int capacidadPasajeros) {
        this.velocidadMaxima = velocidadMaxima;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public boolean puedeTransportarPasajeros() {
        return capacidadPasajeros > 0;
    }
}
