package danielDenyshchukRusuPracticaIV;

import java.util.Scanner;

public class MainVehiculos {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		//Crear 2 vehiculos compactos y crear 2 vehiculos premium.
		
		Vehiculos c1=new Compacto(true, "ABX 5054", NPuertas.TRES, true); 
		Vehiculos c2=new Compacto(true, "ABX 5054", NPuertas.CINCO, false);
		Vehiculos p1=new Premium(false, "ABX 4000", false, "220C");
		Vehiculos p2=new Premium(true, "JXG 4000", true, "300C"); 
		
		//Mostrar cuantos vehiculos hay
		System.out.println("Objetos/Vehiculos creados:");
		System.out.println(Vehiculos.numeroTotalVehiculos()); //Para poder invocar un método con una clase, este método debe de ser estatico
		System.out.println();								  //En mi caso, public static int numeroTotalVehiculos en la clase Vehiculos.
		
		//Mostrar la informacion de los 4 vehiculos
		
		System.out.println(c1.toString());
		System.out.println("");
		System.out.println(c2.toString());
		System.out.println("");
		System.out.println(p1.toString());
		System.out.println("");
		System.out.println(p2.toString());
		System.out.println("");
		
		//Comparar si son iguales dos vehiculos creados 
		System.out.println(c1.equals(c2));					  //Aqui comprobaremos con el método equals si un objeto es igual a otro por su matricula.
															  //En mi caso, nos piden sobreescribir (override) el método en el padre (vehiculo). Generaremos el método y añadiremos el atributo matricula para que compare con ella.
		//Alquilar 2 de los vehiculos ya creados
		Cliente cli1=new Cliente("06690345J","Daniel","Denyshchuk","640320204");
		Cliente cli2=new Cliente("X283739","Ana","Rusu","340340324");

		System.out.println(c1.Alquilar(cli1));
		System.out.println(p1.Alquilar(cli2));
		
		
		//Almacenar todos los vehiculos en un array 
		Vehiculos Almacen[] = new Vehiculos[4];				  //Aqui hemos creado un array, y en sus posiciones hemos metido los objetos ya creados.
		
		Almacen[0]=c1;
		Almacen[1]=c2;
		Almacen[2]=p1;
		Almacen[3]=p2;
		
		//Mostrar el precio de TODOS los vehiculos premium
		for (int i=0;i<Almacen.length;i++) {				  //Recorreremos la longitud del array.
			if (Almacen[i] instanceof Premium) {			  //Aqui comprobaremos si en los valores del array hay algun objeto creado con una clase Premium.
			System.out.println("Precio de los vehiculos premium: ");
			System.out.println(Almacen[i].toString());
			System.out.println(Almacen[i].CalcularCosteAlquiler());		//Si es asi, nos mostrará el precio de los alquileres de esos coches Premium.
			System.out.println();
			}	
		}
		
		//Mostrar el DNI y NOMBRE de los clientes que hayan alquilado vehiculos compactos
		
		System.out.println("Nombre y dni de los clientes que hayan alquilado vehiculos compactos: ");
		if (!c1.isDisponible()) {
			System.out.println(c1.getCliente().getDni() + " - " + c1.getCliente().getNombre()+ " ha podido alquilar el vehiculo con matricula: " +c1.getMatricula());
		} else if (!c2.isDisponible()) {
			System.out.println(c1.getCliente().getDni() + " - " + c1.getCliente().getNombre()+ " ha podido alquilar el vehiculo con matricula: " +c2.getMatricula());
		}
		
		leer.close();
	}
}
