package OtherExamples;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	static class FormulaCriteriOrdenacio implements Comparator<String> {

		@Override
		public int compare(String x, String y) {
			// Assume neither string is null. Real code should
			// probably be more robust
			// You could also just return x.length() - y.length(),
			// which would be more efficient.
			if (x.length() < y.length()) {
				return -1;
			}
			if (x.length() > y.length()) {
				return 1;
			}
			return 0;
		}

	}
	static void linea(){
		System.out.println("+-----------------------------------------------------------------------+");
	}
	
	public static void main(String[] args) {
		String[] ia = { "Elisenda", "Pau", "Maria", "Marc", "Monica",
				"Susanna", "Ot", "Esmeralda" };
		PriorityQueue<String> priorityQueueSenseRes = new PriorityQueue<String>(9);

		// fem servir el mètode offer() per introduir elements a la cua
		// priorityQueueSenseRes
		for (String x : ia) {
			priorityQueueSenseRes.offer(x);
		}
		System.out.println("Cua sense cap criteri de prioritat: " + priorityQueueSenseRes);
		linea();
		FormulaCriteriOrdenacio criteriOrdenacio = new FormulaCriteriOrdenacio();
		PriorityQueue<String> priorityQueueAmbCriteri = new PriorityQueue<String>(9, criteriOrdenacio);
		for (String x : ia) {
			priorityQueueAmbCriteri.offer(x);
		}
		System.out.println("Cua amb criteri de prioritat (fixa't que no sembla ordenada): " + priorityQueueAmbCriteri );

		// tamany
		System.out.println("tamany: " + priorityQueueAmbCriteri.size());
		// retorn de l'element amb el criteri "més alt"
		System.out.println("consulta (peek) element amb criteri més alt: "
				+ priorityQueueAmbCriteri.peek());
		System.out.println("+-----------------------------------------------------------------------+");
		// tamany
		System.out.println("-- Extracció dels elements de la cua ordenada --");
		// return highest priority element and removes it from the queue
		
		while (!priorityQueueAmbCriteri.isEmpty())
		{
			System.out.println("extreu (poll) element amb criteri més alt  : "
					+ priorityQueueAmbCriteri.poll());
			// print tamany
			System.out.println("tamany: " + priorityQueueAmbCriteri.size());
			System.out.println("Cua resultant: " + priorityQueueAmbCriteri);
				System.out.println("+-----------------------------------------------------------------------+");
		}


	}

}
