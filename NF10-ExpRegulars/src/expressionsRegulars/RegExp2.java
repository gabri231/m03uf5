// http://puntocomnoesunlenguaje.blogspot.com.es/2013/07/ejemplos-expresiones-regulares-java-split.html
// http://infolib.lotus.com/resources/symphony/3.0.0/sym20abd014/ca_es/text/shared/01/02100001.html
package expressionsRegulars;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp2 {
	public static void main(String[] args) {
		String text="<body><title id=\"titol\">El titol de la meva page</title></body>";
		String pattern = "(<title.*?>)(.+)(</title>)";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()){
			System.out.println(m.group(2));
		}
	}
}
