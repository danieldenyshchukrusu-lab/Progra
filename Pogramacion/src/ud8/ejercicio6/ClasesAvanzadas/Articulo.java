package ud8.ejercicio6.ClasesAvanzadas;

import java.util.Scanner;

public class Articulo {
Scanner leer=new Scanner(System.in);
	
	//ATRIBUTOS
	
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	//GETTERS Y SETTERS
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		while(codigo.length()!=3) {
			System.out.println("CODIGO INCORRECTO. su longitud debería ser 3.");
		}
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
