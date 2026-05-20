package ejercicioRAEntornosDanielDenyshchuk;

import java.util.ArrayList;
import java.util.List;

public class Banda {
	
	private String cif;
    private String nombreArtistico;
    private double decibelios;
    private List<Concierto> gira;
 
    public Banda(String cif, String nombreArtistico, double decibelios) {
        this.cif = cif;
        this.nombreArtistico = nombreArtistico;
        this.decibelios = decibelios;
        this.gira = new ArrayList<>();
    }
 
    public void programarConcierto(String fecha, Sala s) {
        Concierto concierto = new Concierto(fecha, s, this);
        gira.add(concierto);
        s.agregarConcierto(concierto);
        System.out.println("Concierto programado: " + concierto);
    }
 
    public String getCif() { 
    	return cif;
    }
    
    public void setCif(String cif) { 
    	this.cif = cif;
    }
 
    public String getNombreArtistico() { 
    	return nombreArtistico;
    }
    
    public void setNombreArtistico(String nombreArtistico) { 
    	this.nombreArtistico = nombreArtistico;
    }
 
    public double getDecibelios() { 
    	return decibelios;
    }
    
    public void setDecibelios(double decibelios) { 
    	this.decibelios = decibelios;
    }
 
    public List<Concierto> getGira() { 
    	return gira;
    }
 
    @Override
    public String toString() {
        return "Banda{cif='" + cif + "', nombre='" + nombreArtistico + "', dB=" + decibelios + "}";
    }
    
}
