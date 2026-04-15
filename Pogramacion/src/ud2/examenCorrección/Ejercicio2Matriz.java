package ud2.examenCorrección;

public class Ejercicio2Matriz {
	public static void main(String[] args) {
		double matriz1[][]= new double [3][5];
		double sumaAgua=0;
		int contDiasSaludables=0;
		int contDiasDormidos=0;
		
		for (int i=0;i<matriz1.length;i++) {
			for (int j=0;j<matriz1[i].length;j++) {
					matriz1[0][j]=(int) (Math.random() * (180+1));
					matriz1[1][j]=(double) (Math.random() * (5+1));
					matriz1[2][j]=(double) (Math.random() * (24+1));
				}
			}
		for (int i=0;i<matriz1.length;i++) {
			for (int j=0;j<matriz1[i].length;j++) {
					System.out.print(matriz1[i][j]+" \t");
				}
			System.out.println();
			}
		
		double diaMenosEjercicio=matriz1[0][0];
		
			for (int j=0;j<matriz1[0].length;j++) {
				sumaAgua=sumaAgua+matriz1[1][j];
				if (matriz1[2][j]>=6) {
					contDiasDormidos++;
				}
				if (matriz1[0][j]<=diaMenosEjercicio) {
						diaMenosEjercicio=matriz1[0][j];
						diaMenosEjercicio=j;
					}
				if (matriz1[0][j]>=20 && matriz1[1][j]>=1.5 && matriz1[2][j]>=7) {
					contDiasSaludables++;
				}
				
			}
			String menosEjercicio="";
			if (diaMenosEjercicio==0) {
				menosEjercicio="Lunes";
			}else if(diaMenosEjercicio==1) {
				menosEjercicio="Martes";
			}else if(diaMenosEjercicio==2) {
				menosEjercicio="Miercoles";
			}else if(diaMenosEjercicio==3) {
				menosEjercicio="Jueves";
			}else if(diaMenosEjercicio==4) {
				menosEjercicio="Viernes";
			}
		System.out.println("***HÁBITOS SALUDABLES***");
		System.out.println("El dia que has realizado menos ejercicio es: " +menosEjercicio);
		System.out.println(contDiasDormidos+ " dias, ha dormido al menos 6 horas");
		System.out.println("El promedio de agua bebida es de " +sumaAgua/5+ " litros");
		System.out.println("De los 5 dias, " +contDiasSaludables+ " han sido saludables");
	}
}
