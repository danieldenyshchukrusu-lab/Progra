package ud8.ejercicio8.ClasesAvanzadas;

public class Lechuga {
	
	//ATRIBUTOS
	
	private int tiempoPlantadoSemana=1;
	private TipoLechuga tipo;
	private LechugaMadurez maduracion;
	private double precio;
	
	//CONSTRUCTORES
	
	public Lechuga() {
		
	}
	
	public Lechuga(int tiempoPlantadoSemana, TipoLechuga tipo) {
		this.tiempoPlantadoSemana=tiempoPlantadoSemana;
		this.tipo=tipo;
		CalcularMadurez();
//		PrecioDeVenta();
	}
	
	//MÉTODOS
	
	public void CalcularMadurez() {
		if (this.tiempoPlantadoSemana<=2) {
			this.maduracion = LechugaMadurez.TIERNA;
		} else if (this.tiempoPlantadoSemana<=4) {
			this.maduracion = LechugaMadurez.CRECIMIENTO;
		} else {
			this.maduracion = LechugaMadurez.LISTACOSECHA;
		}
	}
	
	public void Cosechar() {
		if (this.maduracion==LechugaMadurez.LISTACOSECHA) {
			System.out.println("Esta lechuga se ha vendido a: ");
		} else {
			System.out.println("No se puede vender la lechuga. No esta lista para la cosecha");
		}
	}
	
}
