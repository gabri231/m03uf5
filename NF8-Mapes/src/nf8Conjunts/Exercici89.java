package nf8Conjunts;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 *  
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 08.10.2015
 *  
 * Crea un programa Java que faci el següent, fent que la classe sigui estàtica, crea els següents mètodes (mapes)
	1. un mètode que permeti eliminar cotxes de més de 2500 cc de cilindrada;
	2. un mètode que com a paràmetre rebi un enter “nombre de cilindres” i retorni 
	   un ArrayList amb els cotxes que tinguin el nombre de cilindres passats.
	3. un mètode que retorni els noms dels cotxes agrupats per marques (amb un ArrayList de cotxes ja fem).


 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

public class Exercici89 {
	///////////////////////////////////////////////////////////////////////////////////////////
  	/////////////////////////////////////////////////////////////////////////////////////////////
	///////  un mètode que permeti eliminar cotxes de més de 2500 cc de cilindrada  /////////////
	// Creamos una clase estatica que elimina los pares de un mapa. Se eliminan los pares con cilindrada mayor a la que se passa por parametro
	// Parametros 
	//	--> int cilindrada = Cilindrada a partir de la cual borrar.
	//  --> Map<String, Coche> mapCoches =  El mapa que contiene los pares a borrar.
  	public static boolean eliminarCoche(int cilindrada, Map<String, Coche> mapCoches) {
  		// Creamos una array list para guardar los key de los pares a borrar.
		ArrayList<String> arrayMatriculas = new ArrayList<String>();
		// Se recorre el mapa en busca de los pares que cumplan la condición a borrar.
		for (Map.Entry<String, Coche> coche : mapCoches.entrySet()) {
			// La condición es que la cilindrada de los pares sea mayor a la que se ha pasado por parametro.
			if (coche.getValue().getCilindrada() >= cilindrada) {
				// Cuando encuentre alguna coincidencia, el key se añade a el array de matriculas.
				arrayMatriculas.add(coche.getKey());
				// Imprimimos los datos de los pares a borrar.
				System.out.print("Ha sido eliminado->");
				imprimirCuerpo(coche);
			}
		}
		// REcorremos el mapa en caso de que contenga pares.
		if(!mapCoches.isEmpty()){
			// Borramos los pares a partir de la key guardada en nuestra array list.
			for (String cocheMatricula : arrayMatriculas) {
				mapCoches.remove(cocheMatricula);
			}
			// Devolvemos exito si ha borrado algo
			return true;
		}else{
			// Devolvemos fracaso en caso de no haber borrado nada.
			return false;
		}
	}

  	//////////////////////////////////////////////////////////////////////////////////////////////
  	/////////////////////////////////////////////////////////////////////////////////////////////
	//  un mètode que com a paràmetre rebi un enter “nombre de cilindres” i retorni un ArrayList 
  	//  amb els cotxes que tinguin el nombre de cilindres passats.
  	//
	//	--> int cilindros = El número de cilindros que tenga el value de los pares del mapa.
	//  --> Map<String, Coche> mapCoches =  El mapa que contiene los pares a extraer en array.
  	public static ArrayList<Coche> mapDeCochesPorCilindro(int numCilindros, Map<String, Coche> mapDeCoches){
  		// Creamos el array para guardar los coches en un array list que será el que devolveremos con el metodo.
  		ArrayList<Coche> arrayRetorno = new ArrayList<Coche>();
  		// Comprobamos que no este vacio para recorrer el mapa.
  		if (!mapDeCoches.isEmpty()){
  			// Recorremos el mapa en busca de coches con numero de cilindros igual a los pasados por parametro
	  		for (Map.Entry<String, Coche> coche : mapDeCoches.entrySet()){
	  			// Buscamos coincidencias en número de cilindros
	  			if (numCilindros == coche.getValue().getCilindres()){
	  				// Si encuentra un coche con el mismo número de cilindros lo añade al array: arrayRetorno.
	  				arrayRetorno.add(coche.getValue());
	  			}
	  		}
	  		// Comprobamos que el array haya encontrado alguna coincidencia. Si está vacio devolvemos null.
	  		if (!arrayRetorno.isEmpty()){
		  		// Una vez que se terminamos de recorrer el map de coches, devolvemos los resultados en formato arrayList.	
	  			return arrayRetorno;	
	  		}
	  		return null;
  		}else{
  			// Si es que el mapa está vacio devuelve null.
  			return null;
  		}
  	}
  	
	//////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////
  	
  	public static ArrayList<Coche> mapDeCochesPorMarca(Map<String, Coche> mapDeCoches){
  		TreeMap<String, Coche> tmDeCoches = new TreeMap<String, Coche>();
  		tmDeCoches.putAll(mapDeCoches);
  		
  		for (Map.Entry<String, Coche> coche : tmDeCoches.entrySet()){
  			System.out.println(coche);
  		}
  		
  		
  		ArrayList<Coche> tsCocheOrdenadoMarca=new ArrayList<Coche>();
  		if (!tmDeCoches.isEmpty()){
	  		for (Map.Entry<String, Coche> coche : tmDeCoches.entrySet()){
	  			System.out.println("Estas dentro" + coche.getValue());
	  			tsCocheOrdenadoMarca.add(coche.getValue());
	  		}
	  		// Comprobamos que el array haya encontrado alguna coincidencia. Si está vacio devolvemos null.
	  		if (!tsCocheOrdenadoMarca.isEmpty()){
		  		// Una vez que se terminamos de recorrer el map de coches, devolvemos los resultados en formato arrayList.	
	  			return tsCocheOrdenadoMarca;	
	  		}
	  		return null;
  		}else{
  			// Si es que el mapa está vacio devuelve null.
  			return null;
  		}
  	}
  	
  	
  	
  	
  	
  	
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
  	
