package ud6_7.ejemplos;

public class Mesa {
	public String material;
	public String color;
	public String referencia;
	public int tamanio;
		
	public Mesa() {
		this.material="madera";
	}
	
	public Mesa(String material,String color) {
		this.material=material;
		this.color=color;
	}
	
	public Mesa(String referencia,int tamanio) {
		this.referencia=referencia;
		this.tamanio=tamanio;
	}
}


