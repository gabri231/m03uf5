package nf8Conjunts;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.SingleSelectionModel;

/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Imprime una tabla con los valores de un LinkedList tipo Clase coche
 * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 28.09.2015
 *  
 * Crea un programa Java que faci el següent:
	1. Creï un HashSet que suporti 5 objectes de tipus cotxe com hem creat abans.
	2 .Omple’l amb els valors de la taula del costat
	3. Quina potència fiscal té Dacia Sandero? Busca’l com objecte.
	4. Afegeix-hi dos objectes tipus cotxe:
		a. Hyundai Atos 1500, 3 
		b. Ford Focus 2000,4
	5. Pots afegir-hi duplicats? 
	6. Prova a inserir un “Audi A8, 4600, 8” a la posició 1. Pots?
	7. Com pots substituir el Seat Ibiza per un “Seat Mii 1000 3”
	8. Imprimeix les dades de tots els objectes, incloent la pot. fiscal:
		a. For-each o amb Iterator
		b. Estan ordenades?

 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class Exercici85 {

public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 1. Creï un HashSet que suporti 5 objectes de tipus cotxe com hem creat abans.
		//ok
		// Se crea la lista.
		Set<Coche> hashDeCoches=new HashSet<Coche>(5);
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 2. Omple’l amb els valors de la taula del costat
		//ok
		
		hashDeCoches.add(new Coche("Alfa Romero", "Giulia", 2900, 6));
		Coche dacia =new Coche("Dacia", "Sandero", 1200, 4);
		hashDeCoches.add(dacia); 
		hashDeCoches.add(new Coche("Ford", "Focus", 2000, 4));
		hashDeCoches.add(new Coche("Opel", "Insignia", 2200, 4));
		Coche ibiza = new Coche("Seat", "Ibiza", 1600, 4);
		hashDeCoches.add(ibiza);
		ImprimirCoches(hashDeCoches);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 3. Quina potència fiscal té Dacia Sandero? Busca’l com objecte.
		linea();
		if (hashDeCoches.contains(dacia)){
			System.out.println("La potencia fiscal que tiene el Dacia Sandero es: "	+ String.format("%.2f",dacia.pontenciaFiscal()));
		}
		else{
			System.out.println("No se ha encontradro el Dacia Sandero.");
		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	4. Afegeix-hi dos objectes tipus cotxe:
		//		a. Hyundai Atos 1500, 3 
		//		b. Ford Focus 2000,4
		// 
		linea();
		System.out.println("Se añaden dos objetos coche. ");
		Boolean intento;
		intento = hashDeCoches.add(new Coche("Hyundai", "Atos", 1500, 3));
		if (intento){
			System.out.println("Éxito al insertar el Hyundai ");
		}
		else{
			System.out.println("Fracaso al insertar el Hyundai, porque ya existe.");
		}
		intento = hashDeCoches.add(new Coche("Ford", "Focus", 2000, 4));
		if (intento){
			System.out.println("Éxito al insertar el Ford Focus ");
		}
		else{
			System.out.println("Fracaso al insertar el Ford Focus, porque ya existe");
		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	5. Pots afegir-hi duplicats? 
		linea();
		System.out.println("No se pueden añadir elementos duplicados.");
		ImprimirCoches(hashDeCoches);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 6. Prova a inserir un “Audi A8, 4600, 8” a la posició 1. Pots?
		//
		linea();
		System.out.println("No se puede añadir el Audi en la posición 1.");
		ImprimirCoches(hashDeCoches);
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	7. Com pots substituir el Seat Ibiza per un “Seat Mii 1000 3”
		//
		
		linea();
		System.out.println("Se sustituye el Seat Ibiza por un Seat Mii.");
		
		// condicion
				
		if (hashDeCoches.remove(ibiza)){
			hashDeCoches.add(new Coche ("Seat", "Mi", 123,12));		
		}
		
		ImprimirCoches(hashDeCoches);		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//	8. Imprimeix les dades de tots els objectes, incloent la pot. fiscal:
		//		a. For-each o amb Iterator
		//		b. Estan ordenades?
		//
		linea();
		System.out.println("Se sustituye el Seat Ibiza por un Seat Mii. Se busca el Ibiza y se cambian valores.");
		System.out.println("-->No estan ordenadas.\n");
		for (Coche car : hashDeCoches){
			System.out.println("|"
					+ String.format("%1$-13s",car.getMarca())
					+ "|  "
					+String.format("%1$-10s",car.getModelo())
					+"|   "
					+car.getCilindrada()
					+"\t|   "
					+car.getCilindres()
					+"\t|   "
					+ String.format("%.2f", car.pontenciaFiscal())+"\t|");
		}	


		
	}
	
	//Fin de main	
	static void ImprimirCoches(Set<Coche> lista){
		System.out.println("+---------------------------------------------------------------+");
		for (Coche car : lista){
			System.out.println("|"
					+ String.format("%1$-13s",car.getMarca())
					+ "|  "
					+String.format("%1$-10s",car.getModelo())
					+"|   "
					+car.getCilindrada()
					+"\t|   "
					+car.getCilindres()
					+"\t|   "
					+ String.format("%.2f", car.pontenciaFiscal())+"\t|");
		}
		System.out.println("+---------------------------------------------------------------+");
	}
	static void linea(){
		System.out.println("#########################################################################");
	}
}