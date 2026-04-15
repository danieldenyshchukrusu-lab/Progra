package ud8.ejemplo.trabajador;

public class Trabajador {
	public String nombre, dir, tfn, nss;
	
	public Trabajador (String nombre, String nss) {
		this.nombre=nombre;
		this.nss=nss;
	}

	public boolean equals(Trabajador t) {
		return this.nss.equals(t.nss);
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dir=" + dir + ", tfn=" + tfn + ", nss=" + nss + "]";
	}
	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) {
		this.tfn = tfn;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}
	
	
}
