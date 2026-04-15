package ud8.ejercicio8.ClasesAvanzadas;

public class Tomate {

	//CONSTANTE 
	
	private static final double COSTOPORSEMANA = 0.5;
	
	//ATRIBUTOS
	
	private int tiempoPlantadoSemana=1;
	private TipoTomate tipo;
	private TomateMadurez maduracion;
	private double precio;
	
	//CONSTRUCTOR
	
	public Tomate() {
		
	}
	
	public Tomate(int tiempoPlantadoSemana, TipoTomate tipo) {
		this.tiempoPlantadoSemana=tiempoPlantadoSemana;
		this.tipo=tipo;
		CalcularMadurez();
//		PrecioDeVenta();
	}
	
	//MÉTODOS
	
	public void CostoDeCultivo() {
		System.out.println(this.tiempoPlantadoSemana*COSTOPORSEMANA);
	}
	
//	public void PrecioDeVenta() {
//		if (this.tipo==TipoTomate.CHERRY) {
//			this.precio=6;
//		} else if (this.tipo==TipoTomate.PERA) {
//			this.precio=4;
//		} else {
//			this.precio=7;
//		}
//	}
	
	public void CalcularMadurez() {
		if (this.tiempoPlantadoSemana<=3) {
			this.maduracion = TomateMadurez.VERDE;
		} else if (this.tiempoPlantadoSemana<=6) {
			this.maduracion = TomateMadurez.MADURANDO;
		} else {
			this.maduracion = TomateMadurez.MADURO;
		}
	}
	
	public void Cosechar() {
		if (this.maduracion==TomateMadurez.MADURO) {
			System.out.println("Este tomate se ha vendido a: ");
		} else {
			System.out.println("No se puede vender el tomate. No esta maduro");
		}
	}
	
}
