//http://www.javahispano.org/certificacion/2011/12/24/genericos-y-colecciones-parte-2-colecciones.html
package nf8Conjunts;
import java.util.Set;
import java.util.TreeSet;


/** Un programa Java simple - Colas 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 06.10.2015
 * 
 * Crea un programa Java que faci el següent:
	1. Creï 4 TreeSets que suportin objectes de tipus cotxe com hem creat abans.
		a. Dues més amb amb un comparador per cilindrada.
		b. Dues més amb un comparador per pot. fiscal.
	2. Extreu amb criteri “lifo” els elements d’una de les llistes a i b
	3. Extreu amb criteri “fifo” els elements d’una de les llistes a i b

 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class Exercici87 {

public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 1. Creï 4 TreeSets que suportin objectes de tipus cotxe com hem creat abans.
		//		a. Dues més amb amb un comparador per cilindrada.
		//		b. Dues més amb un comparador per pot. fiscal.
		// 

		Coche car1 = new Coche ("coche1","modelo1",1100,6);
		Coche car2 = new Coche ("coche2","modelo2",1200,8);
		Coche car4 = new Coche ("coche4","modelo4",1400,6);
		Coche car3 = new Coche ("coche3","modelo3",1300,2);
		
			
		TreeSet<Coche> tsCocheOrdCilindrada=new TreeSet<Coche>(new CocheOrdCilindrada());
		TreeSet<Coche> tsCocheOrdCilindrada2=new TreeSet<Coche>(new CocheOrdCilindrada());
        tsCocheOrdCilindrada.add(car1);		tsCocheOrdCilindrada2.add(car1); 
        tsCocheOrdCilindrada.add(car4);		tsCocheOrdCilindrada2.add(car4);
        tsCocheOrdCilindrada.add(car2);		tsCocheOrdCilindrada2.add(car2);
        tsCocheOrdCilindrada.add(car3);		tsCocheOrdCilindrada2.add(car3);
        
        System.out.println("Se imprime el TreeSet ordenado por cilindrada:");
        for (Coche car : tsCocheOrdCilindrada){
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
        linea();
        System.out.println("Se imprime el TreeSet ordenado por potencia fiscal:");
		TreeSet<Coche> tsCocheOrdPotenciaFiscal=new TreeSet<Coche>(new CocheOrdPotenciaFiscal());
		TreeSet<Coche> tsCocheOrdPotenciaFiscal2=new TreeSet<Coche>(new CocheOrdPotenciaFiscal());
		
		tsCocheOrdPotenciaFiscal.add(car1);		tsCocheOrdPotenciaFiscal2.add(car1); 
		tsCocheOrdPotenciaFiscal.add(car4);		tsCocheOrdPotenciaFiscal2.add(car4);
		tsCocheOrdPotenciaFiscal.add(car2);		tsCocheOrdPotenciaFiscal2.add(car2);
		tsCocheOrdPotenciaFiscal.add(car3);		tsCocheOrdPotenciaFiscal2.add(car3);

        for (Coche car : tsCocheOrdPotenciaFiscal){
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

		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	2. Extreu amb criteri “lifo” els elements d’una de les llistes a i b
		//	
		// 
		linea();
		System.out.println("lifo: metodo pollLast - Cilindrada");
		while (!tsCocheOrdCilindrada2.isEmpty())
		{
			Coche cilindrada = tsCocheOrdCilindrada2.pollLast();
			System.out.println("|"
					+ String.format("%1$-13s",cilindrada.getMarca())
					+ "|  "
					+String.format("%1$-10s",cilindrada.getModelo())
					+"|   "
					+cilindrada.getCilindrada()
					+"\t|   "
					+cilindrada.getCilindres()
					+"\t|   "
					+ String.format("%.2f", cilindrada.potenciaFiscal())+"\t|");
		}
	
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// 	3. Extreu amb criteri “fifo” els elements d’una de les llistes a i b
		linea();
		System.out.println("fifo: metodo pollFirst, potencia fiscal");
		while (!tsCocheOrdPotenciaFiscal2.isEmpty())
		{
			Coche potencia = tsCocheOrdPotenciaFiscal2.pollFirst();
			System.out.println("|"
					+ String.format("%1$-13s",potencia.getMarca())
					+ "|  "
					+String.format("%1$-10s",potencia.getModelo())
					+"|   "
					+potencia.getCilindrada()
					+"\t|   "
					+potencia.getCilindres()
					+"\t|   "
					+ String.format("%.2f", potencia.potenciaFiscal())+"\t|");
		}
	
				
	}
	//Fin de main	
	static void linea(){
		System.out.println("#########################################################################");
	}
}