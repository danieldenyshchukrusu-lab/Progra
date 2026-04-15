package ud6_7.ejercicio2;

public class Persona {
	String dni;
	String nombre;
	String apellidos;
	int edad;
	
	public Persona () {}
	
	public Persona (String dni) {
		this.dni=dni;
	}
	
	public Persona(String p_dni,String p_nombre, String p_apellidos, int p_edad) {
		dni = p_dni;
		nombre = p_nombre;
		apellidos = p_apellidos;
		edad = p_edad;
	}
}
