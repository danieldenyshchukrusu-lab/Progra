package ud8.ejercicio5.EmpresaAvanzadas;

public class Coches extends Vehiculo {
	
	//CONSTANTES
	
	private static final int NUMERO_RUEDAS_COCHE = 4;
	
	//ATRIBUTOS
	
	private int numeroRuedas=NUMERO_RUEDAS_COCHE;
	private String color;
	private int numeroPasajeros;
	private boolean descapotable;
	
	//CONSTRUCTORES
	
	public Coches() {
		
	}
	
	public Coches(String matricula, String marca, int autonomia, int año, String color, int numeroPasajeros, boolean descapotable ) {
		super(matricula, marca, autonomia, año);
		this.numeroRuedas=NUMERO_RUEDAS_COCHE;
		this.color=color;
		this.numeroPasajeros=numeroPasajeros;
		this.descapotable=descapotable;
	}
	
	//GETTERS Y SETTERS
	
	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	//MÉTODO LISTAR (TOSTRING)
	
	public String Listar() {
		return "Coches [numeroRuedas=" + numeroRuedas + ", color=" + color + ", numeroPasajeros=" + numeroPasajeros
				+ ", descapotable=" + descapotable + ", toString()=" + super.toString() + "]";
	}
	
	//MÉTODOS
	
	public void Pintar(String color) {
		this.color=color;
	}
}
