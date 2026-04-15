package ud8.ejercicio2.ClasesAvanzadas;

public class Televisión extends Electrodoméstico {
	
	
	//CONSTANTES
	
	private static final boolean SINTETIZADOR_BASE = false;
	private static final int RESOLUCION_BASE = 20;
	
	//ATRIBUTOS
	
	private int resolucion = RESOLUCION_BASE;
	private boolean TDT = SINTETIZADOR_BASE;
	
	//CONSTRUCTORES
	
	public Televisión() {
		
	}
	
	public Televisión(int precioBase ,double peso) {
		super (precioBase, peso);
		this.resolucion=RESOLUCION_BASE;
		this.TDT=SINTETIZADOR_BASE;
	}
	
	public Televisión(int precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean TDT) {
		super (precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.TDT=TDT;
	}
	
	//GETTERS Y SETTERS
	
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTDT() {
		return TDT;
	}

	public void setTDT(boolean tDT) {
		TDT = tDT;
	}
	
	//MÉTODOS
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if (resolucion < 0) {
			resolucion = RESOLUCION_BASE;
		}
		
		if (resolucion > 40) {
			precioFinal=precioFinal*1.30;
			
		} else if (TDT = true){
			precioFinal=precioFinal+50;
		}
		
		return precioFinal;
	}
}
