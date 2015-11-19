package xmlSimple;
import java.io.File;
import javax.xml.bind.*;

public class JavaXml {
	// Declaramos las constantes
	private static final String FICHERO_XML = "trabajador.xml";
	private static final String ARCHIVO_XML = "archivoXml.xml";
	
	public static void main(String[] args) {
		// Ejemplo: http://ingmmurillo.blogspot.com.es/2011/06/como-ordenar-elementos-xml-usando-jaxb.html
		// Definimos el objeto
		Empleado trabajador = new Empleado(123, "hombre", 23, "gabriel", "big boss", "P@ssw0rd");
		try {
			///////////////////////////////////
			// Aqui se pasa de un objeto a XML.
			if(objetoAXml(trabajador)){
				System.out.println("Exito al crear el archivo XML.");
			}else{
				System.out.println("Fracaso al crear el archivo XML");
			}
			
			System.out.println("--------------------------------------");
			
			//////////////////////////////////////
			// Aqui se pasa de un XML a un objeto.			
			Empleado objetoDeXml = xmlAObjeto(ARCHIVO_XML);
			System.out.println(objetoDeXml.toString());
			
		} catch (Exception e) {
			System.out.println("El programa se ha ejecutado de forma incorrecta.");
			e.printStackTrace();
		}
	}

	////////////////////////////////////////////
	// Este metodo es para pasar de XML a Objeto	
	private static Empleado xmlAObjeto(String nombreArchivo){
		try {
			// Se crea el contexto
			JAXBContext contexte = JAXBContext.newInstance(Empleado.class);
			// Se instancia Unmarshaller que sirve para pasar de xml a objeto
			Unmarshaller um = contexte.createUnmarshaller();
			// Guardamos lo que retornamos
			File archivo = new File(nombreArchivo);
			Empleado currante = (Empleado) um.unmarshal(archivo);
			System.out.println("El archivo Xml origen está en: " + archivo.getAbsolutePath());
			return currante;
		} catch (JAXBException e){
			e.printStackTrace();
			return null;
		}
	}
	
	////////////////////////////////////////////
	// Este metodo es para pasar de Objeto a XML
	private static boolean objetoAXml(Empleado treballador){
		try {
			File ficheroXml = new File(FICHERO_XML);
			JAXBContext contexte = JAXBContext.newInstance(Empleado.class);
			Marshaller m = contexte.createMarshaller();
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(treballador, ficheroXml); 
			m.marshal(treballador, System.out);
			
			System.out.println("Se ha creado el archivo xml en: " + ficheroXml.getAbsolutePath());
			return true;
		} catch (JAXBException e) {
			e.printStackTrace();
			return false;
		}
	}

}
