package OtherExamples;
import java.util.PriorityQueue;

public class CuaOrdenada {

	public static class Golfista implements Comparable<Object> {
		String name;
		int score;

		public Golfista(String name, int score) {
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return this.name;
		}

		public int getScore() {
			return this.score;
		}

		public int compareTo(Object obj) {
			Golfista that = (Golfista) obj;

			int a = this.score;
			int b = that.score;

			// for golfers, low is good!
			if (a > b)
				return 1;
			if (a < b)
				return -1;
			return 0;
		}

		public static void main(String[] args) {

			Golfista phil = new Golfista("Phil Mickelson", 72);
			Golfista hal = new Golfista("Hal Sutton", 69);
			Golfista tiger = new Golfista("Tiger Woods", 61);

			PriorityQueue<Golfista> pq = new PriorityQueue<Golfista>();
			pq.offer(tiger);
			pq.offer(phil);
			pq.offer(hal);
			
			while (!pq.isEmpty())
			{
				Golfista primerLlista = pq.poll();
				System.out.println(primerLlista.getName() + ", puntuaci�: " + primerLlista.getScore());
			}

		}

	}

}
