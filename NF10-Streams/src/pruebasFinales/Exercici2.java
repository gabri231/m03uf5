package pruebasFinales;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 
 * @author Gabriel
 * @since 30.10.2015
 * @version 1v
 */
public class Exercici2 {
	
	//	EXERCICI 2.
	//	Crear un programa que divideixi  un arxiu en diversos arxius.
	
	//	El programa ens demanarà els següents atributs:
	//	- bigfile és el nom de l'arxiu que s'ha de dividir.
	//	- baseName: Cada arxiu petit serà anomenat baseNameX, on X indica el número d'arxiu. 
	// 			Per exemple, si baseName és "tros", es divideix en "tros0", "tros1", "tros2"...
	//	- chunkSize és la mida en bytes de cada arxiu petit, a excepció de l'últim.
	
	//	Utilitzeu el programa d'arxiu de concatenació (Exercici 1) 
	//	per posar els arxius junts de nou. Observa si s'ha produït algun canvi. 

	//	Per a les proves preliminars, utilitzar arxius de text. 
	//  No obstant això, escriure el programa perquè funcioni amb qualsevol arxiu (ús orientat a bytes IO). 
	//  Per a proves avançades, dividir un arxiu executable, tornar a muntar i després executar-lo. 
	//  També pot dividir i tornar a muntar un arxiu d'imatge, i veure els resultats. 

	public static void main(String[] args) throws IOException {

		FileInputStream bigfile = null;
		String baseName 		= null;
		int chunkSize 			= 0;
	
		try {
			bigfile = new FileInputStream(pedirArchivo("[archivo bigfile]: ")); // Nombre del archivo grande a dividir.
			chunkSize = pedirChunk();
			baseName = pedirBaseName();
			
			dividirArchivo(bigfile, baseName, chunkSize);
			
		} catch (FileNotFoundException ficheroNoEncontrado) {
			System.out.println("ERROR: " + ficheroNoEncontrado.getMessage());
			
		} catch (IOException e) {
			System.out.println("Ha habido un error de I/O" + e.toString());
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido el siguiente error: " + e.toString());
			
		} finally {
			System.out.println("Fin del programa");
		}
	}
	
	public static void dividirArchivo(FileInputStream paramArchivo, String baseName, int chunkSize)  throws IOException {
		byte[] buf = new byte[chunkSize];
		int bytesRead;
		int i= 0;
		while ((bytesRead = paramArchivo.read(buf)) > 0) {
			i++;
			String nombre = baseName+i+".txt"; 
			FileOutputStream out = new FileOutputStream(nombre);
			out.write(buf, 0, bytesRead);
			out.close();
		}
		System.out.println("Se han creado " + i + " ficheros.");
		paramArchivo.close();
	}
	
	public static String pedirArchivo(String mensaje) {
		Scanner s = new Scanner(System.in);
		System.out.print(mensaje);
		String fichero = s.nextLine();
		return "ficheros/ex2/" + fichero;
	}
	private static String pedirBaseName() {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el baseName para cada archivo pequeño: ");
		String baseName = s.nextLine();
		return "ficheros/ex2/" + baseName;
	}
	public static int pedirChunk() {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el tamaño de cada archivo pequeño(en bytes): ");
		int fichero = s.nextInt();
		return fichero;
	}
}