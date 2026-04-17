package ud10.EjercicioLista4;

import java.util.ArrayList;

public class CatalogoVehiculos {
	
	//ATRIBUTOS
	
	 private ArrayList<Vehiculos> vehiculos;
	 
	 public CatalogoVehiculos() {
		 vehiculos = new ArrayList<>();
	 }
	 
	 	public void registrarVehiculo(Vehiculos v) {
	        vehiculos.add(v);
	    }

	 	public Vehiculos buscarVehiculo(int matricula) throws Exception {
		    for (Vehiculos v : vehiculos) {
		        if (v.getMatricula() == matricula) {
		            return v;
		        }
		    }
		    throw new Exception("Vehículo no registrado");
		}

	    public void alquilarVehiculo(int matricula, Cliente cliente) throws Exception {
	        Vehiculos v = buscarVehiculo(matricula);
	        v.alquilar(); // aquí llamas a tu método
	        System.out.println("Vehículo alquilado por: " + cliente);
	    }

	    public void devolverVehiculo(int matricula, Cliente cliente) throws Exception {
	        Vehiculos v = buscarVehiculo(matricula);
	        v.devolucion(); // tu método
	        System.out.println("Vehículo devuelto por: " + cliente);
	    }

	    public void eliminarVehiculo(int matricula) throws Exception {
	        Vehiculos v = buscarVehiculo(matricula);
	        vehiculos.remove(v);
	    }

	    public void mostrarVehiculo(int matricula) throws Exception {
	        Vehiculos v = buscarVehiculo(matricula);
	        System.out.println(v); //El to_string esta definido, no hace falta que lo ponga
	    }

	    public void mostrarCatalogo() {
	        for (Vehiculos v : vehiculos) {
	        	System.out.println(v); 

	            if (v.isEstado()) {
	                System.out.println("Estado: Disponible");
	            } else {
	                System.out.println("Estado: Alquilado");
	            }
	            System.out.println("---------------------");
	        }
	    }
	 
}
