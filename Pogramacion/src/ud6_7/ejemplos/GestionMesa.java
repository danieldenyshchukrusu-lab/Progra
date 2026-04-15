package ud6_7.ejemplos;

public class GestionMesa {
	public static void main(String[] args) {
		Mesa mesa1=new Mesa();
		Mesa mesa2=new Mesa("metal","gris");
		
		System.out.println("El color de mesa1 es: "+mesa1.material);
		System.out.println("El color de mesa2 es: "+mesa2.color);
	}
}
