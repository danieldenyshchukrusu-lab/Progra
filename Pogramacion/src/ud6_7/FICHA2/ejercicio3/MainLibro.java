package ud6_7.FICHA2.ejercicio3;

import java.util.Scanner;

public class MainLibro {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String tituloLibro;
		String autor;
		int ejemplaresLibro;
		int ejemplaresPrestados;
		
		Libro libro2=new Libro("Don Quijote","Miguel de cervantes",12,7);
		Libro libro3=new Libro();
		
		System.out.println("¿Cual es el titulo del libro?");
		tituloLibro=leer.nextLine();
		System.out.println("¿Cual es el autor del libro?");
		autor=leer.nextLine();
		System.out.println("¿Cuantos ejemplares del libro hay?");
		ejemplaresLibro=leer.nextInt();
		System.out.println("¿Cuantos ejemplares hay prestados?");
		ejemplaresPrestados=leer.nextInt();
		
		Libro libro1=new Libro(tituloLibro,autor,ejemplaresLibro,ejemplaresPrestados);
		
		System.out.println(" ");
		System.out.println("Libro3");
		
		libro3.setTituloLibro("LagrimasDeShiva");
		System.out.println(libro3.getTituloLibro());
		libro3.setAutor("Lucas Montero");
		System.out.println(libro3.getAutor());
		libro3.setEjemplaresLibro(7);
		System.out.println(libro3.getEjemplaresLibro());
		libro3.setEjemplaresPrestados(7);
		System.out.println(libro3.getEjemplaresPrestados());
		System.out.println(" ");
		
		System.out.println(libro1);
		System.out.println(" ");
		System.out.println(libro2);
		System.out.println(" ");
		System.out.println(libro3);
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("Aqui se prueba que funciona el método prestamo a la hora de prestar un libro si aun quedan ejemplares.");
		System.out.println(" ");
		libro1.prestamo();
		
		System.out.println(libro1);
		
		System.out.println(" ");
		System.out.println("Aqui se muestra que si hay los mismos ejemplares prestados como ejemplares del libro, no se podria prestar un libro por lo que se quedaria igual.");
		System.out.println(" ");
		libro3.prestamo();
		
		System.out.println(libro3);
		
		System.out.println(" ");
		System.out.println("Aqui se muestra que a la hora de la devolucion, es decir si hay ejemplares prestados, se restan los ejemplares prestados.");
		System.out.println(" ");
		libro2.devolucion();
		
		System.out.println(libro2);
	}
}
