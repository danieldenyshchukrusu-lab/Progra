package ud8.ejercicio1.Empleado;

public class MainPersona {
	public static void main(String[] args) {
		Persona p1=new Persona();
		Persona p2=new Persona("David", 20, 'M');
		Empleado e1=new Empleado();
		Empleado e2=new Empleado("Ana", 35, 'F', 200, "Comercial", "Direccion");
		Persona p3=new Empleado("Luis", 25, 'M', 100, "Administración", "Jefe Dpto");
		
		
		p1.presentacion();
		p2.presentacion();
		e1.presentacion();
		e2.presentacion();
		e1.saludoEmpleado();
		e2.saludoEmpleado();
		
		p3.presentacion();
		/* p3.saludoEmpleado(); esto no se podria a no ser de que forcemos con: */ ((Empleado)p3).saludoEmpleado(); /* pero no lo hariamos */
		
		
		
		
	}
}
