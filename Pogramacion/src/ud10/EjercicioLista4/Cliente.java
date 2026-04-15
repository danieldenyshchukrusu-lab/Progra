package ud10.EjercicioLista4;

public class Cliente {
	
	//ATRIBUTOS
	
	private String nombre;
	private String apellido;
	
	//CONSTRUCTORES
	
	public Cliente(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Cliente() {
		
	}
	
	//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//TO_STRING
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
