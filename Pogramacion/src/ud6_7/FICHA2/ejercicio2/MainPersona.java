package ud6_7.FICHA2.ejercicio2;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String nombre=" ";
		int edad=0;
		char sexo=' ';
		double peso=0;
		double altura=0;

		Persona per1=new Persona();
		Persona per2=new Persona("Lucia",18,'m');
		Persona per3=new Persona();
		
		System.out.println("Dime tu nombre");
		per1.setNombre(leer.nextLine());
		System.out.println("Dime tu edad");
		per1.setEdad(leer.nextInt());
		leer.nextLine();
		System.out.println("Introduce tu sexo (H o M)");
		per1.setSexo(leer.next().charAt(0));
		System.out.println("Dime tu peso");
		per1.setPeso(leer.nextDouble());
		System.out.println("Dime tu altura");
		per1.setAltura(leer.nextDouble());
		
		
		
		/* Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
		anteriores variables pedidas por teclado, el segundo objeto obtendrá
		todos los anteriores menos el peso y la altura y el último por defecto,
		para este último utiliza los métodos set para darle a los atributos un valor. */
		
		
		
		/* Para cada objeto, deberá comprobar si está en su peso ideal, tiene
		sobrepeso o por debajo de su peso ideal con un mensaje. */
		
		System.out.println(per1.calcularIMC());
		System.out.println(per2.calcularIMC()); 
		System.out.println(per3.calcularIMC());
		
		/* Indicar para cada objeto si es mayor de edad. */
		
		if (per1.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
		
		if (per2.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
		
		if (per3.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
		
		/* Por último, mostrar la información de cada objeto. */
		
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		
	}
}
