package proyectoProgramacion;

import java.util.Scanner;

public class MisiónIntergalácticaDanielDenyshchukRusu {
	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		//variable para las respuestas al menu.
		int respuestaMenu=1;
		//Variable contador de energia estelar.
		int contadorTotalEnergiaEstelar=0;
		
		// Variables opción 1.
		int potenciaACalibrar=(int) (Math.random() * 100) + 1; //lo que hará este math.random es darle un valor aleatorio a la potenciaACalibrar, para que no sea nunca la misma. Y podamos jugar siempre con el mayor, menor e igual.
		int potenciaCalibrada=0;
		int intentosPotencia=0;
		//Variables opción 2.
		char codigoSector=' ';
		int cuadrante=0;
		int añoDeDestino=0;
		//Variables opción 4.
		int contadorDeCorrectos=0;
		int totalContadorDeCorrectos=0;
		//Variables opción 6.
		double SistemaSensores[][]=new double[3][3];
		double temperatura=0;
		double mediaSumaTemperaturaSensores=0;
		//Variables opción 5. 
		int unoDos=0;
		String[] tripulantes1 = new String[5];
		String tripulanteIntroducido;
		
		while (respuestaMenu!=0) { //Mientras la respuesta al menu sea 0, podremos introducir todos los numeros que queramos para ir navegando entre opciones.
			System.out.println("--- CENTRO DE CONTROL ---");
			System.out.println("(Introduce 1) Calibrar los motores de la nave");
			System.out.println("(Introduce 2) Introducir coordenadas de destino");
			System.out.println("(Introduce 3) Mostrar energía estelar acumulada");
			System.out.println("(Introduce 4) Iniciar el salto interestelar");
			System.out.println("(Introduce 5) Tripulación registrada");
			System.out.println("(Introduce 6) Diagnóstico del sistema");
			System.out.println("(Introduce 0) Salir");
			respuestaMenu=leer.nextInt();
			
			switch (respuestaMenu) {
			case 1: {
				System.out.println("Piloto, calibre los motores de la nave estelar AuroraIX, para alcanzar el nivel exacto de potencia");
				
			while (potenciaCalibrada!=potenciaACalibrar) { //While: Mientras la potencia randomizada no sea igual a la que vayamos introduciendo, se irá repitiendo hasta que se consiga.
				System.out.println("Introduce un valor para empezar (1-100)");
				potenciaCalibrada=leer.nextInt(); 
					
				if (potenciaCalibrada<potenciaACalibrar) { //Dos if: si una potencia es baja/alta, se tiene que volver a probar y se suma un intento por potencia introducida.
					System.out.println("La potencia: "+potenciaCalibrada+ " es demasiado baja, vuelva a probar con una más alta");
					intentosPotencia++;
						
				} if (potenciaCalibrada>potenciaACalibrar) {
					System.out.println("La potencia: "+potenciaCalibrada+ " es demasiado alta, vuelva a probar con una más baja");
					intentosPotencia++;
				}
			}
			if (potenciaCalibrada==potenciaACalibrar) { //if: si la potencia randomizada es igual a la que hemos introducido, los motores estarán calibrados correctamente.
				System.out.println("Motores calibrados correctamente, la potencia es: " +potenciaCalibrada);	
			}
			System.out.println("Este fue su numero de intentos: " +intentosPotencia); //El numero de intentos que nos han hecho falta hasta dar con la potencia.
			contadorTotalEnergiaEstelar=contadorTotalEnergiaEstelar+10; //Se nos pedía que al finalizar esta opción exitosamente, se sumen 10 de energia al contador de energia estelar.
				
				break; }
			case 2: {
				do {
					System.out.println("Piloto, tiene que introducir las coordenadas galácticas.");
					System.out.println("Introduzca primero el sector (A-Z) (No minusculas)");
					codigoSector = leer.next().charAt(0); //En esta variable se guardará la letra introducida.

					System.out.println("Introduzca ahora el cuadrante (1-10)");
					cuadrante=leer.nextInt();//En esta variable se guardará el numero de cuadrante.

					System.out.println("Introduzca el año de destino (>2200)");//En esta variable se guardará el año de destino.
					añoDeDestino=leer.nextInt();

					if (codigoSector<'A' || codigoSector>'Z' || cuadrante<1 || cuadrante>10 || añoDeDestino < 2200) { //If:  la variable introducida en codigoSector o cuadrante o añoDeDestino no es correcta, te mostrará un mensaje de error.
					    	System.out.println("Coordenadas incorrectas. Reintenta la entrada.");
					}				    
				} while (codigoSector<'A' || codigoSector>'Z' || cuadrante<1 || cuadrante>10 || añoDeDestino<2200) ; //While: si los valores introducidos en las 3 variables por igual no son correctos, tienes que volver a introducir los datos hasta que estén correctos.
				
				System.out.println("Coordenadas cargadas con éxito, piloto. Nave lista para el salto.");
				contadorTotalEnergiaEstelar=contadorTotalEnergiaEstelar+5; //Se nos pedía que al finalizar esta opción exitosamente, se sumen 5 de energia al contador de energia estelar.
					
				break; }
			case 3: {
				System.out.println("Tiene: "+contadorTotalEnergiaEstelar+" unidades de energia estelar acumulada, piloto."); //Aqui nos muestra cuantas unidades de energia estelar tenemos en total.
				
				break; }
			case 4: {
				
				totalContadorDeCorrectos=0;						//Estas dos variables son para que el totalContadorDeCorrectos siempre que se escoja esta opción, se inicialice a 0, para que no nos de problemas con sumas de más de 3.
				contadorDeCorrectos=totalContadorDeCorrectos;
				
				if (potenciaCalibrada==potenciaACalibrar) {		//3 IF: En estos 3 if se comprueba si las opciones 1, 2, y 3 están correctas, si es así se suma uno al contador por cada opción correcta. Si no, se muestra un mensaje de ERROR para cada respectiva opción.
					System.out.println("motores calibrados.");
					contadorDeCorrectos++;
				} else {
					System.out.println("Error: motores sin calibrar.");
				}
					
				if (codigoSector>'A' && codigoSector<'Z' || cuadrante>1 && cuadrante<10 || añoDeDestino >= 2200) { //Comprueba algo de aqui con lo que tienes en el ejercicio 2 (lo de los OR y los AND)
					System.out.println("coordenadas establecidas.");
					contadorDeCorrectos++;
				} else {
					System.out.println("Error: coordenadas no establecidas.");
				}
				
				if (contadorTotalEnergiaEstelar>=10) {
					System.out.println("Suficiente energia estelar: " +contadorTotalEnergiaEstelar+ ".");
					contadorDeCorrectos++;
				} else {
					System.out.println("Error: energía insuficiente para el salto.");
				}
				
				if (contadorDeCorrectos==3) { //IF: Si el contador de correctos es igual a 3, es que se han completado exitosamente las 3 primeras opciones.
					System.out.println("¡Despegue exitoso! La nave Aurora IX ha iniciado su salto interestelar.");
					contadorTotalEnergiaEstelar=contadorTotalEnergiaEstelar-10; //Se nos pedía en el programa que una vez la opción 4 se complete exitosamente, se resten 10 unidades de energia al contador de energia estelar.
				}
				
				break; }
			case 5: {
				System.out.println("Si quiere añadir el registro de 5 tripulantes (pulse 1)"); 
				System.out.println("Si quiere mirar el registro de tripulantes (pulse 2)");
				System.out.println("Si quiere introducir un tripulante (pulse 3)");
				
				unoDos=leer.nextInt();
					if (unoDos==1) {
						System.out.println("Introduce el nombre de 5 tripulantes"); //IF: Con este IF, introduciremos los 5 tripulantes.
						for (int i=0;i<tripulantes1.length;i++) {
							tripulantes1[i]=leer.next();
							}
						}
					
						if (unoDos==2) {
							for (int i=0;i<tripulantes1.length;i++) { //IF: Con este IF, veremos los tripulantes que hay en el registro.
								System.out.println(tripulantes1[i]);
							}
						}
						
						if (unoDos == 3) {
					        System.out.println("Introduce el nuevo tripulante: "); //IF: Con este IF, introduciremos un nuevo tripulante, y eliminaremos al más antiguo.
					        tripulanteIntroducido=leer.next();

					        for (int i=0;i<tripulantes1.length-1;i++) { 
					            tripulantes1[i]=tripulantes1[i+1]; //El nombre que habia en la posición 0 se va a la 1, el nombre de la 1 a la 2, y asi sucesivamente, hasta que la posición 4 queda libre.
					        }
					        tripulantes1[tripulantes1.length-1]=tripulanteIntroducido; //Y aqui vamos a la posición 4 de tripulante con tripulantes1.length-1, e introducimos el nuevo tripulante.
						}
						
				break; }
			case 6: {
				
				System.out.println("Introduce la temperatura de los 3 sensores de cada sistema.");
				for(int i=0;i<SistemaSensores.length;i++) { //2 FOR: Estos 2 for nos ayudarán a recorrer correctamente toda la matriz 3x3, e ir introduciendo a los sensores sus respectivas temperaturas. El primer for recorre las filas [i], y el segundo for las columnas [j].
					System.out.println("Sistema "+(i+1));
					
					for (int j=0;j<SistemaSensores[i].length;j++) { 
						temperatura=leer.nextDouble();
						SistemaSensores[i][j]=temperatura;
						System.out.println("Sistema "+(i+1)+ ", Sensor " +(j+1)+": " +temperatura);
					}
					System.out.println();	
				}
				
				for(int i=0;i<SistemaSensores.length;i++) { //2 FOR: Estos 2 for nos ayudarán a hacer la media de los 3 sensores de cada Sistema.
					System.out.println("Sistema "+(i+1));
					mediaSumaTemperaturaSensores=0; //La media de la suma de la temperatura de los sensores siempre se inicializará a 0.
					
					for (int j=0;j<SistemaSensores[i].length;j++) {
						mediaSumaTemperaturaSensores=mediaSumaTemperaturaSensores+SistemaSensores[i][j]; //se van sumando las temperaturas de los sensores de cada sistema en esta variable.
						System.out.println("Sensor "+(j+1)+", "+SistemaSensores[i][j]);
					}
					mediaSumaTemperaturaSensores=mediaSumaTemperaturaSensores/3; //Luego se divide el total de la suma de los 3 sensores de cada sistema entre 3, para sacar la media de temperatura de cada sistema.
					System.out.println("Sistema "+(i+1)+ " Su media es "+mediaSumaTemperaturaSensores);
					System.out.println();
				}
				
				break; }
			case 0: {
				
				System.out.println("Cerrando sistemas de navegación... ¡Hasta el próximo viaje, piloto!"); //En el caso de introducir 0 en la respuestaMenu, nos saldrá este mensaje y el programa habrá terminado.
				
				break; }
			default:
				
				System.out.println("Número inválido, vuelva a introducir otro numero dentro del rango proporcionado."); //En el caso de no introducir un valor entre 0-6, nos saldrá este mensaje y tendremos que introducir otra vez el numero.
			}
		}
		leer.close();
	}
}
