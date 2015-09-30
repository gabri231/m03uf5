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
 *Crea un programa Java que faci el següent:
	1. Clona dues vegades la LinkedList de l’exercici anterior. Anomena-les lifoAutos, fifoAutos 
	
	2. Ara crea una PriorityQueue (help aquí i aquí) amb els 6 cotxes (pots copiar qualsevol de les dues LinkedLists
		anteriors). Mostra-la per pantalla ordenada per cilindrada, de menor a més gran.
	
	3. Inserta el següent cotxe a les tres llistes: Fiat Panda 900, 2.  
	
	4. Mostra ambdues cues per ordre: Fes un bucle que extregui el primer element de cadascuna de les tres llistes 
		en ordre fins que no en quedi cap.
	
	5. Respon la següent pregunta (en un comentari al final del codi): Posa un exemple de la vida real de cadascun dels dos tipus de cues (no necessàriament quan els objectes són models de cotxes!)
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
		// 1. Clona dues vegades la LinkedList de l’exercici anterior. Anomena-les lifoAutos, fifoAutos 
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
		/*
		 * PriorityQueue<clase> pq = new PriorityQueue<clase>();
		 * 
		PriorityQueue<Golfista> pq = new PriorityQueue<Golfista>();
		pq.offer(tiger);
		pq.offer(phil);
		pq.offer(hal);
		
		while (!pq.isEmpty())
		{
			Golfista primerLlista = pq.poll();
			System.out.println(primerLlista.getName() + ", puntuació: " + primerLlista.getScore());
		}
		*/
		PriorityQueue<cuaCilindrada> cuaOrdenadaPerCilindrada = new PriorityQueue<cuaCilindrada>();
		//cuaOrdenadaPerCilindrada.offer(null);
		
		//for (coche car : fifoAutos){
			//cuaOrdenadaPerCilindrada.offer(new coche(car.getMarca(), car.getModelo(), car.getCilindrada(),car.getCilindres()));
		//}
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
	
	// Se define la clase cuaCilindrada
	// Es una clase heredada de coche.
	public static class cuaCilindrada extends coche implements Comparable<cuaCilindrada> {

		public int compareTo(cuaCilindrada car) {
			cuaCilindrada that = (cuaCilindrada) car;
			int a = this.cilindrada;
			int b = that.cilindrada;

			// for golfers, low is good!
			if (a > b)
				return 1;
			if (a < b)
				return -1;
			return 0;
		}

	}
	
	
}
