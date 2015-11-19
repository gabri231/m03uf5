package expressionsRegulars;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
    	/**
    	 *
    	 *bat
    	 *En batman bateja de batuts
    	 *
    	 *[bcr]at
    	 *En batman i les rates caten Catalans
    	 *
    	 */
    	Scanner sc = new Scanner(System.in);
    	String cadena;
    	String pauta;
        try {
			while (true) {
				System.out.println("");
				System.out.println("Introdueix la pauta (pattern) a buscar (EXIT per sortir): ");
				pauta = sc.nextLine();
			    Pattern pattern = 
			    //Pattern.compile(pauta);
			    //Pattern.CASE_INSENSITIVE
			    Pattern.compile(pauta, Pattern.UNICODE_CHARACTER_CLASS);
			    
			    if (pauta.equals("EXIT")) throw new Exception();
			    
			    System.out.println("Introdueix ara la cadena (matcher) on es buscarà: ");
				cadena = sc.nextLine();  
				
				
			    Matcher matcher = 
			    pattern.matcher(cadena);

			    boolean found = false;
			    while (matcher.find()) {
			        System.out.println("Pauta trobada: <" + matcher.group() + "> i comença a l'índex " +
			        matcher.start() + " i acaba a l'índex " + matcher.end());
			        found = true;
			    }
			    if(!found){
			    	System.out.println("Pauta no trobada");
			    }
			}
		} catch (Exception e) {
			System.out.println("Sortida");
		} finally {
			sc.close();	
		}
        
    } 
}