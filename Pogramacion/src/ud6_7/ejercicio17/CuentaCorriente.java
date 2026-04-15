package ud6_7.ejercicio17;

public class CuentaCorriente {
	public String dni;
	public String nombre;
	public double saldo;
	
	
	//Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial
	//será 0.
	
	//CREAREMOS UN CONTRUCTOR
	
	public CuentaCorriente(String dni,String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		//this.saldoInicial=0; //Esta linea seria opcional porque por defecto los atributos numericos valen 0.
	}
	
	//(EJERCICIO 17: En la clase CuentaCorriente sobrecargar los constructores para poder crear
	//objetos.
	//• Con el DNI del titular de la cuenta y un saldo inicial.
	//• Con el DNI, nombre y el saldo inicial.
	//Escribir un programa que compruebe el funcionamiento de los métodos.
	
	public CuentaCorriente(String dni,int saldo) {
		this.dni=dni;
		this.saldo=saldo;
	}
	
	public CuentaCorriente(String dni,String nombre,double saldo) {
		this.dni=dni;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	//)
	
	public void sacardinero(int retirar) { //PREGUNTA A LA PROFE O INVESTIGA PARA QUE SON LOS "VOID"
		if (retirar>this.saldo) {			//VOID SE UTILIZA CUANDO NO SE TIENE QUE DEVOLVER NADA, POR EJEMPLO EN UNA SUMA N DEBERIAS DE PONER EL VOID PORQUE LUEGO CON UN RETURN TE DA LA SUMA, PERO EN ESTE CASO EL VOID SOLO ACTUALIZA Y TE DICE QUE HIZO EL METODO PERO NO TE DEVUELVE NADA COMO TAL.
			System.out.println("No hay dinero suficiente");
		} else {
			this.saldo=this.saldo-retirar;
			System.out.println("Retirada correcta, su saldo actual es de: " +this.saldo);
		}
	}
	
	public void ingresarDinero(double ingresar) {
		this.saldo=this.saldo+ingresar;
	}
	
	public void muestraInformacion() {
		System.out.println("Dni: " +this.dni);
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Saldo: " +this.saldo);
	}
}
