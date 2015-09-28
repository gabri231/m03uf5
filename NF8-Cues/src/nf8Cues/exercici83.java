package nf8Cues;
import java.util.LinkedList;
import java.util.ListIterator;

/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Imprime una tabla con los valores de un LinkedList tipo Clase coche
 * 
 * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 28.09.2015
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class exercici83 {

	public static void main(String[] args) {
		coche f = new coche();
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Creï un LinkedList que suporti 5 objectes de tipus cotxe com hem creat abans
		LinkedList<coche> lista = new LinkedList <coche>();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Omple’l amb els valors de la taula del costat afegint-los amb mètodes de cua.
		lista.add(new coche("Alfa Romero", "Giulia", 2900, 6));
		lista.add(new coche("Dacia", "Sandero", 1200, 4));
		lista.add(new coche("Ford", "Focus", 2000, 4));
		lista.add(new coche("Opel", "Insignia", 2200, 4));
		lista.add(new coche("Seat", "Ibiza", 1600, 4));
		linea();
		ImprimirCoche(lista);
		linea();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Afegeix-hi dos objectes tipus cotxe
		System.out.println("Se añaden dos elementos clase coche. ");
		System.out.println("Se añade Hyundai Atos al principio y Ford Focus al final.");
		lista.addFirst(new coche("Hyundai", "Atos", 1500, 3));
		lista.addLast(new coche("Ford", "Focus", 2000, 4));
		linea();
		// Pots afegir-hi duplicats?
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Prova a inserir un “Audi A8, 4600, 8” a la posició 1. Pots?
		boolean encontrado;
		System.out.println("Se añade el elemento Audi A8 en la posición 1. ");
		lista.add(1, new coche("Audi", "A8", 4600, 8));
		encontrado = false;
		for (int i = 0; i < lista.size() && encontrado==false; i++) {
			if(lista.get(i).getMarca() == "Audi" && lista.get(i).getModelo() == "A8"){
				// Se comprueba si Audi A8 está en la posición 1 para imprimir la confirmación o negación
				if (i == 1){
					System.out.println("Audi A8 esta en la posición 1.");
				}
				else{
					System.out.println("Audi A8 no está en la posición 1.");
				}
				// Una vez que se ha encontrado el objeto Audi A8, se termina la busqueda para optimizar el proceso.
				encontrado = true;
			}
		}
		linea();
		ImprimirCoche(lista);
		linea();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//  Substitueix el Seat Ibiza per un “Seat Mii 1000 3”
		//
		encontrado = false;
		for (int i = 0; i < lista.size() && encontrado==false; i++) {
			if(lista.get(i).getMarca() == "Seat" && lista.get(i).getModelo() == "Ibiza"){
				System.out.println("Se sustituye el Seat Ibiza por:\"Seat Mii 1000 3\"");
				// Cuando el filtro encuentra al SEAT IBIZA se borra el contenido de todo el coche.
				lista.remove(i);
				// Una vez que se borra, se inserta el SEAT MII en la misma posición que el seat ibiza. De esta forma se sustituye el coche.
				lista.add(i,new coche("Seat", "Mii", 1000, 3));
				// Se cancela la busqueda de SEAT IBIZA.
				encontrado = true;
			}
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//  Elimina el primer element de la LinkedList amb el mètode adient
		//
		linea();
		ImprimirCoche(lista);
		lista.removeFirst();
		linea();
		System.out.println("Se elimina el primer elemento de la LinkedList");
		linea();
		
		ImprimirCoche(lista);
		linea();	
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Quina posició té el Hyundai? Busca’l.
		//		
		System.out.println("Se ubica las posiciones del coche: \"Hyundai Atos\" y se imprimen.");
		int a = 0;
		for (int i=0; i < lista.size(); i++) {
			if(lista.get(i).getMarca() == "Hyundai" && lista.get(i).getModelo() == "Atos"){
				// Se comprueba si Audi A8 está en la posición 1 para imprimir la confirmación o negación
				System.out.println("Se ha encontrado un Hyundai Atos en la posición: " + i);
				a = 1;
			}
		}
		if(a!=1){
			System.out.println("No se ha encontrado un Hyundai Atos en ninguna posición");
		}
	
		
	}
	//Fin de main	
	static void ImprimirCoche(LinkedList<coche> lista){
		ListIterator<coche> iterCoche = lista.listIterator();
		while(iterCoche.hasNext()){
			coche c = iterCoche.next();			
			System.out.println("| "
					+ String.format("%1$-13s",c.getMarca())
					+ "|  "
					+String.format("%1$-10s",c.getModelo())
					+"|   "
					+c.getCilindrada()
					+"\t|   "
					+c.getCilindres()
					+"\t|   "
					+ c.pontenciaFiscal()+"\t|");
		}
	}
	static void linea(){
		System.out.println("+-----------------------------------------------------------------------+");
	}
}