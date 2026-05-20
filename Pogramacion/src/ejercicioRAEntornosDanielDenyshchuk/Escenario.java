package ejercicioRAEntornosDanielDenyshchuk;

public class Escenario {
	
	private double superficie;
    private String materialSuelo;
    private Sala sala;
 
    public Escenario(double superficie, String materialSuelo) {
        this.superficie = superficie;
        this.materialSuelo = materialSuelo;
    }
 
    public boolean activarLuces() {
        System.out.println("Luces activadas en escenario de " + superficie + " m² (" + materialSuelo + ").");
        return true;
    }
 
    public double getSuperficie() {
    	return superficie; 
    }
    
    public void setSuperficie(double superficie) {
    	this.superficie = superficie; 
    }
 
    public String getMaterialSuelo() { 
    	return materialSuelo; 
    }
    
    public void setMaterialSuelo(String materialSuelo) { 
    	this.materialSuelo = materialSuelo; 
    }
 
    public Sala getSala() { 
    	return sala; 
    }
    
    public void setSala(Sala sala) { 
    	this.sala = sala; 
    }
 
    @Override
    public String toString() {
        return "Escenario{superficie=" + superficie + " m², suelo='" + materialSuelo + "'}";
    }
    
}
