package ud8.ejercicio2.ClasesAvanzadas;

public class Lavadora extends Electrodoméstico {
	
	//CONSTANTES
	
	private static final int CARGA_CONSTANTE = 5;
	
	//ATRIBUTOS
	
	private int carga;
	
	//CONSTRUCTORES
	
	public Lavadora() {
		
	}
	
	public Lavadora(int precioBase ,double peso) {
		super (precioBase, peso);
		this.carga=CARGA_CONSTANTE;
	}
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super (precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
	}
	
	//GETTERS Y SETTERS
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	//MÉTODOS 
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if (carga < 0) {
			carga = CARGA_CONSTANTE;
		}
		
		if (carga > 30) {
			precioFinal=precioFinal+50;
		}
		
		return precioFinal;
	}
}
