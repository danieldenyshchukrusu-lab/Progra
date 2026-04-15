package ud10.EjercicioLista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Producto {
	
	//ATRIBUTOS
	
	private int codigo;
	private String nombre;
	private String tipo;
	private double precio;
	private int stock;
	
	//CONSTRUCTORES
	
	public Producto(int codigo, String nombre, String tipo, double precio, int stock) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.tipo=tipo;
		this.precio=precio;
		this.stock=stock;
	}
	
	public Producto() {
		
	}
	
	//GETTERS Y SETTERS
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	//MÉTODO TO_STRING
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}

	//MÉTODO EQUALS
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre);
	}
}
