package ejercicio;

public interface GestionPrestamo {
	
	public abstract void tieneRetraso(int diasRetraso); /* no se si este deberia ser default */
	
	public abstract int calcularDiasPrestamo(Socio s);
	
}
