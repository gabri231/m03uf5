package listaXml;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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
