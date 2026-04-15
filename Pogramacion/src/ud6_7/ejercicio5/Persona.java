package ud6_7.ejercicio5;

public class Persona {
	
	/* public void imprime() // Imprime la información del objeto: “DNI:…
	Nombre:… etc.”
	• public boolean esMayorEdad() // Devuelve true si es mayor de edad
	(false si no).
	• public boolean esJubilado() // Devuelve true si tiene 65 años o más
	(false si no).
	• public int diferenciaEdad(Persona p) // Devuelve la diferencia de edad
	entre ‘this’ y p.
	Prueba a utilizar estos métodos desde el main para comprobar su
	funcionamiento. */
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
