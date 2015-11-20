/**
 * 
 */
package pruebasFinales;

/**
 * @author gscalle
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiarFicheros {
	public static void main(String[] args) {
		  
		File origen = new File("origen.txt");
		File destino = new File("destino.txt");
		try {
		    InputStream in = new FileInputStream(origen);
		    OutputStream out = new FileOutputStream(destino);
			int len;
			while ((len = in.read()) != -1) {
			        out.write(len);
			}
			in.close();
			out.close();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
}