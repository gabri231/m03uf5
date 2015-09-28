package nf8Cues;
import java.util.LinkedList;
import java.util.ListIterator;

public class exercici83 {

	public static void main(String[] args) {
		LinkedList<coche> lista = new LinkedList <coche>();
		
		
		lista.add(new coche("Alfa Romero", "Giulia", 2900, 6));
		lista.add(new coche("Dacia", "Sandero", 1200, 4));
		lista.add(new coche("Ford", "Focus", 2000, 4));
		lista.add(new coche("Opel", "Insignia", 2200, 4));
		lista.add(new coche("Seat", "Ibiza", 1600, 4));
		
		// Añadimos dos objetos tipo coche al principio y al final
		lista.addFirst(new coche("Hyundai", "Atos", 1500, 3));
		lista.addLast(new coche("Focus", "Focus", 2000, 4));
		lista.add(new coche("Focus", "Focus", 2000, 4));
		
		ListIterator<coche> iterCoche = lista.listIterator();
		System.out.println("+-----------------------------------------------------------------------+");
		while(iterCoche.hasNext()){
			coche c = iterCoche.next();			
			System.out.println("| "+String.format("%1$-13s",c.getMarca())+"|  "+String.format("%1$-10s",c.getModelo())+"|   "+c.getCilindrada()+"\t|   "+c.getCilindres()+"\t|   "+ c.pontenciaFiscal()+"\t|");
		}
		System.out.println("+-----------------------------------------------------------------------+");

		ListIterator<coche> tempCoche = lista.listIterator();
		while(tempCoche.hasNext()){
			coche c = tempCoche.next();			
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
		
		coche car = new coche(); 
		car.prueba();
	
		//Fin de main
	}
}