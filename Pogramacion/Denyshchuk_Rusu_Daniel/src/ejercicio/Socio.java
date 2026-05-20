package ejercicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Socio {

	//ATRIBUTOS
	
	private int numSocio;
	private String nombre;
	private int edad;
	private Map<Integer,Material> prestamosActivos;
	private int nSanciones;
	
	//CONSTRUCTORES
	
	public Socio(int numSocio, String nombre, int edad) {
		this.numSocio=numSocio;
		this.nombre=nombre;
		this.edad=edad;
		prestamosActivos = new HashMap<>();
		this.nSanciones=0;
	}
	
	//METODOS
	
	public boolean puedePedirPrestamo() {
		if (nSanciones > 3) {
			return false;
		} else {
			return true;
		}
	}
	
	public void agregarPrestamo(Material material) {
		prestamosActivos.put(material.getCod(), material);
	}
	
	public void devolverPrestamo(Material material) throws PrestamoNoEncontradoException {
		
		Iterator<Map.Entry<Integer, Material>> it = prestamosActivos.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, Material> mat = it.next();
			if (material.getCod()==mat.getKey()) {
				it.remove();
			} else {
				throw new PrestamoNoEncontradoException("El prestamo no existe");
			}
		}
	}
	
	public void mostrarPrestamos() {
		for (Map.Entry<Integer, Material> mate : prestamosActivos.entrySet()) {
			System.out.println(mate.getKey()+" "+mate.getValue());
		}
	}
	
	public void agregarSancion() {
		nSanciones=nSanciones+1;
	}
	
	public String mostrarInformacion() {
		return "Socio [numSocio=" + numSocio + ", nombre=" + nombre + ", edad=" + edad + ", prestamosActivos="
				+ prestamosActivos + ", nSanciones=" + nSanciones + "]";
	}
	
	//GETTERS Y SETTERS
	
	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Map<Integer, Material> getPrestamosActivos() {
		return prestamosActivos;
	}

	public void setPrestamosActivos(Map<Integer, Material> prestamosActivos) {
		this.prestamosActivos = prestamosActivos;
	}

	public int getnSanciones() {
		return nSanciones;
	}

	public void setnSanciones(int nSanciones) {
		this.nSanciones = nSanciones;
	}
	
}
