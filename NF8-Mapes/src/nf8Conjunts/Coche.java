package nf8Conjunts;

public class Coche implements Comparable<Coche>{
	String marca, modelo;
	int cilindrada, cilindres;
		
	// Constructor
	public Coche(String marca, String modelo, int cilindrada, int cilindres) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.cilindres = cilindres;
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
	public double potenciaFiscal() {
		double potencia = 0.08 * this.cilindres * Math.pow((this.cilindrada / this.cilindres), 0.6);
		return potencia;
	}

	@Override
	public String toString() {
		return "Coche[marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", cilindres="
				+ cilindres + ", pontenciaFiscal=" + String.format("%1$-5s",String.format("%.2f",potenciaFiscal())) + "]";
	}

	@Override
	public int compareTo(Coche that) {
		return this.getMarca().compareTo(that.getMarca());
	}

}