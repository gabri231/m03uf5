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
		LinkedList<coche> lista = new LinkedList <coche>();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Llena los valores de la tabla con los metodos de cola.
		//
		lista.offer(new coche("Alfa Romero", "Giulia", 2900, 6));
		lista.offer(new coche("Dacia", "Sandero", 1200, 4));
		lista.offer(new coche("Ford", "Focus", 2000, 4));
		lista.offer(new coche("Opel", "Insignia", 2200, 4));
		lista.offer(new coche("Seat", "Ibiza", 1600, 4));
		linea();
		ImprimirCoche(lista);
		linea();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Agrega dos objetos tipo coche.
		// 
		System.out.println("Se a�aden dos elementos clase coche. ");
		System.out.println("Se a�ade Hyundai Atos al principio y Ford Focus al final.");
		// Agregamos el Hyundai Atos en la primera posici�n
		lista.offerFirst(new coche("Hyundai", "Atos", 1500, 3));
		// Agregamos el Ford Focus en la ultima posici�n.
		lista.offerLast(new coche("Ford", "Focus", 2000, 4));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Se puede a�adir duplicados?
		linea();
		System.out.println("Se pueden a�adir elementos duplicados.");
		ImprimirCoche(lista);
		linea();	
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Prueba de insertar un Audi A8 en la posici�n 1, se puede?
		// 
		System.out.println("No se puede a�adir Audi A8 en la posici�n 1, porque el metodo .offer() no lo permite.");
		
				
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Sustituye el Seat Ibiza por un "Seat Mii 1000 3".
		//
		linea();
		System.out.println("Se sustituye el Seat Ibiza por un Seat Mii. Se busca el Ibiza y se cambian valores.");
		for (coche car : lista){
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
		int contador=0;
		
		// Se define 'comprobador' de tipo boolean para m�s adelante utilizarlo en caso de encontrar un coche.
		boolean comprobador=false;
		// Se recorre toda la lista en busca del Hyundai Atos. 
		for (coche car : lista){
			// Si encuentra el Huyndai Atos, imprime resultado y rompe el bucle para optimizar la aplicacion.
			if(car.getMarca() == "Hyundai" && car.getModelo() == "Atos"){
				System.out.println("--> Se ha encontrado un Hyundai Atos en la posici�n de cola: " + contador);
				// Se establece el comprobador como true debido a que ha encontrado el Hyundai.
				comprobador = true;
			}
			contador++;
		}
		// Se comprueba si es que se ha encontrado un coche. Si es falso, es que no se ha encontrado e imprime negaci�n.
		if(!comprobador){
			System.out.println("--> No se ha encontrado ning�n Hyundai Atos.");
		}	
	}
	
	//Fin de main	
	static void ImprimirCoche(LinkedList<coche> lista){
		int contador = 0;
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
	}
	static void linea(){
		System.out.println("+-----------------------------------------------------------------------+");
	}
}