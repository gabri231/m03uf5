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
	private static final String NOM_FITXER_EMPLEATS = "listadoEmpleados.xml";
	
	public static void main(String[] args) {
		Empleado trabajador = new Empleado(125, "home", 23, "gabriel", "big boss", "P@ssw0rd");
		Empleado trabajador2 = new Empleado(123, "home", 40, "xavi", "account manager", "P@ssw0rd");
		Empleado trabajador3 = new Empleado(121, "dona", 23, "marta", "designer", "P@ssw0rd");
		try {
			Staff trabajadores = new Staff();
			trabajadores.add(trabajador);
			trabajadores.add(trabajador2);
			trabajadores.add(trabajador3);
			//Marshal
			File fichero = new File(NOM_FITXER_EMPLEATS);
			marshalLista(trabajadores, fichero);
			//unMarshal
			File fichero2 = new File(NOM_FITXER_EMPLEATS);
			Staff listado = unMarshalLista(fichero2);
			if (listado != null){
				for (Empleado trabajador1 : listado.getTrabajadores()){
					System.out.println(trabajador1);
				}
			}
			
					    
		} catch (Exception e) {
			System.out.println("ha petao");
			e.printStackTrace();
		}
	}
	
	private static void marshalLista(Staff trabajadores, File file) {
		try {
			JAXBContext contexte = JAXBContext.newInstance(Staff.class);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			Marshaller m = contexte.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(trabajadores, System.out);
			m.marshal(trabajadores, writer);
			System.out.println("Se ha creado el fichero XML en la dirección: " + file.getAbsolutePath());
			writer.close();
			
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//unMarshalLista
	private static Staff unMarshalLista(File file) {
		try {
			JAXBContext contexte = JAXBContext.newInstance(Staff.class);
			Unmarshaller um = contexte.createUnmarshaller();
			Staff trabajadores = (Staff) um.unmarshal(file);
			return trabajadores;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
}
