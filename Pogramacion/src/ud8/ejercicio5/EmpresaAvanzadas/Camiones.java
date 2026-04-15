package ud8.ejercicio5.EmpresaAvanzadas;

public class Camiones extends Vehiculo {
	
	//ATRIBUTOS
	
	private int numeroRuedas;
	private int limiteCarga;
	private int carga;
	private String conductor;
	
	//CONSTRUCTORES
	
	public Camiones() {
		
	}
	
	public Camiones(String matricula, String marca, int autonomia, int año, int numeroRuedas, int limiteCarga, int carga, String conductor) {
		super(matricula, marca, autonomia, año);
		this.numeroRuedas=numeroRuedas;
		this.limiteCarga=limiteCarga;
		this.carga=this.ComprobarCarga(carga); //Si la comprobacion devuelve algo, tenemos que ponerlo de esta manera, si es un VOID la comprobacion, solo "ComprobarCarga(carga);".
		this.conductor=conductor;
	}
	
	//GETTERS Y SETTERS
	
	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getLimiteCarga() {
		return limiteCarga;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	//MÉTODO LISTAR (TOSTRING)
	
	public String Listar() {
		return "Camiones [numeroRuedas=" + numeroRuedas + ", limiteCarga=" + limiteCarga + ", carga=" + carga
				+ ", conductor=" + conductor + ", toString()=" + super.toString() + "]";
	}
	
	//MÉTODOS
	
	public int ComprobarCarga(int carga) {
		int cargaCorrecta;
		if (this.limiteCarga < carga) {
			cargaCorrecta = limiteCarga; 
		} else {
			cargaCorrecta = carga;
		}
	return cargaCorrecta;
	}
	
	public void CambiarConductor(String conductor) {
		this.conductor=conductor;
	}
	
	public void Cargar(int incrementoCarga) {
		if((this.carga+incrementoCarga) > this.limiteCarga) {
			this.carga=this.limiteCarga;
		} else {
			this.carga=this.carga+incrementoCarga;
		}
	}
	
	public void Descargar(int descargarCarga) {
		if((this.carga-descargarCarga)<0) {
			this.carga=0;
		} else {
			this.carga=this.carga-descargarCarga;
		}
	}
}