	public static void main(String[] args) {
	  	//////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Se crea el mapa y se añaden coches		
		Map<String, Coche> mapaDeCoches = new TreeMap<String, Coche>();	
		mapaDeCoches.put("1234 AAA", new Coche("Alfa Romeo", "Giulia", 2900, 6));
		mapaDeCoches.put("2321 BBB", new Coche("Dacia", "Sandero", 1200, 4));
		mapaDeCoches.put("8232 AFA", new Coche("Ford", "Focus", 2000, 4));
		mapaDeCoches.put("3311 FFF", new Coche("Opel", "Insignia", 2200, 4));
		mapaDeCoches.put("2311 OPE", new Coche("Opel", "Astra", 1600, 4));
		mapaDeCoches.put("9381 LEL", new Coche("Seat", "Ibiza", 1200, 3));
		mapaDeCoches.put("2485 AHL", new Coche("BMW", "525D", 3000, 6));
		mapaDeCoches.put("6382 ALL", new Coche("Mercedes", "270DCI", 2700, 5));
		mapaDeCoches.put("7384 MLG", new Coche("Mercedes", "280SEL", 3500, 8));
		imprimirCoches(mapaDeCoches);
		
	  	//////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////
		//1. un mètode que permeti eliminar cotxes de més de 2500 cc de cilindrada;
		// int cilindrada: define la cilindrada a partir de la cual se borraran los coches.
		separador();
		int cilindrada=3000;
		// Se llama al metodo que elimina los coches.
		// Por parametro se pasa cilindrada y el mapa que contiene los pares a elegir por cilindrada y borrar.
		eliminarCoche(cilindrada, mapaDeCoches);
		
		// Se comprueba qué coches se han borrado.
		linea();
		System.out.println("Resultado después del borrado de coches mayores a: "+cilindrada+" CC.");
		imprimirCoches(mapaDeCoches);

	  	//////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 2. un mètode que com a paràmetre rebi un enter “nombre de cilindres” i retorni 
		// 	un ArrayList amb els cotxes que tinguin el nombre de cilindres passats.
		separador();
		// Se crea el arrayList para recibir los datos después de pasarlos por nuestro metodo.
		ArrayList<Coche> arrayDeCochesPorCilindro = new ArrayList<Coche>();
		// Guardamos en nuestro arrayList el resultado de los cilindros 
		arrayDeCochesPorCilindro = mapDeCochesPorCilindro(4,mapaDeCoches);
		//System.out.println(arrayDeCochesPorCilindro.getClass().getName());
		System.out.println("Se imprime el array con los resultados de los coches con x números de cilindros.");
		for (Coche coche: arrayDeCochesPorCilindro){
			imprimirCuerpoArray(coche);
		}
		
	  	//////////////////////////////////////////////////////////////////////////////////////////////
	  	//////////////////////////////////////////////////////////////////////////////////////////////
		// 3. un mètode que retorni els noms dels cotxes agrupats per marques (amb un ArrayList de cotxes ja fem). 
		separador();
		ArrayList<Coche> arrayCocheOrdenadoMarca=new ArrayList<Coche>();
		arrayCocheOrdenadoMarca=mapDeCochesPorMarca(mapaDeCoches);
		
		//System.out.println(mapDeCochesPorMarca(mapaDeCoches).getClass().getName());
		
		
		if (!arrayCocheOrdenadoMarca.isEmpty()){
			for (Coche coche : arrayCocheOrdenadoMarca){
				System.out.println(coche);
			}
		}else{
			System.out.println("La ts esta vacia");
		}
		
		//Map<String, ArrayList<Coche>> marcasDeCoches = new TreeMap<String,  ArrayList<Coche>>();
	
		
	
	}
	//Fin de main
	static void separador(){
		System.out.println("#########################################################################");
	}
	static void linea(){
		System.out.println("-------------------------------------------------------------------------");
	}
	static void imprimirCoches(Map<String, Coche> mapaDeCoches){
		for (Map.Entry<String, Coche> car : mapaDeCoches.entrySet()){
			System.out.println("|"
				+ String.format("%1$-8s",car.getKey())
				+ "| "
				+String.format("%1$-12s",car.getValue().getMarca())
				+" | "
				+String.format("%1$-8s",car.getValue().getModelo())
				+" | "
				+car.getValue().getCilindrada()
				+" | "
				+car.getValue().getCilindres()
				+" | "
				+ String.format("%1$-5s",String.format("%.2f", car.getValue().potenciaFiscal()))+"|");
		}
	}
	static void imprimirCuerpo(Map.Entry<String, Coche> coche){
		System.out.println("|"
				+ String.format("%1$-8s",coche.getKey())
				+ "| "
				+String.format("%1$-12s",coche.getValue().getMarca())
				+" | "
				+String.format("%1$-8s",coche.getValue().getModelo())
				+" | "
				+coche.getValue().getCilindrada()
				+" | "
				+coche.getValue().getCilindres()
				+" | "
				+ String.format("%1$-5s",String.format("%.2f", coche.getValue().potenciaFiscal()))+"|");
	}
	static void imprimirCuerpoArray(Coche coche){
		System.out.println("|"
				+String.format("%1$-10s",coche.getMarca())
				+" | "
				+String.format("%1$-8s",coche.getModelo())
				+" | "
				+coche.getCilindrada()
				+" | "
				+coche.getCilindres()
				+" | "
				+ String.format("%1$-5s",String.format("%.2f", coche.potenciaFiscal()))+"|");
	}
}