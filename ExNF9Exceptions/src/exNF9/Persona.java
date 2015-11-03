package exNF9;

public class Persona {
	String nom;
	String cognom;
	
	
	public Persona(String nom, String cognom) {
		super();
		this.nom = nom;
		this.cognom = cognom;
	}
	// Gettters and Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	//to string
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + "]";
	}
	

		
}
