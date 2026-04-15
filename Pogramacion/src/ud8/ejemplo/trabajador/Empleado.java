package ud8.ejemplo.trabajador;

public class Empleado extends Trabajador {
	private double salario;
	private int irpf;
	
	public Empleado(String nombre, String nss) {
		super(nombre,nss);
	}
	
	public Empleado(String nombre, String nss, double salario, int irpf) {
		// this.setNombre(nombre); //esto es igual que hacer un this.nombre=nombre pero claro, ten en cuenta que esta clase tiene herencia con Trabajador. Por eso se pone asi.
		// this.setNss(nss);
		
		super(nombre,nss);
		this.salario=salario;
		this.irpf=irpf;
	}

	public void sueldo() {
		double salarioFinal=this.getSalario()-this.getSalario()*this.getIrpf()/100;
		System.out.println("El sueldo de "+this.getNombre()+" es "+ salarioFinal);
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return super.toString()+"Empleado [salario=" + salario + ", irpf=" + irpf + "]";
	}
	
	//GETTERS Y SETTERS
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}
	
	
	
	
}
