package ejercicio;

public class Main {

	public static void main(String[] args) {
		
		GestionBiblioteca listas = new GestionBiblioteca();
		
		Material l1 = new Libro("DonQuijote",1605,3,"Cervantes",500);
		Material l2 = new Libro("Libro largo",2020,2,"Autor largo",900);
		Material p1 = new Pelicula("Batman",2022,2,"Reeves",175,ClasificacionEdad.MENOS18);
		Material p2 = new Pelicula("Saw",2004,1,"James Wan",120,ClasificacionEdad.MAS18);
		
		Socio s1 = new Socio(1,"Juan",20);
		Socio s2 = new Socio(2,"Ana",16);
		
		System.out.println("REGISTRADO MATERIALES");
		System.out.println();
		
		listas.registrarMaterial(l1);
		listas.registrarMaterial(l2);
		listas.registrarMaterial(p1);
		listas.registrarMaterial(p2);
		
		System.out.println("REGISTRADO SOCIOS");
		System.out.println();
		
		listas.registrarSocios(s1);
		listas.registrarSocios(s2);
		
		System.out.println("REALIZAR EL PRESTAMO DEL MATERIAL 1 AL SOCIO 1");
		System.out.println();
		listas.realizarPrestamo(1, 1);
		
		System.out.println("REALIZAR EL PRESTAMO DEL MATERIAL 2 AL SOCIO 1");
		System.out.println();
		listas.realizarPrestamo(2, 1);
		
		System.out.println("REALIZAR EL PRESTAMO DEL MATERIAL 4 AL SOCIO 2");
		System.out.println();
		listas.realizarPrestamo(4, 1);
		
		for (Socio s : listas.getListaSocios()) {
			System.out.println(s.mostrarInformacion());
		}
		
		System.out.println("MOSTRAR INFORMACION DE LOS MATERIALES TIPO LIBRO");
		System.out.println();
		
		for (Material m : listas.getListaMateriales()) {
			if (m instanceof Libro) {
				System.out.println(m.mostrarInformacion());
			}
		}
		System.out.println();
		
 		System.out.println("ALMACENAR LOS MATERIALES EN EL FICHERO");
 		System.out.println();
 		
 		listas.almacenarMateriales();
		
		System.out.println("CONSULTAR LOS MATERIALES QUE TENGAN MINIMO 2 UNIDADES");
		System.out.println();
		
		listas.consultarMaterialesPorUnidades(2);
		System.out.println();
		
		System.out.println("ELIMINAREMOS EL MATERIAL 2");
		System.out.println();
		
		listas.eliminarMaterial(2);
		
		for (Material m : listas.getListaMateriales()) {
			System.out.println(m.mostrarInformacion());
		}
		
		
		
	}	
	
}
