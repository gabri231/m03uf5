package exercicis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// EXERCICI 1. 
		// Escriu un programa que crei un nou arxiu mitjançant la concatenació de diversos arxius alhora. 
		// El programa ens demanarà una sèrie d'arxius d'on llegirem les dades i el nom del nou arxiu on
		// les escriurem.
		
		// Cada arxiu d'origen ha d'existir (si no, cal mostrar un missatge d'error i la sortida). 
		// L'últim arxiu , és el nom de l'arxiu que s'ha de crear, i no ha d'existir.
		
		// Crea el nou arxiu amb l'obertura dels arxius d'origen d'un en un i en ordre. 
		// Realitza la lectura i escriptura de cada arxiu byte per byte i recorda tancar
		// els arxius un cop n'hagis fet ús.
		
		// TODO Auto-generated method stub
		FileInputStream inA = null;
		FileInputStream inB = null;
		FileInputStream inC = null;
        FileOutputStream out = null;

        try {
            inA = new FileInputStream("ficheros/ex1/fichero1.txt");
            inB = new FileInputStream("ficheros/ex1/fichero2.txt");
            inC = new FileInputStream("ficheros/ex1/fichero3.txt");
            out = new FileOutputStream("ficheros/ex1/ficheroFinal.txt");
            
            try {
				añadir(inA, out);
				añadir(inB, out);
				añadir(inC, out);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
        } finally {
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
	public static void añadir(FileInputStream paramArchivo, FileOutputStream paramOut) throws IOException{
        int c;
        while ((c = paramArchivo.read()) != -1) {
        	System.out.println(c);
            paramOut.write(c);
        }
	}
}
