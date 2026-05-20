package ejercicio;

public class Pelicula extends Material {

	//ATRIBUTOS
	
	private String director;
	private int duracionMinutos;
	private ClasificacionEdad clasificacion;
	
	//CONSTRUCTORES
	
	public Pelicula(String nombre, int anioPublicacion, int unidadesTotales, String director, int duracionMinutos, ClasificacionEdad clasificacion) {
		super(nombre, anioPublicacion, unidadesTotales);
		this.director=director;
		this.duracionMinutos=duracionMinutos;
		this.clasificacion=clasificacion;
	}
	
	//METODOS
	
	@Override
	public int calcularDiasPrestamo(Socio s) {
		if (s.getEdad()<18 && getClasificacion()==ClasificacionEdad.MAS18) {
			return 5;
		} else {
			return -1;
		}
	}
	
	@Override
	public String mostrarInformacion() {
		return super.mostrarInformacion()+ "Pelicula [director=" + director + ", duracionMinutos=" + duracionMinutos + ", clasificacion="
				+ clasificacion + "]";
	}
	
	//GETTERS Y SETTERS

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public ClasificacionEdad getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(ClasificacionEdad clasificacion) {
		this.clasificacion = clasificacion;
	}
	
}
