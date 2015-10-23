package Recuperem;

import java.util.ArrayDeque;
import java.util.ArrayList;

// Exercici 1: 2 punts
// Crea una estructura dinàmica de dades que emmagatzemi amb una cua LIFO i una FIFO
// els animals que estan esperant a ser atesos pel veterinari.
// Simula el bucle d'atenció als animals.
// L'ordre és el mateix que el de l'estructura inicial.
//
// Definició de cada cua: 1 punt (les dues)
// Mostrar bé les cues: 1 punt (les dues)
// -0,5 si hi ha mètodes dels quals no en verifiques el retorn (excepte els proporcionats pel professor)


public class Exercici1 {

	public static void main(String[] args) {
				
		
		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>(11);
		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));
	
		// Definimos las listas
		ArrayDeque<Animal> colaLifo = new ArrayDeque<Animal>();
		ArrayDeque<Animal> colaFifo = new ArrayDeque<Animal>();
		// Con el metodo addAll añadimos todos los animales a las dos colas.
		colaLifo.addAll(LlistaInicial);
		colaFifo.addAll(LlistaInicial);
	
		// Creamos una instancia para comprobar e imprimir.
		Animal comproba;
		
		// imprimimos lifo
		System.out.println("Cua LIFO");
		while (!colaLifo.isEmpty()) {
			comproba = colaLifo.pollLast();
			// comprobamos los nulos
			if (comproba != null) {
				System.out.println(comproba.getCodi() + " " + comproba.getBreed() + " " + comproba.getPotes() + " "	+ comproba.valorMercat());
			}

		}
		
		
		//imprimimos fifo
		System.out.println("Cua FIFO");
		while (!colaFifo.isEmpty()) {
			comproba = colaFifo.pollFirst();
			// comprobamos los nulos
			if (comproba != null) {
				System.out.println(comproba.getCodi() + " " + comproba.getBreed() + " " + comproba.getPotes() + " "	+ comproba.valorMercat());
			}

		}

	
	}

}
