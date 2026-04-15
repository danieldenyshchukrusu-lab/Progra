package ud8.ejemplo.trabajador;

public class Consultor extends Trabajador {
	private int numHoras;
	private double tarifa;
	
	public Consultor(String nombre, String nss, int numHoras, double tarifa) {
		super(nombre,nss);
		this.numHoras=numHoras;
		this.tarifa=tarifa;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public void sueldo() {
		double salarioFinal=this.tarifa*this.numHoras;
		System.out.println("El sueldo de es "+ salarioFinal);
	}
	
}
