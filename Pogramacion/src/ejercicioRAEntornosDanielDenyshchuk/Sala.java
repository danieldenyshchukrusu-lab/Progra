package ejercicioRAEntornosDanielDenyshchuk;

import java.util.ArrayList;
import java.util.List;

public abstract class Sala {

    public enum Estado { ABIERTA, CERRADA, PREPARADA, EN_MANTENIMIENTO }

    private String nombre;
    private Estado estado;
    private String direccion;
    private Escenario escenario;
    private EquipoSonido equipo;
    private List<Concierto> calendario;

    public Sala(String nombre, String direccion, double superficieEscenario, String materialSuelo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = Estado.CERRADA;
        this.calendario = new ArrayList<>();
        this.escenario = new Escenario(superficieEscenario, materialSuelo);
        this.escenario.setSala(this);
    }

    public void prepararEscenario() {
        if (estado != Estado.ABIERTA) {
            System.out.println("La sala '" + nombre + "' no está abierta. Estado actual: " + estado);
            return;
        }
        if (escenario.activarLuces()) {
            estado = Estado.PREPARADA;
            System.out.println("Sala '" + nombre + "' = PREPARADA.");
        }
    }

    public boolean instalarSonido(EquipoSonido e) {
        if (estado == Estado.CERRADA) {
            System.out.println("La sala '" + nombre + "' está cerrada. No se puede instalar equipo.");
            return false;
        }
        if (equipo != null) {
            System.out.println("La sala '" + nombre + "' ya tiene el equipo " + equipo.getIdEquipo() + " instalado.");
            return false;
        }
        equipo = e;
        System.out.println("Equipo " + e.getIdEquipo() + " instalado en '" + nombre + "'.");
        return true;
    }

    public void agregarConcierto(Concierto concierto) {
        calendario.add(concierto);
    }

    public String getNombre() { 
    	return nombre;
    }
    
    public void setNombre(String nombre) { 
    	this.nombre = nombre;
    }

    public Estado getEstado() { 
    	return estado;
    }
    
    public void setEstado(Estado estado) { 
    	this.estado = estado;
    }

    public String getDireccion() { 
    	return direccion;
    }
    
    public void setDireccion(String direccion) { 
    	this.direccion = direccion;
    }

    public Escenario getEscenario() { 
    	return escenario;
    }

    public EquipoSonido getEquipo() { 
    	return equipo;
    }

    public List<Concierto> getCalendario() { 
    	return calendario;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{nombre='" + nombre + "', estado=" + estado + "}";
    }
}
