package exNF9;

public class Jefe extends Empleat{
	double bonusAnual;

	
	public Jefe(String nom, String cognom, String carrec, double souAnual, double bonusAnual) {
		super(nom, cognom, carrec, souAnual);
		this.bonusAnual = bonusAnual;
	}

	public double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}

	@Override
	public String toString() {
		return "Jefe [Nom=" + nom +  ", cognom=" + cognom + ", Cargo=" + carrec + ", souAnual=" + souAnual+ " Bonus: "+ bonusAnual +"]";
	}
}
