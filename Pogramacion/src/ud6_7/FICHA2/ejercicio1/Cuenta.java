package ud6_7.FICHA2.ejercicio1;

public class Cuenta {
	/* Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y
	cantidad (puede tener decimales).
	El titular será obligatorio y la cantidad es opcional. Crea dos constructores que
	cumplan con lo anterior.
	Crea sus métodos get, set y toString. */
	
	public String titular;
	public double cantidad;
	
	public Cuenta(String titular,double cantidad) {
		this.titular=titular;
	}
	
	/* Ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la
	cantidad introducida es negativa, no se hará nada.*/
	
	/* retirar (double cantidad): se retira una cantidad a la cuenta, si restando
	la cantidad actual a la que nos pasan es negativa, la cantidad de la
	cuenta pasa a ser 0. */
	
	/* Cuenta transferencia (Cuenta destino, double cantidad) que permita
	pasar dinero de una cuenta a otra siempre que en la cuenta de origen
	haya dinero suficiente para poder hacerla. */
}
