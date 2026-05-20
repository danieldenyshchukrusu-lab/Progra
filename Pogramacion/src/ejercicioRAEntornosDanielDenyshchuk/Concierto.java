package ejercicioRAEntornosDanielDenyshchuk;

public class Concierto {
	
	private String fecha;
    private Sala sala;
    private Banda banda;
 
    public Concierto(String fecha, Sala sala, Banda banda) {
        this.fecha = fecha;
        this.sala = sala;
        this.banda = banda;
    }
 
    public String getFecha() { 
    	return fecha;
    }
    
    public Sala getSala() { 
    	return sala;
    }
    
    public Banda getBanda() { 
    	return banda;
    }
 
    @Override
    public String toString() {
        return "Concierto{fecha='" + fecha + "', banda='" + banda.getNombreArtistico()
                + "', sala='" + sala.getNombre() + "'}";
    }
    
}
