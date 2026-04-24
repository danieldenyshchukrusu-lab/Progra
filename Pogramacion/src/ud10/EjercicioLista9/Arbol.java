package ud10.EjercicioLista9;

public class Arbol extends Planta {

	//CONSTANTES Y ESTATICOS
	
	private final static int MAX_AGUA=100;
	
	//ATRIBUTOS
	 
	private int edad;
	private TipoDeHoja tipoHoja;
	
	//CONSTRUCTORES
	
	public Arbol(String nombre, double altura, boolean NecesitaAgua, int edad, TipoDeHoja tipohoja) {
		super(nombre, altura, NecesitaAgua);
		this.edad=edad;
		this.tipoHoja=tipohoja;
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
		double crecimientoBase=MAX_AGUA*0.05;
		double reduccionPorEdad=edad*0.2;
		
		double resultado = crecimientoBase - reduccionPorEdad;
		
		if (resultado < 0) {
			resultado=0;
			this.edad++;
		} else {
			this.edad++;
			this.setAltura(getAltura()+resultado);
			System.out.println("El arbol ha crecido: " +resultado);
		}
	}
	
}
