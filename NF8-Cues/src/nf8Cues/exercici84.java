package nf8Cues;

import java.util.LinkedList;
import java.util.PriorityQueue;


/** Un programa Java simple - Colas prioritarias 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 29.09.2015
 *  
 *Crea un programa Java que faci el seg�ent:
	1. Clona dues vegades la LinkedList de l�exercici anterior. Anomena-les lifoAutos, fifoAutos 
	
	2. Ara crea una PriorityQueue (help aqu� i aqu�) amb els 6 cotxes (pots copiar qualsevol de les dues LinkedLists
		anteriors). Mostra-la per pantalla ordenada per cilindrada, de menor a m�s gran.
	
	3. Inserta el seg�ent cotxe a les tres llistes: Fiat Panda 900, 2.  
	
	4. Mostra ambdues cues per ordre: Fes un bucle que extregui el primer element de cadascuna de les tres llistes 
		en ordre fins que no en quedi cap.
	
	5. Respon la seg�ent pregunta (en un comentari al final del codi): Posa un exemple de la vida real de cadascun dels
	 	dos tipus de cues (no necess�riament quan els objectes s�n models de cotxes!)
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class exercici84 {

	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Se crea la lista LinkedList con 5 objetos de tipo coche.
		LinkedList<coche> lista = new LinkedList <coche>();
		// Llena los valores de la tabla con los metodos de cola.
		//
		lista.offer(new coche("Hyundai", "Atos", 1500, 3));
		lista.offer(new coche("Alfa Romero", "Giulia", 2900, 6));
		lista.offer(new coche("Dacia", "Sandero", 1200, 4));
		lista.offer(new coche("Ford", "Focus", 2000, 4));
		lista.offer(new coche("Opel", "Insignia", 2200, 4));
		lista.offer(new coche("Seat", "Ibiza", 1600, 4));
				
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 1. Clona dues vegades la LinkedList de l'exercici anterior. Anomena-les lifoAutos, fifoAutos 
		// Creamos las LinkedList para clonarlas.
		
		LinkedList<coche> lifoAutos = new LinkedList<coche>();
		LinkedList<coche> fifoAutos = new LinkedList<coche>();
		// Clonamos desde la LinkedList 'lista'
		lifoAutos= (LinkedList) lista.clone();
		fifoAutos= (LinkedList) lista.clone();
		
		linea("Lista coches");
		ImprimirCoche(lista);
		linea("Lista lifoAutos");
		ImprimirCoche(lifoAutos);
		linea("Lista fifoAutos");
		ImprimirCoche(fifoAutos);
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//2. Ara crea una PriorityQueue amb els 6 cotxes 
		//		(pots copiar qualsevol de les dues LinkedLists anteriors). 
		// 		Mostra-la per pantalla ordenada per cilindrada, de menor a més gran.
		
		// Se crea la priorityQueue de la clase coche llamada cuaOrdenadaPerCilindrada. 
		PriorityQueue<coche> cuaOrdenadaPerCilindrada = new PriorityQueue<coche>();
		
		// Se crea una cua auxiliar para fer proves
		PriorityQueue<coche> cuaAux= new PriorityQueue<coche>();
		
		// Recorremos la lista lifoautos para añadirlo en la cua de cotxes ordenada per cilindre.
		for(coche car : lifoAutos){
			cuaOrdenadaPerCilindrada.offer(car);
			cuaAux.offer(car);
		}
		System.out.println("Lista ordenada por cilindrada.");
		
		// Imprimimos els objectes de la cua.
				
		while (!cuaAux.isEmpty())
		{
			coche cilindrada = cuaAux.poll();
			System.out.println("|"
					+ String.format("%1$-13s",cilindrada.getMarca())
					+ "|  "
					+String.format("%1$-10s",cilindrada.getModelo())
					+"| "
					+cilindrada.getCilindrada()
					+" | "
					+cilindrada.getCilindres()+" |");
		}
		linea();
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 3. Inserta el segent cotxe a les tres llistes: Fiat Panda 900, 2.  
		//	("Fiat", "Panda", 900, 2)
		//
		// 		Listas disponibles: 'lista'. 'fifoAutos', 'lifoAutos'
		//		añadimos el nuevo coche a las 3 listas.
		
		cuaOrdenadaPerCilindrada.offer(new coche("Fiat", "Panda", 900, 2));
		fifoAutos.offer(new coche("Fiat", "Panda", 900, 2));
		lifoAutos.offer(new coche("Fiat", "Panda", 900, 2));
 		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//	4. Mostra ambdues cues per ordre: Fes un bucle que extregui el primer element de cadascuna de les tres llistes 
		// 		en ordre fins que no en quedi cap.
		System.out.println("Se extrae el primer elemento de las 3 listas: \n");
		
		// Imprimimos el primer elemento, que es el que se extraera.
		System.out.println("De la cua [[cuaOrdenadaPerCilindrada]] el primer elemento que se extrae es: " +cuaOrdenadaPerCilindrada.element().getMarca());
		// Listamos elementos de la cola.
		cuaOrdenadaPerCilindrada.poll();
		System.out.print(" ");
		while (!cuaOrdenadaPerCilindrada.isEmpty())
		{
			coche cilindrada = cuaOrdenadaPerCilindrada.poll();
			System.out.print("("+ cilindrada.getMarca()+"),");
		}
		
		
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	5. Respon la seg�ent pregunta (en un comentari al final del codi): Posa un exemple de la vida real de cadascun dels
	 	// 		dos tipus de cues (no necess�riament quan els objectes s�n models de cotxes!)
		
		
		
		
		
		
		
		
		
		//Fin de main
	}
	
	//Fin de main	
	static void ImprimirCoche(LinkedList<coche> lista){
		int contador = 1;
		for (coche car : lista){
			System.out.println("|"
					+ contador+"| "
					+ String.format("%1$-13s",car.getMarca())
					+ "|  "
					+String.format("%1$-10s",car.getModelo())
					+"|   "
					+car.getCilindrada()
					+"\t|   "
					+car.getCilindres()
					+"\t|   "
					+ car.pontenciaFiscal()+"\t|");
			contador++;
		}
		linea();
	}
	static void linea(){
		System.out.println("+-----------------------------------------------------------------------+");
	}
	static void linea(String a){
		System.out.println("+------------------<["+ String.format("%1$15s", a)+" ]>---------------------------------+");
	}
	
}
