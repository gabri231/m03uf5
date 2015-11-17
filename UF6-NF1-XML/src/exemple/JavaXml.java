package exemple;

import java.io.File;
import javax.xml.bind.*;

public class JavaXml {
	private static final String NOM_FITXER = "exemple.xml";
	
	public static void main(String[] args) {
		Empleat treballador = new Empleat(125, "home", 23, "gabriel", "big boss", "P@ssw0rd");
		try {
			objectAXml(treballador);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void objectAXml(Empleat treballador){
		try {
			JAXBContext contexte = JAXBContext.newInstance(Empleat.class);
			Marshaller m = contexte.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(treballador, new File(NOM_FITXER));
		} catch (JAXBException e) {
			e.printStackTrace();
		}  
	}

}
