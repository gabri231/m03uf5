package xmlSimple;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "Treballador")
//@XmlType, Si no se dice el orden se guarda todos los atributos de la clase desordenado.	
@XmlType(propOrder={"nom", "carrec", "edat", "sexe"})

public class Empleado {
	private int id;
	private String sexe;
	private int edat;
	private	String nom;
	private String carrec;
	private String password;
	
	public Empleado() {
		super();
	}
	public Empleado(int id, String sexe, int edat, String nom, String carrec, String password) {
		super();
		this.id = id;
		this.sexe = sexe;
		this.edat = edat;
		this.nom = nom;
		this.carrec = carrec;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

	public String getSexe() {
		return sexe;
	}
	//@XmlElement
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public int getEdat() {
		return edat;
	}
	//@XmlElement
	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}
	//@XmlElement
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCarrec() {
		return carrec;
	}
	//@XmlElement
	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}
	
	public String getPassword() {
		return password;
	}
	// con @XmlTransient No se muestra el contenido.
	@XmlTransient
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Empleat [id=" + id + ", sexe=" + sexe + ", edat=" + edat + ", nom=" + nom + ", carrec=" + carrec
				+ ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrec == null) ? 0 : carrec.hashCode());
		result = prime * result + edat;
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (carrec == null) {
			if (other.carrec != null)
				return false;
		} else if (!carrec.equals(other.carrec))
			return false;
		if (edat != other.edat)
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (sexe == null) {
			if (other.sexe != null)
				return false;
		} else if (!sexe.equals(other.sexe))
			return false;
		return true;
	}
}
