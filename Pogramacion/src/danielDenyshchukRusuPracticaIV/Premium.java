package danielDenyshchukRusuPracticaIV;

public class Premium extends Vehiculos {
	
	//ATRIBUTOS
	
	private boolean seguroRiesgo;
	private String motorCaballos;
	
	//CONSTRUCTORES
	
	public Premium() {
		
	}
	
	public Premium(boolean disponible, String matricula, boolean seguroRiesgo, String motorCaballos) {
		super(disponible, matricula);
		this.seguroRiesgo=seguroRiesgo;
		this.motorCaballos=motorCaballos;
	}
	
	//TO-STRING
	
	@Override
	public String toString() {
		String comprobacionSeguro=" ";
		if (this.seguroRiesgo == true) {
			comprobacionSeguro="SI";
		} else {
			comprobacionSeguro="NO";
		}
		
		return super.toString()+ " [seguroRiesgo=" + comprobacionSeguro + ", motorCaballos=" + motorCaballos + "]";
	}
	
	//MÉTODOS
	
	@Override
	public double CalcularCosteAlquiler() {
		double suma;
		double precioAumento;
		
		precioAumento=1.40;
		suma = super.CalcularCosteAlquiler() * precioAumento;
		
		if (seguroRiesgo == true) {
			suma=suma*1.10;
		}
		return suma;
		
	}
}
