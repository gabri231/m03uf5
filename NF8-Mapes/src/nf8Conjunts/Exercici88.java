package nf8Conjunts;

import java.util.Map;
import java.util.TreeMap;

/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 *  
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 28.09.2015
 *  
 * rea un programa Java que faci el següent:
	1. Creï un objecte que faci servir mètodes de SortedMap on la clau sigui una matrícula (9999 XXX)
	 	i l’objecte relacionat sigui de tipus cotxe. Pots fer servir els de sempre
	2. Afegiu els objectes 
	3. Pots afegir-hi duplicats? Com?
	4. Obté les dades de tots els objectes
		a. amb qualsevol mètode

 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class Exercici88 {

	public static void main(String[] args) {
			
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 1. Creï un HashSet que suporti 5 objectes de tipus cotxe com hem creat abans.
		//ok
		// Se crea la lista.
		Map<String, Coche> mapDeCoches = new TreeMap<String, Coche>();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 2. Omple’l amb els valors de la taula del costat
		//ok
	
		mapDeCoches.put("1234 ABC", new Coche("Alfa Romero", "Giulia", 2900, 6));
		mapDeCoches.put("3566 DEF", new Coche("Dacia", "Sandero", 1200, 4));
		mapDeCoches.put("5122 GHI", new Coche("Ford", "Focus", 2000, 4));
		mapDeCoches.put("4321 JKL", new Coche("Opel", "Insignia", 2200, 4));
		mapDeCoches.put("2233 MNO", new Coche("Seat", "Ibiza", 1600, 4));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 3. Pots afegir-hi duplicats? Com?
		linea();
		String matricula="1234 ABC";
		Coche putCar= new Coche("Coche1", "Modelo1", 1300, 4);
		
		if(!mapDeCoches.containsKey(matricula)){
			mapDeCoches.put(matricula, putCar);
			System.out.println("El se ha a�adido el coche con matricula: "+matricula+".");
		}else{
			System.out.println("ERROR: El coche con la matricula: "+matricula+" ya est� introducido en el mapa.");
		}
		linea();
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 4. Obté les dades de tots els objectes
		//	a. amb qualsevol mètode
		for (Map.Entry<String, Coche> car : mapDeCoches.entrySet()){
			System.out.println("|"
				+ String.format("%1$-8s",car.getKey())
				+ "| "
				+String.format("%1$-12s",car.getValue().getMarca())
				+" | "
				+String.format("%1$-8s",car.getValue().getModelo())
				+" | "
				+car.getValue().getCilindrada()
				+" | "
				+car.getValue().getCilindres()
				+" | "
				+ String.format("%1$-5s",String.format("%.2f", car.getValue().potenciaFiscal()))+"|");
		}
	}

	//Fin de main	
	static void linea(){
	System.out.println("#########################################################################");
	}
}