package Recuperem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

// Has de crear una estructura d'animals que ordeni primer per raça 
// i després pel seu preu de venda
// 
// OPCIÓ 1: Fins a 5,5 punts
// Estructura bidimensional, sent la primera "dimensió" les races ordenades alfabèticament
//     i la segona "dimensió" els animals de cada raça ordenats per valor sense canviar allò fet 
//     a l'exercici 2
// Cal extreure totes les races (només un cop)
// Per cada raça, crear un element de "segona dimensió" i omplir-lo amb cada animal si coincideix la raça
// Mostrar els animals agrupats per races, i després per valor
// - Extreure races i mostrar-les: 0,5
// - Definir l'estructura bidimensional: 1,5 punts
// - Omplir l'estructura bidimensional: 2 punts
// - Mostrar l'estructura correctament: 1,5 punts


// OPCIÓ 2: Fins a 3 punts
// Estructura fent un sistema per comparar els animals amb dos criteris al mateix temps
//    - Alfabètic primer per la raça i després pel valor.
// Bona estructura: 0,5
// Criteri d'ordenació: 1,5
// S'intenta afegir bé els dos animals: 0,5
// Es mostra bé com ha quedat: 0,5

public class Exercici3 {
	public static void main(String[] args) {

		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>();

		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));
		LlistaInicial.add(new Animal(331, "campiona", 3.41, 2, 871.71));
		Animal mostra;

		///////////////////////////////////////////////////////////////////
		// imprimimos
		HashMap<String, TreeSet<Animal>> hashAnimalesFinal = ordenacio(LlistaInicial);
		for (String raza : hashAnimalesFinal.keySet()) {
			TreeSet<Animal> llistaActual = hashAnimalesFinal.get(raza);
			while (!llistaActual.isEmpty()) {
				mostra = llistaActual.pollFirst();
				System.out.println("     " + mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}
		}
	}

	public static HashMap<String, TreeSet<Animal>> ordenacio(ArrayList<Animal> pHashMapDeAnimales) {
		HashMap<String, TreeSet<Animal>> hashMapADevolver = new HashMap<String, TreeSet<Animal>>();
		
		// las razas por orden
		RazasOrden razaOrden = new RazasOrden();
		TreeSet<String> razas = new TreeSet<String>(razaOrden);
		for (Animal raza: pHashMapDeAnimales) {
			razas.add(raza.getBreed());
		}
		System.out.println("Llista de races"+razas);

		criterioOrden ordenAnimales = new criterioOrden();
		for (String raza : razas) {
			TreeSet<Animal> ordenados = new TreeSet<Animal>(ordenAnimales);
			for (Animal animal : pHashMapDeAnimales) {
				if (animal.getBreed() == raza) {
					ordenados.add(animal);
				}
				hashMapADevolver.put(raza, ordenados);
			}			
		}
		return hashMapADevolver;
	}
	// clase para ordenar por orden alfabetico
	public static class RazasOrden implements Comparator<String> {
		@Override
		public int compare(String a1, String a2) {
			return a1.compareTo(a2);
		}
	}
	
	// clase para ordenar por orden
	public static class criterioOrden implements Comparator<Animal>{
		@Override
		// - Els animals de dues potes sempre valen menys que els animals de quatre potes
		// - Si tenen el mateix nombre de potes, aleshores es comparen pel preu de venda
		public int compare(Animal a1, Animal a2) {
			if (a1.getPotes() < a2.getPotes())
				return 1;
			if (a1.getPotes() > a2.getPotes())
				return -1;
			if (a1.getPotes() == a2.getPotes()){			
				if (a1.valorMercat() > a2.valorMercat())
					return -1;
				if (a1.valorMercat() < a2.valorMercat())
					return 1;
			}
			return 0;
		}

	}
		
		

}
