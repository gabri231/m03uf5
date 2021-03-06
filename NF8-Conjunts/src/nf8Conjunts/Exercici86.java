package nf8Conjunts;
import java.util.LinkedHashSet;
import java.util.Set;

/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 06.10.2015
 * 
 * Crea un programa Java que faci el segÃ¼ent:
	1. CreÃ¯ una LinkedHashSet que suporti 5 objectes de tipus cotxe com hem creat abans.
	2. Afegeix-hi dos objectes tipus cotxe:
		a.Hyundai Atos 1500, 3 
		b.Ford Focus 2000,4
	3. Pots afegir-hi duplicats? 
	4. Obté les dades de tots els objectes amb qualsevol mÃ¨tode
	5. Quin ordre hi tenim? Quin tipus de â€œcuaâ€� és?


 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class Exercici86 {

public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 1. CreÃ¯ una LinkedHashSet que suporti 5 objectes de tipus cotxe com hem creat abans.
		//ok
		// Se crea la lista.
		LinkedHashSet<Coche> linkedHashDeCoches=new LinkedHashSet<Coche>();
		
		linkedHashDeCoches.add(new Coche("Alfa Romero", "Giulia", 2900, 6));
		linkedHashDeCoches.add(new Coche("Dacia", "Sandero", 1200, 4));
		linkedHashDeCoches.add(new Coche("Ford", "Focus", 2000, 4));
		linkedHashDeCoches.add(new Coche("Opel", "Insignia", 2200, 4));
		linkedHashDeCoches.add(new Coche("Seat", "Ibiza", 1600, 4));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	2. Afegeix-hi dos objectes tipus cotxe:
		//		a. Hyundai Atos 1500, 3 
		//		b. Ford Focus 2000,4
		// 
		linea();
		System.out.println("Se añaden dos objetos coche. ");
		Boolean intento;
		intento = linkedHashDeCoches.add(new Coche("Hyundai", "Atos", 1500, 3));
		if (intento){
			System.out.println("Ok: Éxito al insertar el Hyundai ");
		}
		else{
			System.out.println("ERROR: Fracaso al insertar el Hyundai, porque ya existe.");
		}
		intento = linkedHashDeCoches.add(new Coche("Ford", "Focus", 2000, 4));
		if (intento){
			System.out.println("Ok: Éxito al insertar el Ford Focus ");
		}
		else{
			System.out.println("ERROR: Fracaso al insertar el Ford Focus, porque ya existe");
		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	3. Pots afegir-hi duplicats? 
		linea();
		System.out.println("No se pueden añadir elementos duplicados.");


		// 	4. Obté les dades de tots els objectes amb qualsevol mÃ¨tode
		for (Coche car : linkedHashDeCoches){
			System.out.println("|"
					+ String.format("%1$-13s",car.getMarca())
					+ "|  "
					+String.format("%1$-10s",car.getModelo())
					+"|   "
					+car.getCilindrada()
					+"\t|   "
					+car.getCilindres()
					+"\t|   "
					+ String.format("%.2f", car.potenciaFiscal())+"\t|");
		}
		
		//  5. Quin ordre hi tenim? Quin tipus de cúa és?
		linea();
		System.out.println("Estan por orden de llegada. El tipo de cola es: FIFO.");
		
		
	}
	
	//Fin de main	
	static void linea(){
		System.out.println("#########################################################################");
	}
}