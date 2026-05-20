package ejercicioRAEntornosDanielDenyshchuk;

public class EquipoSonido {
	
	private String idEquipo;
    private double potenciaWatios;
 
    public EquipoSonido(String idEquipo, double potenciaWatios) {
        this.idEquipo = idEquipo;
        this.potenciaWatios = potenciaWatios;
    }
 
    public boolean verificarAcustica(double decibelios) {
        boolean soporta = potenciaWatios >= decibelios;
        System.out.println("Equipo " + idEquipo + ": " + decibelios + " dB requeridos");
        return soporta;
    }
 
    public String getIdEquipo() { 
    	return idEquipo;
    }
    
    public void setIdEquipo(String idEquipo) { 
    	this.idEquipo = idEquipo; 
    }
 
    public double getPotenciaWatios() { 
    	return potenciaWatios;
    }
    
    public void setPotenciaWatios(double potenciaWatios) { 
    	this.potenciaWatios = potenciaWatios;
    }
 
    @Override
    public String toString() {
        return "EquipoSonido{id='" + idEquipo + "', potencia=" + potenciaWatios + " W}";
    }
    
}
