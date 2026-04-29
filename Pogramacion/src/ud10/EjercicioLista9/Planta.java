package ud10.EjercicioLista9;

import java.util.Objects;

public abstract class Planta  {
	
	//ESTATICOS Y CONSTANTES
	
	private static int totalplantas;
	private static int idplanta;
	
	//ATRIBUTOS
	
	private String nombre;
	private double altura;
	private boolean NecesitaAgua;
	private int IDPlanta;
	private int MAX_AGUA;
	
	//CONSTRUCTORES
	
	public Planta(String nombre, double altura, boolean NecesitaAgua) {
		this.nombre=nombre;
		this.altura=altura;
		this.NecesitaAgua=NecesitaAgua;
		this.IDPlanta=idplanta+=1;
		totalplantas+=1;
	}
	
	//GETTERS Y SETTERS
	
	public static int Totalplantas() {
		return totalplantas;
	}

	public static void setTotalplantas(int totalplantas) {
		Planta.totalplantas = totalplantas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isNecesitaAgua() {
		return NecesitaAgua;
	}

	public void setNecesitaAgua(boolean necesitaAgua) {
		NecesitaAgua = necesitaAgua;
	}

	public int getIDPlanta() {
		return IDPlanta;
	}

	public void setIDPlanta(int iDPlanta) {
		IDPlanta = iDPlanta;
	}
	
	//MÉTODOS
	
	public void regar() throws RiegoExcesivoException {
		if(this.NecesitaAgua == true) {
			this.NecesitaAgua = false;
			System.out.println("La planta " +this.IDPlanta+ " se ha regado correctamente");
		} else {
			throw new RiegoExcesivoException("ERROR: La planta no necesita agua en este momento.");
		}
	}
	
	//ESTE METODO REGAR ESTA MEDIO MAL, COMO UN EJERCICIO A PARTE ESTA BIEN, PERO AL FINAL
	//COMO NOS PIDEN EL MAX_AGUA DE CADA PLANTA POR SEPARADO, ESTO DEBERIA SER UN METODO
	//ABSTRACTO. AHORA LO CORRIGES
	
	public abstract void regar(int cantidadAgua) throws RiegoExcesivoException;
	
	public abstract void crecer();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		return NecesitaAgua == other.NecesitaAgua && Objects.equals(nombre, other.nombre);
	}

	public String mostrarInformación() {
		String necesita;
		if (this.NecesitaAgua == true) {
			necesita="SI";
		} else {
			necesita="NO";
		}
		
		return "Planta:  " + nombre + " | altura: " + altura + " | NecesitaAgua: " + necesita + " | ID: " + IDPlanta;
	}
}
