package ud10.EjercicioLista9;

public class Flor extends Planta {

	//CONSTANTES Y ESTATICOS
	
	private final static int MAX_AGUA=50;
		
	//ATRIBUTOS
	
	private String color;
	
	//CONSTRUCTORES
	
	public Flor(String nombre, double altura, boolean NecesitaAgua, String color) {
		super(nombre, altura, NecesitaAgua);
		this.color=color;
	}
	
	//MÉTODOS
	
	public void regar(int cantidadAgua) throws RiegoExcesivoException {
		if (cantidadAgua >= MAX_AGUA) {
			throw new RiegoExcesivoException("ERROR: Cantidad de agua excesiva para esta planta");
		} else if (this.isNecesitaAgua() == false) {
			throw new RiegoExcesivoException("ERROR: La planta no necesita agua en este momento");
		} else if (this.isNecesitaAgua() == true && cantidadAgua < MAX_AGUA) {
			System.out.println("Planta " +this.getIDPlanta()+ " regada correctamente con: " +cantidadAgua+ " ml");
			this.setNecesitaAgua(false);
		}
	}
	
	public void crecer() {
		double crecimiento=MAX_AGUA*0.1;
		this.setAltura(getAltura()+crecimiento);
		this.setNecesitaAgua(true);
		System.out.println("La flor ha crecido: " +getAltura());
	}
	
}
