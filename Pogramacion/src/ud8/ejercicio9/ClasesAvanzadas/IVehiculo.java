package ud8.ejercicio9.ClasesAvanzadas;

public interface IVehiculo {
	
	//MÉTODOS
	
	 int getVelocidadMaxima();

	 boolean puedeTransportarPasajeros();

	 default String mostrarDatos() {
	     return "Velocidad máxima: " + getVelocidadMaxima() +
	     " | Puede transportar pasajeros: " + puedeTransportarPasajeros();
	 }
}
