package examplesStreams;
import java.io.File;

public class Exemple2transparencies {
	public static void main(String[] args) {
		File file = new File("exemple1.txt");
		boolean exist= file.exists();
		if (exist){
			System.out.println("És un arxiu: "+file.isFile());
			System.out.println("Té permsos de lectura: "+file.canRead());
			System.out.println("Té permsos d'escriptura: "+file.canWrite());
		}
	}
}
