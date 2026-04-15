package ud8.ejercicio6.ClasesAvanzadas;

import java.util.Scanner;

public class Software extends Articulo {
Scanner leer=new Scanner(System.in);

	//ATRIBUTOS
	
	private String tipo;

	//GETTERS Y SETTERS
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
