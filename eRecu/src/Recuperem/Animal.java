package Recuperem;

// La classe animal defineix els animals d'una granja qualsevol
// Aquí no hi has de fer res en especial (si no vols)

public class Animal {
	
	public Animal() {
		super();
	}
	public Animal(int codi, String breed, Double pes, int potes, Double preuVendaCanal) {
		super();
		this.codi = codi;
		this.breed = breed;
		this.pes = pes;
		this.potes = potes;
		this.preuVendaCanal = preuVendaCanal;
	}

	int codi;
	// Breed = raça
	String breed;
	Double pes;
	int potes;
	Double preuVendaCanal;

	public int getCodi() {
		return codi;
	}
	
	public void setCodi(int codi) {
		this.codi = codi;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Double getPes() {
		return pes;
	}

	public void setPes(Double pes) {
		this.pes = pes;
	}

	public int getPotes() {
		return potes;
	}

	public void setPotes(int potes) {
		this.potes = potes;
	}

	public Double getPreuVendaCanal() {
		return preuVendaCanal;
	}

	public void setPreuVendaCanal(Double preuVendaCanal) {
		this.preuVendaCanal = preuVendaCanal;
	}

	public double valorMercat() {
		return preuVendaCanal * pes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((pes == null) ? 0 : pes.hashCode());
		result = prime * result + potes;
		result = prime * result + ((preuVendaCanal == null) ? 0 : preuVendaCanal.hashCode());
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
		Animal other = (Animal) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (pes == null) {
			if (other.pes != null)
				return false;
		} else if (!pes.equals(other.pes))
			return false;
		if (potes != other.potes)
			return false;
		if (preuVendaCanal == null) {
			if (other.preuVendaCanal != null)
				return false;
		} else if (!preuVendaCanal.equals(other.preuVendaCanal))
			return false;
		return true;
	}

}
