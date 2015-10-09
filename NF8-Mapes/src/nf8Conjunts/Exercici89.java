package nf8Conjunts;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

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

	
  	public static ArrayList<Coche> eliminarCoche(int cilindrada, Map<String, Coche> lista) {
		ArrayList<String> listaMatriculas = new ArrayList<String>();
		ArrayList<Coche> retorno = new ArrayList<Coche>();
		for (Map.Entry<String, Coche> coche : lista.entrySet()) {
			if (coche.getValue().getCilindrada() > cilindrada) {
				String matricula = coche.getKey();
				listaMatriculas.add(matricula);
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
						+ String.format("%1$-5s",String.format("%.2f", coche.getValue().potenciaFiscal()))+"|"
						+ "->Ha sido eliminado");
			} else {
				retorno.add(coche.getValue());
			}
				
		}
		for (String cocheMatricula : listaMatriculas) {
			lista.remove(cocheMatricula);
		}
		return retorno;
	}
  	
	public static void listaDeCochesPorCilindro(int cilindrada, Map<String, Coche> mapDeCoches){
		for (Map.Entry<String, Coche> coche : mapDeCoches.entrySet()) {
			if (coche.getValue().getCilindres()== cilindrada) {
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
						+ String.format("%1$-5s",String.format("%.2f", coche.getValue().potenciaFiscal())));
			}
		}
	}
	
	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Se crea la lista.
		
		Map<String, Coche> mapaDeCoches = new TreeMap<String, Coche>();	
		mapaDeCoches.put("1234 AAA", new Coche("Alfa Romeo", "Giulia", 2900, 6));
		mapaDeCoches.put("2321 BBB", new Coche("Dacia", "Sandero", 1200, 4));
		mapaDeCoches.put("8232 FFF", new Coche("Ford", "Focus", 2000, 4));
		mapaDeCoches.put("3311 FFF", new Coche("Opel", "Insignia", 2200, 4));
		mapaDeCoches.put("9381 LLL", new Coche("Seat", "Ibiza", 1200, 4));
		mapaDeCoches.put("9381 ALL", new Coche("Opel", "Astra", 2500, 4));
		imprimirCoches(mapaDeCoches);
		
		linea();
		int cilindrada=2400;
		eliminarCoche(cilindrada, mapaDeCoches);
		
		linea();
		imprimirCoches(mapaDeCoches);
		
		linea();
		listaDeCochesPorCilindro(4,mapaDeCoches);
		
		//Map<String, ArrayList<Coche>> marcasDeCoches = new TreeMap<String,  ArrayList<Coche>>();
	
	
	}
	//Fin de main
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
	
	static void linea(){
	System.out.println("#########################################################################");
	}
	
}
