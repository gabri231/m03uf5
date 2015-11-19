package pruebas;

public class AlertaFichero extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public AlertaFichero(String c) {
		this.msg = c;
	}

	public String toString() {
		return "Aviso gestión de ficheros: " + msg;
	}
}
