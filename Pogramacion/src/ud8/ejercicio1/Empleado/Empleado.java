package ud8.ejercicio1.Empleado;

public class Empleado extends Persona {
	private int NEmpleado=0;
	private String NDepartamento=" ";
	private String NPuesto=" ";
	
	public Empleado() {
		// No nos daria error ya que en la clase padre (persona) tiene otro constructor por defecto asi
	}
	
	public Empleado(String nombre, int edad, char genero, int NEmpleado, String NDepartamento, String NPuesto) {
		super(nombre, edad, genero);
		this.NEmpleado=NEmpleado;
		this.NDepartamento=NDepartamento;
		this.NPuesto=NPuesto;
	}

	//GETTERS Y SETTERS
	
	public int getNEmpleado() {
		return NEmpleado;
	}

	public void setNEmpleado(int nEmpleado) {
		NEmpleado = nEmpleado;
	}

	public String getNDepartamento() {
		return NDepartamento;
	}

	public void setNDepartamento(String nDepartamento) {
		NDepartamento = nDepartamento;
	}

	public String getNPuesto() {
		return NPuesto;
	}

	public void setNPuesto(String nPuesto) {
		NPuesto = nPuesto;
	}
	
	public void presentacion() {
		System.out.println("Buenos dias, soy una persona " +this.NDepartamento);
	}
	
	public void saludoEmpleado() {
		System.out.println("Buenos dias desde el empleado "+this.getNombre()+" con num de empleado " +this.getNEmpleado());
	}
}
