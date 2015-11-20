package listaXml;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement(namespace = "namespace")	Define the root element for an XML tree
//@XmlType(propOrder = { "field2", "field1",.. })	Allows to define the order in which the fields are written in the XML file
//@XmlElement(name = "neuName")	Define the XML element which will be used. Only need to be used if the neuNeu is different then the JavaBeans Name

@XmlRootElement(name = "empleados")
@XmlAccessorType (XmlAccessType.FIELD)
public class Empleados {
	
	@XmlElement(name = "empleado")
	private List<Empleado> employees = null;

	public List<Empleado> getEmpleados() {
		return employees;
	}

	public void setEmpleados(List<Empleado> employees) {
		this.employees = employees;
	}

}
