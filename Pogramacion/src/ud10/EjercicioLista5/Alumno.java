package ud10.EjercicioLista5;

public class Alumno implements Comparable<Alumno> {
	//Puedes no poner el implements Comparabale<Alumno>, y castearlo en el mismo metodo.
	
	//ATRIBUTOS
	
	private String nombre;
	private int edad;
	private int nota;
	
	//CONSTRUCTORES
	
	public Alumno(String nombre, int edad, int nota) {
		this.nombre=nombre;
		this.edad=edad;
		this.nota=nota;
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

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	//MÉTODO
	
	//CRISTINA HA DICHO QUE EL COMPARATOR NO ENTRA, EL COMPARABLE Y EL SORT SI, PERO EL COMPARATOR NO
	
	@Override //Necesito encontrar una explicacion detallada de esto.
	public int compareTo(Alumno o) {
		int resultado = o.getNota() - this.nota;
		if(resultado == 0) {
			return this.nombre.compareTo(o.getNombre()); //El compareTo nos devuelve un entero, es el criterio que necesita el metodo Sort, por eso no metemos un equals.
		} else {										 //También, donde pongas el this, o en la primera posicion, o en la segunda posicion
			return resultado;							 //Si ponemos el this. primero, ordena de menor mayor, y si ponemos el this despues, de mayor menor (creo que es asi, si no busca explicacion en la ia)
		}
	}

	//TO_STRING
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}

	
	
	
}
