package ud6_7.FICHA2.ejercicio3;

public class Libro {
	
	private String tituloLibro=" ";
	private String autor=" ";
	private int ejemplaresLibro=0;
	private int ejemplaresPrestados=0;
	
	//CONSTRUCTORES
	
	public Libro() {
		this.tituloLibro=" ";
		this.autor=" ";
		this.ejemplaresLibro=0;
		this.ejemplaresPrestados=0;
	}
	
	public Libro(String tituloLibro, String autor, int ejemplaresLibro, int ejemplaresPrestados) {
		this.tituloLibro=tituloLibro;
		this.autor=autor;
		this.ejemplaresLibro=ejemplaresLibro;
		this.ejemplaresPrestados=ejemplaresPrestados;
	}
	
	//MÉTODOS 
	
	public boolean prestamo() {
		boolean prestamos = true;
		if ((ejemplaresLibro-ejemplaresPrestados)>0) {
			ejemplaresPrestados++;
			prestamos = true;
		} else if ((ejemplaresLibro-ejemplaresPrestados)<=0){
			prestamos = false;
		}
		return prestamos;
	}
	
	public boolean devolucion() {
		boolean devolucion = true;
		if ((ejemplaresLibro-ejemplaresPrestados)==ejemplaresLibro) {
			devolucion = false;
		} else if ((ejemplaresLibro-ejemplaresPrestados)!=ejemplaresLibro){
			ejemplaresPrestados--;
			devolucion = true;
		}
		return devolucion;
	}
	
	@Override
	public String toString() {
        return "Libro{" +
                "Titulo del libro=" + tituloLibro + '\'' +
                ", Autor del libro=" + autor +
                ", Ejemplares del libro=" + ejemplaresLibro + '\'' +
                ", Ejemplares prestados=" + ejemplaresPrestados +
                '}';
    }
	
	//SETTERS Y GETTERS
	
	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro=tituloLibro;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public void setEjemplaresLibro(int ejemplaresLibro) {
		this.ejemplaresLibro=ejemplaresLibro;
	}
	
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados=ejemplaresPrestados;
	}
	
	public String getTituloLibro() {
		return tituloLibro;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getEjemplaresLibro() {
		return ejemplaresLibro;
	}
	
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
}
