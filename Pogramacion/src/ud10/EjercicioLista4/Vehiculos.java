package ud10.EjercicioLista4;

public class Vehiculos {
	
	//CONSTANTES Y ESTATICOS
	
	private static int MATRICULA = 0;
	
	//ATRIBUTOS
	
	private int matricula;
	private String marca;
	private String modelo;
	private int añoFabricacion;
	private boolean estado;
	
	//CONSTRUCTORES
	
	public Vehiculos(String marca, String modelo, int añoFabricacion, boolean estado) {
		MATRICULA++;
		this.matricula=MATRICULA;
		this.marca=marca;
		this.modelo=modelo;
		this.añoFabricacion=añoFabricacion;
		this.estado=estado;
	}
	
	public Vehiculos() {
		
	}
	
	//GETTERS Y SETTERS
	
	public static int getMATRICULA() {
		return MATRICULA;
	}

	public static void setMATRICULA(int mATRICULA) {
		MATRICULA = mATRICULA;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//MÉTODOS
	
	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", añoFabricacion="
				+ añoFabricacion + ", estado=" + estado + "]";
	}

	public void alquilar(Cliente cliente, Vehiculos vehiculo) throws Excepcion {
		if (vehiculo.isEstado()==true) {
			vehiculo.setEstado(false);
			System.out.println("El vehiculo ha sido reclamado por: " +cliente.toString());
		} else {
			throw new Excepcion("El vehículo ya está alquilado");
		}
	}
	
	public void devolucion(Cliente cliente, Vehiculos vehiculo) {
		if (vehiculo.isEstado()==false) {
			vehiculo.setEstado(true);
			System.out.println("El vehiculo ha sido devuelto correctamente por: " +cliente.toString());
		} else {
			System.out.println("El vehiculo que ha intentado devolver no es correcto");
		}
	}
}
