package exemple;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name = "Company_Staff")
public class Staff {
	@XmlElement(name = "Trabajador", type = Empleado.class)
	public ArrayList<Empleado> trabajadores= new ArrayList<Empleado>();

	
	public ArrayList<Empleado> getTrabajadores() {
		return trabajadores;
	}

	public void add(Empleado trabajador){
		trabajadores.add(trabajador);
	}
		
	public void setTrabajadores(ArrayList<Empleado> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public Staff(ArrayList<Empleado> trabajadores) {
		super();
		this.trabajadores = trabajadores;
	}

	public Staff() {
		super();
	}
	
}
