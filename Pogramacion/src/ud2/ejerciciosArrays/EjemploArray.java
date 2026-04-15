package ud2.ejerciciosArrays;

public class EjemploArray {
	public static void main(String[] args) {
		int notas[]=new int[5];
		//Recorremos el array para pasarle valores
		for (int i=0;i<notas.length;i++) {
			notas[i]=i+1;
		}
		//Recorremos DE NUEVO el array para que nos muestre los valores almacenados
		for (int i=0;i<notas.length;i++) {
			System.out.println(i);
		}
		
	}
}
