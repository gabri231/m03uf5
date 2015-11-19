package listaXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "employee")
@XmlAccessorType (XmlAccessType.FIELD)
public class Empleado 
{
	@XmlAttribute
	private Integer id;
	private String nombre;
	private String apellido;
	private double ingresos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getIngresos() {
		return ingresos;
	}
	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ingresos=" + ingresos + "]";
	}	
}
