package exemple;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name = "Company_Staff")
public class Staff {
	@XmlElement(name = "Trabajador", type = Empleat.class)
	private ArrayList<Empleat> trabajadores= new ArrayList<Empleat>();

	
	public ArrayList<Empleat> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Empleat> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public Staff(ArrayList<Empleat> trabajadores) {
		super();
		this.trabajadores = trabajadores;
	}

	public Staff() {
		super();
	}
	
}
