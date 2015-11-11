package ex;

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
public class Exercici1 {
	// EXERCICI 1.
	// Escriu un programa que crei un nou arxiu mitjançant la concatenació de
	// diversos arxius alhora.
	// El programa ens demanarà una sèrie d'arxius d'on llegirem les dades i el
	// nom del nou arxiu on
	// les escriurem.

	// Cada arxiu d'origen ha d'existir (si no, cal mostrar un missatge d'error
	// i la sortida).
	// L'últim arxiu , és el nom de l'arxiu que s'ha de crear, i no ha
	// d'existir.

	// Crea el nou arxiu amb l'obertura dels arxius d'origen d'un en un i en
	// ordre.
	// Realitza la lectura i escriptura de cada arxiu byte per byte i recorda
	// tancar
	// els arxius un cop n'hagis fet ús.

	public static void main(String[] args) throws IOException {

		FileInputStream inA = null;
		FileInputStream inB = null;
		FileInputStream inC = null;
		FileOutputStream out = null;

		try {
			inA = new FileInputStream(pedirArchivo("[archivo a leer] Introduce un archivo: "));
			inB = new FileInputStream(pedirArchivo("[archivo a leer] Introduce un archivo: "));
			inC = new FileInputStream(pedirArchivo("[archivo a leer] Introduce un archivo: "));
			out = crearFicheroFinal(pedirArchivo("Introduce el nombre del archivo final: "));
			
			añadir(inA, out);
			añadir(inB, out);
			añadir(inC, out);

		} catch (FileNotFoundException ficheroNoEncontrado) {
			System.out.println("ERROR: " + ficheroNoEncontrado.getMessage());
		} catch (AlertaFichero e) {
			System.out.println("ERROR: " + e.msg);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Fin del programa");
			if (inA != null) {
				inA.close();
			}
			if (inB != null) {
				inB.close();
			}
			if (inC != null) {
				inC.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	public static void añadir(FileInputStream paramArchivo, FileOutputStream paramOut) throws IOException {
		int c;
		while ((c = paramArchivo.read()) != -1) {
			// System.out.println(c);
			paramOut.write(c);
		}
	}

	public static String pedirArchivo(String mensaje) {
		Scanner s = new Scanner(System.in);
		System.out.print(mensaje);
		String fichero = s.nextLine();
		return "ficheros/ex1/" + fichero;
	}

	public static FileOutputStream crearFicheroFinal(String fichero) throws Exception, AlertaFichero {
		File archivoFinal = new File(fichero);
		FileOutputStream out = null;
		if (archivoFinal.exists()) {
			throw new AlertaFichero("El archivo: " + fichero + " ya existe.");
		} else {
			out = new FileOutputStream(fichero);
			return out;
		}

	}
}