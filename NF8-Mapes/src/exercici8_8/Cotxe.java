package exercici8_8;

public class Cotxe {
//public class Cotxe {
	String marca;
	String modelo;
	int nCilindros;
	Integer cilindrada;
	double potenciaFiscal;

	public Cotxe(String marca, String modelo, int nCilindros, int cilindrada) {
		this.marca = marca;
		this.modelo = modelo;
		this.nCilindros = nCilindros;
		this.cilindrada = cilindrada;
	}

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

	public int getnCilindros() {
		return nCilindros;
	}

	public void setnCilindros(int nCilindros) {
		this.nCilindros = nCilindros;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotenciaFiscal() {
		return this.potenciaFiscal;
	}

	public void setPotenciaiscal() {
		this.potenciaFiscal = potFiscal();
	}

	public double potFiscal() {
		return 0.08 * this.nCilindros * Math.pow((this.cilindrada / this.nCilindros), 0.6);
	}

	@Override
	public String toString() {
		return "Cotxe [marca= " + marca + ", modelo= " + modelo + ", nCilindros= " + nCilindros + ", cilindrada= "
				+ cilindrada + ", potenciaFiscal= " + potFiscal() + "]\n";
	}


}