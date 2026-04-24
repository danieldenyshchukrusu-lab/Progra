package ud10.EjercicioLista9;

public interface Cuidable {
	
	public static void recomendarRiego(Planta p) {
		if (p.isNecesitaAgua() == false) {
			System.out.println("No es necesario regar la planta");
		} else {
			System.out.println("Es necesario regar la planta");
		}
	}
	
	public boolean necesitaRiego();
	
	public void recibirLuz();
	
}
