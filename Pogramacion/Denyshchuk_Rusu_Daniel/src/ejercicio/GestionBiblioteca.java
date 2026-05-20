package ejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionBiblioteca {
	
	//ATRIBUTOS
	private List<Socio> listaSocios;
	private List<Material> listaMateriales;
	
	//CONSTRUCTORES
	
	public GestionBiblioteca() {
		this.listaSocios = new ArrayList<>();
		this.listaMateriales = new ArrayList<>();
	}

	//METODOS
	
	public void registrarMaterial(Material m) {
		listaMateriales.add(m);
	}
	
	public void registrarSocios(Socio s) {
		listaSocios.add(s);
	}
	
	public void realizarPrestamo(int codigoMaterial, int numSocio) {
		boolean materialSi = false;
		boolean socioSi = false;
		boolean puedePedir = true;
		boolean hayMateriales = false;
		
		for (Material material : listaMateriales) {
			if (material.getCod()==codigoMaterial) {
				materialSi=true;
			}
		}
		
		for (Socio socio : listaSocios) {
			if (socio.getNumSocio()==numSocio) {
				socioSi=true;
			}
		}
		if (materialSi == true && socioSi == true) {
			for (Socio soci : listaSocios) {
				if (soci.puedePedirPrestamo()==true) {
					puedePedir = true;
				}
			}
			
			for (Material material : listaMateriales) {
				if (material.hayDisponibles()==true) {
					hayMateriales = true;
				}
			}
			
			if (puedePedir == true && hayMateriales == true) {
				for (Material material : listaMateriales) {
					if (socioSi==true && material.getCod()==codigoMaterial) {
						material.prestar();
					}
				}
			}
		}
	}
	
	public void realizarDevolucion() {
		
	}
	
	public void almacenarMateriales() {
		
		File f = null;
		PrintWriter pw = null;
		
		String cadena;
		
		FileReader fr = null;
		BufferedReader bf = null;
		
		f = new File("materiales.csv");
		
		try {
			pw = new PrintWriter(f);
			
			fr = new FileReader(f);
			bf = new BufferedReader(fr);
			
			pw.println("CODIGO;NOMBRE;UNIDADES TOTALES");
			
			for (Material m : listaMateriales) {
				pw.println(m.mostrarInformacionFichero());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
	}
	
	public void consultarMaterialesPorUnidades(int minimoUnidades) {
		String[] partes;
		
		FileReader fr = null;
		BufferedReader bf = null;
		
		String cadena;
		
		File f = null;
		
		f = new File("materiales.csv");
		
		try {
			
			fr = new FileReader(f);
			bf = new BufferedReader(fr);
			
			cadena = bf.readLine();
			
			while((cadena=bf.readLine())!=null) {
				partes=cadena.split(";");
				if (Integer.parseInt(partes[2])>=minimoUnidades) {
					System.out.println(cadena);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (Material m : listaMateriales) {
			if (m.getUnidadesTotales()>=minimoUnidades) {
				System.out.println(m);
			}
		}
	}
	
	public void eliminarMaterial(int codigoMaterial) {
		Iterator<Material> it = listaMateriales.iterator();
		
		while(it.hasNext()) {
			Material m = it.next();
			if (m.getCod()==codigoMaterial) {
				it.remove();
			}
		}
		
	}
	
	//GETTERS Y SETTERS
	
	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public List<Material> getListaMateriales() {
		return listaMateriales;
	}

	public void setListaMateriales(List<Material> listaMateriales) {
		this.listaMateriales = listaMateriales;
	}
	
}
