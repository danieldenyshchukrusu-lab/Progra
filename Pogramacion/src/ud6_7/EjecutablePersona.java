package ud6_7;

public class EjecutablePersona {
	public static void main(String[] args) {
		Persona per1=new Persona();
		Persona per2=new Persona();
		
		per1.nombre="Pepa";
		per1.edad=20;
		per1.estatura=170;
		
		per1.saludar();
		System.out.println(per1.cumplirAnios());
		
		per1.nombre="Paco";
		per1.edad=20;
		per1.estatura=170;
		
		per1.saludar();
		System.out.println(per2.edad);
	}
}	
