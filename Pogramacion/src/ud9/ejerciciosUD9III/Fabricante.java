package ud9.ejerciciosUD9III;

public class Fabricante {
	
	//CONSTANTES Y ESTATICOS
	
	private static int numeroFabricantes = 0;
	private static final String paisDefecto = "---";
	
	//ATRIBUTOS
	
	private String nombre;
	private String pais;
	
	//CONSTRUCTORES
	
	public Fabricante(String nombre, String pais) {
		this.nombre=nombre;
		this.pais=pais;
		numeroFabricantes++;
	}
	
	public Fabricante(String nombre) {
		this.nombre=nombre;
		this.pais=paisDefecto;
		numeroFabricantes++;
	}

	//GETTERS Y SETTERS
	
	public static int getNumeroFabricantes() {
		return numeroFabricantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	//MÉTODOS
	
	public int mostrarNumFabricantes() {
		return getNumeroFabricantes();
	}

	@Override
	public String toString() {
		return "Fabricante: " + nombre + " - País: " + pais;
	}
	
	
}
