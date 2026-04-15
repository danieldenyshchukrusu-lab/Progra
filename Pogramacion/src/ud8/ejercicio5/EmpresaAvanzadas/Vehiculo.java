package ud8.ejercicio5.EmpresaAvanzadas;

public class Vehiculo {
	
	//ATRIBUTOS
	
	private int año;
	private String marca;
	private String matricula;
	private int autonomia;

	//CONSTRUCTORES
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String matricula, String marca, int autonomia, int año) {
		this.matricula=matricula;
		this.marca=marca;
		this.autonomia=autonomia;
		ComprobarAño(año);
	}

	//GETTERS Y SETTERS
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	
	//TO STRING
	
	@Override
	public String toString() {
		return "Vehiculo [año=" + año + ", marca=" + marca + ", matricula=" + matricula + ", autonomia=" + autonomia
				+ "]";
	}
	
	//MÉTODOS
	
	public void ComprobarAño(int año) {
		if (this.año <= 1900 && this.año > 2030) {
			this.año = 2000;
		}
	}
	
}
