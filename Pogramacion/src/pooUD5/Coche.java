package pooUD5;

public class Coche {
	//Atributos (Propiedades)
	public String color;
	public String marca;
	public int velocidad;
	
	//Métodos (acciones)
	public void arrancar() {
		System.out.println("Coche arrancado");
		velocidad=10;
	}
	
	public void frenar() {
		System.out.println("Freno");
		velocidad=0;
	}
	
	public void acelerar(int acelero) {
		System.out.println("Acelero el coche");
		if (velocidad+acelero>120) {
			System.out.println("Aviso, superas la velocidad permitida"); 
		} else {
		velocidad=velocidad+acelero;
		}
	}
}
