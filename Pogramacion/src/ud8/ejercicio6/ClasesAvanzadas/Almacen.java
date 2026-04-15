package ud8.ejercicio6.ClasesAvanzadas;

import java.util.Arrays;

public class Almacen {

	//ATRIBUTOS
	
	public Articulo[] almacen=new Articulo[100];
	
	//MÉTODOS
	
	public void aniadirArticulo(Articulo articulo) {
		int i=0;
		while (almacen[i]!=null) {
			i++;
		}
		
		almacen[i]=articulo;
	}

	public static void mostrarArticulos() {
		for (int i=0;i<almacen.length || almacen[i]!=null;i++) {
			almacen[i].toString();
		}
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Almacen [almacen=" + Arrays.toString(almacen) + "]";
	}
	
}
