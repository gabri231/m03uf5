import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class exercici83 {

	public static void main(String[] args) {
		LinkedList<coche> array = new LinkedList <coche>();
		array.add(new coche("Alfa Romero", "Giulia", 2900, 6));
		array.add(new coche("Dacia", "Sandero", 1200, 4));
		array.add(new coche("Ford", "Focus", 2000, 4));
		array.add(new coche("Opel", "Insignia", 2200, 4));
		array.add(new coche("Seat", "Ibiza", 1600, 4));
	}

	public static void imprimirArray(ArrayList<coche> pArray) {
		ListIterator<coche> iterCoche = pArray.listIterator();
		while(iterCoche.hasNext()){
			coche c = iterCoche.next();
			System.out.println("| "+String.format("%1$-13s",c.getMarca())+"|  "+String.format("%1$-10s",c.getModelo())+"|   "+c.getCilindrada()+"\t|   "+c.getCilindres()+"\t|   "+ c.pontenciaFiscal()+"\t|");
		
	}
	
//	for(i=0; i<Array.getLength(); i++){
//		imprimirArray(ArrayList[i]);
//	}
	
}

}
