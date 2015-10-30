package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExampleBytesStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("ficheros/hola.txt");
            out = new FileOutputStream("ficheros/hola_copiado.txt");
            int c;

            while ((c = in.read()) != -1) {
            	System.out.println(c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
	}

}
