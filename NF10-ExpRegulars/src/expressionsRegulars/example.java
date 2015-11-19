package expressionsRegulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "El que pregunta una dasdasdasdasd vegada és tonto una vegada, el que no pregunta mai sempre és tonto";
		
		String regex = "[a-z]{7}[aeiou]";
		// para tener alguna expresion para encontrar decimal por ejemplo \d ( hay que escapar la contrabarra) ex: (\\d)
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(text);
		
		while (m.find() == true) {
				System.out.println("Cadena: " + m.group());
		}
	}

}
