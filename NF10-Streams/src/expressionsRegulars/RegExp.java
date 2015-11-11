package expressionsRegulars;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args) {

		String text = "El que pregunta una vegada és tonto una vegada, el que no pregunta mai sempre és tonto";
		String regex = "[a-z]{7}[aeiou]";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		while (m.find() == true) {
			System.out.println("Cadena: " + m.group());
			
		}
	}
}