package nf8Cues;
import java.util.LinkedList;


/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Imprime una tabla con los valores de un LinkedList tipo Clase coche
 * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 28.09.2015
 *  
 * Crea un programa Java que faci el seg�ent:
	Cre� un LinkedList que suporti 5 objectes de tipus cotxe com hem creat abans.
	Omple�l amb els valors de la taula del costat afegint-los amb m�todes de cua.
	Afegeix-hi dos objectes tipus cotxe
	Hyundai Atos 1500, 3  - al principi
	Ford Focus 2000,4 - al final
	Pots afegir-hi duplicats?
	Prova a inserir un �Audi A8, 4600, 8� a la posici� 1. Pots?
	Substitueix el Seat Ibiza per un �Seat Mii 1000 3�
	Elimina el primer element de la LinkedList amb el m�tode adient
	Quina posici� t� el Hyundai? Busca�l.

 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class exercici83 {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Crea una LinkedList que soporte 5 objetos de tipo coche.
		// 
		
		// Se crea la lista.
		LinkedList<Coche> lista = new LinkedList <Coche>();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Llena los valores de la tabla con los metodos de cola.
		//
		lista.offer(new Coche("Alfa Romero", "Giulia", 2900, 6));
		lista.offer(new Coche("Dacia", "Sandero", 1200, 4));
		lista.offer(new Coche("Ford", "Focus", 2000, 4));
		lista.offer(new Coche("Opel", "Insignia", 2200, 4));
		lista.offer(new Coche("Seat", "Ibiza", 1600, 4));
		linea();
		// Se imprime para comprovar sin metodo de cola.
		ImprimirCoche(lista);
		linea();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Agrega dos objetos tipo coche.
		// 
		System.out.println("Se añaden dos objetos coche. ");
		System.out.println("Se añade Hyundai Atos al principio y Ford Focus al final.");
		// Agregamos el Hyundai Atos en la primera posici�n
		lista.offerFirst(new Coche("Hyundai", "Atos", 1500, 3));
		// Agregamos el Ford Focus en la ultima posici�n.
		lista.offerLast(new Coche("Ford", "Focus", 2000, 4));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Se puede añadir duplicados?
		linea();
		System.out.println("Se pueden añadir elementos duplicados. Ejemplo: el Ford Focus");
		ImprimirCoche(lista);
		linea();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Prueba de insertar un Audi A8 en la posici�n 1, se puede?
		// 
		System.out.println("No se puede añadir Audi A8 en la posición 1, porque el metodo .offer() no lo permite.");
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Sustituye el Seat Ibiza por un "Seat Mii 1000 3".
		//
		linea();
		System.out.println("Se sustituye el Seat Ibiza por un Seat Mii. Se busca el Ibiza y se cambian valores.");
		for (Coche car : lista){
			// Buscamos el objecto Seat Ibiza y lo sustituimos por un Seat Mii.
			if(car.getMarca() == "Seat" && car.getModelo() == "Ibiza"){
				car.setMarca("Seat");
				car.setModelo("Mii");
				car.setCilindrada(1000);
				car.setCilindres(3);
				System.out.println("--> Se ha substituido el Seat Ibiza por el Seat Mii.");
				// Cuando ya hemos realizado los cambios en el lugar que queremos, salimos del bucle con break para optimizar el rendimiento.
				break;
			}
		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Elimina el primer elemento de la LinkedList con el metodo correspondiente.
		//
		linea();
		// Se elimia el primer elemento de la lista.
		System.out.println("El primer elemento: "+lista.element().getMarca());
		lista.pollFirst();
		System.out.println("Se elimina el primer elemento de la LinkedList.");
		linea();
		
		// Se imprime la lista para comprobar que se ha eliminado el primer elemento
		ImprimirCoche(lista);
		linea();	
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Quina posici� t� el Hyundai? Busca�l.
		//		
		System.out.println("Se ubica las posiciones del coche: \"Hyundai Atos\" y se imprimen.");
		
		
		// Se utiliza contador para determinar la posición de un coche en caso de encontrarlo.
		int contador=0;
		// Se define 'comprobador' de tipo boolean para m�s adelante utilizarlo en caso de encontrar un coche.
		boolean comprobador=false;
		// Se recorre toda la lista en busca del Hyundai Atos. 
		for (Coche car : lista){
			// Si encuentra el Huyndai Atos, imprime resultado y rompe el bucle para optimizar la aplicacion.
			if(car.getMarca() == "Hyundai" && car.getModelo() == "Atos"){
				System.out.println("--> Se ha encontrado un Hyundai Atos en la posición de cola: " + contador);
				// Se establece el comprobador como true debido a que ha encontrado el Hyundai.
				comprobador = true;
			}
			contador++;
		}
		// Se comprueba si es que se ha encontrado un coche. Si es falso, es que no se ha encontrado e imprime negaci�n.
		if(!comprobador){
			System.out.println("--> No se ha encontrado ningún Hyundai Atos.");
		}
		
		
		// Finalmente imprimimos toda la lista utilizando el metodo .poll()
		linea();
		System.out.println("\t\tImprimimos la lista con el metodo .poll()");
		linea();
		while (!lista.isEmpty())
		{
			// Se recoge el tama�o de la lista para ir imprimiendolo y viendo que con el metodo .poll(); La lista se va reduciendo.
			int cantLista = lista.size();
			Coche car = lista.poll();
			System.out.println("|"
					+ String.format("%1$-13s",car.getMarca())
					+ "|  "
					+String.format("%1$-10s",car.getModelo())
					+"|   "
					+car.getCilindrada()
					+"\t|   "
					+car.getCilindres()
					+"\t|   "
					+ car.pontenciaFiscal()+"\t|"
					+ "Tamaño lista: " + cantLista);
			
		}
		linea();	
		
	}
	
	//Fin de main	
	static void ImprimirCoche(LinkedList<Coche> lista){
		int contador = 0;
		for (Coche car : lista){
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
	}
	static void linea(){
		System.out.println("+-----------------------------------------------------------------------+");
	}
}