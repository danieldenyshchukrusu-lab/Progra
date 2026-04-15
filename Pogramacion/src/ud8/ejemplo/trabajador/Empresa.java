package ud8.ejemplo.trabajador;

public class Empresa {
	public static void main(String[] args) {
		Trabajador t = new Trabajador("Luis", "A123456");
		System.out.println(t.toString());
		
		Empleado e1=new Empleado("Ana", "B1817"); 
		System.out.println(e1.toString());		
		e1.sueldo();
		
		Empleado e2=new Empleado("Diego", "B1282"); 
		System.out.println(e2.toString());		
		e2.sueldo();
		
		Consultor c1=new Consultor ("David", "F827390", 10,20);
		System.out.println(c1.toString());
		c1.sueldo();
		
		Trabajador t2=new Consultor("Eva", "6729B", 100, 15);
		
		
	}
}
