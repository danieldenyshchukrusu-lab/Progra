package danielDenyshchukRusuPracticaIV;

import java.util.Objects;

public class Vehiculos {
	
	//ESTÁTICOS 
	
	private static int totalVehiculos=0;
	
	//CONSTANTES
	
	public static final double PRECIO_BASE = 50;
	
	//ATRIBUTOS
	
	private String matricula;
	private boolean disponible;
	private Cliente cliente;
	
	//CONSTRUCTORES
	
	public Vehiculos() {
		totalVehiculos++;
	}
	
	public Vehiculos(boolean disponible, String matricula) {
		this.disponible=disponible;
		this.matricula=matricula;
		totalVehiculos++;
	}
	
	//TO-STRING

	@Override
	public String toString() {
		String DisponibilidadVehiculo = "";
		if (this.disponible==true) {
			DisponibilidadVehiculo="DISPONIBLE";
		} else {
			DisponibilidadVehiculo="NO DISPONIBLE";
		}
		
		return "Matricula=" + matricula + "\n" + DisponibilidadVehiculo;
	}
	
	//EQUALS
	
	@Override
	public boolean equals(Object obj) { //Esto lo he hecho simplemente desde source, hash()/equals(), selecciono solo el atributo matricula porque es el que nos pide, y ya.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculos other = (Vehiculos) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	//GETTERS Y SETTERS
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//MÉTODOS 
	
	public double CalcularCosteAlquiler() {
		return PRECIO_BASE;
	}

	public String Alquilar(Cliente cliente) {
		String alquiler;
		
		if (this.disponible==true) {
			this.cliente=cliente;
			this.disponible=false;
			alquiler="el cliente " +this.cliente+ " ha alquilado el coche correctamente";
		} else {
			this.cliente=cliente;
			alquiler="el cliente " +this.cliente+ " no ha podido alquilar el coche";
		}
		return alquiler;
	}

	public static int numeroTotalVehiculos() {
		return totalVehiculos;
	}
}
