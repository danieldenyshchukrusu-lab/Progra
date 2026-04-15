package ud8.ejercicio5.EmpresaAvanzadas;

import java.util.Scanner;

public class mainVehiculos {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		//CREAR 1 VEHICULO, 1 COCHE, 2 CAMIONES.
		
		Vehiculo v1=new Vehiculo("ABX 5054","Toyota",5000,2002);
		Vehiculo c1=new Coches("ABC 1234","Mercedes",7000,2005);
		Camiones ca1=new Camiones("ABC 1233","BMW",12000,2016);
		Camiones ca2=new Camiones("ABC 1232","Subaru",15000,2018);
		
		//VISUALIZAR LOS DATOS DE LOS OBJETOS CREADOS.
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
