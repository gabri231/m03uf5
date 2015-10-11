package Altres;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author calle
 * 
 */
public class SortMapExample {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//creating unsorted map of employee id as a key and employee name as a value
		Map<String, Coche> unsortMap = new HashMap<String, Coche>();
		unsortMap.put("1234 AAA", new Coche("Alfa Romeo", "Giulia", 2900, 6));
		unsortMap.put("2321 BBB", new Coche("Dacia", "Sandero", 1200, 4));
		unsortMap.put("8232 AFA", new Coche("Ford", "Focus", 2000, 4));
		unsortMap.put("3311 FFF", new Coche("Opel", "Insignia", 2200, 4));
		unsortMap.put("2311 OPE", new Coche("Opel", "Astra", 1600, 4));
		unsortMap.put("9381 LEL", new Coche("Seat", "Ibiza", 1200, 3));
		unsortMap.put("2485 AHL", new Coche("BMW", "525D", 3000, 6));
		unsortMap.put("6382 ALL", new Coche("Mercedes", "270DCI", 2700, 5));
		unsortMap.put("7384 MLG", new Coche("Mercedes", "280SEL", 3500, 8));

		System.out.println("Unsort Map......");
		printMap(unsortMap);


		// Forcing the descending order by creating our own comparator then passing it to the sorted map at creation time
		System.out.println("\nSorted Map in descending order......");
		Map<String, Coche> desSortedMap = new TreeMap<String, Coche>(
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1);
					}
				});
		desSortedMap.putAll(unsortMap);
		printMap(desSortedMap);

	}

	/**
	 * Prints the map.
	 *
	 * @param map the map
	 */
	public static void printMap(Map<String, Coche> map) {
		for (Map.Entry<String, Coche> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}
	}
  	
  	
	//  	public static ArrayList<Coche> mapDeCochesPorMarca(Map<String, Coche> mapDeCoches){
	//  		//TreeSet<Coche> tsDeCoches = new TreeSet<Coche>();
	//  		PriorityQueue<Coche> cuaOrdenadaPerMarca = new PriorityQueue<Coche>();
	//  		
	//  		for (Map.Entry<String, Coche> coche : mapDeCoches.entrySet()){
	//  			cuaOrdenadaPerMarca.add(coche.getValue());
	//  		}
	//  		
	//  		ArrayList<Coche> tsCocheOrdenadoMarca=new ArrayList<Coche>();
	//  		if (!cuaOrdenadaPerMarca.isEmpty()){
	//	  		for (Coche coche : cuaOrdenadaPerMarca){
	//	  			tsCocheOrdenadoMarca.add(coche);
	//	  		}
	//	  		// Comprobamos que el array haya encontrado alguna coincidencia. Si está vacio devolvemos null.
	//	  		if (!tsCocheOrdenadoMarca.isEmpty()){
	//		  		// Una vez que se terminamos de recorrer el map de coches, devolvemos los resultados en formato arrayList.	
	//	  			return tsCocheOrdenadoMarca;	
	//	  		}
	//	  		return null;
	//  		}else{
	//  			// Si es que el mapa está vacio devuelve null.
	//  			return null;
	//  		}
	//  	}
  	
  	// http://stackoverflow.com/questions/24140804/recursive-iteration-of-a-map-java
	//  	public static ArrayList<Coche> mapDeCochesPorMarca(Map<String, Coche> mapDeCoches){
	//  		TreeMap<String, Coche> tmDeCoches = new TreeMap<String, Coche>();
	//  		tmDeCoches.putAll(mapDeCoches);
	//  		
	//  		for (Map.Entry<String, Coche> coche : tmDeCoches.entrySet()){
	//  			System.out.println(coche);
	//  		}
	//  		
	//  		
	//  		ArrayList<Coche> tsCocheOrdenadoMarca=new ArrayList<Coche>();
	//  		if (!tmDeCoches.isEmpty()){
	//	  		for (Map.Entry<String, Coche> coche : tmDeCoches.entrySet()){
	//	  			System.out.println("Estas dentro" + coche.getValue());
	//	  			tsCocheOrdenadoMarca.add(coche.getValue());
	//	  		}
	//	  		// Comprobamos que el array haya encontrado alguna coincidencia. Si está vacio devolvemos null.
	//	  		if (!tsCocheOrdenadoMarca.isEmpty()){
	//		  		// Una vez que se terminamos de recorrer el map de coches, devolvemos los resultados en formato arrayList.	
	//	  			return tsCocheOrdenadoMarca;	
	//	  		}
	//	  		return null;
	//  		}else{
	//  			// Si es que el mapa está vacio devuelve null.
	//  			return null;
	//  		}
	//  	}
  	
  	
	//  	public static TreeSet<Coche> mapDeCochesPorMarcas(Map<String, Coche> mapDeCoches){
	//  		TreeSet<Coche> tsCocheOrdenadoMarca=new TreeSet<Coche>();
	//  		if (!mapDeCoches.isEmpty()){
	//	  		for (Map.Entry<String, Coche> coche : mapDeCoches.entrySet()){
	//	  			System.out.println("Estas dentro" + coche.getValue());
	//	  			tsCocheOrdenadoMarca.add(coche.getValue());
	//	  		}
	//	  		// Comprobamos que el array haya encontrado alguna coincidencia. Si está vacio devolvemos null.
	//	  		if (!tsCocheOrdenadoMarca.isEmpty()){
	//		  		// Una vez que se terminamos de recorrer el map de coches, devolvemos los resultados en formato arrayList.	
	//	  			return tsCocheOrdenadoMarca;	
	//	  		}
	//	  		return null;
	//  		}else{
	//  			// Si es que el mapa está vacio devuelve null.
	//  			return null;
	//  		}
	//  	}

}
