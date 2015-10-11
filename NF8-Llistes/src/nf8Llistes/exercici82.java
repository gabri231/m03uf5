// http://jagonzalez.org/arraylist-de-objetos-en-java-con-ejemplo-practico/
package nf8Llistes;
import java.util.ArrayList;
import java.util.ListIterator;

/** Un programa Java simple - Potencia Fiscal 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Imprime una tabla con los valores de un ArrayList tipo Clase coche
 * Imprime de tres maneras diferentes el contenido de un ArrayList
 * 
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 28.09.2015
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class exercici82 {

	public static void main(String[] args) {
		ArrayList<Coche> array = new ArrayList<Coche>();
	
		array.add(new Coche("Alfa Romero", "Giulia", 2900, 6));
		array.add(new Coche("Dacia", "Sandero", 1200, 4));
		Coche focus = new Coche("Ford", "Focus", 2000, 4);
		array.add(focus);
		array.add(new Coche("Opel", "Insignia", 2200, 4));
		array.add(new Coche("Seat", "Ibiza", 1600, 4));
		ImprimirCoches(array);
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//Quina pot�ncia fiscal t� el cotxe a la posici� 2?
		// En este caso utilizamos el metodo .get(posicion), en la impresi�n siguiente accedemos directamente a calcular la potencia fiscal del coche en la posici�n 2
		System.out.println("La potencia fiscal del coche en la posici�n 2 es : "+String.format("%.2f",array.get(2).potenciaFiscal()));
		System.out.println("El coche es un "+array.get(2).marca+" "+array.get(2).modelo);
		InsertarSeparador();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// AGREGAR DOS OBJETOS TIPO COCHE EN EL ARRAY
		// Agregamos dos objetos tipo coche en el array con el metodo .add(elemento);
		System.out.println("Se añaden dos objetos tipo coche y se imprime el resultado.");
		array.add(new Coche("Hyundai", "Atos", 1500, 3));
		array.add(focus);
		// Se imprime el array para comprobar los valores despues de a�adir los dos objetos tipo coche anteriores.
		ImprimirCoches(array);
		System.out.println(" --> S� se puede a�adir duplicados.");
		InsertarSeparador();
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// AGREGAR UN OBJETO TIPO COCHE EN LA POSICI�N 1
		System.out.println("Se a�ade el objeto tipo coche \"Audi A8\" en la posici�n 1.");
		
		// Se a�ade Audi A8 en la posici�n 1
		array.add(1,new Coche("Audi", "A8", 4600, 8));
		
		// Se crea el atributo 'encontrado' de tipo boolean para romper el bucle cuando encuentre a AUDI A8 
		boolean encontrado = false;
		
		// Se recorre el array buscando el objeto Audi A8 para determinar si su posici�n en el array es 1.
		// Una vez encontrado el objeto no se recorre m�s el bucle para no cargar el sistema.
		// Cuando se encuentra el objeto Audi A8, el atributo 'encontrado' se estable en true i se rompe la condici�n del bucle FOR.
		for (int i = 0; i < array.size() && encontrado==false; i++) {
			if(array.get(i).getMarca() == "Audi" && array.get(i).getModelo() == "A8"){
				// Se comprueba si Audi A8 est� en la posici�n 1 para imprimir la confirmaci�n
				if (i == 1){
					System.out.println("Audi A8 esta en la posici�n 1.");
				}
				else{
					System.out.println("Audi A8 no est� en la posici�n 1.");
				}
				// Una vez que se ha encontrado el objeto Audi A8, se termina la busqueda para optimizar el proceso.
				encontrado = true;
			}
		}	
		ImprimirCoches(array);
		InsertarSeparador();
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Substitueix el Seat Ibiza per un Seat Mii 1000 3
		// 
		
		encontrado = false;
		// Se recorre el array buscando el objeto Seat Ibiza para sustituirlo por un "Seat Mii 100 3".
		// Una vez encontrado el objeto no se recorre m�s el bucle para no cargar el sistema.
		// Cuando se encuentra el objeto Seat Ibiza, el atributo 'encontrado' se estable en true i se rompe la condici�n del bucle FOR.
		for (int i = 0; i < array.size() && encontrado==false; i++) {
			if(array.get(i).getMarca() == "Seat" && array.get(i).getModelo() == "Ibiza"){
				System.out.println("Se sustituye el Seat Ibiza por:\"Seat Mii 1000 3\"");
				// Cuando el filtro encuentra al SEAT IBIZA se borra el contenido de todo el coche.
				array.remove(i);
				// Una vez que se borra, se inserta el SEAT MII en la misma posici�n que el seat ibiza. De esta forma se sustituye el coche.
				array.add(i,new Coche("Seat", "Mii", 1000, 3));
				// Se cancela la busqueda de SEAT IBIZA.
				encontrado = true;
			}
		}
		ImprimirCoches(array);
		InsertarSeparador();
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Quina posici� (o quines) t� el Ford Focus?
		// Se encuentra el Ford Focus y se imprime las posiciones en las que se encuentra.
		System.out.println("Se ubica las posiciones del coche: \"Ford Focus\" y se imprimen.");
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i) == focus ){
				// Se comprueba si Audi A8 est� en la posici� 1 para imprimir la confirmaci�n
				System.out.println("Se ha encontrado un Ford Focus en la posici�n: " + i);
			}
		}
		
		InsertarSeparador();
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		// 
		//		Imprimeix les dades de tots els objectes, incloent la pot. fiscal:
		//			a. Un bucle normal fins al tamany.
		//			b. For-each
		//			c. Amb Iterator
		// Se declara el contador para contar el total de coches que se usa al imprimir el ArrayList
		int contador;
		////////////
		// Se imprime todos los coches con un bucle normal. En este caso For.
		// BUCLE FOR
		////////////
		InsertarCabecera("BUCLE FOR");
		contador=0;
		for (int i = 0; i < array.size(); i++) {
			System.out.print("|"
					+String.format("%1$2d", i) +".| "
					+String.format("%1$-13s",array.get(i).getMarca()) + "|  "
					+String.format("%1$-10s",array.get(i).getModelo()) + "| "
					+array.get(i).getCilindrada() + "\t|   "
					+array.get(i).getCilindres() + "\t|   "
					+String.format("%.2f",array.get(i).potenciaFiscal())+"\t|\n");
			contador++;
		}
		InsertarPie(contador);
		System.out.println("\n");
		
		///////////
		// Se imprime todos los coches con FOR EACH
		// FOR EACH
		///////////
		InsertarCabecera("FOR EACH");
		contador=0;
		for (Coche car : array) {
			System.out.println("|"
				+String.format("%1$2d", contador) +".| "
				+String.format("%1$-13s",car.getMarca())+"|  "
				+String.format("%1$-10s",car.getModelo())+"|  "
				+car.getCilindrada()+"\t|   "
				+car.getCilindres()+"\t|   "
				+String.format("%.2f",car.potenciaFiscal())+"\t|");
			contador++;
		}
		InsertarPie(contador);
		System.out.println("\n");
		
		////////////
		// Se imprime todos los coches con Iterator
		// ITERATOR
		////////////		
		InsertarCabecera("ITERATOR");
		ListIterator<Coche> iterCoche = array.listIterator();
		contador=0;
		while (iterCoche.hasNext()) {
			Coche c = iterCoche.next();
			System.out.println("|"
					+String.format("%1$2d", contador) +".| "
					+String.format("%1$-13s",c.getMarca())+"|  "
					+String.format("%1$-10s",c.getModelo())+"|  "
					+c.getCilindrada()+"\t|   "
					+c.getCilindres()+"\t|   "
					+String.format("%.2f",c.potenciaFiscal())+"\t|");
			contador++;
		}
		InsertarPie(contador);
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// FIN DE LOS EJERCICIOS //////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////
			
	}
	
	// Funciones pr�cticas para esta aplicacion	
	// Imprimir tabla de coches	
	static void ImprimirCoches(ArrayList<Coche> pArray){
		System.out.println("+-----------------------------------------------+");
		int contador=0;
		for (Coche car : pArray) {
			System.out.println("|"
				+String.format("%1$2d", contador) +".| "
				+String.format("%1$-13s",car.getMarca())+"|  "
				+String.format("%1$-10s",car.getModelo())+"|  "
				+car.getCilindrada()+"\t|   "
				+car.getCilindres()+"\t|");
			contador++;
		}
		System.out.println("+-----------------["+ String.format("%1$2d",contador) +" coches]-------------------+");
	}

	static void InsertarSeparador(){
		System.out.println("***********************************************************");
	}
	static void InsertarCabecera(String a){
		System.out.println("+---------------<["+ String.format("%1$10s", a)+" ]>---------------------------------+");
		System.out.println("+ Nº| Marca        | Modelo     | CC    | NºC   |  CV Fiscales  +");
		System.out.println("+---+--------------+------------+-------+-------+---------------+");
	}
	static void InsertarPie(int a){
		System.out.println("+-----------------["+ String.format("%1$2d",a) +" Resultados ]------------------------------+");
	}	
}