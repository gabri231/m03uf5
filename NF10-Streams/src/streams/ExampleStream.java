package streams;

import java.io.File;

public class ExampleStream {

	public static void main(String[] args) {

		try {
			// file, crea un objeto de un fichero.
			// byte : representació en numero del caracter
			// char : representació per cada lletra.
			// buffers? es temporal, intermedia.
			File file = new File("example1.txt");
			boolean exist= file.exists();
			if (exist){
				System.out.println("És un arxiu: " + file.isFile());
				System.out.println("Té permsos de lectura: " + file.canRead());
				System.out.println("Té permisos d'escriptura: " + file.canWrite());
			}else{
				System.out.println("No existe el fichero");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}	
	}
}