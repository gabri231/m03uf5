package Recuperem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

// Exercici 2 (2,5 punts)
// Crea una estructura dinàmica de dades que emmagatzemi 
// de forma que els animals es mostrin segons la següent fórmula
// - Els animals de dues potes sempre valen menys que els animals de quatre potes
// - Si tenen el mateix nombre de potes, aleshores es comparen pel preu de venda
// 
// Intenta afegir els animals af1 i af2 tot mostrant el resultat
//
//
// Criteri
// Bona estructura: 0,5
// Criteri d'ordenació: 1
// S'intenta afegir bé els dos animals: 0,5
// Es mostra bé com ha quedat: 0,5
//-0,5 si hi ha mètodes dels quals no en verifiques el retorn (excepte els proporcionats pel professor)



public class Exercici2 {

	public static void main(String[] args) {
		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>(11);
		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "campiona", 3.41, 2, 871.71));
		Animal af1 = new Animal(394, "empordanesa", 3.95, 2, 1.17);
		Animal af2 = new Animal(394, "empordanesa", 3.99, 2, 1.17);
		
		
		ordenarAnimales criterioOrden = new ordenarAnimales();
		
		// creamos la estructura con los animales.
		TreeSet<Animal> animalesOrdenados = new TreeSet<Animal>(criterioOrden);
		animalesOrdenados.addAll(LlistaInicial);

		// Añadimos animal 1?
		System.out.println("Afegim 1?");
		if (animalesOrdenados.add(af1)) {
			System.out.println("He pogut afegir: "+af1.getCodi() + " " + af1.getBreed() + " " + af1.getPotes() + " " + af1.valorMercat());
		}
		// Añadimos animal 2?
		System.out.println("Afegim 2?");
		if (animalesOrdenados.add(af2)) {
			System.out.println("He pogut afegir: "+af2.getCodi() + " " + af2.getBreed() + " " + af2.getPotes() + " " + af2.valorMercat());
		}

		// Imprimimos los animales.
		Animal animal;
		while (!animalesOrdenados.isEmpty()) {
			animal = animalesOrdenados.pollFirst();
			if (animal != null) {
				System.out.println(animal.getCodi() + " " + animal.getBreed() + " " + animal.getPotes() + " " + animal.valorMercat());
			}
			
		}
	
		
	}
	static class ordenarAnimales implements Comparator<Animal> {
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
