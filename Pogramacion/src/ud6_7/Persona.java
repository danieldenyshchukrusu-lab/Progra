package ud6_7;

public class Persona {
	//Atributos de la clase persona
	public String nombre;
	int edad;
	int estatura;
		
	//Métodos 
	public void saludar() {
		System.out.println("Hola a todos");
	}
		
	public void crecer (int cm) {
		estatura=estatura+cm;
	}
		
	public int cumplirAnios() {
		return edad+1;
	}
}
