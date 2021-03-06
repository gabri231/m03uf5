package nf8Cues;

public class Coche implements Comparable<Object>  {
	String marca, modelo;
	int cilindrada, cilindres;
		
	// Constructor
	public Coche(String marca, String modelo, int cilindrada, int cilindres) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.cilindres = cilindres;
	}
	public Coche() {

	}
	
	// Set and Get
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCilindres() {
		return cilindres;
	}
	public void setCilindres(int cilindres) {
		this.cilindres = cilindres;
	}
	
	// Calcula potencia fiscal de coches.
	public double pontenciaFiscal() {
		double potencia = 0.08 * this.cilindres * Math.pow((this.cilindrada / this.cilindres), 0.6);
		return potencia;
	}
	
	// CompareTo Para organizarlos por cilindrada. 
	public int compareTo(Object car) {
		Coche that = (Coche) car;
		int a = this.getCilindrada();
		int b = that.getCilindrada();

		// for golfers, low is good!
		if (a > b)
			return 1;
		if (a < b)
			return -1;
		return 0;
	}
}