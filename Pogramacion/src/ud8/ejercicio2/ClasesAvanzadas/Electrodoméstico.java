package ud8.ejercicio2.ClasesAvanzadas;

public class Electrodoméstico {
	
	//CONSTANTES
	
	private static final String COLOR_BLANCO = "blanco";
	private static final char CONSUMO_ENERGETICO = 'F';
	private static final int PRECIO_BASE = 100;
	private static final double PESO_BASE = 5.0;
	
	//ATRIBUTOS
	
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	//CONSTRUCTORES
	
	public Electrodoméstico() {
		/* Preguntale a la profe para que son las constantes PRECIO_BASE Y PESO_BASE */
	}
	
	public Electrodoméstico(int precioBase, double peso) {
		this.precioBase=precioBase;
		this.color=COLOR_BLANCO;
		this.consumoEnergetico=CONSUMO_ENERGETICO;
		this.peso=peso;
	}
	
	public Electrodoméstico(int precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase=precioBase;
		this.color=comprobarColor(color);
		this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
		this.peso=peso;
	}
	
	//GETTERS Y SETTERS
	
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//MÉTODOS
	
	public char comprobarConsumoEnergetico(char consumoEnergetico) {
		//char letra;
		
		char letras[] = {'A','B','C','D','E','F'};
		boolean comprobar=false;
		char consumoEnergeticoCorrecto;
		
		for (int i=0;i<letras.length;i++) {
			if (consumoEnergetico==letras[i]) {
				comprobar=true;
				consumoEnergeticoCorrecto = consumoEnergetico;
			}
		}
		
		if (comprobar=false) {
			consumoEnergeticoCorrecto = CONSUMO_ENERGETICO;
		} else {
			consumoEnergeticoCorrecto = consumoEnergetico;
		}
		
		return consumoEnergeticoCorrecto;

		
//		O tambien podemos hacer: (((RECUERDA, A LA HORA DE COMPARAR EN COMPROBARCOLOR, PARA COMPROBAR COLORES NO ES CON "==" ES CON EQUALS.
//		if (consumoEnergetico=='A' || consumoEnergetico=='B' || consumoEnergetico=='C' || consumoEnergetico=='D' || consumoEnergetico=='E' || consumoEnergetico=='F') {
//			letra = consumoEnergetico;
//		} else {
//			letra = CONSUMO_ENERGETICO;
//		}
//		return letra;
	}
	
	public String comprobarColor(String color) {
		String colorCorrecto;
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
			colorCorrecto = color;
		} else {
			colorCorrecto = COLOR_BLANCO;
		}
		return colorCorrecto;
	}
	
	public double precioFinal() {
		double precioFinal=0;
		double pesoFinal=0;
		
		if (precioBase < 0) {
			precioBase = PRECIO_BASE;
		}
		if (precioBase >= 0) {
			precioFinal=precioFinal+precioBase;
		}
		
		if (consumoEnergetico=='A') {
			precioFinal=precioFinal+100;
		}
		if (consumoEnergetico=='B') {
			precioFinal=precioFinal+80;
		}
		if (consumoEnergetico=='C') {
			precioFinal=precioFinal+60;
		}
		if (consumoEnergetico=='D') {
			precioFinal=precioFinal+50;
		}
		if (consumoEnergetico=='E') {
			precioFinal=precioFinal+30;
		}
		if (consumoEnergetico=='F') {
			precioFinal=precioFinal+10;
		}
			
		if (peso < 0) {
			pesoFinal = PESO_BASE;
		}
		if (peso >= 0) {
			pesoFinal = peso;
		}
		
		if (pesoFinal >= 0 && pesoFinal <= 19) {
			precioFinal=precioFinal+10;
		}
		
		if (pesoFinal >= 20 && pesoFinal <= 49) {
			precioFinal=precioFinal+50;
		}
		
		if (pesoFinal >= 50 && pesoFinal <= 79) {
			precioFinal=precioFinal+80;
		}
		
		if (pesoFinal >= 80) {
			precioFinal=precioFinal+100;
		}
		
		return precioFinal;
	}
}
