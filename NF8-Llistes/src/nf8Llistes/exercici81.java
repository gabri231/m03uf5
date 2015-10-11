package nf8Llistes;
// Importaciï¿½n de clases necesarias
import java.util.ArrayList; 
import java.util.ListIterator;

/** Un programa Java simple - Fibonacci
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Imprime de tres maneras diferentes el contenido de un ArrayList
 * En este caso es un array list con los valores de una secuencia Fibonacci
 * @author Gabriel Calle Torrez
 * @version 1
 * @since 28.09.2015
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class exercici81 {
	public static void main(String[] args) {
		// CREACIï¿½N OBJETO
		// Se crea un objeto Integer llamado 'array' de la clase ArrayList
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		// Se añaden dos valores al objeto en la primera y segunda posiciï¿½n.
		array.add(0,0);
		array.add(1,1);
		
		// El atributo 'cantidad' de tipo Int, es utilizado como referencia para para determinar el tamaï¿½o del objeto 'array' de la clase ArrayList 
		int cantidad=25;
		
		// INTRODUCIR VALORES
		// Recorremos el objeto 'array' para introducir los valores que crean una secuencia Fibonacci, con el limite de repeticiones definido en el atributo 'cantidad'
		for(int i=2; i<cantidad; i++){
			array.add( array.get(i-1) + array.get(i-2));
		}
		
		// IMPRIMIR RESULTADO
		// Se imprime todos los valores del objeto 'array'.
		
		// BUCLE FOR
		// Se recorre el objeto para obtener sus datos e imprimirlos con un bucle for
		System.out.println("Bucle for normal****************************************************************************");
		for(int i=0; i<cantidad; i++){
			System.out.print(array.get(i) + " ");
		}
		
		// FOR EACH
		// Se recorre el objeto para obtener sus datos e imprimirlos con For each		
		System.out.println("\nFor each************************************************************************************");
		for( int numero : array){
			System.out.print(numero + " ");
		}
		
		// ITERATOR
		// Se recorre el objeto para obtener sus datos e imprimirlos con Iterator
		System.out.println("\nIterator************************************************************************************");
		ListIterator<Integer> iter = array.listIterator();
		while (iter.hasNext()){
		  System.out.print(iter.next()+" ");
		}
		
		
		// Se imprime la posición del valor 2584
		// El metodo para ubicar la posiciï¿½n de un valor es:   .indexOf(valor);
		System.out.println("\n--------------------------------------------------------------------------------------------");
		System.out.print("La posición de 2584 dentro del Arraylist es " + array.indexOf(2584));
		
		
		// Se comprueba si existe un valor
		// El metodo que se utiliza es: array.contains(valor); Te devuelve 'true' si existe el valor introducido. Devuelve 'false' si es que no existe.
		System.out.println("\n--------------------------------------------------------------------------------------------");
		// Utilizamos un bifurcador para imprimir el resultado.
		if(array.contains(4311)){
			System.out.print("El array contiene 4311.");
		}
		else{
			System.out.print("El array no contiene 4311.");
		}
		System.out.println("\n--------------------------------------------------------------------------------------------");	
	}
}