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
		LinkedList<Coche> lista = new LinkedList <Coche>();
		// Llena los valores de la tabla con los metodos de cola.
		//
		lista.offer(new Coche("Hyundai", "Atos", 1500, 3));
		lista.offer(new Coche("Alfa Romeo", "Giulia", 2900, 6));
		lista.offer(new Coche("Dacia", "Sandero", 1200, 4));
		lista.offer(new Coche("Ford", "Focus", 2000, 4));
		lista.offer(new Coche("Opel", "Insignia", 2200, 4));
		lista.offer(new Coche("Seat", "Ibiza", 1600, 4));
				
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 1. Clona dues vegades la LinkedList de l'exercici anterior. Anomena-les lifoAutos, fifoAutos 
		// Creamos las LinkedList para clonarlas.
		
		LinkedList<Coche> lifoAutos = new LinkedList<Coche>();
		LinkedList<Coche> fifoAutos = new LinkedList<Coche>();
		// Clonamos desde la LinkedList 'lista'
		lifoAutos= (LinkedList) lista.clone();
		fifoAutos= (LinkedList) lista.clone();
		
		// Imprimimos las listas sin metodos de cola para verificar que estan correctamente creadas.
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
		PriorityQueue<Coche> cuaOrdenadaPerCilindrada = new PriorityQueue<Coche>();
		// Se crea una cua auxiliar para fer proves.
		PriorityQueue<Coche> cuaAux= new PriorityQueue<Coche>();
		
		// Recorremos la lista lifoAutos para añadirlo en la cua de cotxes ordenada per cilindre.
		// Todo lo que se ñada dentro de lista cuaOrdenadaPerCilindrada y cuaAux se añadira y se ordenará por cilindrada.
		for(Coche car : lifoAutos){
			cuaOrdenadaPerCilindrada.offer(car);
			cuaAux.offer(car);
		}
		
		
		// Imprimimos els objectes de la cua.		
		System.out.println("Lista ordenada por cilindrada.");
		// Imprimimos cuaAux para verificar que esta todo correctamente añadido y ordenado.		
		while (!cuaAux.isEmpty())
		{
			Coche cilindrada = cuaAux.poll();
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
		// 		Listas disponibles: 'cuaOrdenadaPerCilindrada'. 'fifoAutos', 'lifoAutos'
		//		añadimos el nuevo coche a las 3 listas.
		
		cuaOrdenadaPerCilindrada.offer(new Coche("Fiat", "Panda", 900, 2));
		fifoAutos.offer(new Coche("Fiat", "Panda", 900, 2));
		lifoAutos.offer(new Coche("Fiat", "Panda", 900, 2));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//	4. Mostra ambdues cues per ordre: Fes un bucle que extregui el primer element de cadascuna de les tres llistes 
		// 		en ordre fins que no en quedi cap.
		System.out.println("Se extrae el primer elemento de las 3 listas: \n");
		
		
		////// cuaOrdenadaPerCilindrada ////////
		// Imprimimos el primer elemento, que es el que se extraera.
		System.out.println("De la cua [[cuaOrdenadaPerCilindrada]] el primer elemento que se extrae es: " +cuaOrdenadaPerCilindrada.element().getMarca());
		cuaOrdenadaPerCilindrada.poll();
		// Listamos elementos de la cola.
		System.out.print(" --> Restante dentro de la cola: \n ");
		while (!cuaOrdenadaPerCilindrada.isEmpty())
		{
			Coche cilindrada = cuaOrdenadaPerCilindrada.poll();
			System.out.print("("+ cilindrada.getMarca()+"),");
		}
		
		
		////// fifoAutos ////////
		// Imprimimos el primer elemento, que es el que se extraera.
		System.out.println("\nDe la cua [[fifoAutos]] el primer elemento que se extrae es: " +fifoAutos.element().getMarca());
		fifoAutos.poll();
		// Listamos elementos de la cola.
		System.out.print(" --> Restante dentro de la cola: \n ");
		while (!fifoAutos.isEmpty())
		{
			Coche cilindrada = fifoAutos.poll();
			System.out.print("("+ cilindrada.getMarca()+"),");
		}
		
		
		////// lifoAutos ////////
		// Imprimimos el primer elemento, que es el que se extraera.
		System.out.println("\nDe la cua [[lifoAutos]] el primer elemento que se extrae es: " +lifoAutos.element().getMarca());
		lifoAutos.pollLast();
		// Listamos elementos de la cola.
		System.out.print(" --> Restante dentro de la cola: \n ");
		while (!lifoAutos.isEmpty())
		{
			Coche cilindrada = lifoAutos.pollLast();
			System.out.print("("+ cilindrada.getMarca()+"),");
		}		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	5. Respon la seg�ent pregunta (en un comentari al final del codi): Posa un exemple de la vida real de cadascun dels
	 	// 		dos tipus de cues (no necess�riament quan els objectes s�n models de cotxes!)
		
		/**
		 * 
		 * RESPUESTAS:
		 * 	FIFO: Una caja de supermercado, el primero que entra en la cola de la caja, es el primero que atiende la cajera.
		 * 	LIFO: Una libreria. El ultimo libro que llega, suele ser el primero que sale. 
		*/
		
		
		//Fin de main
	}
	
	//Fin de main	
	static void ImprimirCoche(LinkedList<Coche> Lista){
		int contador = 1;
		for (Coche car : Lista){
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
