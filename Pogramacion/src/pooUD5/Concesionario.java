package pooUD5;

import java.util.Scanner;

public class Concesionario {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
				
		//instanciar una clase = crear un objeto
		Coche c1=new Coche();
		
		c1.color="negro";
		c1.marca="Seat";
		c1.velocidad=0;
		
		System.out.println(c1.velocidad);
		
		c1.acelerar(50);
		
		System.out.println(c1.velocidad);
		
		c1.acelerar(60);
		
		System.out.println(c1.velocidad);
	}
}
