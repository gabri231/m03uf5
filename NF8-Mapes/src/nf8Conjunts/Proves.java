package nf8Conjunts;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Proves {

  	public static boolean removeCar(int cilindrada, Map<String, Coche> list) {
		ArrayList<String> listKeys = new ArrayList<String>();
		for (Map.Entry<String, Coche> c : list.entrySet()) {
			if (c.getValue().getCilindrada() > 2500) {
				String valor = c.getKey();
				listKeys.add(valor);
				System.out.println(c.toString() + "ha sigut eliminat\n");
			}
		}
		for (String s : listKeys) {
			list.remove(s);
		}
		return false;
	}

	public static void listCarWithSpecificCilinder(int cilinder, Map<String, Coche> list){
		for (Map.Entry<String, Coche> c : list.entrySet()) {
			if (c.getValue().getCilindres()== cilinder) {
				System.out.println(c);
			}
		}
	}
	
	public static void listCarsAgrupedByBrand(Map<String, Coche> list){
		for (Map.Entry<String, Coche> c : list.entrySet()) {
			
		}
	}
	
	public static void main(String[] args) {
		// Creem el LinkedList
		SortedMap<String, Coche> list = new TreeMap<String, Coche>();
		Coche c2 = new Coche("Seat", "Ibiza", 1600, 4);
		// Creeam els Coches
		list.put("1234 AAA", new Coche("Alfa Romeo", "Giulia", 2900, 6));
		list.put("2321 BBB", c2);
		list.put("8232 FFF", new Coche("Ford", "Focus", 2000, 4));
		list.put("3311 FFF", new Coche("Ford", "Mondeo", 2200, 4));
		list.put("9381 LLL", new Coche("Seat", "Leon", 1600, 4));
		list.put("B 9011 XC", new Coche("Hyundai", "Atos", 1500, 3));
		list.put("9234 BHG", new Coche("Hyundai", "Santa Fe", 3000, 6));
		list.put("9216 CKK", new Coche("Hyundai", "Accent", 2000, 4));
		// 3.- No deixa afegir duplicats
		// 4.- Esta ordenada ja que esta indexada y es una fifo
		list.put("9216 CKK", new Coche("Hyundai", "Accent", 2000, 4));
		for (Map.Entry<String, Coche> c : list.entrySet()) {
			System.out.println(c + "\n");
		}
		System.out.println("Coches eliminats");
		System.out.println("================");
		removeCar(2500, list);
		System.out.println("Llista de Coches amb cilindrada menor a 2500cc");
		System.out.println("==============================================");
		for (Map.Entry<String, Coche> c : list.entrySet()) {
			System.out.println(c + "\n");
		}
		System.out.println("Coches amb cilindrada 3");
		System.out.println("=======================");
		listCarWithSpecificCilinder(3,list);
		System.out.println("Llista ordenada per marca");
		System.out.println("=======================");
		listCarsAgrupedByBrand(list);
	}
	
}
