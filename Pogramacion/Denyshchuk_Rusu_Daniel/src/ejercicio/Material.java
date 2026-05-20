package ejercicio;

public abstract class Material implements GestionPrestamo {
	
	//ESTATICOS Y CONSTANTES
	
	private static int codUnico;
	
	//ATRIBUTOS
	
	private int cod;
	private String nombre;
	private int anioPublicacion;
	private int unidadesTotales;
	private int unidadesPrestadas;
	private int numeroVecesPrestado;
	
	//CONSTRUCTORES
	
	public Material(String nombre, int anioPublicacion, int unidadesTotales) {
		this.cod=codUnico++;
		this.nombre=nombre;
		this.anioPublicacion=anioPublicacion;
		this.unidadesTotales=unidadesTotales;
		this.unidadesPrestadas=0; 
		this.numeroVecesPrestado=0;
	}
	
	//METODOS
	
	public boolean hayDisponibles() {
		if (unidadesTotales>unidadesPrestadas) {
			return true;
		}
		return false;
	}
	
	public void prestar() {
		if (unidadesTotales>unidadesPrestadas) {
			unidadesPrestadas=unidadesPrestadas+1;
			numeroVecesPrestado=numeroVecesPrestado+1;
		} else {
			System.out.println("stock insuficiente");
		}
	}
	
	public void devolver() {
		unidadesPrestadas=unidadesPrestadas-1;
	}
	
	@Override
	public void tieneRetraso(int diasRetraso) {
		if (diasRetraso > 0) {
			System.out.println("Se ha devuelto con " +diasRetraso);
		} else if (diasRetraso==0) {
			System.out.println("No tiene retraso");
		}
	}

	@Override
	public abstract int calcularDiasPrestamo(Socio s);
	
	public String mostrarInformacion() {
		return cod + "," + nombre + "," + anioPublicacion
				+ "," + unidadesTotales + "," + unidadesPrestadas
				+ "," + numeroVecesPrestado;
	}
	
	public String mostrarInformacionFichero() {
		return cod + ";" + nombre + ";" + unidadesTotales;
	}
	
	//GETTERS Y SETTERS
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getUnidadesTotales() {
		return unidadesTotales;
	}

	public void setUnidadesTotales(int unidadesTotales) {
		this.unidadesTotales = unidadesTotales;
	}

	public int getUnidadesPrestadas() {
		return unidadesPrestadas;
	}

	public void setUnidadesPrestadas(int unidadesPrestadas) {
		this.unidadesPrestadas = unidadesPrestadas;
	}

	public int getNumeroVecesPrestado() {
		return numeroVecesPrestado;
	}

	public void setNumeroVecesPrestado(int numeroVecesPrestado) {
		this.numeroVecesPrestado = numeroVecesPrestado;
	}	
}