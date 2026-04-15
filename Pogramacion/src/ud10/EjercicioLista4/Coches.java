package ud10.EjercicioLista4;

public class Coches extends Vehiculos {
	
	//ATRIBUTOS
	
	private numPuertas numeroPuertas;
	private boolean aireAcondicionado;
	
	//CONSTRUCTORES
	
	public Coches(String marca, String modelo, int añoFabricacion, boolean estado, numPuertas numeroPuertas, boolean aireAcondicionado) {
		super(marca, modelo, añoFabricacion, estado);
		this.numeroPuertas=numeroPuertas;
		this.aireAcondicionado=aireAcondicionado;
	}
	
	public Coches() {
		
	}
	
	//GETTERS Y SETTERS
	
	public numPuertas getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(numPuertas numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	//TO_STRING
	
	@Override
	public String toString() {
		return super.toString()+ "Coches [numeroPuertas=" + numeroPuertas + ", aireAcondicionado=" + aireAcondicionado + "]";
	}
	
	
}
