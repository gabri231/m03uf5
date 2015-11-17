package exemple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.*;

public class JavaXml {
	private static final String NOM_FITXER = "exemple.xml";
	private static final String NOM_FITXER_TREBALLADOR = "treballador.xml";
	
	public static void main(String[] args) {
		Empleat trabajador = new Empleat(125, "home", 23, "gabriel", "big boss", "P@ssw0rd");
		Empleat trabajador2 = new Empleat(123, "home", 40, "xavi", "account manager", "P@ssw0rd");
		Empleat trabajador3 = new Empleat(121, "dona", 23, "marta", "designer", "P@ssw0rd");
		try {
			//if(objetoAXml(trabajador))
			//	System.out.println("Exito al crear el archivo XML.");
			//else
			//	System.out.println("Fracaso al crear el archivo XML");
			ArrayList<Empleat> trabajadores= new ArrayList<Empleat>();
			trabajadores.add(trabajador);
			trabajadores.add(trabajador2);
			trabajadores.add(trabajador3);
			
			marshalLista(trabajadores, new File("listadoEmpleados.xml"));
			
			trabajador = xmlAObjeto();
			System.out.println(trabajador);
			
		} catch (Exception e) {
			System.out.println("ha petao");
			e.printStackTrace();
		}
	}
	
	private static void marshalLista(ArrayList<Empleat> trabajadores, File file) {
		try {
			JAXBContext contexte = JAXBContext.newInstance(Empleat.class);
			BufferedWriter writer = null;
			writer = new BufferedWriter(new FileWriter(file));
			
			Marshaller m = contexte.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(trabajadores, writer);
			
			writer.close();
			
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	// Este metodo es para pasar de XML a Objeto	
	private static Empleat xmlAObjeto(){
		try {
			JAXBContext contexte = JAXBContext.newInstance(Empleat.class);
			Unmarshaller um = contexte.createUnmarshaller();
			Empleat currante = (Empleat) um.unmarshal(new File(NOM_FITXER_TREBALLADOR));
			return currante;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// Este metodo es para pasar de Objeto a XML
	private static boolean objetoAXml(Empleat treballador){
		try {
			JAXBContext contexte = JAXBContext.newInstance(Empleat.class);
			Marshaller m = contexte.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//m.marshal(treballador, System.out);
			m.marshal(treballador, new File(NOM_FITXER));
			return true;
		} catch (JAXBException e) {
			e.printStackTrace();
			return false;
		}
	}

}
