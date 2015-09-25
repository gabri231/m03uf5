// http://jarroba.com/arraylist-en-java-ejemplos/
import java.util.ArrayList;
import java.util.ListIterator;

public class exercici81 {

	public static void main(String[] args) {
		// Se inicializa el array
		// Nombre de la ArrayList = array
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(0,0);
		array.add(1,1);	
		int serie=25;
	
		for(int i=2; i<serie; i++){
			array.add( array.get(i-1) + array.get(i-2));
		}
		
		// Bucle normal
		System.out.println("for normal**********************************************************************************");
		for(int i=0; i<serie; i++){
			System.out.print(array.get(i) + " ");
		}
		
		// For each		
		System.out.println("\nfor each************************************************************************************");
		for( int numero : array){
			System.out.print(numero + " ");
		}
		
		// Iterator
		System.out.println("\nIterator************************************************************************************");
		ListIterator<Integer> iter = array.listIterator();
		while (iter.hasNext()){
		  System.out.print(iter.next()+" ");
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------------");
		
		System.out.print("La posición de 2584 dentro del Arraylist és " + array.indexOf(2584));
		
		System.out.println("\n--------------------------------------------------------------------------------------------");
		
		boolean a;
		a = array.contains(4311);//4311 - Contenido a buscar dentro del Array
		if(a){
			System.out.print("El array contiene 4311.");
		}
		else{
			System.out.print("El array no contiene 4311.");
		}
		System.out.println("\n--------------------------------------------------------------------------------------------");	
	}

}
