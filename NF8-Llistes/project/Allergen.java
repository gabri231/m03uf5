package project;
public class Allergen {
	private int code;
	private String allergen;
	
	
	// Constructor of these class
	public Allergen(int code, String allergen) {
		this.code = code;
		this.allergen = allergen;
	}

	// Method Get of Allergen
	public int getCode() {
		return code;
	}
	public String getAllergen() {
		return allergen;
	}
}
