package ud6_7.FICHA4;

public class Estudiante {
	private String nombre=" ";
	private int edad=0;
	private String curso=" ";
	private int IDestudiante=0;
	
	private static int CodigoEstudiante=0;
	
	private final int edad_defecto=18;
	
	//CONSTRUCTORES
	
	public Estudiante() {
		this.nombre="";
		this.edad=edad_defecto;
		this.curso="";
		CodigoEstudiante++;
		this.IDestudiante=CodigoEstudiante;
	}
	
	public Estudiante(String nombre, String curso, int IDestudiante) {
		this.nombre=nombre;
		this.curso=curso;
		this.edad=comprobarEdad(edad);
		CodigoEstudiante++;
		this.IDestudiante=CodigoEstudiante;
	}
	
	public Estudiante(String nombre, int edad, String curso) {
		this.nombre=nombre;
		this.edad=comprobarEdad(edad);
		this.curso=curso;
		CodigoEstudiante++;
		this.IDestudiante=CodigoEstudiante;
		
	}
	
	//METODOS
	public int comprobarEdad(int edad) {
		if (edad<0) {
			edad=18;
		}
		return edad;
	}
	
	public int cumplirAnios() {
		if (edad<0) {
			edad=edad_defecto;
		} else {
			edad++;
		}
		return edad;
	}

	public String mostrarInformacion() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + ", IDestudiante=" + IDestudiante
				+ "]";
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getIDestudiante() {
		return IDestudiante;
	}
	
	public static int getTotalEstudiantes() {
		return CodigoEstudiante;
	}
}
