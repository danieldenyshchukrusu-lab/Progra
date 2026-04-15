package danielDenyshchukRusuPracticaIV;

public class Cliente {
	
	//ATRIBUTOS
	
	private String dni;
	private String nombre;
	private String apellido;
	private String telefono;
	
	//CONSTRUCTORES
	
	public Cliente(String dni, String nombre, String apellido, String telefono) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
	}

	//TOSTRING
	
	@Override
	public String toString() {
		return "[dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
	
	//GETTERS Y SETTERS
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
