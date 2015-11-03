package exNF9;

public class Empleat extends Persona {
	String carrec;
	double souAnual;
	
	
	public Empleat(String nom, String cognom, String carrec, double souAnual) {
		super(nom, cognom);
		this.carrec = carrec;
		this.souAnual = souAnual;
	}
	
	// Getters and Setters
	public String getCarrec() {
		return carrec;
	}
	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}
	public double getSouAnual() {
		return souAnual;
	}
	public void setSouAnual(double souAnual) {
		this.souAnual = souAnual;
	}
	//Subir sueldo
	public void pujarSou(double porcentaje){
		double sueldo = this.souAnual; 
		double nuevoSueldo = sueldo + (sueldo * (porcentaje/100));
		this.souAnual = nuevoSueldo;
	}

	@Override
	public String toString() {
		return "Empleat [Nom=" + nom +  ", cognom=" + cognom + ", Cargo=" + carrec + ", souAnual=" + souAnual +"]";
	}
			
}
