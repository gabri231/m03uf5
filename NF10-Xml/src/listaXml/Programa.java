package listaXml;


import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Programa {
	
	
	public static void main(String[] args) throws JAXBException 
	{
		Empleados empleados = new Empleados(); 
		
		
		empleados.setEmpleados(new ArrayList<Empleado>());
		
		Empleado emp = new Empleado();
		emp.setId(1);
		emp.setNombre("Samir");
		emp.setApellido("Torrez");
		emp.setIngresos(100.0);
		
		Empleado emp2 = new Empleado();
		emp2.setId(2);
		emp2.setNombre("Gabriel");
		emp2.setApellido("Calle");
		emp2.setIngresos(90.0);
		
		empleados.getEmpleados().add(emp);
		empleados.getEmpleados().add(emp2);
	
		marshaling(empleados);
		System.out.println("************************************************");
		unMarshaling();
	}

	private static void unMarshaling() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Empleados.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Empleados emps = (Empleados) jaxbUnmarshaller.unmarshal( new File("c:/temp/employees.xml") );
		
		for(Empleado emp : emps.getEmpleados())
		{
			System.out.println(emp.toString());
		}
	}

	private static void marshaling(Empleados employees) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Empleados.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		jaxbMarshaller.marshal(employees, System.out);
		jaxbMarshaller.marshal(employees, new File("employees.xml"));
	}
}
