package excercici8_9;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import exercici8_8.Cotxe;

public class Metodos {
	/*
	 * Elimina un coche con un determinada cilindrada
	 */
	public static void removeCar(int cilin, Map<String, Cotxe> mapList) {
		ArrayList<String> borrar = new ArrayList<String>();

		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (aux.getCilindrada() > cilin) {
				String key = (String) elemento.getKey();
				borrar.add(key);
			}
		}

		for (String key : borrar) {
			mapList.remove(key);
		}

	}

	/*
	 * ArrayList con Coches de determinado numero de cilindros
	 */
	public static ArrayList<Cotxe> numberCilin(int nCili, Map<String, Cotxe> mapList) {
		ArrayList<Cotxe> returnList = new ArrayList<Cotxe>();

		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (aux.getnCilindros() == nCili) {
				String clave = (String) elemento.getKey();
				returnList.add((Cotxe) elemento.getValue());
			}
		}
		return returnList;
	}

	/*
	 * arrayList con los coches ordenados alfabeticamente
	 */

	public static Map<String, ArrayList<Cotxe>> brandCar(Map<String, Cotxe> mapList) {
		Map<String, ArrayList<Cotxe>> returnListBrand = new TreeMap<String, ArrayList<Cotxe>>();

		ArrayList<String> brand = new ArrayList<String>();

		// Recorremos para almacenar las marcas de los coches sin repeticiones
		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (!brand.contains(aux.getMarca()))
				System.out.println(aux.getMarca());
				brand.add(aux.getMarca());
		}
		//Recorremos la lista de marcas para buscar coincidencias con el map pasado y crear nuestro arrayList de coches
		for (int i = 0; i < brand.size(); i++) {
			String marca = brand.get(i);
			ArrayList<Cotxe> brandCar = new ArrayList<Cotxe>();
			for (Map.Entry elemento : mapList.entrySet()) {
				Cotxe aux = (Cotxe) elemento.getValue();
				if (marca == aux.getMarca()) {
					brandCar.add(aux);
				}
			}
			returnListBrand.put(marca, brandCar);
		}

		return returnListBrand;
	}

}