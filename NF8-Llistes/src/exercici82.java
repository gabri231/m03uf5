// http://jagonzalez.org/arraylist-de-objetos-en-java-con-ejemplo-practico/
import java.util.ArrayList;
import java.util.ListIterator;

public class exercici82 {

	public static void main(String[] args) {
		
		ArrayList<coche> array = new ArrayList<coche>();
	
		array.add(new coche("Alfa Romero", "Giulia", 2900, 6));
		array.add(new coche("Dacia", "Sandero", 1200, 4));
		array.add(new coche("Ford", "Focus", 2000, 4));
		array.add(new coche("Opel", "Insignia", 2200, 4));
		array.add(new coche("Seat", "Ibiza", 1600, 4));

		// Bucle normal
		// System.out.println("for
		// normal**********************************************************************************");

		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i).getMarca() + " ");
			System.out.print(array.get(i).getModelo() + " ");
			System.out.print(array.get(i).getCilindrada() + " ");
			System.out.print(array.get(i).getCilindres() + " \n");
		}
		System.out.println(" ");

		// For each
		// System.out.println("\nfor
		// each************************************************************************************");
		for (coche car : array) {
			System.out.print(car.getMarca() + " ");
			System.out.print(car.getModelo() + " ");
			System.out.print(car.getCilindrada() + " ");
			System.out.print(car.getCilindres() + " \n");
		}
		System.out.println(" ");

		/*
		 * System.out.println(
		 * "Iterator**********************************************************************************"
		 * );
		 */
		
		ListIterator<coche> iterCoche = array.listIterator();
		while (iterCoche.hasNext()) {
			coche c = iterCoche.next();
			System.out.println(c.getMarca() + " " + c.getModelo() + " " + c.getCilindrada() + " " + c.getCilindres());
		}
	}
}
