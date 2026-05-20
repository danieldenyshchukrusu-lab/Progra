package ejercicio;

public class Libro extends Material {

	//ATRIBUTOS
	
	private String autor;
	private int numeroPaginas;
	
	//CONSTRUCTORES
	
	public Libro(String nombre, int anioPublicacion, int unidadesTotales, String autor, int numeroPaginas) {
		super(nombre, anioPublicacion, unidadesTotales);
		this.autor=autor;
		this.numeroPaginas=numeroPaginas;
	}
	
	//MÉTODOS

	@Override
	public int calcularDiasPrestamo(Socio s) {
		if (numeroPaginas<700 && s.getPrestamosActivos().size()<2) { //Piensa como agarrar 2 de ahi
			return 15;
		} else {
			return -1;
		}
	}
	
	@Override
	public String mostrarInformacion() {
		return super.mostrarInformacion()+ " Libro [autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}
	
	//GETTERS Y SETTERS
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
}
