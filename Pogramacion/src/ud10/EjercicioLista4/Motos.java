package ud10.EjercicioLista4;

public class Motos extends Vehiculos {

	//ATRIBUTOS
	
	private boolean almacenamiento;
	
	//CONSTRUCTORES
	
	public Motos(String marca, String modelo, int añoFabricacion, boolean estado, boolean almacenamiento) {
		super(marca, modelo, añoFabricacion, estado);
		this.almacenamiento=almacenamiento;
	}
	
	public Motos() {
		
	}
	
	//GETTERS Y SETTERS
	
	public boolean isAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(boolean almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	
	//TO_STRING
	
	@Override
	public String toString() {
		return super.toString()+ "Motos [almacenamiento=" + almacenamiento + "]";
	}
	
}
 