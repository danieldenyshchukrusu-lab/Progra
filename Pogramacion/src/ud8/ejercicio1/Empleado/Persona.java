package ud8.ejercicio1.Empleado;

public class Persona {
	private String nombre;
	private int edad=0;
	private char genero;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, char genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
	}
	
	//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	
	public void presentacion() {
		System.out.println("Buenos dias, soy una persona " +this.nombre);
	}
}
