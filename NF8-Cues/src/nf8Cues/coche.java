package nf8Cues;
//import java.util.LinkedList;
//import java.util.ListIterator;

public class coche {
	String marca, modelo;
	int cilindrada, cilindres;
		
	// Constructor
	public coche(String marca, String modelo, int cilindrada, int cilindres) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.cilindres = cilindres;
	}
	public coche() {

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
	
	public double pontenciaFiscal() {
		double potencia = 0.08 * this.cilindres * Math.pow((this.cilindrada / this.cilindres), 0.6);
		return potencia;
	}
	public void prueba(){
		System.out.println("Esto es una linea de prueba");
	}
}