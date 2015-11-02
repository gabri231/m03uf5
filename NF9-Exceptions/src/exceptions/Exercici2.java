package exceptions;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici2 {

	public static void main(String[] args) {
		try {
			funcion1();
		} catch ( SecurityException e) {
			System.out.println("ERROR Security Tipo de excepción: \n"+ e.toString());
			System.out.println(e.getMessage());
		} catch ( IOException e) {
			System.out.println("ERROR I/O Tipo de excepción: \n"+ e);
			System.out.println("-> "+e.getClass().getName());
			e.printStackTrace();
		}

	}
	
	static void funcion1() throws SecurityException, IOException {
		FileOutputStream f = new FileOutputStream ("/etc/fstab");
		f.close();
	}

}
