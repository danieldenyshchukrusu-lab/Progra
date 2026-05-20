package ejercicioRAEntornosDanielDenyshchuk;

public class Auditorio extends Sala {
	private int numButacas;
    private int cantidadButacasOcupadas;
 
    public Auditorio(String nombre, String direccion, double superficieEscenario, String materialSuelo, int numButacas) {
        super(nombre, direccion, superficieEscenario, materialSuelo);
        this.numButacas = numButacas;
        this.cantidadButacasOcupadas = 0;
    }
 
    public boolean asignarAsientos(int personas) {
        if (getEstado() != Estado.ABIERTA) {
            System.out.println("La sala '" + getNombre() + "' no está Abierta.");
            return false;
        }
        int disponibles = numButacas - cantidadButacasOcupadas;
        if (personas > disponibles) {
            System.out.println("No hay suficientes butacas. Disponibles: " + disponibles + ", solicitadas: " + personas);
            return false;
        }
        cantidadButacasOcupadas += personas;
        System.out.println("Reserva confirmada en '" + getNombre() + "'. Ocupadas: " + cantidadButacasOcupadas + "/" + numButacas);
        return true;
    }
 
    public int getNumButacas() { 
    	return numButacas;
    }
    
    public void setNumButacas(int numButacas) { 
    	this.numButacas = numButacas;
    }
 
    public int getCantidadButacasOcupadas() { 
    	return cantidadButacasOcupadas; 
    }
 
    @Override
    public String toString() {
        return "Auditorio{nombre='" + getNombre() + "', estado=" + getEstado()
                + ", butacas=" + cantidadButacasOcupadas + "/" + numButacas + "}";
    }
}
