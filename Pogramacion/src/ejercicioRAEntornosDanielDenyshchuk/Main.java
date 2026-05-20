package ejercicioRAEntornosDanielDenyshchuk;

public class Main {
	public static void main(String[] args) {
		
		// Crear salas
        Auditorio auditorio = new Auditorio("Auditorio Nacional", "Calle Mayor 1", 300.0, "Madera noble", 500);
        Auditorio sala2 = new Auditorio("Sala Rincon", "Av. del Arte 22", 120.0, "Tarima flotante", 150);
 
        // Crear equipos de sonido
        EquipoSonido equipo1 = new EquipoSonido("EQ-001", 120.0);
        EquipoSonido equipo2 = new EquipoSonido("EQ-002", 80.0);
 
        // Instalar equipo con sala cerrada (falla)
        System.out.println("-- Instalar equipo con sala cerrada --");
        auditorio.instalarSonido(equipo1);
 
        // Abrir sala e instalar equipo
        System.out.println("-- Abrir sala e instalar equipo --");
        auditorio.setEstado(Sala.Estado.ABIERTA);
        auditorio.instalarSonido(equipo1);
        System.out.println();
 
        // Instalar segundo equipo (falla)
        System.out.println("-- Instalar segundo equipo (ya hay uno) --");
        auditorio.instalarSonido(equipo2);
        System.out.println();
 
        // Preparar escenario
        System.out.println("-- Preparar escenario --");
        auditorio.prepararEscenario();
        System.out.println();
 
        // Preparar escenario sala cerrada (falla)
        System.out.println("-- Preparar escenario sala cerrada --");
        sala2.prepararEscenario();
        System.out.println();
 
        // Verificar acustica
        System.out.println("-- Verificar acustica --");
        equipo1.verificarAcustica(110.0);
        equipo1.verificarAcustica(130.0);
        System.out.println();
 
        // Asignar asientos
        System.out.println("-- Asignar asientos --");
        auditorio.setEstado(Sala.Estado.ABIERTA);
        auditorio.asignarAsientos(200);
        auditorio.asignarAsientos(400);
        System.out.println();
 
        // Crear bandas y programar conciertos
        System.out.println("-- Programar conciertos --");
        Banda banda1 = new Banda("B-001", "The Rolling Beats", 115.0);
        Banda banda2 = new Banda("B-002", "Jazz Collective", 75.0);
        System.out.println();
 
        sala2.setEstado(Sala.Estado.ABIERTA);
        banda1.programarConcierto("2025-06-15", auditorio);
        banda1.programarConcierto("2025-06-20", sala2);
        banda2.programarConcierto("2025-07-01", auditorio);
 
        // Gira de las bandas
        System.out.println("-- Gira de " + banda1.getNombreArtistico() + " --");
        for (Concierto c : banda1.getGira()) System.out.println("  " + c);
        System.out.println();
        
        System.out.println("-- Gira de " + banda2.getNombreArtistico() + " --");
        for (Concierto c : banda2.getGira()) System.out.println("  " + c);
        System.out.println();
 
        // Calendario del auditorio
        System.out.println("-- Calendario Auditorio Nacional --");
        for (Concierto c : auditorio.getCalendario()) System.out.println("  " + c);
        System.out.println();
 
        // Verificar si el equipo soporta a cada banda
        System.out.println("-- Acustica por banda en el Auditorio --");
        for (Concierto c : auditorio.getCalendario()) {
            auditorio.getEquipo().verificarAcustica(c.getBanda().getDecibelios());
        }
        System.out.println();
        
	}
}
