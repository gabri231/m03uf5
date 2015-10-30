package streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleCharactersStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileReader inputStream = null;
	     FileWriter outputStream = null;

	        try {
	            inputStream = new FileReader("hola.txt");
	            outputStream = new FileWriter("characteroutput.txt");

	            int c;
	            while ((c = inputStream.read()) != -1) {
	            	System.out.println(c);
	                outputStream.write(c);
	            }
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
	}

}
