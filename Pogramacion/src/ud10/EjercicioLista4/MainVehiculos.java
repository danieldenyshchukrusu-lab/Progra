package ud10.EjercicioLista4;

import java.util.Scanner;

public class MainVehiculos {
	public static void main(String[] args) {
		
		CatalogoVehiculos catalogo = new CatalogoVehiculos();

        Cliente cliente1 = new Cliente("Juan","Velazquez");
        Cliente cliente2 = new Cliente("Ana","Maria");

        Vehiculos coche1 = new Coches("Toyota", "Corolla", 2020, true, numPuertas.CINCO, true);
        Vehiculos coche2 = new Coches("Seat", "Ibiza", 2022, true, numPuertas.TRES, true);

        Vehiculos moto1 = new Motos("Yamaha", "R1", 2021, true, true);
        Vehiculos moto2 = new Motos("Yamaha", "R1", 2021, true, false);

        catalogo.registrarVehiculo(coche1);
        catalogo.registrarVehiculo(coche2);
        catalogo.registrarVehiculo(moto1);
        catalogo.registrarVehiculo(moto2);

        try {

            System.out.println("=-- CATÁLOGO INICIAL --=");
            catalogo.mostrarCatalogo();

            System.out.println("\n=-- ALQUILAR VEHÍCULO --=");
            catalogo.alquilarVehiculo(10, cliente1);

            System.out.println("\n=-- CATÁLOGO DESPUÉS DE ALQUILAR --=");
            catalogo.mostrarCatalogo();

            System.out.println("\n=-- DEVOLVER VEHÍCULO --=");
            catalogo.devolverVehiculo(10, cliente1);

            System.out.println("\n=-- CATÁLOGO DESPUÉS DE DEVOLVER --=");
            catalogo.mostrarCatalogo();

            System.out.println("\n=-- ELIMINAR VEHÍCULO --=");
            catalogo.eliminarVehiculo(20);

            System.out.println("\n=-- CATÁLOGO FINAL --=");
            catalogo.mostrarCatalogo();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
	}
} 
