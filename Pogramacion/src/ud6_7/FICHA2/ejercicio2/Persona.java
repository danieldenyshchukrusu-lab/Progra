package ud6_7.FICHA2.ejercicio2;

public class Persona {
	private String nombre=" ";
	private int edad=0;
	private String dni;
	private char sexo;
	private double peso=0;
	private double altura=0;
	
	private static char sexo_defecto = 'H';
	private static double IMC_bajo = -1;
	private static double IMC_medio = 0;
	private static double IMC_alto = 1;
	
	//CONSTRUCTORES
	
	public Persona() {
		this.nombre="";
		this.edad=0;
		this.dni=generaDNI();
		this.sexo=sexo_defecto;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=generaDNI();
		this.sexo=comprobarSexo(sexo);
		this.peso=0;
		this.altura=0;
		
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=generaDNI();
		this.sexo=comprobarSexo(sexo);
		this.peso=peso;
		this.altura=altura;
	}
	
	//MÉTODOS
	
	public double calcularIMC() {
		double IMCResultado=0;
		double IMC=0;
		IMC=peso/(altura*altura);
		if (IMC<20) {
			IMCResultado=IMC_bajo;
		} else if (IMC>=20 && IMC<=25) {
			IMCResultado=IMC_medio;
		} else if (IMC>25) {
			IMCResultado=IMC_alto;
		}
		return IMCResultado;
	}
	
	public boolean esMayorDeEdad() {
		boolean mayor=true;
		if (edad>=18) {
			mayor=true;
		} else {
			mayor=false;
		}
		return mayor;
	}
	
	private char comprobarSexo(char sexo) {
		char sexoComprobado=' ';
		if (sexo=='H' || sexo=='h' || sexo=='M' || sexo=='m') {
			sexoComprobado = sexo;
		}else{
			sexoComprobado = sexo_defecto;
		}
		return sexoComprobado;
	}
	
	public String generaDNI() {
		int numero = (int) (Math.random() * 100000000);
		char letra = calcularLetraDNI(numero);
        return numero + "" + letra;
	}
	
	private char calcularLetraDNI(int numero) {
		char[] letra = { 'T','R','W','A','G','M','Y','F','P','D','X','B',
	            'N','J','Z','S','Q','V','H','L','C','K','E' };
		return letra[numero % 23];
	}
	
	@Override
	public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
	
	//SETTERS
	
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
