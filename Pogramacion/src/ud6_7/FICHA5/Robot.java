package ud6_7.FICHA5;

public class Robot {
	private String modelo=" ";
	private int bateria=0;
	private int IDrobot=0;
	private static int TotalRobots; 
	private static int BateriaMaxima=100;
	private static int BateriaEstandar=50;
	private static int GenerarIDRobot;
	private static String ModeloGénerico="ZC250";
	
	
	//CONSTRUCTOR
	
	public Robot() {
		this.modelo=ModeloGénerico;
		this.bateria=BateriaEstandar;
		GenerarIDRobot+=10;
		TotalRobots++;
		this.IDrobot=GenerarIDRobot;
	}
	
	public Robot(String modelo, int bateria) {
		this.modelo=modelo;
		this.bateria=bateria;
		GenerarIDRobot+=10;
		TotalRobots++;
		this.IDrobot=GenerarIDRobot;
	}
	
	public Robot(String modelo) {
		this.modelo=modelo;
		this.bateria=BateriaEstandar;
		GenerarIDRobot+=10;
		TotalRobots++;
		this.IDrobot=GenerarIDRobot;
	}
	
	//MÉTODOS

	public int comprobarBateria(int bateria) {
		int baterias;
		if (bateria>0 && bateria<=100) {
			baterias = bateria;
		} else {
			baterias = BateriaEstandar;
		}
	return baterias;
	}
	
	public String comprobarModelo(String modelo) {
		String modeloComprobado;
		if (modelo==" ") {
			modeloComprobado = ModeloGénerico;
		} else {
			modeloComprobado = modelo;
		}
		return modeloComprobado;
	}

	//SETTERS Y GETTERS
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public int getIDrobot() {
		return IDrobot;
	}

	public void setIDrobot(int iDrobot) {
		IDrobot = iDrobot;
	}
}	
