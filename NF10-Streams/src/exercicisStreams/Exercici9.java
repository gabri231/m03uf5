package exercicisStreams;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * EXERCICI 9. Crear un programa que donat un directori ens mostri tots els
 * fitxers i directoris que té per sota.
 * 
 *
 */

public class Exercici9 {
	public static void main(String[] args) {
			String path="d:/backup/hola.txt";
			
			File directori = new File(path);
			if (directori.exists() && directori.isDirectory()){
				List<String> llista = new ArrayList<String>();
				mostrarFitxersDirectoris(directori ,llista);
				//System.out.println(llista);
				if (!llista.isEmpty()){
					for (String a : llista){
						System.out.println(a);
					}
				}
			}else{
				System.out.println("El directori no existeix!!");
			}
	}

	private static void mostrarFitxersDirectoris(File directori,
			List<String> llista) {
		String path = directori.getPath();
		String[] arxius = directori.list();
		for (int i = 0; i < arxius.length; i++) {
			File f = new File(path+"/"+arxius[i]);
			if (f.isDirectory()){
				mostrarFitxersDirectoris(f, llista);
			}
			llista.add(arxius[i]);
		}
	}
}
