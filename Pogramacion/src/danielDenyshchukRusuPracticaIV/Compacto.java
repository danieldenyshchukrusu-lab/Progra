package danielDenyshchukRusuPracticaIV;

public class Compacto extends Vehiculos {
	
	//ATRIBUTOS
	
	private NPuertas numeroPuertas;
	private boolean aireAcondicionado; 
	
	//CONSTRUCTORES
	
	public Compacto() {
		
	}
	
	public Compacto(boolean disponible, String matricula,NPuertas numeroPuertas , boolean aireAcondicionado) {
		super(disponible, matricula);
		this.numeroPuertas=numeroPuertas;
		this.aireAcondicionado=aireAcondicionado;
	}
	
	//TO-STRING
	
	@Override
	public String toString() {
		return super.toString()+ " [numeroPuertas=" + numeroPuertas + ", aireAcondicionado=" + aireAcondicionado + "]";
	}
	
	//MÉTODOS

	@Override
	public double CalcularCosteAlquiler() {
		double suma;
		double precioAumento;
		
		precioAumento=1.15;
		suma = super.CalcularCosteAlquiler() * precioAumento;
		
		if (aireAcondicionado == true) {
			suma=suma+3;
		}
		return suma;
	}
}
